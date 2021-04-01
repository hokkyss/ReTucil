/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stima.tucil3;

public class Trituple {
    public Double lat;
    public Double lng;
    public String name;
    
    public Trituple()
    {
        this.lat = null;
        this.lng = null;
        this.name = null;
    }
    
    public Trituple(Double lat, Double lng, String name)
    {
        this.lat = lat;
        this.lng = lng;
        this.name = name;
    }
    
    public String toString()
    {
        String s = "(";
        s = this.name + " = (" + this.lat + ", " + this.lng + ")";
        
        return s;
    }
    
    public Double straightLineDistance(Trituple other)
    {
        return Math.sqrt(Math.pow(other.lat - this.lat, 2) + Math.pow(other.lng - this.lng, 2));
    }
}
