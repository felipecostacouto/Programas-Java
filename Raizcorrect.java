
public class Raizcorrect {

        static double mod(double a) {

            if (a < 0) {
                a = a * -1;
            }

            return a;
        }

        static double raizQuadrada(double a, double epsilon) {
            double chuteAtual;
            double ultimoChute;

            chuteAtual = a / 2; // Primeira interação para se aproximar da raiz quadrada.

            do {

                ultimoChute = chuteAtual;
                chuteAtual = 0.5* (ultimoChute + a / ultimoChute);

            } while (mod(chuteAtual - ultimoChute) >= epsilon);

            return chuteAtual;}
        public static void main(String[] args) {
                double a = -63;
                double epsilon = 0.01;
                System.out.println("Raiz de : " + a + " = " + raizQuadrada(a, epsilon));
            }
        
    }
