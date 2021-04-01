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
    
    public int compareTo(PriorityQueueEntry other)
    {
        return -1 * this.sum.compareTo(other.sum);
    }
}