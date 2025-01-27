public class CaixaObjetoTeste {

    public static void main(String[] args) {
        CaixaObjeto caixaA = new CaixaObjeto();
        caixaA.guardar(2.3);

        Integer coisa = (Integer)caixaA.abrir();
        System.out.println(coisa);//vai dar problema
        //ClassCastException

        Double coisa2 = (Double) caixaA.abrir();
        System.out.println(coisa2);
        //precisa explicitar o Double
    }
}
