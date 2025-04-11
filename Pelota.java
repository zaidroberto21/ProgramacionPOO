public class Pelota {

// Definicion

String forma;
double tamano;
double peso;
String material;

// Constructores

Pelota(String form, double tama, double pes, String mate){

    this.forma = form;
    this.tamano = tama;
    this.peso = pes;
    this.material = mate;

}

//Firma de un metodo | Method signature -> return value + nombredelmetodo + (lista de parametros) + {}

void mover(){
    System.out.println("La pelota se movio");
}

void rebota(){
    System.out.println("La pelota esta rebotando");
}

void lanza(){
    System.out.println("La pelota fue lanzada");
}

}