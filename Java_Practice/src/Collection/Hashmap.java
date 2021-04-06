package Collection;

import java.util.HashMap;

public class Hashmap {
public static void main(String[] args) {
	HashMap<String, String> capitalCities = new HashMap<String, String>();

    // Add keys and values (Country, City)
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    System.out.println(capitalCities);
    System.out.println(capitalCities.get("England"));;
    
    
    String S = "ankur";
    String res = "";
    for(int i =S.length()-1; i>=0;i--) {
    	Character s = S.charAt(i);
    	res+= s.toString();
    }
    System.out.println(res);
}
}
