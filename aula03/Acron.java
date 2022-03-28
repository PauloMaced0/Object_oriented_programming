package aula03;
import java.util.Scanner;

public class Acron {
    private static String acronim(String string){
        String[] strarray = string.split(" +");
        
        String acronim = "";
        
        //for(String word : strarray){
        for(int i = 0;i<3;i++){  
            if (Character.isUpperCase(strarray[i].charAt(0))){
                    acronim += strarray[i].charAt(0);
            }
        }
        return acronim;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("???");
        String str = sc.nextLine();
        sc.close();

        System.out.println(acronim(str));
    }
}
