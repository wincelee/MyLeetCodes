package others;

import classes.Movie;
import classes.MovieLocal;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class MyMovies {

    public static void main(String[] args) throws JsonParseException,
            JsonMappingException, IOException {

        String moviesData = "[{'id': 1, 'movieName': 'The Gray Man'}, " +
                "{'id': 2, 'movieName': 'Halftime'}]";

        //List<Movie> movieList = Arrays.asList(new Gson().fromJson(moviesData, Movie[].class));

        /*JsonArray jsonArray = JsonParser.parseString(moviesData).getAsJsonArray();
        jsonArray.forEach(jsonElement -> {
            //movieList.add(JsonToObject(jsonElement.getAsJsonObject()));
        });*/


        ObjectMapper mapper = new ObjectMapper();

        List<Movie> moviesList = mapper.readValue(moviesData, new
                TypeReference<>() {});

        List<MovieLocal> movieLocalList = new ArrayList<>();

        moviesList.forEach(movie -> {

            MovieLocal movieLocal = new MovieLocal();

            movieLocal.setId(movie.getId());
            movieLocal.setMovieName(movie.getMovieName());
            movieLocal.setCached(false);

            movieLocalList.add(movieLocal);

        });



/*        List<MovieLocal> movieLocalList1 = moviesList.stream().map(movie ->{

            MovieLocal movieLocal = new MovieLocal();

            movieLocal.setId(movie.getId());
            movieLocal.setMovieName(movie.getMovieName());
            movieLocal.setCached(false);

            movieLocalList.add(movieLocal);

                }).toList();*/

    }
}
