public class Pelotabas extends Pelota {
    

    //La Pelotabas hereda las propiedades y métodos de la clase base Pelota
    public Pelotabas() {

        //El constructor Pelotabas() llama al constructor de la clase padre (Pelota) usando super()
        super("Redonda", 75.0, 397, "Poliéster");
    }

    
    //Indica que este método está reemplazando una implementación existente en la clase padre (Pelota)
    @Override

    //Cuando rodar() se llama en un objeto Pelotabas, se ejecuta esta versión, en lugar de la genérica de Pelota
    public void rodar() {
        System.out.println("La pelota de basquetbol puede rodar de manera firme en el suelo");
    }

    @Override
    public void rebotar() {
        System.out.println("La pelota de basquetbol puede rebota con fuerza sobre superficies duras");
    }

}
