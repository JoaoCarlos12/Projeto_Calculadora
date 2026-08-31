package br.com.joao.classes;

import br.com.joao.interfaces.Calculos;

import java.util.Scanner;

public class Calculadora implements Calculos {
    Scanner entrada = new Scanner(System.in);
    Double a, b;

    public Calculadora() {
    }

    @Override
    public Double soma(Double a, Double b){
        // Calculo para realizar a soma
        Double calc_soma  = a + b;
        //Retorno do valor realizado na soma
        return calc_soma;
    }

    @Override
    public Double Subtracao(Double a, Double b) {
        //Calculo para realizar a subtração
        Double calc_sub = a - b;
        //Retorno do valor do calculo
        return calc_sub;
    }

    @Override
    public Double multiplicação(Double a, Double b) {
        // Calculo para realizar a multiplicacao
        Double calc_mult = a * b;
        //Retorno do valor realizado na multiplicacao
        return calc_mult;
    }


    public void realizar_soma(){
        System.out.println("Digite o primeiro numero: ");
        a = entrada.nextDouble();
        System.out.println("Digite o segundo numero: ");
        b = entrada.nextDouble();
        System.out.println("A soma dos numeros é " + soma(a, b));
    }

    public void realizar_subtracao(){
        System.out.println("Digite o primeiro numero: ");
        a = entrada.nextDouble();
        System.out.println("Digite o segundo numero: ");
        b = entrada.nextDouble();
        System.out.println("A valor da subtração dos numero é " + Subtracao(a, b));
    }

    public void realizar_multiplicacao(){
        System.out.println("Digite o primeiro numero: ");
        a = entrada.nextDouble();
        System.out.println("Digite o segundo numero: ");
        b = entrada.nextDouble();
        System.out.println("A valor da subtração dos numero é " + multiplicação(a, b));
    }
}
