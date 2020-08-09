/*********************************************************************/
/**   ACH2001 - Introdu��o � Programa��o                            **/
/**   EACH-USP - Primeiro Semestre de 2020                          **/
/**   <turma:104> - <Norton Trevisan Roman>                         **/
/**                                                                 **/
/**   Primeiro Exerc�cio-Programa                                   **/
/**                                                                 **/
/**   <(Felipe Monteiro Costa Couto)>          <11884800>            **/
/**                                                                 **/
/**   <14/04/2020>                                             **/
/*********************************************************************/

/*
	Caixa eletr�nico das Ilhas Weblands, com estoque ilimitado de c�dulas
	de B$50,00, B$10,00, B$5,00 e B$1,00.
*/
public class CaixaEletronico {
	// N�mero de c�dulas de B$50,00
	static int n50;
	//
	// N�mero de c�dulas de B$10,00
	static int n10;

	// N�mero de c�dulas de B$5,00
	static int n5;
	
	// N�mero de c�dulas de B$1,00
	static int n1;

    static int n;// criei essa vari�vel auxiliar para printar o valor no fim do programa, ela � atribuida no faz retirada
	/*
		Determina a quantidade de cada nota necess�ria para totalizar
		um determinado valor de retirada, de modo a minimizar a quantidade
		de c�dulas entregues.
		
		Abastece as vari�veis globais n50,n10, n5 e n1 com seu respectivo
		n�mero de c�dulas.
		
		Par�metro:
			valor - O valor a ser retirado
	*/
	/* explica��o do algoritmo no final*/
	static void fazRetirada(int valor) {
		n=valor;
		int n10aux; 
		int n5aux;
		int n1aux;
		if(valor>=0) {
		n50=valor/50; //divis�o inteira          
		n10aux=valor%50;// resto
		n10=n10aux/10;  
		n5aux=n10aux%10;
		n5=n5aux/5;
		n1aux=n5aux%5;
		n1=n1aux/1;}
		else{n50=-1;
		n10=-1;
		n5=-1;
		n1=-1;
		}
	}
	public static void main(String[] args) {
		fazRetirada(257);
		System.out.println(n);
		System.out.println("Notas de 50: "+n50);
		System.out.println("Notas de 10: "+n10);
		System.out.println("Notas de 5:  "+n5);
		System.out.println("Notas de 1:  "+n1);}
}
	    /* peguei o resto da divis�o inteira de valor por 50,ou seja,
		 descontei as notas de 50 j� contabilizadas, fiz a divis�o inteira de novo pela
		 proxima nota, assim em diante*/
        /* essa v�riavel auxiliar serve para armazenar o resto da divis�o anterior e passar para
          outra c�dula de menor valor*/

