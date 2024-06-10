public class Main {

    static String nome = "Yan Araújo";
    static int idade = 22;
    static String cidade = "";

    /**
     * 
     * @return Retornara os dados de uma pessoa
     */
    public static void main(String[] args) {
        System.out.println(somarValores(1, 2));
        imprimirDados();
    }

    private static void imprimirDados() {
        System.out.println("Nome: " + nome + ", idade: " + idade + ", cidade" + definirCidade());
    }

    private static String definirCidade() {
        cidade = "Belo Horizonte";
        return cidade;
    }

    public static int somarValores(int a, int b) {
        int c = a + b;
        return c;
    }

}