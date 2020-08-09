
public class lista4ex4 {
   static int metodomaior(double[] list) {
    	double maior= list[0];
    	int indexmai=0;
     for(int i=0 ;i<list.length;i++) {
          if(maior<=list[i]) {  //ele quer a última ocorrência
    	    maior=list[i];
    	    indexmai=i;}
    }
      System.out.println("maior valor: "+maior);
      return indexmai;}
  static int metodomenor(double[] list) {
	  double menor= list[0];
	  int indexmen=0;
	 for(int i=0; i<list.length;i++) {
		  if(menor>list[i]) { //ele quer a primeira ocorrência
			  menor=list[i];
			  indexmen= i;}
	  }
	 System.out.println("menor valor: "+menor);
	 return indexmen;}
 public static void main(String[] args) {
	 double[] list= {7,29,9,3,29};
	 System.out.println("O indíce do maior valor: "+ metodomaior(list));//posição no array
	 System.out.println();
	 System.out.println("O indíce do menor valor: "+ metodomenor(list));//posição no array
 }
}
