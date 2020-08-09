/*********************************************************************/
/**   ACH2001 - Introdução à Programação                            **/
/**   EACH-USP - Primeiro Semestre de 2020                          **/
/**   <turma:104> - <Norton Trevisan Roman>                         **/
/**                                                                 **/
/**   Primeiro Exercício-Programa                                   **/
/**                                                                 **/
/**   <(Felipe Monteiro Costa Couto)>          <11884800>            **/
/**                                                                 **/
/**   <14/04/2020>                                             **/
/*********************************************************************/

/*
	Caixa eletrônico das Ilhas Weblands, com estoque ilimitado de cédulas
	de B$50,00, B$10,00, B$5,00 e B$1,00.
*/
public class CaixaEletronico {
	// Número de cédulas de B$50,00
	static int n50;
	//
	// Número de cédulas de B$10,00
	static int n10;

	// Número de cédulas de B$5,00
	static int n5;
	
	// Número de cédulas de B$1,00
	static int n1;

    static int n;// criei essa variável auxiliar para printar o valor no fim do programa, ela é atribuida no faz retirada
	/*
		Determina a quantidade de cada nota necessária para totalizar
		um determinado valor de retirada, de modo a minimizar a quantidade
		de cédulas entregues.
		
		Abastece as variáveis globais n50,n10, n5 e n1 com seu respectivo
		número de cédulas.
		
		Parâmetro:
			valor - O valor a ser retirado
	*/
	/* explicação do algoritmo no final*/
	static void fazRetirada(int valor) {
		n=valor;
		int n10aux; 
		int n5aux;
		int n1aux;
		if(valor>=0) {
		n50=valor/50; //divisão inteira          
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
	    /* peguei o resto da divisão inteira de valor por 50,ou seja,
		 descontei as notas de 50 já contabilizadas, fiz a divisão inteira de novo pela
		 proxima nota, assim em diante*/
        /* essa váriavel auxiliar serve para armazenar o resto da divisão anterior e passar para
          outra cédula de menor valor*/

