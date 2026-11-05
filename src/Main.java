import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int MAX = 5;

        LuzInteligente luces[] = new LuzInteligente[MAX];

        int indice = 0;
        int opc;

        do{

            System.out.println("\n1. Agregar");
            System.out.println("2. Encender");
            System.out.println("3. Mostrar");
            System.out.println("4. Salir");

            opc = Integer.parseInt(sc.nextLine());

            switch(opc){

                case 1:

                    if(indice < MAX){

                        System.out.print("ID Luz: ");
                        String id = sc.nextLine();

                        luces[indice++] =
                                new LuzInteligente(id);

                    }else{
                        System.out.println("Sin espacio");
                    }

                    break;

                case 2:

                    System.out.print("Indice: ");
                    int pos = Integer.parseInt(sc.nextLine());

                    if(pos >= 0 && pos < indice)
                        luces[pos].encender();

                    break;

                case 3:

                    System.out.print("Indice: ");
                    pos = Integer.parseInt(sc.nextLine());

                    if(pos >= 0 && pos < indice)
                        luces[pos].mostrarEstado();

                    break;
            }

        }while(opc != 4);
    }
}