/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stima.tucil3;

public class Trituple {
    public final Double lat;
    public final Double lng;
    public final String name;
    public final Integer index;
    public static int numOfTrituples = 0;
    
    public Trituple()
    {
        this.lat = null;
        this.lng = null;
        this.name = null;
        this.index = null;
    }
    
    public Trituple(Double lat, Double lng, String name)
    {
        this.lat = lat;
        this.lng = lng;
        this.name = name;
        this.index = numOfTrituples;
        numOfTrituples++;
    }
    
    public String toString()
    {
        String s;
        // format js
        s = "{";
        s = s + "lat: " + this.lat + ", ";
        s = s + "lng: " + this.lng + ", ";
        s = s + "name: " + '"' + this.name + '"';
        s = s + "}";
        
        return s;
    }
    
    public Double straightLineDistance(Trituple other)
    {
        return Math.sqrt(Math.pow(other.lat - this.lat, 2) + Math.pow(other.lng - this.lng, 2));
    }
}
