# Movie-Application-Spring

Afleverings Dato 3/10/2021

**Movie Facts workshop**
IntroductionToday we are going to create an application that provides information aboutmovies to the user This is done by modelling movie data to java objects, sort &order a collection of them.

**Notes**
We will be working with the dataset: movies.csv located in Fronter.

**Requirements**
We are going to create 5 end-points, that each will have a specific task in mind.
You an  use the same Controller class. Annotate the controllers with @RestController.

3.1 /
This  end-point  welcomes  the  user  and  prints  out  a  short  description  of  yourapplication
3.2 /getFirst
Shown in classThis end-points calls a service that finds the first movie fromthe list and displays the title.
3.3 /getRandom
This end-point calls a service,  that finds a single random movie from the listand displays the title.
3.4 /getTenSortByPopularity
This end-point calls a service that fetches 10 random movies, maps each resultto  a  Movie  model  class,  adds  to  a  Movie  Arraylist  and  prints  the  result  tothe  browser  -  sorted  in  ascending  order  by  popularity  (Hint:  Remember  thecomparable interface).
3.5 /howManyWonAnAward
This  end-point  prints  how  many  of  the  movies  of  the  data-set  that  won  anaward.git.
3.6 (Advanced) /filter?char=’x’amount=’n’
This end points calls a service that prints all movies, but only if they containxcharacternamount of times.
3.7 (Advanced) /howManySequals?g1=’x’g2=’y’
This end-point calls a service that compares two genres and finds what genre,on average, has the longest movies.
3.8 Advanced
Import data into an MySQL database.  Display all comedies that won an awardonly using SQL queries.

