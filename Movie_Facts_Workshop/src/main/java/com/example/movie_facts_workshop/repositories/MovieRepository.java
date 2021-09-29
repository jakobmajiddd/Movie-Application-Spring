package com.example.movie_facts_workshop.repositories;

import com.example.movie_facts_workshop.controllers.Movie;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

@Repository
public class MovieRepository {

    public Movie getFirst() {
        return getMovie("SELECT * FROM movies LIMIT 1");
    }

    private ResultSet getResultSet(String query) {
        Connection connection = DBManager.getConnection();
        PreparedStatement preparedStatement;
        ResultSet resultSet = null;

        try {
            preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return resultSet;
    }

    private Movie getMovie(String query) {
        ResultSet resultSet = getResultSet(query);
        Movie movie = null;
        try {
            while (resultSet.next()) {
                movie = new Movie(
                        resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getInt(3),
                        resultSet.getInt(4),
                        resultSet.getString(5),
                        resultSet.getInt(6),
                        resultSet.getString(7));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return movie;
    }

    public Movie getRandom() {
        return getMovie("SELECT * FROM movies ORDER BY RAND() LIMIT 1");
    }

    public Movie getMovies(String query) {
        return getMovie("");
    }


}
