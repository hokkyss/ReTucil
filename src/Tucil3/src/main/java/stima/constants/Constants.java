/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stima.constants;

import com.google.maps.*;

/**
 *
 * @author PERSONAL
 */
public class Constants {
    private static String apiKey = "AIzaSyBi9RgHgPabzADyC-RQThD3mi4hCyWLxD4";
    
    public static String getApiKey()
    {
        return apiKey;
    }
    
    public static final GeoApiContext context = new GeoApiContext.Builder().apiKey(Constants.getApiKey()).build();
}