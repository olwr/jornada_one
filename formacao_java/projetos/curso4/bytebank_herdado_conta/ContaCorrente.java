package bytebank_herdado_conta;

public class ContaCorrente extends Conta implements Tributavel {

    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void saca(double valor) throws SaldoInsuficienteException{
        double taxacao = valor + 0.2;
        super.saca(taxacao);
    }

    @Override
    public double getValorImposto() {
        return super.getSaldo() * 0.01;
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }
}
