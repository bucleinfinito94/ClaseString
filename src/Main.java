public class Main {
    public static void main(String[] args) {
        String mensaje = "Hola mundo"; //Creamos variable de la Clase String o del tipo String.
        System.out.println("mensaje tiene una longitud de " + mensaje.length() + " caracteres"); // Imprimimos la variable creada y también sacamos la longitud que tiene con el .lenght

        System.out.println("----------------------------------------------------------------------");

        String mensajeMayuscula = mensaje.toUpperCase(); //Creamos nueva variable para almacenar "mensaje" en mayúsculas.
        System.out.println(mensajeMayuscula); //Imprimimos "mensajeMayuscula" para ver si está en mayúscula.

        System.out.println("----------------------------------------------------------------------");

        String mensajeConEspacios = " Tengo espacios delante y detrás ";
        System.out.println(mensajeConEspacios); // Imprimimos para ver los espacios delante y detrás.
        System.out.println(mensajeConEspacios.trim()); // El método .trim() quita los espacios delante y detrás del String.

        System.out.println("----------------------------------------------------------------------");

        String compara1 = "hola";
        String compara2 = "HOLA";

        if(compara1.equals(compara2)){ //La comparación da que son distintos, ya que "compara1" está en minúsculas y "compara2" está en mayúsculas.
            System.out.println("Son iguales");
        }else{
            System.out.println("Son distintos");
        }

        if(compara1.equalsIgnoreCase(compara2)){//La comparación aquí dice que son iguales porque compara ambos Strings sin tener en cuenta mayúsculas y minúsculas.
            System.out.println("Son iguales");
        }else{
            System.out.println("Son distintos");
        }

        System.out.println("----------------------------------------------------------------------");

        int numero = 10;
        String numero2 = String.valueOf(numero); //Pasamos la variable "numero" que era un int, a una variable de la clase String.
        System.out.println(numero2);

        int deTextoANumero = Integer.parseInt(numero2); //Pasamos la variable "numero2" que estaba como String, como variable de tipo int.
        System.out.println(deTextoANumero);

        System.out.println("----------------------------------------------------------------------");

        System.out.println("indexOf: " + mensaje.indexOf("l")); //Con index.Of obtenemos la ubicación, el índice, de la primera aparición del carácter buscado.
        System.out.println("lastIndexOf: " + mensaje.lastIndexOf("o")); //Con lastIndexOf, nos entrega la ubicación, el índice, de la última aparición del carácter buscado.
        System.out.println("chatAt(n): " + mensaje.charAt(2)); //charAt() nos muestra qué carácter se encuentra en la posición solicitada entre paréntesis.
        System.out.println("substring: " + mensaje.substring(0,4)); //Este método nos devuelve la subcadena que se encuentra entre las posiciones 0 y 4-1.
        System.out.println("toUpperCase: " + mensaje.toUpperCase()); //Convierte toda la cadena de texto a mayúsculas.
        System.out.println("toLowerCase: " + mensaje.toLowerCase()); //Convierte toda la cadena de texto a minúsculas.
        System.out.println("equals: " + compara1.equals(compara2)); //Compara las dos cadenas en cuestión y pone false porque no son iguales.
        System.out.println("equalsIgnoreCase: " + compara1.equalsIgnoreCase(compara2)); //Compara ambas cadenas de texto sin tener en cuenta mayúsculas ni minúsculas, por eso pone true, son iguales.
        System.out.println("compareTo: " + compara1.compareTo(mensaje)); //Esto devuelve 0 si ambas cadenas son iguales. Da <0 si la primera es alfabéticamente menor que la segunda. Y da >0, si la primera es alfabéticamente mayor que la segunda.
        System.out.println("replace: " + mensaje.replace('l','d')); //replace sustituye el caracter indicado por uno nuevo en la cadena entera.
        System.out.println(compara1.equals(compara1)); //Pone true porque es igual.

        System.out.println("----------------------------------------------------------------------");

        // PARTE DE PROFESOR //
        String str1 = "  En un lugar de La Mancha de cuyo";
        String str2 = "Pepe Muñoz";
        String str3 = "PEPE Muñoz";
        String str4 = "";
        String str5 = " ";
        String str6 = null;
        // Longitud
        System.out.println("Longitud = " + str1.length());
        // Igual
        System.out.println("Igual = " + str1.equals(str2));
        // Igual Insensitivo
        System.out.println("Igual = " + str2.equals(str3));
        System.out.println("Igual = " + str2.equalsIgnoreCase(str3));
        // Comparar con
        System.out.println("Compara =" + str2.compareTo(str3));
        // Eliminar espacios
        System.out.println("Con espacios |" + str1 + "|");
        System.out.println("Sin espacios |" + str1.trim() + "|");
        // Extraer un caracter determinado
        System.out.println("Extrae el caracter 10 = " + str1.charAt(10));
        // Convertir en matriz
        char[] matriz = str1.toCharArray();
        System.out.println("matriz(10) = " + matriz[10]);
        // Extraer cadena de caracteres
        System.out.println("Extrae del 3 al 9 = " + str1.substring(3,9));
        System.out.println("Extrae desde 3 = " + str1.substring(3));
        // Buscar coincidencia de un caracter
        System.out.println("Buscar la 1º coincidencia = " + str1.indexOf("u"));
        System.out.println("Buscar la 1º coincidencia = " + str1.indexOf("u",6));
        System.out.println("Buscar la 1º coincidencia = " + str1.indexOf("lugar"));
        System.out.println("Buscar la 1º coincidencia = " + str1.lastIndexOf("u"));
        // Empieza o termina por algo
        System.out.println("Empieza por En = " + str1.trim().startsWith("En"));
        System.out.println("Empieza por un en 3 = " + str1.trim().startsWith("un",3));
        System.out.println("Termina en cuyo = " + str1.trim().endsWith("cuyo"));
        //Concatenar Strings
        System.out.println("Concatenar = " + str1 + " " + str2 + " " + str3);
        System.out.println("Concatenar = " + str1.concat(" ").concat(str2).concat(" ").concat(str3));
        // Está vacío?
        System.out.println("Vacio = " + str4.isEmpty());
        // Está en blanco?
        System.out.println("Blanco = " + str5.isBlank());
        //Separar en una matriz
        String[] palabras = str1.trim().split(" ");
        System.out.println("palabra 4º (indice 3) = " + palabras[3]);
        String meses = "enero,febrero,marzo,abril,mayo,junio,julio";
        String[] nombreMes = meses.split(",");
        System.out.println("nombreMes 5 = (indice 4) = " + nombreMes[4]);
        //  Mayúsculas y Minúsculas
        System.out.println("Mayúsculas = " + str1.trim().toUpperCase());
        System.out.println("Minúsculas = " + str1.trim().toLowerCase());
        //Reemplazar texto
        System.out.println("Reemplazo = " + str1.replace("La Mancha","Castilla y León"));
        System.out.println("str1 = " + str1);
        str1 = str1.replace("La Mancha","Castilla y León");
        System.out.println("str1 = " + str1);
        System.out.println("Sin espacios = " + str1.replace(" ",""));// Elimina espacios
        // Contiene
        System.out.println("Contiene Castilla = " + str1.contains("Castilla"));

        // .equals lo que hace es comparar el valor de dos String pero "==", comprueba si ambos son el mismo objeto o no.
        String strObjeto1 = "Hola, buenas tardes";
        String strObjeto2 = "Hola, buenas tardes";

        System.out.println("¿Son el mismo objeto?: " + strObjeto1 == strObjeto2); //False, porque a pesar de que tienen el mismo valor, son dos objetos distintos (están en una dirección de memoria distinta cada uno almacenado).

        //EJERCICIO.
        //Dado un archivo del ordenador (mifoto.jpg) extraer el nombre y la extensión del archivo.

        System.out.println("----------------------------------------------------------------------");


        String archivo = "mifoto.jpg";
        System.out.println("Archivo: " + archivo);
        String nombreArchivo = archivo.substring(0,6);
        System.out.println("Nombre del archivo: " + nombreArchivo);
        String extensionArchivo = archivo.substring(6);
        System.out.println("Extensión del archivo: " + extensionArchivo);
    }
}