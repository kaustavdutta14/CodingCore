package com.kaustav.collection;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.List;
import java.util.Map;

public class PersonService {

	public List<Person> generateList(){
		List<Person> list = new ArrayList<Person>();
		list.add(new Person(1,"Harsha",60000));
		list.add(new Person(5,"Siddartha",57000));
		list.add(new Person(3,"Krishna",250000));
		list.add(new Person(9,"Prasanna",100000));
		list.add(new Person(9,"Chanakya",60000));
		list.add(new Person(9,"Wathsa",85000));
		list.add(new Person(1,"Sreenivas",150000));
		list.add(new Person(1,"Padma",75000));
		
		return list;
	}
	
	public Map<Float,Person> transform(List<Person> people){
		Map<Float,Person> map = new HashMap<Float,Person>();
		Map<Integer,List<Person>> tempMap = new HashMap<Integer,List<Person>>();
		for(Person p:people) {
			if(tempMap.containsKey(p.id)) {
				List<Person> lst = tempMap.get(p.id);
				lst.add(p);
				tempMap.put(p.id, lst);
			}
			else {
				List<Person> lst = new ArrayList<Person>();
				lst.add(p);
				tempMap.put(p.id,lst );
			}
		}
		for(Map.Entry<Integer, List<Person>> entry: tempMap.entrySet()) {
			List<Person> lst = entry.getValue();
			if(lst.size() > 1) {
				int size = lst.size();
				for(int i = 0;i < size;i++) {
					String str = ""+lst.get(i).id;
					int y =i;
					String str2 = str;
					while(y > 0) {
						str = str+str2;
						y = y - 1;
					}
					float f = Float.parseFloat(str.trim());
					float divider = (float) Math.pow(10, i);
					f = f/divider;
					map.put(f,lst.get(i));
				}
			}
			else map.put((float)entry.getKey(),lst.get(0));
		}
		return map;
		
	}
	
	public void show(List<Person> list) {
		for(Person p:list) {
			System.out.println(p);
		}
	}
	
	public void show(Map<Float,Person> map) {
		for(Map.Entry<Float,Person> entry:map.entrySet()) {
			float key = entry.getKey();
			String value = entry.getValue().toString();
			System.out.println("Key: "+ key+" Value: "+value);
		}
	}
}
