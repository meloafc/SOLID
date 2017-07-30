package aula5.antes;

public class ContaDeEstudante extends ContaComum {

    private int milhas;

    public void deposita(double valor) {
        super.deposita(valor);
        this.milhas += (int)valor;
    }

    public int getMilhas() {
        return milhas;
    }

    //pode quebrar varias partes de um sistema
    public void rende() {
        throw new RuntimeException("N�o pode render");
    }
    
}
