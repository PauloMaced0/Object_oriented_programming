package aula01;
import java.util.Scanner;

public class energy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double kg,energ;
        int tempi,tempf;
        System.out.println("Quantidade de água(kg):");
        kg  = sc.nextDouble();
        System.out.println("Temperatura inicial:");
        tempi = sc.nextInt();
        System.out.println("Temperatura final");
        tempf = sc.nextInt();
        energ = kg*(tempf-tempi)*4184;
        System.out.format("Q= %4.2f J \n",energ);

        sc.close();
    }
}
