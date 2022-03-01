package aula02;

public class Pauta {
    public static void main(String[] args) {
        double[][] grades = {
            {8.5,10},
            {12,14.8},
            {11.3,9.3},
            {15.7,7.1},
            {8,13},
            {17,18},
            {19.4,17.5},
            {2.8,6.6},
            {9.1,10.5},
            {5.8,7.3},
            {9.4,10.5},
            {7.9,13.3},
            {17.4,12.1},
            {6.8,9.5},
            {10.3,9.1},
            {7.3,5.5},
        };
        System.out.format("%7s %7s %7s \n","NotaT","NotaP","Pauta");
        
        double pauta;
        for(int i = 0; i < 16;i++){
            pauta = 0.4*grades[i][0] + 0.6*grades[i][1];
            if(grades[i][0]<7 || grades[i][1]<7){
                pauta = 66;
            }
            System.out.format("%7s %7s %7s \n",grades[i][0],grades[i][1],(int)pauta);
        }
        
    }
}
