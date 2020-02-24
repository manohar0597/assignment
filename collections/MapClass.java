package com.cts.collections;
import java.util.*;
import java.util.Map.Entry;
public class MapClass {
	public static void main(String[] args) {
		HashMap<String,Integer> hash = new HashMap<String,Integer>();
		
		hash.put("Dharun MK", 22);
		hash.put("Manohar", 23);
		hash.put("Naveen", 24);
		hash.put("Mahesh", 22);
		hash.put("Srinivas", 22);
		hash.put("Bhargav", 21);
		
		//Iterator it =  hash.entrySet().iterator();
		Iterator<Map.Entry<String, Integer>> it = hash.entrySet().iterator();
		
		while(it.hasNext()){
//			Map.Entry map = (Map.Entry)it.next();
			Map.Entry<String, Integer> map = it.next();
			System.out.println(map.getKey() + "   " + map.getValue());
		}
		System.out.println( " \n\n  " );
		
		LinkedList<Map.Entry<String,Integer>> list = new LinkedList<Map.Entry<String,Integer>>(hash.entrySet());
		
		Collections.sort(list, new Comparator<Map.Entry<String,Integer>>(){

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				
				return o2.getValue() - o1.getValue();
			}
			
		});
		
		for(Map.Entry<String,Integer> e : list){
			System.out.println(e.getKey() + "   " + e.getValue());
		}
		
	}
}
