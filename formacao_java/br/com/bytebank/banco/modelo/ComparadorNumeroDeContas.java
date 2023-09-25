package formacao_java.br.com.bytebank.banco.modelo;

import java.util.Comparator;

public class ComparadorNumeroDeContas implements Comparator<Conta> {
    @Override
    public int compare(Conta c1, Conta c2) {

        return Integer.compare(c1.getNumero(), c2.getNumero());

        // maior > N positivo, menor < N negativo, igual = 0
        // return c1.getNumero() - c2.getNumero();
        
        // if (c1.getNumero() > c2.getNumero()) {
        //     return 1;
        // } else if (c1.getNumero() < c2.getNumero()) {
        //     return -1;
        // } else {
        //     return 0;
        // }

    }
    
}
