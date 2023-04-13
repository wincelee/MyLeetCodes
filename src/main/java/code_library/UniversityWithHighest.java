package code_library;

import classes.Config;
import classes.Person;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.util.*;

public class UniversityWithHighest {

    public static void main(String[] args) {

        JsonObject jsonObject = new Gson().fromJson(getData(), JsonObject.class);
        JsonArray jsonArray = jsonObject.getAsJsonArray("data");

        List<University> universities = Arrays.asList(new Gson().fromJson(jsonArray, University[].class));

         /*University maxUniversity = universities
                .stream()
                //.filter(university -> university.getLocation().city.equals(""))
                .max(Comparator.comparing(University::getInternational_students))
                .orElseThrow(NoSuchElementException::new);*/

        University maxUniversity = universities.stream()
                .max(Comparator.comparingInt(value -> Integer.parseInt(removeComma(value.getInternational_students()))))
                        .get();

        List<String> rankDisplayList = universities.stream().map(University::getRank_display).toList();

        System.out.println("HighestNumberOfInternationStudents: " + maxUniversity.getInternational_students());
        System.out.println("CityWithHighestNumberOfInternationStudents: " + maxUniversity.getLocation().getCity());
        System.out.println(Config.ANSI_BLUE + "RankDisplayList: " + new GsonBuilder()
                .setPrettyPrinting().create().toJson(rankDisplayList));

    }

    public static String removeComma(String input) {

        return input.replace(",", "");
    }

    public static String getData(){
        return "{\n" +
                "  \"data\": [\n" +
                "    {\n" +
                "      \"type\": \"Private\",\n" +
                "      \"score\": 100,\n" +
                "      \"location\": {\n" +
                "        \"city\": \"Cambridge\",\n" +
                "        \"region\": \"North America\",\n" +
                "        \"country\": \"United States\"\n" +
                "      },\n" +
                "      \"university\": \"Massachusetts Institute of Technology (MIT)\",\n" +
                "      \"rank_display\": \"1\",\n" +
                "      \"faculty_count\": \"3,065\",\n" +
                "      \"student_faculty_ratio\": 4,\n" +
                "      \"international_students\": \"3,730\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"type\": \"Public\",\n" +
                "      \"score\": 99.5,\n" +
                "      \"location\": {\n" +
                "        \"city\": \"Oxford\",\n" +
                "        \"region\": \"Europe\",\n" +
                "        \"country\": \"United Kingdom\"\n" +
                "      },\n" +
                "      \"university\": \"University of Oxford\",\n" +
                "      \"rank_display\": \"2\",\n" +
                "      \"faculty_count\": \"6,708\",\n" +
                "      \"student_faculty_ratio\": 3,\n" +
                "      \"international_students\": \"8,442\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"type\": \"Private\",\n" +
                "      \"score\": 98.7,\n" +
                "      \"location\": {\n" +
                "        \"city\": \"Stanford\",\n" +
                "        \"region\": \"North America\",\n" +
                "        \"country\": \"United States\"\n" +
                "      },\n" +
                "      \"university\": \"Stanford University\",\n" +
                "      \"rank_display\": \"3\",\n" +
                "      \"faculty_count\": \"4,725\",\n" +
                "      \"student_faculty_ratio\": 3,\n" +
                "      \"international_students\": \"3,879\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"type\": \"Public\",\n" +
                "      \"score\": 98.7,\n" +
                "      \"location\": {\n" +
                "        \"city\": \"Cambridge\",\n" +
                "        \"region\": \"Europe\",\n" +
                "        \"country\": \"United Kingdom\"\n" +
                "      },\n" +
                "      \"university\": \"University of Cambridge\",\n" +
                "      \"rank_display\": \"3\",\n" +
                "      \"faculty_count\": \"5,800\",\n" +
                "      \"student_faculty_ratio\": 4,\n" +
                "      \"international_students\": \"7,925\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"type\": \"Private\",\n" +
                "      \"score\": 98,\n" +
                "      \"location\": {\n" +
                "        \"city\": \"Cambridge\",\n" +
                "        \"region\": \"North America\",\n" +
                "        \"country\": \"United States\"\n" +
                "      },\n" +
                "      \"university\": \"Harvard University\",\n" +
                "      \"rank_display\": \"5\",\n" +
                "      \"faculty_count\": \"4,646\",\n" +
                "      \"student_faculty_ratio\": 5,\n" +
                "      \"international_students\": \"5,877\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"type\": \"Private\",\n" +
                "      \"score\": 97.4,\n" +
                "      \"location\": {\n" +
                "        \"city\": \"Pasadena\",\n" +
                "        \"region\": \"North America\",\n" +
                "        \"country\": \"United States\"\n" +
                "      },\n" +
                "      \"university\": \"California Institute of Technology (Caltech)\",\n" +
                "      \"rank_display\": \"6\",\n" +
                "      \"faculty_count\": \"968\",\n" +
                "      \"student_faculty_ratio\": 2,\n" +
                "      \"international_students\": \"692\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"type\": \"Public\",\n" +
                "      \"score\": 97.3,\n" +
                "      \"location\": {\n" +
                "        \"city\": \"London\",\n" +
                "        \"region\": \"Europe\",\n" +
                "        \"country\": \"United Kingdom\"\n" +
                "      },\n" +
                "      \"university\": \"Imperial College London\",\n" +
                "      \"rank_display\": \"7\",\n" +
                "      \"faculty_count\": \"8,000\",\n" +
                "      \"student_faculty_ratio\": 5,\n" +
                "      \"international_students\": \"11,143\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"type\": \"Public\",\n" +
                "      \"score\": 95.4,\n" +
                "      \"location\": {\n" +
                "        \"city\": \"Zürich\",\n" +
                "        \"region\": \"Europe\",\n" +
                "        \"country\": \"Switzerland\"\n" +
                "      },\n" +
                "      \"university\": \"ETH Zurich - Swiss Federal Institute of Technology\",\n" +
                "      \"rank_display\": \"8\",\n" +
                "      \"faculty_count\": \"2,719\",\n" +
                "      \"student_faculty_ratio\": 7,\n" +
                "      \"international_students\": \"7,733\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"type\": \"Public\",\n" +
                "      \"score\": 95.4,\n" +
                "      \"location\": {\n" +
                "        \"city\": \"London\",\n" +
                "        \"region\": \"Europe\",\n" +
                "        \"country\": \"United Kingdom\"\n" +
                "      },\n" +
                "      \"university\": \"UCL\",\n" +
                "      \"rank_display\": \"8\",\n" +
                "      \"faculty_count\": \"7,195\",\n" +
                "      \"student_faculty_ratio\": 5,\n" +
                "      \"international_students\": \"21,824\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"type\": \"Private\",\n" +
                "      \"score\": 94.5,\n" +
                "      \"location\": {\n" +
                "        \"city\": \"Chicago\",\n" +
                "        \"region\": \"North America\",\n" +
                "        \"country\": \"United States\"\n" +
                "      },\n" +
                "      \"university\": \"University of Chicago\",\n" +
                "      \"rank_display\": \"10\",\n" +
                "      \"faculty_count\": \"2,703\",\n" +
                "      \"student_faculty_ratio\": 6,\n" +
                "      \"international_students\": \"4,696\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"page\": 1,\n" +
                "  \"total\": 200,\n" +
                "  \"per_page\": 10,\n" +
                "  \"total_pages\": 20\n" +
                "}";
    }





}
