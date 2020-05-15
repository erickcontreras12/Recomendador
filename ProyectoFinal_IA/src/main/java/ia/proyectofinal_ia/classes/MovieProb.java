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
public class MovieProb {
    private String title;
    private Double probability;

    public MovieProb(String title, Double probability) {
        this.title = title;
        this.probability = probability;
    }

    
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getProbability() {
        return probability;
    }

    public void setProbability(Double probability) {
        this.probability = probability;
    }
}
