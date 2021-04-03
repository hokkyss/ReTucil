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
public class PriorityQueueEntryComparator implements Comparator<PriorityQueueEntry>{
    public int compare(PriorityQueueEntry e1, PriorityQueueEntry e2)
    {
        return e1.compare(e2);
    }
}
