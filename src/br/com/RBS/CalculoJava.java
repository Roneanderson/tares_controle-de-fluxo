package br.com.RBS;
/* @autor Rone
 */
//calculadora de media que faz leitura de notas e gerar resultado do calulo da notas bimestrais
import java.util.Scanner;

public class CalculoJava {
    public  static void main(String args[]) {
        //Scanner imprimir no console
        Scanner s = new Scanner(System.in);
        //receber a notas
        float nota1, nota2, nota3, nota4, media;
        //imprimir no console a mensagem
        System.out.println("Por favor informe as 4 notas");
        //aguarda a mensagem para fazer interração com usuario
        nota1 = s.nextFloat();
        nota2 = s.nextFloat();
        nota3 = s.nextFloat();
        nota4 = s.nextFloat();

        media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("O totaL da notas é: " + media + " pontos");
         String mediaSt = getMedia((int) media);
         System.out.println(mediaSt);
    }
        //função para realizar calculo da media bimestral de alunos
    public static String getMedia(int media) {
        if (media > 1 && media < 5) {
            System.out.println("Aluno reprovado");
        } else if (media >= 7 && media <= 10) {
            System.out.println("aluno aprovado");
        } else {
            boolean b = media < 10;
        }
        return "erro na média, refaça o calculo";
    }
}

