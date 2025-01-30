package secao13.interfaceGraficaComSwing.padraoObserver;

import java.util.Date;
//aqui que deve ficar todas as informaçõe relacionadas ao evento
public class EventoChegadaAniversariante {

    private final Date chegada;

    public EventoChegadaAniversariante(Date chegada){
        this.chegada = chegada;
    }

    public Date getChegada() {
        return chegada;
    }
}
