public class CaixaNumeroTeste {

    public static void main(String[] args) {
        // CaixaNumero<String> caixaA = new CaixaNumero<>();
        // caixaA.guardar("Teste");
        //não aceita valor do tipo String

        CaixaNumero<Double> caixaA = new CaixaNumero<>();
        caixaA.guardar(1.2);
        System.out.println(caixaA.abrir());
    }
}
