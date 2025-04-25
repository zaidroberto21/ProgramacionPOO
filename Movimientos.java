public class Movimientos {
    
    String patear;
    String pasar;
    String golpear;
    String atrapar;

    Movimientos() {}

    Movimientos(String patear, String pasar, String golpear, String atrapar){
    
    this.patear = patear;
    this.pasar = pasar;
    this.golpear = golpear;
    this.atrapar = atrapar;
        
    }

    public String getPatear() {
    
    return this.patear;
    
    }

    public void setPatear(String patear){
    this.patear = patear;

    }

    public String getPasar() {
    
        return this.pasar;
        
        }
    
        public void setPasar(String pasar){
        this.pasar = pasar;
    
        }

        public String getGolpear() {
    
            return this.golpear;
            
            }
        
            public void setGolpear(String golpear){
            this.golpear = golpear;
        
            }

            public String getAtrapar() {
    
                return this.atrapar;
                
                }
            
                public void setAtrapar(String atrapar){
                this.atrapar = atrapar;
            
                }

    

   

}
