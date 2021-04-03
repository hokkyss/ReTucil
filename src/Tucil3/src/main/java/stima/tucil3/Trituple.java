/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stima.tucil3;

import stima.constants.Constants;

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
    
    // dihitung menggunakan Haversine Formula
    public Double straightLineDistance(Trituple other)
    {
        double pi1 = this.lat * Math.PI/180;
        double pi2 = other.lat * Math.PI/180;
        
        double deltaPi = (this.lat - other.lat) * Math.PI/180;
        double deltaLambda = (this.lng - other.lng) * Math.PI/180;
        
        double a = Math.pow(Math.sin(deltaLambda / 2), 2) + (Math.cos(pi1) * Math.cos(pi2) * Math.pow(Math.sin(deltaLambda), 2));
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        
        return Constants.earthRadiusInMeter * c;
    }
}
