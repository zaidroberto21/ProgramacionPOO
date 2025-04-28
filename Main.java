public class Main {
    public static void main(String[] args) {

        // Arreglo para tipos de pelotas
        Pelota[] pelotas = { new Pelotafut(), new Pelotabas()}; //Lista de objetos hijos 

        // Se Itera sobre las pelotas en el arreglo
        for (Pelota pelota : pelotas) {
            
            // Comprueba las pelotas y realiza una acción específica
            if (pelota instanceof Pelotafut) {
                Pelotafut futbol = (Pelotafut) pelota;
                futbol.rodar();
            }

            // Ejecutar el método polimórfico
            pelota.rebotar();
        }
    }
}

/*----------------------------------Pruebas o Cambios Realizados---------------------------------------------------*/

/*public class Main {
    public static void main(String[] args) {

        // Se crea los objetos sin listas
        Pelota pelotaFutbol = new Pelotafut();

        // Se realiza la prueba de métodos polimórficos
        System.out.println("Pelota de Fútbol");
        System.out.println("Forma: " + pelotaFutbol.getForma());
        System.out.println("Material: " + pelotaFutbol.getMaterial());
        pelotaFutbol.rodar();
        pelotaFutbol.rebotar();
    }
}
    */

/*public class Main {
    
public static void main (String [] args){

// Instancia

Pelota pel = new Pelota ("Circular",41.5,450,"Cuero Sintético", "Se pateo la pelota","Se paso la pelota", "Se golpeo la pelota","Se atrapo la pelota");
Movimientos movi = new Movimientos("Se peteo la pelota en otra direccion","Se paso la pelota en otra direccion","Se golpeo la pelota en la misma direccion","Se atrapo la pelota en el mismo lugar");

//Nuevo

pel.movimientos.setPatear(" | Se pateo la pelota ¿en que direccion?");
String pelotaPeateo = pel.movimientos.getPatear();
System.out.println("La pelota de se pateo en la direccion derecha" + pelotaPeateo);
//System.out.println(movi);


//set: Para modificar el valor del atributo 
//get: Obtener el valor del atributo (Leer o Imprimir)

//Realiza la modificación del nombre con Setter (Opcional)
pel.setForma("Redondo");

// Dot-Notation | Notación de puntos | Como tambien imprime el nombre del getter

System.out.println("La pelota tiene Forma: " + pel.getForma());

System.out.println("El peso de la Pelota tiene: " + pel.getPeso());

System.out.println("El tamaño de la Pelota es: " + pel.getTamano());

System.out.println("El material de la Pelota es: " + pel.getMaterial());

}

}
*/