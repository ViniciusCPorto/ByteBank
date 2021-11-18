class Conta {

    private double saldo = 0;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;


    public Conta (int agencia, int numero){
        Conta.total++;
        System.out.println("o total de contas é " + Conta.total);
        if (agencia <= 0){
            System.out.println("Agencia não pode ter número negativo");
        }
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("estou criando uma conta " + this.numero);
    }

    public void deposita(double valor){
        this.saldo = this.saldo + valor;
    }

    public boolean saca(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino){
        if(this.saldo >= valor){
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }

    public double getSaldo(){

        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero) {
        if(numero <= 0)
        this.numero = numero;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setAgencia(int novaAgencia){
        if(agencia <= 0){
            System.out.println("não pode valor menor igual a 0");
            return;
        }
        this.agencia = novaAgencia;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal(){
        return Conta.total;
    }

}
