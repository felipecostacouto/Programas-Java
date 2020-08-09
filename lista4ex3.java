public class lista4ex3 {

   static String toString(double[] num1,double[] num2) {
	   double somareal;
	   double somaimag;
	   somareal=num1[0]+num2[0];
	   somaimag=num1[1]+num2[1];
	 System.out.println("a+b*i");
	 System.out.println("parte real: "+somareal+"  parte imaginária: "+somaimag);  
	 System.out.println();
	 return(somareal+" + "+somaimag+"(*i)");
   }
public static void main(String[] args) {
	double[] num1= {12,-4};
	double[] num2= {-10,7};
    System.out.println("A soma dos valores = "+toString(num1,num2));
}
}