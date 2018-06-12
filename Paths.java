
/* Assignment number:  6.3
 * File Name:          Paths.java 
 * Name (First Last):  Andrey Kastelmacher
 * Student ID :        303258537 
 * Email :             Andrey Kastelmacher@post.idc.ac.il
 */


public class Paths {
     /**
      * loops to check amount of paths in matrix nXn from lowest point to highest.
      * @param args - takes a user input cmd line integer, to build the  nXn matrix (this is "n").
      */
     public static void main (String args[]){
    	 int size = Integer.parseInt(args[0]);
         System.out.print(efficientPaths(size));
     }
     /**
      * wrapper function for the efficient paths algorithm.
      * @param n - the size nXn of the matrix to search
      * @return returns the amount of found paths.
      */
     public static long efficientPaths(int n){
    	 if (n < 0){return 0;}
    	 if (n == 0){return 1;}
    	 if (n == 2){return 2;}
    	 long[][] memo = new long [n+1][n+1];
    	 return legal(n*2, 0, 0, n, memo);
     } 
     /**
      * the legal function checks for paths by steps and memoizes the tried paths.
      * @param n - size of the array.
      * @param i - indicator for the position in matrix index i
      * @param j - indicator for the position in matrix index j
      * @param size - the original size of the matrix.
      * @param memo - an array containing steps that were already calculated .
      * @return counter- the amount of paths found.
      */
     public static long legal(int n, int i, int j, int size, long[][] memo){
    	 if ( i > j || j > size ){return 0;}
    	 if ( memo[i][j] != 0 ){return memo[i][j];}
    	 long counter = 0;
    	 if (n == 0) { return 1;}
    	 counter += legal(n-1, i + 1 , j, size, memo)+legal(n-1, i, j + 1, size, memo); 
    	 memo[i][j] = counter;
    	 return counter;
     }
}

  