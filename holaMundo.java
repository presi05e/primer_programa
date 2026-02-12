import java.util.Scanner;

public class holaMundo {

    public static void main(String[] args) {

        try {

            // Datos de entrada ||
            // ----------------------------||--------------------------------------||

            String nombre = "";

            // Datos de salida
            // ||----------------------------||------------------------------------||

            // Variables adicionales
            // ||-----------------------||------------------------------------||

            String integrantesEquipo = "";

            // Procesos
            // ||----------------------------||----------------------------------------||

            // Damos la bienvenida a el usuario.

            System.out.println("Bienvenido, este es tu primer hola Mundo");

            // Invocamos el Scanner para posteriormente solicitar un dato que va a ser
            // relevante, en esta ocasion, su nombre.

            Scanner informacion = new Scanner(System.in);

            System.out.println("Ahora dime, ¿Cual es tu nombre?");

            nombre = informacion.nextLine();

            System.out.println("Entiendo, ahora haces parte del grupo, " + nombre);

            // Invoco nuevamente el Scanner para solicitar los datos de mis integrantes de
            // equipo.

            Scanner equipos = new Scanner(System.in);

            System.out.println("Cuales son tus compañeros?");

            integrantesEquipo = equipos.nextLine();

            // Mostramos la informacion final, usuario y su equipo.

            System.out.println(nombre + " Tus compañeros de equipo seran " + integrantesEquipo);

        } catch (Exception e) {

            System.out.println("Error");

        }

    }

}