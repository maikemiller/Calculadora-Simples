package calculadora.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo a Calculadora Simples!");

        double num1, num2; //Variáveis para receber numeros a calcular
        
        System.out.println("Digite o valor do primeiro numero a calcular: "); //Solicita ao usuário que insira o primeiro numero a calcular.
        num1 = scanner.nextDouble(); // Lê o numero escolhido pelo usuário.

        System.out.println("Escolha qual tipo de operação (-, +, /, *): "); //Solicita ao usuário que insira qual o operador matemático a utilizar.
        char operador = scanner.next().charAt(0);

        System.out.println("Digite o valor do segundo numero a calcular: "); //Solicita ao usuário que insira o segundo numero a calcular.
        num2 = scanner.nextDouble();

        double resultado; //armazena o resultado da operação

        //faz as operações de acordo com cada operador matemático escolhido.
        switch (operador) {
            case '+':
            resultado = num1+num2;
            System.out.println("Resultado: " + num1 + " + " + num2 + " = " + resultado);
                break;

            case '-':   
            resultado = num1-num2;
            System.out.println("Resultado: " + num1 + " - " + num2 + " = " + resultado);
                break;

            case '*':   
            resultado = num1*num2;
            System.out.println("Resultado: " + num1 + " * " + num2 + " = " + resultado);
                break;

            case '/':
            if (num2 !=0) {       //testa se o segundo numero inserido é diferente de 0
                resultado = num1/num2;
                System.out.println("Resultado: " + num1 + " / " + num2 + " = " + resultado);
            }   else {
                System.out.println("Erro, Divisão por 0 não é permitida. ");
            }
            break;

            default:  //caso o operador seja diferente dos orientados a inserir o sistema retorna o erro. 
                System.out.println("Erro, operador invalido; Use apenas +, -, * ou /.");;
        }

    }
}