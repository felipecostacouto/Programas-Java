public class quadrado {
	static int n;
	static int m;
	static int lado;
  static void metodo(int colunas,int linhas) {
	  n=linhas;
	  m=colunas;
	  
  } 
  public static void main(String[] args){
           n=5;//linhas
           m=5;//colunas
           lado=5;
     for (int j= 0; j< n; j++){
       for (int i= 1; i< m; ++i){
         System.out.print("*");//colunas
        	      
        	    }

       System.out.println("*");//linhas
        	}
     //contador númerico
     for (int cont1 = 1; cont1 <=6; cont1++) {//linha
       for (int cont2 = cont1; cont2 <=36; cont2=cont1+cont2) System.out.print("\t"+cont2);//coluna
       System.out.println();
       
        		  }

         	
      //como montar um quadrado vazio no meio   
	  for(int i = 0; i<lado;i++){
	    if(i==0 || i==(lado-1)){
	         for(int j = 0; j<lado;j++){
	              System.out.print("*");
	         }
	    }
	    else
	    {
	         for(int j = 0; j<lado;j++){
	              if(j==0 || j==(lado - 1)) {
	                   System.out.print("*");
	              }
	              else
	              {
	                   System.out.print(" ");
	              }
	         }
	    }
	System.out.println();
	  }
	 
}}