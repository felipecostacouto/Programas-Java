/*
	Programa para calcular a área de uma casa com piscina, conforme
	projeto específico.
*/
class CasaRet_Aula08 {
	/* Valor do metro quadrado para a construção */
	static double valorM2 = 1500;
	
	/* Materiais para a piscina */
	static final int ALVENARIA = 0;
	static final int VINIL = 1;
	static final int FIBRA = 2;
	static final int PLASTICO = 3;
	
	/*
		Método para calcular a área de uma casa (e seus cômodos)
		de 3 cômodos: uma sala, um banheiro e um quarto.
		
		Parâmetros:
			lateral: comprimento da lateral da sala
			cquarto: comprimento da lateral maior do quarto
	*/
	static void areaCasa(float lateral,float cquarto){
		float areaq; // área do quarto
		float areas; // área da sala
		float areat; // área total
		
		if (lateral<0 || cquarto<0)
			System.out.println("Erro: parâmetro<0");
		else {
			System.out.println("Programa para cálculo da área da casa");
			areas = lateral*lateral;
			System.out.println("A área da sala é "+areas);
			areaq = cquarto*(lateral/2);
			System.out.println("A área do quarto é "+areaq);
			System.out.println("A área do banheiro é "+areaq);
			areat = areas + 2*areaq;
			System.out.println("A área total é " + areat);
		}
	}
	
	/*
		Calcula o valor de uma casa.
		
		Parâmetro:
			area: área da construção
		
		Retorna:
			O valor (preço) da construção, ou -1 se a área for negativa
	*/
	static double valor(double area) {
		if (area >= 0) return(valorM2*area);
		return(-1);
	}
	
	/*
		Método para calcular a área de uma piscina redonda.
		
		Parâmetro:
			raio: tamanho do raio da piscina
		
		Retorna:
			A área da piscina, ou -1 se o raio for negativo
	*/
	static double areaPiscina(double raio){
		return((raio >= 0) ? Math.PI*Math.pow(raio,2) : -1);
	}
	
	/*
		Calcula o valor de uma piscina.
		
		Parâmetro:
			area: área da piscina
			material: material de que é feita
		
		Retorna:
			O valor (preço) da construção, ou -1 se a área for negativa
	*/
	static double valorPiscina(double area, int material) {
		switch (material) {
			case ALVENARIA: return(area*1500);
			case VINIL: return(area*1100);
			case FIBRA: return(area*750);
			case PLASTICO: return(area*500);
			default: return(-1);		
		}
	}

	public static void main(String[] args) {
		double area = 50;
		int tipo=0;
		System.out.println("Área\tMaterial\tValor");
		while (area <= 200) {
			tipo = ALVENARIA;
			while (tipo <= PLASTICO) {
				System.out.println(area+"\t"+tipo+"\t\t"+valorPiscina(area,tipo));
				tipo = tipo+1;
				
			}
			area = area+50;
				}
		for(int cont = 1; cont <= 5; cont++) System.out.print("Oi");
	}
}