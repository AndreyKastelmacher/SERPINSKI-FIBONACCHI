
/* Assignment number:  6.4
 * File Name:          serpinski.java 
 * Name (First Last):  Andrey Kastelmacher
 * Student ID :        303258537 
 * Email :             Andrey Kastelmacher@post.idc.ac.il
 */


public class serpinki {
     /**
      * main tester function, takes n loops and draws serpinskis triangle.
      * @param args - must be an integer - amount of times to multiply the fractal.
      */
     public static void main (String args[]){
    	 int amount = Integer.parseInt(args[0]);
         serpinskiBuffer(amount);
     }
     /**
      * buffers the void serpinsky function with a starting points, amount of loops,
      * size of initial loop.
      * @param n = amount of times to loop
      */
     public static void serpinskiBuffer(int n) {
         serpinski(n, 0, 0, 1);
     }
     /**
      * draws the serpinsky triangle from left to right to top.
      * taken the proportional size of the triangle.
      * @param n - amount of loops
      * @param base x - left point of triangle
      * @param base y - left point of triangle
      * @param size - size of the triangle
      */
     public static void serpinski(int n, double x, double y, double size) {
         if (n == 0) return;
         double x0 = x;
         double y0 = y;
         double x1 = x0 + size;
         double y1 = y0;
         double x2 = x0 + size / 2;
         double y2 = y0 + (Math.sqrt(3.0)) * size / 2;    
         StdDraw.line(x0, y0, x1, y1);
         StdDraw.line(x0, y0, x2, y2);
         StdDraw.line(x1, y1, x2, y2);
         serpinski(n-1, x0, y0, size / 2);
         serpinski(n-1, (x0 + x1) / 2, (y0 + y1) / 2, size / 2);
         serpinski(n-1, (x0 + x2) / 2, (y0 + y2) / 2, size / 2);
     }

}

  