public class lista4ex15 {
   public static void result(int[] first,int[] second) {
	   int[] soma= new int[first.length];
	   int ordem;
	 
	   for(int i=first.length-1;i>=0;i--) {
		   if((first[i]+second[i])>9) {
		    soma[i]=(first[i]+second[i])-10;
			   }
		   else if((first[i+1]+second[i+1])>9) {
			 soma[i]=first[i]+second[i]+1;}
		   else {
		   soma[i]=first[i]+second[i];}
		   }// System.out.print(soma[i]+" ")
	  
	   System.out.println("o Resultado da soma é:");
	   for(int n=0;n<first.length;n++){
	    	ordem=soma[n];
	    	System.out.print(" "+ordem+" ");}
	  
		   
}
 
public static void main(String[] args) {
	int[] first= {3,4,5,1,8,0,5};
	int[] second= {0,0,7,3,1,1,8};
	 
	result(first,second);
	
	
}
}

/*if(first.length != second.length) {
		  int dif=(first.length)-(second.length);
		  second =  new int[secondif];
		   } /  */