public class TestaBanco {

    public static void main(String[] args) {
        Cliente vinicius = new Cliente();
        vinicius.nome = "Vinicius Porto";
        vinicius.cpf = "122.222.222-22";
        vinicius.profissao = "programador";

        Conta contaDovinicius = new Conta();
        contaDovinicius.deposita(100);

        //associa o cliente vinicius a contaDoVinicius
        contaDovinicius.titular = vinicius;
        System.out.println(contaDovinicius.titular.nome);
    }

}
