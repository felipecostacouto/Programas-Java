/*
	Programa para calcular a �rea de uma casa com piscina, conforme
	projeto espec�fico.
*/
class CasaRet_Aula08 {
	/* Valor do metro quadrado para a constru��o */
	static double valorM2 = 1500;
	
	/* Materiais para a piscina */
	static final int ALVENARIA = 0;
	static final int VINIL = 1;
	static final int FIBRA = 2;
	static final int PLASTICO = 3;
	
	/*
		M�todo para calcular a �rea de uma casa (e seus c�modos)
		de 3 c�modos: uma sala, um banheiro e um quarto.
		
		Par�metros:
			lateral: comprimento da lateral da sala
			cquarto: comprimento da lateral maior do quarto
	*/
	static void areaCasa(float lateral,float cquarto){
		float areaq; // �rea do quarto
		float areas; // �rea da sala
		float areat; // �rea total
		
		if (lateral<0 || cquarto<0)
			System.out.println("Erro: par�metro<0");
		else {
			System.out.println("Programa para c�lculo da �rea da casa");
			areas = lateral*lateral;
			System.out.println("A �rea da sala � "+areas);
			areaq = cquarto*(lateral/2);
			System.out.println("A �rea do quarto � "+areaq);
			System.out.println("A �rea do banheiro � "+areaq);
			areat = areas + 2*areaq;
			System.out.println("A �rea total � " + areat);
		}
	}
	
	/*
		Calcula o valor de uma casa.
		
		Par�metro:
			area: �rea da constru��o
		
		Retorna:
			O valor (pre�o) da constru��o, ou -1 se a �rea for negativa
	*/
	static double valor(double area) {
		if (area >= 0) return(valorM2*area);
		return(-1);
	}
	
	/*
		M�todo para calcular a �rea de uma piscina redonda.
		
		Par�metro:
			raio: tamanho do raio da piscina
		
		Retorna:
			A �rea da piscina, ou -1 se o raio for negativo
	*/
	static double areaPiscina(double raio){
		return((raio >= 0) ? Math.PI*Math.pow(raio,2) : -1);
	}
	
	/*
		Calcula o valor de uma piscina.
		
		Par�metro:
			area: �rea da piscina
			material: material de que � feita
		
		Retorna:
			O valor (pre�o) da constru��o, ou -1 se a �rea for negativa
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
		System.out.println("�rea\tMaterial\tValor");
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