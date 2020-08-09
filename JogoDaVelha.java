/*********************************************************************/
/**   ACH2001 - Introdução a Programação                            **/
/**   EACH-USP - Primeiro Semestre de 2020                          **/
/**   <04> - <Norton Trevisan Roman>                                **/
/**                                                                 **/
/**   Terceiro Exercício-Programa                                   **/
/**                                                                 **/
/**   <Felipe Monteiro Costa Couto>                   <11884800>    **/
/**                                                                 **/
/**   <01/06/2020>                                                  **/
/*********************************************************************/

/*
	Jogo da Velha - programa para verificar o status de um jogo.
	
	Lista de Status calculado:
	0 – Jogo não iniciado: o tabuleiro esta “vazio”, isto é sem peças X e O;
 1 – Jogo encerrado 1: o primeiro jogador (que usa as peças X) é o ganhador;
 2 – Jogo encerrado 2: o segundo jogador (que usa as peças O) é o ganhador;
 3 – Jogo encerrado 3: empate – todas as casas do tabuleiro estão preenchidas com X e
O, mas nenhum dos jogadores ganhou;
 4 – Jogo ja iniciado e em andamento: nenhuma das alternativas anteriores.
*/

public class JogoDaVelha {
	static final char pecaX = 'X';
	static final char pecaY = 'O';
	static final char espacoVazio = ' ';

	/*
		Determina o status de uma partida de Jogo da Valha
		O jogo é sempre iniciado pelo jogador X pecaX
		Entrada:
			tabuleiro - matriz 3x3 de caracteres representando uma partida valida de Jogo da Velha
			
		Saida:
			um inteiro contendo o status da partida (valores válidos de zero a quatro)
	*/
	static int verificaStatus(char[][] tabuleiro) {
		int status = -1;
        
		
				
			      if (tabuleiro[0][0]==espacoVazio && tabuleiro[0][1]==espacoVazio && tabuleiro[0][2]==espacoVazio &&
				      tabuleiro[1][0]==espacoVazio && tabuleiro[1][1]==espacoVazio && tabuleiro[1][2]==espacoVazio &&
				      tabuleiro[2][0]==espacoVazio && tabuleiro[2][1]==espacoVazio && tabuleiro[2][2]==espacoVazio) {
				          status=0;}
			      else {
			      if(tabuleiro[0][0]==pecaX && tabuleiro[0][1]==pecaX && tabuleiro[0][2]==pecaX ||
					  tabuleiro[1][0]==pecaX && tabuleiro[1][1]==pecaX && tabuleiro[1][2]==pecaX ||
					  tabuleiro[2][0]==pecaX && tabuleiro[2][1]==pecaX && tabuleiro[2][2]==pecaX ||//possibilidades horizontais
					  tabuleiro[0][0]==pecaX && tabuleiro[1][0]==pecaX && tabuleiro[2][0]==pecaX ||
					  tabuleiro[0][1]==pecaX && tabuleiro[1][1]==pecaX && tabuleiro[2][1]==pecaX ||
					  tabuleiro[0][2]==pecaX && tabuleiro[1][2]==pecaX && tabuleiro[2][2]==pecaX ||//possibilidades verticais
					  tabuleiro[0][0]==pecaX && tabuleiro[1][1]==pecaX && tabuleiro[2][2]==pecaX||
					  tabuleiro[0][2]==pecaX && tabuleiro[1][1]==pecaX && tabuleiro[2][0]==pecaX) { //possibilidades diagonais
					      status=1;}
			      else if(tabuleiro[0][0]==pecaY && tabuleiro[0][1]==pecaY && tabuleiro[0][2]==pecaY ||
					  tabuleiro[1][0]==pecaY && tabuleiro[1][1]==pecaY && tabuleiro[1][2]==pecaY ||
					  tabuleiro[2][0]==pecaY && tabuleiro[2][1]==pecaY && tabuleiro[2][2]==pecaY ||//possibilidades horizontais
					  tabuleiro[0][0]==pecaY && tabuleiro[1][0]==pecaY && tabuleiro[2][0]==pecaY ||
					  tabuleiro[0][1]==pecaY && tabuleiro[1][1]==pecaY && tabuleiro[2][1]==pecaY ||
					  tabuleiro[0][2]==pecaY && tabuleiro[1][2]==pecaY && tabuleiro[2][2]==pecaY ||//Possibilidades verticais
					  tabuleiro[0][0]==pecaY && tabuleiro[1][1]==pecaY && tabuleiro[2][2]==pecaY||
					  tabuleiro[0][2]==pecaY && tabuleiro[1][1]==pecaY && tabuleiro[2][0]==pecaY) { //possibilidades diagonais
					  status=2;}
			      else if(tabuleiro[0][0]==espacoVazio || tabuleiro[0][1]==espacoVazio || tabuleiro[0][2]==espacoVazio ||
				      tabuleiro[1][0]==espacoVazio || tabuleiro[1][1]==espacoVazio || tabuleiro[1][2]==espacoVazio ||
				      tabuleiro[2][0]==espacoVazio || tabuleiro[2][1]==espacoVazio || tabuleiro[2][2]==espacoVazio) {
			    	  status=4;}
			      else {status=3;}}
			
		return status;
	}//fim metodo	

public static void main(String[] args) {
		// escreva seu código (para testes) aqui
		char[][] tabuleiro1= {{'X','O','O'},{'O','O','X'},{'O','X','X'}};
		System.out.println("status teste: "+verificaStatus(tabuleiro1));
        System.out.println("Status esperado para o tabuleiro teste: 2\n");
        
		char[][] tab0 = {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
		char[][] tab1 = {{'X','X','X'},{'O','O',' '},{' ',' ',' '}};
		char[][] tab2 = {{'O','X','X'},{'X','O','O'},{' ',' ','O'}};
		char[][] tab3 = {{'O','X','X'},{'X','O','O'},{'O','X','X'}};
		char[][] tab4 = {{' ',' ',' '},{'X','O','X'},{' ',' ',' '}};

		System.out.println("Status calculado: " + verificaStatus(tab0));
		System.out.println("Status esperado para o tabuleiro0: 0\n");

		System.out.println("Status calculado: " + verificaStatus(tab1));
		System.out.println("Status esperado para o tabuleiro1: 1\n");

		System.out.println("Status calculado: " + verificaStatus(tab2));
		System.out.println("Status esperado para o tabuleiro2: 2\n");
		
		System.out.println("Status calculado: " + verificaStatus(tab3));
		System.out.println("Status esperado para o tabuleiro1: 3\n");
		
		System.out.println("Status calculado: " + verificaStatus(tab4));
		System.out.println("Status esperado para o tabuleiro4: 4\n");
		

	}
}
