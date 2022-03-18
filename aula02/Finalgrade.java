package aula02;
import java.util.Scanner;
import java.lang.Math;

public class Finalgrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota_pratica,nota_teorica,nota_final;
        
        do{
            System.out.println("Nota Prática:???");
            nota_pratica = sc.nextDouble();
            System.out.println("Nota Teórica:???");
            nota_teorica = sc.nextDouble();
            if((nota_pratica<0 || nota_pratica>20) || (nota_teorica<0 || nota_teorica>20 )){
                System.out.println("Nota Prática/Teórica --> [0..20]!!!");
            }
        } while((nota_pratica<0 || nota_pratica>20) || (nota_teorica<0 || nota_teorica>20 ));
        
        if(nota_pratica<7 || nota_teorica<7 ){
            System.out.println("Reprovado por nota minima!");
        } else{
            nota_final = 0.4*nota_teorica + 0.6*nota_pratica;
            if(nota_final<9.5){
                System.out.println("Reprovado!");
            } else{
                System.out.format("Nota final: %d \n",Math.round(nota_final));
            }
        }
        sc.close();
    }
}
