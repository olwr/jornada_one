package formacao_java.projetos.curso2;

// código fonte, blueprint para contas
public class Conta { // tipo Conta
// atributos do tipo Conta
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int totalDeContas;

// construtor, inicializa objetos
    public Conta(int agencia, int numero) {
        Conta.totalDeContas++;
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("estou criando uma conta " + this.numero);
        System.out.println("Total de contas: " + Conta.totalDeContas);
    }

// métodos (comportamentos) do tipo Conta
    public void deposita (double valor) {
        this.saldo += valor;
    }

    public boolean saca (double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean transfere (double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }

        return false;
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