
/* Assignment number:  6.4
 * File Name:          serpinski.java 
 * Name (First Last):  Andrey Kastelmacher
 * Student ID :        303258537 
 * Email :             Andrey Kastelmacher@post.idc.ac.il
 */


public class Tree2 {

     public static void main (String args[]){
         treeBuffer(4);
     }
     public static void treeBuffer(int n) {
         tree(n, 0.3, 0, 0.5, 45);	
         tree(n, 0.8, 0, 0.5, 45);	

     }

     public static void tree(int n, double x, double y, double size, double angle) {
         if (n == 0) return;
         double angled = (angle * Math.PI) / 180;
         //if (n % 2 != 0){
         double length = (size*Math.sqrt(2)/2 );
         double x0 = x;
         double y0 = y;
         double xa = x0 - size/2;
         double x1 = x0 + length * Math.sin(angled);
         double y1 = y0 + length * Math.cos(angled);
         double x2 = x0 - length * Math.sin(angled);
         double y2 = y0 + length * Math.cos(angled);
         double x3 = x0;
         double y3 = y0 + size/2;
         StdDraw.line(x0, y0, x1, y1);
         //StdDraw.line(x0, y0, x2, y2);
         StdDraw.line(x0, y0, x3, y3);
         StdDraw.line(x2, y2, x3, y3);
         StdDraw.line(x3, y3, x1, y1);
         StdDraw.line(x0, y0, xa, y0);
         StdDraw.line(x2, y2, xa, y0);
         
         
         tree(n-1, x1, y1, size/2, angle ) ;
         tree(n-1, x2, y2, size/2, angle ) ;
         tree(n-1, x3, y3, size/2, angle ) ;
         //tree(n-1, x2, y2, size/2, angle + 45) ;

         //tree(n-1, (x0 + x1) / 2, (y0 + y1) / 2, size / 2);
         //tree(n-1, (x0 + x2) / 2, (y0 + y2) / 2, size / 2);
         //tree(n-1, (x0 + x2) / 2, (y0 + y2) / 2, size / 2);
        // }
     }

}

  