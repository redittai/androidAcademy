package com.android_academy.ittai.androidacademy.Models;

import com.android_academy.ittai.androidacademy.R;

import java.util.ArrayList;
import java.util.List;

/**
 * generate mock data
 *
 * Created by ittai on 26/11/2018.
 */

public class DataModel {

    public static List<MovieModel> loadData()
    {
        ArrayList<MovieModel> movies = new ArrayList<>();
        MovieModel m1 = new MovieModel();
        m1.setImageResource(R.drawable.black_panther);
        m1.setMovieName("The Black Panther");
        m1.setMovieOverview("King T'Challa returns home from America to the reclusive, technologically advanced African nation of Wakanda " +
                "to serve as his country's new leader. However, T'Challa soon finds that he is challenged for the throne by " +
                "factions within his own country as well as without. Using powers reserved to Wakandan kings, " +
                "T'Challa assumes the Black Panther mantel to join with girlfriend Nakia, the queen-mother, " +
                "his princess-kid sister, members of the Dora Milaje (the Wakandan 'special forces') and an American secret " +
                "agent, to prevent Wakanda from being dragged into a world war.");
        movies.add(m1);

        MovieModel m2 = new MovieModel();
        m2.setImageResource(R.drawable.deadpool_2);
        m2.setMovieName("Deadpool 2");
        m2.setMovieOverview("Wisecracking mercenary Deadpool battles the evil and powerful Cable and other bad " +
                "guys to save a boy's life.");
        movies.add(m2);

        MovieModel m3 = new MovieModel();
        m3.setImageResource(R.drawable.guardians_of_the_galaxy);
        m3.setMovieName("Guardians Of The Galaxy");
        m3.setMovieOverview("Light years from Earth, 26 years after being abducted, Peter Quill finds himself " +
                "the prime target of a manhunt after " +
                "discovering an orb wanted by Ronan the Accuser.");
        movies.add(m3);

        MovieModel m4 = new MovieModel();
        m4.setImageResource(R.drawable.jurassic_world_fallen_kingdom);
        m4.setMovieName("Jurassic World - Fallen Kingdom");
        m4.setMovieOverview("Three years after the demise of Jurassic World, a volcanic eruption threatens " +
                "the remaining dinosaurs on the isla Nublar, so Claire Dearing, the former park manager, " +
                "recruits Owen Grady to help prevent the extinction of the dinosaurs once again.");
        movies.add(m4);

        MovieModel m5 = new MovieModel();
        m5.setImageResource(R.drawable.ocean_eight);
        m5.setMovieName("Ocean Eight");
        m5.setMovieOverview("Debbie Ocean, a criminal mastermind, gathers a crew of female thieves " +
                "to pull off the heist of the century at New York's annual Met Gala.");
        movies.add(m5);

        MovieModel m6 = new MovieModel();
        m6.setImageResource(R.drawable.the_meg);
        m6.setMovieName("The Meg");
        m6.setMovieOverview("A deep sea submersible pilot revisits his past fears in the Mariana Trench, and " +
                "accidentally unleashes the seventy foot ancestor of the Great White Shark believed to be extinct.");
        movies.add(m6);

        MovieModel m7 = new MovieModel();
        m7.setImageResource(R.drawable.thor_ragnarok);
        m7.setMovieName("Thor Ragnarok");
        m7.setMovieOverview("Thor is on the other side of the universe and finds himself in a race " +
                "against time to get back to Asgard to stop Ragnarok, the prophecy of destruction to his " +
                "homeworld and the end of Asgardian civilization, at the hands of an all-powerful new threat, the ruthless Hela.");
        movies.add(m7);

        return movies;
    }
}
