import java.io.*;
import java.util.*;

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

        public void OrdenarNumeros(){
            String archivoTxt = "numeros_aleatorios.txt";
            String archivoTxtOrdenado = "numeros_aleatorios_ordenados.txt";

            try {
                List<Integer> numeros = new ArrayList<>();
                try (BufferedReader br = new BufferedReader(new FileReader(archivoTxt))) {
                    String linea;
                    while ((linea = br.readLine()) != null) {
                        numeros.add(Integer.parseInt(linea));
                    }
                }

                Collections.sort(numeros);

                try (PrintWriter pw = new PrintWriter(new FileWriter(archivoTxtOrdenado))) {
                    for (int n : numeros) {
                        pw.println(n);
                    }
                }
                System.out.println("Archivo ordenado creado: " + archivoTxtOrdenado);
            } catch (IOException e) {
                System.out.println("Error al ordenar archivo: " + e.getMessage());
            }
        }

        public void LeerNumerosOrdenados(){
            String archivoTxtOrdenado = "numeros_aleatorios_ordenados.txt";
            try {
                FileReader leerArchivoOrdenado = new FileReader(archivoTxtOrdenado);
                BufferedReader leer = new BufferedReader(leerArchivoOrdenado);
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
        public void BuscarNumero() {
            String archivoTxt = "numeros_aleatorios.txt";
            Scanner entrada = new Scanner(System.in);
            System.out.print("Ingrese el número a buscar: ");
            int num = entrada.nextInt();
            boolean encontrado = false;

            try (BufferedReader br = new BufferedReader(new FileReader(archivoTxt))) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    if (Integer.parseInt(linea) == num) {
                        encontrado = true;
                        break;
                    }
                }
            } catch (IOException e) {
                System.out.println("Error al leer archivo: " + e.getMessage());
            }

            if (encontrado) {
                System.out.println("El número " + num + " se encuentra en el archivo.");
            } else {
                System.out.println("El número " + num + " NO está en el archivo.");
            }
        }



}
