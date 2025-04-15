public class Pelota {

// Definicion

private String forma;
private double tamano;
private double peso;
private String material;

// Constructores

Pelota(String forma, double tamano, double peso, String material){

this.forma = forma;
this.tamano = tamano;
this.peso = peso;
this.material = material;

}

// getter -> public tipo | Nombre del atributo ||| return nombre del atributo 

public String getForma(){

    return this.forma;

}

public double getTamano(){

    return this.tamano;

}

public double getPeso(){

    return this.peso;

}

public String getMaterial(){

    return this.material;

}

// Setter public void | Nombre del Atributo (Tipo del atributo) ||| this Nombre del atributo 

public void setForma(String forma) {
    this.forma = forma;
}

public void setTamano(double tamano) {
    this.tamano = tamano;
}

public void setPeso(double peso) {
    this.peso = peso;
}

public void setMaterial(String material) {
    this.material = material;
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
