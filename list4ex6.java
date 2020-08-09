
public class list4ex6 {
   static double mediapond(double[] x, double[] p) {
	      double media=0;
	      double n=0;
	   for(int i=0; i< p.length;i++) {
		   media+=x[i]*p[i];
		   n+=p[i];
		   if(x.length != p.length) {
				 System.out.println("indíces diferentes");
				 media=0;
				    break; }
		   else {
				 continue;}
       }
	   media=media/n;
	   return media;}
public static void main(String[] args) {
	double[] x={1,3,2,5};// valores
	double[] p= {80,70,120,72};//pesos
	System.out.println("a medida ponderada é: "+mediapond(x,p));
}
}
