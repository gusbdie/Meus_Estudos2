package secao13.interfaceGraficaComSwing.padraoObserver;

public class FestaAniversario {
    public static void main(String[] args) {
        Namorada namorada = new Namorada();
        Porteiro porteiro = new Porteiro();

        //preciso registrar que a namorada tem a intenção de saber quando
        //ele chegar(registrar que ela é observer)
        porteiro.registrarObservador(namorada);

        porteiro.monitorar();
    }
}
