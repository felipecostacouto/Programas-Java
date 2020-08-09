
public class Lista4ex2 {
  static void metint(int[] listint) {
  System.out.println("os múltiplos de 7 na lista são:");
	  for(int i=0;i<listint.length;i++) {
		  if (listint[i]%7 == 0) {
	       System.out.print(listint[i]+"  ");
	  }
  }
  System.out.println();
  System.out.println();
  System.out.println("da lista completa:");
  for(int j= 0;j<listint.length;j++) {
	
	 System.out.print(listint[j]+" "); 
  }
  }
public static void main(String[] args) {
	int[] listint= {7,4,32,42,9,2,70,35};
	metint(listint);

}}
