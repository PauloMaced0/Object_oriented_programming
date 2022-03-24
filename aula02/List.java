package aula02;
// import java.util.ArrayList;
import java.util.Scanner;

public class List {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Number???");
        double incnumber = sc.nextDouble();

        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        int items = 1;
        double count = incnumber;
        while(true){
            double number = sc.nextDouble();
            if (max<number){
                max = number;
            }
            if(min>number){
                min = number;
            }
            items +=1;
            count +=number;
            if(number == incnumber){break;}
        }
        System.out.println("Número de elementos lidos:"+items);
        System.out.format("Média:%.1f\n",count/items);
        System.out.println("Máximo:"+max);
        System.out.println("Mínimo:"+min);
        
        //ArrayList<Double> numbers = new ArrayList<>();
        
        // System.out.println("Number:???");
        // double first_number = sc.nextDouble();
        // numbers.add(first_number);

        // double other_numbers;
        // while(true){
        //     System.out.println("Number:???");
        //     other_numbers = sc.nextDouble();
        //     numbers.add(other_numbers);
        //     if (other_numbers == first_number){ break; }
        // }
        // int total_numbers = 0;
        // double soma = 0;
        // for(int i = 0; i < numbers.size();i++){
        //     soma += numbers.get(i);
        //     total_numbers += 1;  
        // }
        // double media = soma/total_numbers;

        // double max,min;
        // max = Double.MIN_VALUE;
        // min = Double.MAX_VALUE;
        // for(int m = 0;m < numbers.size();m++){
        //     if(numbers.get(m) > max){
        //         max = numbers.get(m);
        //     }
        // }
        // for(int n = 0;n < numbers.size();n++){
        //     if(numbers.get(n) < min){
        //         min = numbers.get(n);
        //     }
        // }
        // System.out.println("Número de elementos lidos:"+total_numbers);
        // System.out.println("Média:"+media);
        // System.out.println("Máximo:"+max);
        // System.out.println("Mínimo:"+min);

        sc.close();
    }
}
