public class Sprint {
    
    private Cargo desenvolvedor; 
    private Cargo gerente;
    private Cargo lider;
    
    public void defineEquipe(Gerente g, Lider lider, Dev dev) {
        setGerente(g);
        setLider(lider);
        setDesenvolvedor(dev);
    }
    
    private void setGerente(Cargo gerente){
        this.gerente = gerente;
    }
    
    private void setLider(Cargo lider){
        this.lider = lider;
    }
    
    private void setDesenvolvedor(Cargo dev){
        this.desenvolvedor = dev;
    }
}
