import java.util.Random;

public class NumerosRandom {
    public static void main(String[] args) {

        //creo 10 numeros random
        Random randomNum = new Random();

        for(int i=0; i<10;i++){
            System.out.println(randomNum.nextInt(101));
        }
    }
}
