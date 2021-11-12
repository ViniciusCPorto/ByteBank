public class TestaGetESet {

    public static void main(String[] args) {
        Conta conta = new Conta();
        //conta numero 1377
        conta.setNumero(1337);
        System.out.println(conta.getNumero());

        Cliente vinicius = new Cliente();
        //conta.titular = vinicius;
        vinicius.setNome("viniciusporto");
        conta.setTitular(vinicius);

        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("programador");
        //agora em duas linhas
        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("programador");

        System.out.println(titularDaConta);
        System.out.println(vinicius);
        System.out.println(conta.getTitular());
    }
}
