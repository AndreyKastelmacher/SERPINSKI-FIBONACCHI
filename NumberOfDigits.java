/* Assignment number:  6.1
 * File Name:          NumberOfDigits.java 
 * Name (First Last):  Andrey Kastelmacher
 * Student ID :        303258537 
 * Email :             Andrey Kastelmacher@post.idc.ac.il
 */


public class NumberOfDigits {
	/**
	 * counts the digits of a number
	 * @param args - takes a user cmd line input , must be int, and counts the digits.
	 */
     public static void main ( String args[] ){
    	 int number = Integer.parseInt( args[ 0 ] );
         StdOut.printf("%d", numberOfDigits( number ));
     }
     /**
      * wrapper function for counting digits.
      * @param n - input number
      * @return returns the input length
      */
     public static int numberOfDigits(int n){
    	 int length = 1;
    	 return intLength(1, n);
     } 
     /**
      * counts mathematically by devisions of 10. each devision is counted.
      * @param length - the final length of the input number, adds 1 for each successful step of recursion
      * @param value - the current divided value.
      * @return length of input number.
      */
     private static int intLength(int length, int value){
    	 if(value/ 10<1)
    	     return length;
    	 return intLength(length+1,value/10);
     }
}
  