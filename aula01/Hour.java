package aula01;
import java.util.Scanner;

public class Hour {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int seg,min,hour,resto;
        System.out.println("Tempo em seg:???");
        seg = ler.nextInt();
        hour = seg / 3600;
        resto = seg % 3600;
        min = resto / 60;
        seg = resto % 60;
        System.out.format("%02d:%02d:%02d \n",hour,min,seg);
        ler.close();
    }
}
