public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta();


        // conta está inconsistente
        conta.setAgencia(-50);
        conta.setNumero(-330);


    }

}
