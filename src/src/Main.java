import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //creo el menú

        Scanner leer = new Scanner(System.in);

        int opcion;
        do {
            do {
                System.out.println("Opciones");
                System.out.println("-----------------------------");
                System.out.println("1 - Genera nuevo archivo");
                System.out.println("2 - Lee archivo generado");
                System.out.println("3 - Ordena archivo");
                System.out.println("4 - Lee archivo ordenado");
                System.out.println("5 - Buscar numero en archivo");
                System.out.println("6 - Salir");
                System.out.println("Seleccione una opción: ");
                opcion = leer.nextInt();

            } while (opcion < 1 || opcion > 6);
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese una cantidad de numeros aleatorios");
                    NumerosRandom random = new NumerosRandom();
                    random.NumRandom();
                    break;
                case 2:
                    System.out.println("Leer archivo generado:");
                    NumerosRandom leyendoArchivo = new NumerosRandom();
                    leyendoArchivo.LeerNumRandom();
                    break;
                case 3:
                    System.out.println("Se ordena archivo");
                    NumerosRandom ordenarArchivo = new NumerosRandom();
                    ordenarArchivo.OrdenarNumeros();
                    break;
                case 4:
                    System.out.println("Leer archivo ordenado:");
                    NumerosRandom leerArchivOrdenado = new NumerosRandom();
                    leerArchivOrdenado.LeerNumerosOrdenados();
                    break;
                case 5:
                    System.out.println("Se busca numero:");
                    NumerosRandom buscarNum = new NumerosRandom();
                    buscarNum.BuscarNumero();
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        }while (opcion!=6);
    }
}