import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class NumerosRandom {

        public void NumRandom(){
            Scanner entrada = new Scanner(System.in);

            String archivoTxt = "numeros_aleatorios.txt";

            int cantidad = entrada.nextInt();

            try {

                FileWriter escritor = new FileWriter(archivoTxt);

                //creo 10 numeros random
                Random randomNum = new Random();

                for(int i=0; i<cantidad;i++){
                    int numeroAleatorio = randomNum.nextInt(101);
                    escritor.write(String.valueOf(numeroAleatorio) + "\n");

                }
                escritor.close();
                System.out.println("Se han generado y guardado " + cantidad + " números aleatorios en el archivo " + archivoTxt);


            }catch (IOException e) {
                System.err.println("Error al escribir en el archivo: " + e.getMessage());
            }

        }

        public void LeerNumRandom(){
            String archivoTxt = "numeros_aleatorios.txt";
            try {
                FileReader leerArchivo = new FileReader(archivoTxt);
                BufferedReader leer = new BufferedReader(leerArchivo);
                String linea = leer.readLine();

                while(linea!=null){

                    System.out.println(linea);
                    linea = leer.readLine();

                }
            }
            catch (IOException e) {
                System.err.println("Error al escribir en el archivo: " + e.getMessage());
            }
        }



}
