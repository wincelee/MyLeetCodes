package leet_code_learning;

import classes.Movie;

public class MoviesList {

    public static void main(String[] args) {

        Movie avengersMovie = new Movie(1, "Avengers Movie");
        Movie skyWalker = new Movie(2, "SkyWalker");
        Movie fastAndFurious = new Movie(3, "Fast and Furious");

        Movie[] movieArray = new Movie[15];

        movieArray[2] = avengersMovie;
        movieArray[3] = skyWalker;
        movieArray[12] = fastAndFurious;

        for (int i =0 ; i < movieArray.length; i++){

            System.out.println("MovieAtIndex " + i + ": " + movieArray[i]);
        }


    }
}
