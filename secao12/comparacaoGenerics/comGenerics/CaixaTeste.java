package secao12.comparacaoGenerics.comGenerics;

public class CaixaTeste {
//Assim não preciso me preocupar em todo vez deixar 
//explicito o tipo da variável
    public static void main(String[] args) {
        Caixa<String> caixaA = new Caixa<>();
        caixaA.guardar("Segredo");
        String coisaA = caixaA.abrir();
        System.out.println(coisaA);

        Caixa<Double> caixaB = new Caixa<>();
        caixaB.guardar(3.14);
        Double coisaB = caixaB.abrir();
        System.out.println(coisaB);
        //agora ele vai dar erro de compilação e não uma exception caso
        //eu tente por uma String o que facilita durante o desenvolvimento        
    }
}
