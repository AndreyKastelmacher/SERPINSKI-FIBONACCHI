/* Assignment number:  6.2
 * File Name:          Reverse.java 
 * Name (First Last):  Andrey Kastelmacher
 * Student ID :        303258537 
 * Email :             Andrey Kastelmacher@post.idc.ac.il
 */


public class Reverse {
     /**
      * takes a user string input and reverses it.
      * @param args - a user string input to be reversed.
      */
     public static void main (String args[]){
    	 String input = args[0];
         reverse(input);
         
     }
     /**
      * reverses the string by printing the last digit first and cutting the string short of that digit.
      * @param s - the original string
      */
     public static void reverse(String s){
    	 if (s.length() == 0){return;}
    	 System.out.print(s.charAt(s.length()-1));
    	 reverse(s.substring(0, s.length()-1));    	 
     }     	
}

  