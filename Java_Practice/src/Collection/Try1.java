package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Try1 {
	public static void main(String[] args) {
		int[] x= new int[5];
		x[0]= 1;
		x[1]=2;
		x[2]=3;
		x[3]=4;
		x[4]=5;
		int i=0;
		do
		{
			System.out.println(x[i]);
			i++;
		}
		while(i<x.length);
		
		ArrayList<String> temp = new ArrayList<String>() ;
		temp.add("aviskar");
		temp.add("ankur");
		temp.add("ankur");
		Set<String> s = new HashSet<String>(temp);

			System.out.println(s);
		
	}
	// new try 
	
	
	
	
}
