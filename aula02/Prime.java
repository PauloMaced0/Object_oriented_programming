package aula02;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = 0;
        while(number < 1){
            System.out.println("Number:???");
            number = sc.nextInt();
        }
        boolean prime = true;
        for(int i = 2; i<number;i++){
            if (number % i == 0){
                prime = false;
            }
        }
        if(prime==true){
            System.out.format("%d is prime! \n",number);
        } else {
            System.out.format("%d isn't prime \n",number);
        }
        sc.close();
    }
}
