package puzzle;

import java.util.*;
import java.io.*;

public class Map {
	public static void main(String[] args) {
		HashMap<Integer,String> hmap= new  HashMap<Integer,String>();
		hmap.put(1, "Ankur");
		hmap.put(2, "Shanky");
		hmap.put(3, "Gunjan");
		hmap.put(4, "Aaaru");
		hmap.put(5, "Aaaru");
		System.out.println(hmap);
		System.out.println(hmap.get(4));
		if(hmap.containsKey(6)) {
			System.out.println(hmap.get(3));
		}
		else {
			hmap.put(6,"zoom");
			System.out.println(hmap);
			
		}
		System.out.println(hmap.entrySet());
		System.out.println(hmap.keySet());
		for(Map.Entry m :hmap.entrySet()) {
			 System.out.println(m.getKey()+" "+m.getValue());  
		}
}
}
