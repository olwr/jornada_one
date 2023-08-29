package bytebank_herdado_conta;

// código fonte, blueprint para contas
public abstract class Conta { // tipo Conta
// atributos do tipo Conta
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int totalDeContas = 0;

// construtor, inicializa objetos
    public Conta(int agencia, int numero) {
        if(agencia < 1) {
            throw new IllegalArgumentException("Agência inválida");
        }

        if(numero < 1) {
            throw new IllegalArgumentException("Número da conta inválido");
        }

        Conta.totalDeContas++;
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("estou criando uma conta " + this.numero);
        System.out.println("Total de contas: " + Conta.totalDeContas);
    }

// métodos (comportamentos) do tipo Conta
    public abstract void deposita (double valor);

    public void saca (double valor) throws SaldoInsuficienteException {
        if (this.saldo <= valor) {
            throw new SaldoInsuficienteException("Saldo insuficiente: " + "Saldo: " + this.saldo + ", Valor: " + valor);
        }
        
        this.saldo -= valor;
    }
    
    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
        this.saca(valor);
        destino.deposita(valor);
    }

// getters e setters, retornam e definem valores
    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotalDeContas() {
        return Conta.totalDeContas;
    }
}