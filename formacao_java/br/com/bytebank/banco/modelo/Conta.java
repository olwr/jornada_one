// declaração do pacote
package formacao_java.br.com.bytebank.banco.modelo;

/**
 * Classe que representa a moldura de uma conta no Bytebank.
 * 
 * @author Oliver
 * @version 0.1
 */

// código fonte, blueprint para contas
public abstract class Conta implements Comparable<Conta> { // tipo Conta
    // atributos do tipo Conta
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int totalDeContas = 0;

    /**
     * Construtor para inicializar o objeto a partir da agência e número
     * 
     * @param agencia
     * @param numero
     */

    // construtor, inicializa objetos
    public Conta(int agencia, int numero) {
        if (agencia < 1) {
            throw new IllegalArgumentException("Agência inválida");
        }

        if (numero < 1) {
            throw new IllegalArgumentException("Número da conta inválido");
        }

        Conta.totalDeContas++;
        this.agencia = agencia;
        this.numero = numero;
        // System.out.println("estou criando uma conta " + this.numero);
        // System.out.println("Total de contas: " + Conta.totalDeContas);
    }

    /**
     * Se o valor for maior que o saldo gera a exceção
     * 
     * @param valor
     * @throws SaldoInsuficienteException
     */

    // métodos (comportamentos) do tipo Conta
    public abstract void deposita(double valor);

    public void saca(double valor) throws SaldoInsuficienteException {
        if (this.saldo <= valor) {
            throw new SaldoInsuficienteException("Saldo insuficiente: " + "Saldo: " + this.saldo + ", Valor: " + valor);
        }

        this.saldo -= valor;
    }

    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
        this.saca(valor);
        destino.deposita(valor);
    }

    public static int getTotalDeContas() {
        return Conta.totalDeContas;
    }

    @Override
    public String toString() {
        return "Número: " + this.numero + " Agência: " + this.agencia;
    }

    @Override
    public boolean equals(Object ref) {
        Conta outra = (Conta) ref;
        
        if (this.agencia != outra.agencia || this.numero != outra.numero) {
            return false;
        } else {
            return true;
        }
    }
    
    public String igualdade(Conta outra){
        String diferente = "Não é a mesma conta!";
        String igual = "É a mesma conta!";

        if (equals(outra) == false) {
            return diferente;
        } else {
            return igual;
        }
    }

    @Override
    public int compareTo(Conta outra) {
        return Double.compare(this.saldo, outra.saldo);
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
}