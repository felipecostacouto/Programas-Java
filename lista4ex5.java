
public class lista4ex5 {
	 static double metodomedia(double[] list) {
	    	double maior= list[0];
	    	double menor= list[0];
	    	double media=0;
	    	int indexmaior=0;
	    	int indexmenor=0;
	     for(int i=0 ;i<list.length;i++) {
	          if(maior<=list[i]) {  //ele quer a última ocorrência
	    	    maior=list[i];
	    	    indexmaior=i;
	    	    }
	          else if(menor>list[i]) { //ele quer a primeira ocorrência
				  menor=list[i];
				  indexmenor=i;}
	     
	     media+=list[i];
	     }
	     media=media-maior-menor;   //gambiarra
	     media=media/(list.length -2);  //gambiarra
	     System.out.println("maior valor: "+maior);
	     System.out.println("indice maior valor: "+indexmaior);
		 System.out.println("menor valor: "+menor);
	     System.out.println("indice menor valor: "+indexmenor);
	     System.out.println();
		 return media ;}
	 public static void main(String[] args) {
		 double[] list= {1,2,3,4,5,6};
		 System.out.println("media: "+metodomedia(list));
		 }
}