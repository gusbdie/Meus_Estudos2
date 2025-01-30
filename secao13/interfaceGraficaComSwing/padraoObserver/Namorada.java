package secao13.interfaceGraficaComSwing.padraoObserver;

public class Namorada implements ObservadorChegadaAniversariante{

    public void chegou(EventoChegadaAniversariante evento){
        System.out.println("Avisar os convidados \nApagar as luzes \nSurpresa!");
    }
}
