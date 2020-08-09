public class Lista4ex1 {
	
 static float metodo(float[] list) {
    float maior=list[0];
  for(int i=1; i< list.length; i++) {
	    if(list[i]>maior) {
		  maior=list[i];}
		  }
  return(maior);
  }
 public static void main(String[] args) {
   float[] list= {-7,9,12, 67,69};
   System.out.println("o maior valor da lista= "+ metodo(list));
 }
 
}

/*public static void main(String[] args) {
float[] list= {20,30,40,2,777,65,-2};
float maior=list[0];
for(int i=1; i< list.length; i++) {
	    if(list[i]>maior) {
		  maior=list[i];}
		  }
System.out.println(maior);
} */