public class Main {
    
public static void main (String [] args){

// Instancia

Pelota pel = new Pelota ("Circular",41.5,450,"Cuero Sintético");

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
