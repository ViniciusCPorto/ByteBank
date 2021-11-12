public class TestaMetodos {

    public static void main(String[] args) {

        Conta contaDoVinicius = new Conta();
        contaDoVinicius.saldo = 100;
        contaDoVinicius.deposita(50);
        System.out.println(contaDoVinicius.saldo);
        contaDoVinicius.saca(20);
        System.out.println(contaDoVinicius.saldo);

        Conta contaDaIsabela = new Conta();
        contaDaIsabela.deposita(1000);
        boolean sucessoTransferencia = contaDaIsabela.transfere(300,contaDoVinicius);

        if(sucessoTransferencia) {
            System.out.println("transferencia com sucesso");
        }else {
            System.out.println("faltou dinheiro");
        }
            System.out.println(contaDaIsabela.saldo);
            System.out.println(contaDoVinicius.saldo);

            contaDoVinicius.titular = "Vinicius Porto";
            System.out.println(contaDoVinicius.titular);
    }
}