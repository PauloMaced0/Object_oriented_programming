package aula02;
import java.util.Scanner;
import java.util.Random;

public class Highlowgame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str;
        int givenumber,attemps,max,min,numberinterval;
        do{
            
            max = 100;
            min = 1;
            Random randnumber = new Random();
            numberinterval = min + randnumber.nextInt(max);
            
            attemps = 0;
            do{
                givenumber = sc.nextInt();
                if(givenumber>numberinterval){
                    System.out.println("HIGH!!!");
                } else if (givenumber<numberinterval){
                    System.out.println("LOW!!!");
                } else {
                    System.out.println("YOU DID IT!!!");
                }
                attemps += 1;
            } while(numberinterval != givenumber);
            System.out.format("You did it after %d attemps! \n",attemps);
            System.out.println("\n Novo Jogo? Prima (S)im");
            str = sc.next();
            
        } while(str.equals("S") || str.equals("Sim"));
        
        sc.close();    
    }   
}
