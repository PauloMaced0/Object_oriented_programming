package aula02;

public class Loopprime {
    public static void main(String[] args) {
        int primo,count,num;
        for (primo = 2;;primo++){
            num = primo;
            count = 0;
            do{
                if(primo % num == 0){
                    count++;
                }
                num--;
            }while(num >0);          
            if(count == 2){
                System.out.println(primo);
            }
        }
    
    }

}
