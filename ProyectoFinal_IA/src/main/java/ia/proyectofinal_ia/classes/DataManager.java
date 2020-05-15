/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ia.proyectofinal_ia.classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author eecon
 */
public class DataManager {

    private ArrayList<Movie> movies_list = new ArrayList<>();
    private ArrayList<Movie> filter = new ArrayList<>();
    private ArrayList<Movie> favorites = new ArrayList<>();
    FileReader fr;
    BufferedReader br;
    String line, path;
    String[] data;

    public DataManager() throws IOException {
        path  = new File(".").getAbsolutePath();
        if (path.endsWith(".")) {
            path = path.substring(0, path.length() - 1);
        }
        readMoviesFile();
        readProbabilitiesFile();
    }

    /**
     * Reads the file with the movies data to keep it all in the program
     *
     * @throws FileNotFoundException
     * @throws IOException
     */
    private void readMoviesFile() throws FileNotFoundException, IOException {
        fr = new FileReader(path + "DataNormalizada.csv");
        br = new BufferedReader(fr);
        /*Read the first line, just to eliminate the
            header line.
         */
        String line = br.readLine();
        Character c;
        //Starts working with the next ones
        while ((line = br.readLine()) != null) {
            String[] data = line.split(";");

            String title = "";
            for (int i = 0; i < data[6].length(); i++) {
                c = data[6].charAt(i);
                if (c.equals('Â')) {
                    break;
                }
                title += c;
            }

            movies_list.add(new Movie(data[0], data[1], data[2], data[3], data[4], data[5],
                    title, data[7], data[8], data[9], data[10], data[11], data[12], data[13]));

        }

        fr.close();
    }

    private void readProbabilitiesFile() throws FileNotFoundException, IOException {
        fr = new FileReader(path + "Probabilidades.csv");
        br = new BufferedReader(fr);

        while ((line = br.readLine()) != null) {
            data = line.split(";");

            String title = "";
            Character c;
            
            for (int i = 0; i < data[0].length(); i++) {
                c = data[0].charAt(i);
                if (c.equals('Â')) {
                    break;
                }
                title += c;
            }

            for (Movie movie : movies_list) {
                if (movie.getTitle().equals(title)) {
                    movie.setProbabilityP(Double.valueOf(data[1]));
                    movie.setProbabilityM(Double.valueOf(data[2]));

                }
            }

        }

        fr.close();
    }

    public void addToFavorites() {

    }

    public ArrayList<Movie> getMovies_list() {
        return movies_list;
    }

    public void setMovies_list(ArrayList<Movie> movies_list) {
        this.movies_list = movies_list;
    }

    public ArrayList<Movie> getFilter() {
        return filter;
    }

    public void setFilter(ArrayList<Movie> filter) {
        this.filter = filter;
    }

    public ArrayList<Movie> getFavorites() {
        return favorites;
    }

    public void setFavorites(ArrayList<Movie> favorites) {
        this.favorites = favorites;
    }

}
