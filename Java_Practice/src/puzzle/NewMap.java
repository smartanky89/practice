package puzzle;

import java.util.HashMap;


public class NewMap {
public static void main(String[] args) {
	String name = "ankur chauhan";


	HashMap<Character,Integer> map1 = new HashMap<Character,Integer>();
	for(int i = 0; i<name.length();i++){
		if(name.charAt(i)==' ')
			continue;
	if(map1.containsKey(name.charAt(i))){
		map1.put(name.charAt(i), map1.get(name.charAt(i))+1);
	}
	else {
		map1.put(name.charAt(i), 1);
	}
	}
	System.out.println(map1);

}

}
