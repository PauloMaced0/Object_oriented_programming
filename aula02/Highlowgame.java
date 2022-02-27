package aula02;
import java.util.Scanner;
import java.util.Random;

public class Highlowgame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int max = 100;
        int min = 1;
        Random randnumber = new Random();
        int numberinterval = min + randnumber.nextInt(max);

        int givenumber,attemps;
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
        
        sc.close();    
    }   
}
