package com.forgyan.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class InternalWorkingOfHashMAp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Employee, String> hMap = new HashMap<Employee, String>();
		hMap.put(new Employee(1,"Suraj",1000), "Jaharkhand");
		hMap.put(new Employee(2,"Suraj",1000), "Jaharkhanda");
		System.out.println(hMap.size());
		
		for(Map.Entry<Employee, String> entry : hMap.entrySet()) {
			System.out.println("Key = "+entry.getKey()+",Value = "+entry.getValue());
		}
		
		for(Entry<Employee, String> entry : hMap.entrySet()) {
			System.out.println("Key = "+entry.getKey()+",Value = "+entry.getValue());
		}
	}

}
