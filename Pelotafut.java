public class Pelotafut extends Pelota {
    

    //La Pelotafut hereda las propiedades y métodos de la clase base Pelota

    public Pelotafut() {

        //El constructor Pelotafut() llama al constructor de la clase padre (Pelota) usando super()
        super("Redonda", 22.0, 450, "Cuero Sintético");
    }
    

    @Override
    public void rodar() {
        System.out.println("La pelota de fútbol puede rodar suavemente sobre césped");
    }

    @Override
    public void rebotar() {
        System.out.println("La pelota de fútbol tambien puede rebota de manera controlada");
    }

    //Overloading | Sobre escritura de metodos, anuladar metodos

    public void rebotar(int altura) {
        System.out.println("La pelota de fútbol rebota a " + altura + " cm");
    }

    //Overloading
    
    public void rodar(int velocidad) {
        System.out.println("La pelota de fútbol rueda a " + velocidad + " km/h");
    }

}



