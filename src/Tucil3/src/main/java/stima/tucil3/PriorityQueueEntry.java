/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stima.tucil3;

import java.util.*;
/**
 *
 * @author PERSONAL
 */
public class PriorityQueueEntry {
    public Double distanceSoFar;
    public Double sum;
    public Integer nodeIndex;
    public ArrayList<Integer> path;
    
    public PriorityQueueEntry(double distanceSoFar, double sum, int nodeIndex, ArrayList<Integer> path)
    {
        this.distanceSoFar = distanceSoFar;
        this.sum = sum;
        this.nodeIndex = nodeIndex;
        this.path = path;
    }
    
    public int compare(PriorityQueueEntry other)
    {
        return this.sum.compareTo(other.sum);
    }
    
    public String toString()
    {
        String s = "(" + this.distanceSoFar + ", " + (this.nodeIndex + 1) + ", [";
        for(int i : path)
        {
            s = s + (i + 1) + ", ";
        }
        s = s + "])";
        return s;
    }
}