import java.util.Scanner;
import br.com.joao.classes.Calculadora;
public class Main {
    public static void main(String[] args) {
        int opcao;
        Double a,b;
        Scanner entrada = new Scanner(System.in);
        Calculadora calculos = new Calculadora();

        do {
            System.out.println("========== CALCULADORA ==========\n" +
                    "1 - Somar\n2 - Subtrair\n3 - Multiplicar\n4 - Sair");

            opcao = entrada.nextInt();
            switch (opcao) {
                case 1:
                    calculos.realizar_soma();
                    break;
                case 2:
                    calculos.realizar_subtracao();
                    break;
                case 3:
                    calculos.realizar_multiplicacao();
                }
            }while(opcao != 4);
        }
    }