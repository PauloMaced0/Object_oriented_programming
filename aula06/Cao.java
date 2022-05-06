package aula06;

public class Cao extends Mamifero {
    @Override
    public void emitirSom() {
        System.out.println("Au! Au! Au!");
    }

    public void reagir(String frase) {
        if(frase == "toma comida" || frase == "olá"){
            System.out.println("abanar e ladrar");
        } else {
            System.out.println("rosnar");
        }
    }

    public void reagir(int hora, int min) {
        if(hora<12){
            System.out.println("abanar");
        } else if(hora>= 18){
           System.out.println("ignorar"); 
        } else {
            System.out.println("abanar e ladrar");
        }
    }

    public void reagir(int idade, double peso) {
        if(idade<5){
            if(peso<10){
                System.out.println("abanar");
            }else {
                System.out.println("ladrar");
            }
        } else {
            if(peso<10){
                System.out.println("rosnar");
            } else {
                System.out.println("ignorar");
            }
        }
    }

    public void reagir(boolean dono) {
        if(dono){
            System.out.println("abanar");
        } else {
            System.out.println("rosnar e ladrar");
        }
    }
}
