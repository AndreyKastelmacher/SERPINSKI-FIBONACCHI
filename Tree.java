
/* Assignment number:  6.5
 * File Name:          tree.java 
 * Name (First Last):  Andrey Kastelmacher
 * Student ID :        303258537 
 * Email :             Andrey Kastelmacher@post.idc.ac.il
 */
/**
 * failed to implement this patch
 */

public class Tree {
     /**
      * main function for testing code
      * @param args - amount of pythagorean steps to undertake
      */
     public static void main (String args[]){
    	 int amount = Integer.parseInt(args[0]);
         treeBuffer(amount);
     }
     /**
      * wrpper function for initiation.
      * @param n- amount of branches.
      */
     public static void treeBuffer(int n) {
         tree(n, 0.3, 0, 0.7, 0, 0.4*Math.sqrt(2), 90  );
     }
     
     /**
      * draws pythagorean tree.
      * 
      * @param n - amount of branches
      * @param x - point x on plane
      * @param y - point y on plane
      * @param nextx - the next x point to calculate
      * @param nexty - the next y point to calculate.
      * @param size - size of nXn square.
      * @param d - diagonal of the square.
      */
     public static void tree(int n, double x0, double y0, double x1, double y1, double d ,double angle) {
         if (n == 0) return;
         double angled = Math.toRadians(angle);
        
         double x2 = x0 + (d/(Math.sqrt(2))/2);
         double y2 = y0 + (d/Math.sqrt(8));
         double x3 = x2 - (d/(Math.sqrt(2))/2);
         double y3 = y2 +  (d/Math.sqrt(8)); 
         double x4 = x2 + (d/(Math.sqrt(2))/2);
         double y4 = y2 +  (d/Math.sqrt(8)); 
         double x5 = x2 - (d*(Math.sqrt(2)/2));
         double y5 = y2 ;
         double x6 = x2 + (d*(Math.sqrt(2)/2));
         double y6 = y2 ;
        // double x3 = x2 + length * Math.sin(angled);
         //double y3 = y2 + length * Math.cos(angled); 
         //double x4 = x3 + length * Math.sin(angled);
        // double y4 = y2 + length * Math.cos(angled);
    
         double[] xPlane = { x0, x1, x6, x4, x2, x3, x5 };
         double[] yPlane = { y0, y1, y6, y4, y2, y3, y5 };
         StdDraw.polygon(xPlane, yPlane);
 

         tree(n-1, x5, y5, x3, y3, d/2, angle-45);
         tree(n-1, x6, y6, x4, y4, d/2, angle-45);

     }

}

  