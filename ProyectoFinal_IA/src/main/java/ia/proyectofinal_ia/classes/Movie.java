/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ia.proyectofinal_ia.classes;

/**
 *
 * @author eecon
 */
public class Movie {
    private String color;
    private String director;
    private String actor2;
    private String genres;
    private String actor1;
    private String title;
    private String actor3;
    private String keywords;
    private String lenguage;
    private String country;
    private String rating;
    private String duration;
    private String year;
    private String score;
    private Double probabilityP, probabilityM;


    public Movie(String color, String director_name, String duration, String actor2, String genres, String actor1, String title, String actor3, String keywords, String lenguage, String country, String rating, String year, String score) {
        this.color = color;
        this.director = director_name;
        this.actor2 = actor2;
        this.genres = genres;
        this.actor1 = actor1;
        this.title = title;
        this.actor3 = actor3;
        this.keywords = keywords;
        this.lenguage = lenguage;
        this.country = country;
        this.rating = rating;
        this.duration = duration;
        this.year = year;
        this.score = score;
    }
    
    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the director
     */
    public String getDirector() {
        return director;
    }

    /**
     * @param director the director to set
     */
    public void setDirector(String director) {
        this.director = director;
    }

    /**
     * @return the actor2
     */
    public String getActor2() {
        return actor2;
    }

    /**
     * @param actor2 the actor2 to set
     */
    public void setActor2(String actor2) {
        this.actor2 = actor2;
    }

    /**
     * @return the genres
     */
    public String getGenres() {
        return genres;
    }

    /**
     * @param genres the genres to set
     */
    public void setGenres(String genres) {
        this.genres = genres;
    }

    /**
     * @return the actor1
     */
    public String getActor1() {
        return actor1;
    }

    /**
     * @param actor1 the actor1 to set
     */
    public void setActor1(String actor1) {
        this.actor1 = actor1;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the actor3
     */
    public String getActor3() {
        return actor3;
    }

    /**
     * @param actor3 the actor3 to set
     */
    public void setActor3(String actor3) {
        this.actor3 = actor3;
    }

    /**
     * @return the keywords
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * @param keywords the keywords to set
     */
    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    /**
     * @return the lenguage
     */
    public String getLenguage() {
        return lenguage;
    }

    /**
     * @param lenguage the lenguage to set
     */
    public void setLenguage(String lenguage) {
        this.lenguage = lenguage;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return the rating
     */
    public String getRating() {
        return rating;
    }

    /**
     * @param rating the rating to set
     */
    public void setRating(String rating) {
        this.rating = rating;
    }

    /**
     * @return the duration
     */
    public String getDuration() {
        return duration;
    }

    /**
     * @param duration the duration to set
     */
    public void setDuration(String duration) {
        this.duration = duration;
    }

    /**
     * @return the year
     */
    public String getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * @return the score
     */
    public String getScore() {
        return score;
    }

    /**
     * @param score the score to set
     */
    public void setScore(String score) {
        this.score = score;
    }

    /**
     * @return the probability
     */
    public Double getProbabilityP() {
        return probabilityP;
    }
    
    public void setProbabilityP(Double probability){
        this.probabilityP = probability;
    }
    
    public Double getProbabilityM() {
        return probabilityM;
    }
    
    public void setProbabilityM(Double probability){
        this.probabilityM = probability;
    }
}
