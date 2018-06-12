/* Assignment number:  6.3
 * File Name:          Reverse.java 
 * Name (First Last):  Andrey Kastelmacher
 * Student ID :        303258537 
 * Email :             Andrey Kastelmacher@post.idc.ac.il
 */


public class nonEfficientpaths {

     public static void main (String args[]){
         System.out.print(paths(5));
     }
     public static long paths(int n){
    	 if (n < 0){return 0;}
    	 if (n == 0){return 1;}
    	 if (n == 2){return 2;}
    	 long result = legal(n, n, n);
    	 return result;
     } 
     public static long legal(int n, int i, int j){
    	 if ( i == 1 || j == 1){return 1;}
         if ( j == i -1 ){return legal(n, i -1 , j);}
    	 return legal(n, i - 1, j) + legal(n, i, j - 1);
     }
}

  