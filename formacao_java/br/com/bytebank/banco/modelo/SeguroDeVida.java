package formacao_java.br.com.bytebank.banco.modelo;

public class SeguroDeVida implements Tributavel {

    @Override
    public double getValorImposto() {
        return 42;
    }
    
}