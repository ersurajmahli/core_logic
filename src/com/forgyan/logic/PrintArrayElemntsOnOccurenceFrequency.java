package com.forgyan.logic;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PrintArrayElemntsOnOccurenceFrequency {

	public static void main(String[] args) {
		int[] inpArr = {1,2,4,3,4,5,5,5,6,7,8,9,9,9,2,1,3,5,7,6,6,6,6,6,6,6};
		
		HashMap<Integer, Integer> tempMap = new HashMap<Integer, Integer>();
		
		for(int i = 0 ; i< inpArr.length ; i++) {
			if(tempMap.containsKey(inpArr[i])) {
				tempMap.put(inpArr[i], (tempMap.get(inpArr[i])+1));
			}else {
				tempMap.put(inpArr[i], 1);
			}
		}
		
		HashMap<Integer, Integer> sortedMap = sortByValues(tempMap);
		
		 Set set = sortedMap.entrySet();
	      Iterator iterator = set.iterator();
	      while(iterator.hasNext()) {
	           Map.Entry me2 = (Map.Entry)iterator.next();
	           System.out.println("---------------"+me2.getKey()+", "+me2.getValue()+" times----------");
	           for(int t =0 ; t< (int) me2.getValue() ;t++) {
	        	   System.out.println(me2.getKey());
	           }
	      }
		
	}
	
	private static HashMap sortByValues(HashMap map) { 
	       List list = new LinkedList(map.entrySet());
	       // Defined Custom Comparator here
	       Collections.sort(list, new Comparator() {
	            public int compare(Object o1, Object o2) {
	               return ((Comparable) ((Map.Entry) (o2)).getValue())
	                  .compareTo(((Map.Entry) (o1)).getValue());
	            }
	       });
	       
	       HashMap sortedHashMap = new LinkedHashMap();
	       for (Iterator it = list.iterator(); it.hasNext();) {
	              Map.Entry entry = (Map.Entry) it.next();
	              sortedHashMap.put(entry.getKey(), entry.getValue());
	       } 
	       return sortedHashMap;
	}
}
