public class lista4ex7 {
 static boolean possibility(char[] arranjo) {
	 char[] tras= new char[arranjo.length];
	 char[] frente= new char[arranjo.length];
	 boolean pali= true;
	 for(int i=0;i<arranjo.length;i++) {
		 frente[i]=arranjo[i];
		 System.out.println(i);
		 System.out.println("frente:"+frente[i]);}
	 for(int j=arranjo.length-1; j>=0;j--) {
		 System.out.println("j:"+j);
		 tras[j]= arranjo[j];
		 System.out.println("tras:"+tras[j]);
	 }
  for(int n=0;n<arranjo.length;n++) {
	 for(int w=arranjo.length-1;w>=0;w--) {
	 if(frente[n]==tras[w]) {
	   pali= true;}
		else {
	   pali= false;
		 }
 }}
  return pali;}

public static void main(String[] args) {
	char[] arranjo= {'9','2','2','9'};
	System.out.println("É PALÍNDROMO: "+possibility(arranjo));
}
}
/*for(int i=0;i<arranjo.length;i++) {
char[] frente=new char[arranjo[i]];
System.out.println(frente); */