package test;

public class RevString {
	public static void method1(String s) {
		s = s.replaceAll("[^a-zA-Z0-9]", " ");
		System.out.println(s);
		s= s.replace(' ', 'Z');
		System.out.println(s);
	}
	public static void main(String[] args) {
		String main = "ankur";
        String rev = "";
       
       for(int i = main.length()-1 ; i>=0; i--)
       {
           rev += main.charAt(i);
          
       }
       System.out.println(rev);
       
       String a = "ankurchauhan";
       char[] c = a.toCharArray();
       String str="";
       for(int i = 0; i <a.length();i++) {
    	   if(i%2==1) {
    	   c[i] = '*';
    	    }
    	   
       }
       str=   String.valueOf(c);
	   System.out.println(str);
	   RevString.method1("This#string%contains^special*characters&.");
	}
	

}
