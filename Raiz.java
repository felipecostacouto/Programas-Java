/*********************************************************************/
/**   ACH2001 - Introdu��o � Programa��o                            **/
/**   EACH-USP - Primeiro Semestre de 2020                          **/
/**   <04> - <Norton Trevisan Roman>                                **/
/**                                                                 **/
/**   Segundo Exerc�cio-Programa                                    **/
/**                                                                 **/
/**   <Felipe Monteiro Costa Couto>           <11884800>            **/
/**                                                                 **/
/**   <06/05/2020>                                                  **/
/*********************************************************************/

/*
	C�lculo para raiz quadrada
*/
public class Raiz {
		/*Calcula a raiz quadrada de um valor, com uma determinada
		precis�o. Retorna esse valor, ou -1 quando:
		
		* a < 0
		* epsilon <= 0
		* epsilon >= 1
		
		Par�metro:
			a - valor cuja raiz quadrada ser� calculada
			epsilon - precis�o do c�lculo
	*/
	static double raizQuadrada(double a, double epsilon) {
		 
		 double x;    // primeira raiz, atualizada xi+1
		 double xn;  // raiz anterior xi
		 double dif;
		       x=a/2; // x0
		if ( a < 0 || epsilon <= 0 || epsilon >=1) return -1 ;
		    do { 
		    	xn=x; // atualizar o valor de x na f�rmula na repeti��o do la�o
		    	x = 0.5*(xn+(a/xn));
		    	dif=(xn-x);  
		    	 if(dif<0) {//corre��o do incremento para que tenha sempre valor positivo e seja limitado apenas pelo while, meio que uso de modulo
		    		 dif=dif*(-1);
		    	      }
		    	System.out.println(xn-x);//possibilidade de ver as intera��es botando system.out.println(x) nessa linha
		    }while(dif>= epsilon);// o la�o IF junto ao while condiciona o limite
		     System.out.println();
	        return x;// la�o Do exige um retorno, n�o bote println aqui
		    	
	}

	public static void main(String[] args) {
		
		// Exemplo de teste:
		double a=63;
		double epsilon=0.001;
		System.out.println("Raiz de : "+a+" = "+raizQuadrada(a, epsilon));
	}
}
// utilizei vari�veis auxiliar para ir trocando o valor da raiz at� o ponto onde o la�o while � aceito
// m�todo semelhante a newton-raphson(nesse outro se utiliza fx de dx)
//erro para valores menores que 1, corrigir

/* 3.14159 (0.01): 1.772453102962626

0.14159 (0.01): 0.3762883049663319

0.003 (1.0E-6): 0.05477225575058863
3.141592653589793 (0.001): 1.772453851526627
 */
//ERRO para valores com muitas casas decimais ou menores que 1 o valor de xn-x se torna negativo logo na primeira intera��o, dessa forma ache o modo de botar o xn-x em modulo