package secao13.interfaceGraficaComSwing.padraoObserver;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

//nesse caso o porteiro representa o subject que é
//quem informa os Observer que o evento ocorreu
public class Porteiro {
    private List<ObservadorChegadaAniversariante> observadores 
    = new ArrayList<>();

    public void registrarObservador(ObservadorChegadaAniversariante observador){
        observadores.add(observador);
    }

    public void monitorar(){
        Scanner scanner = new Scanner(System.in);

        String valor = "";
        while(!"sair".equalsIgnoreCase(valor)){
            System.out.println("Aniversariante chegou?");
            valor = scanner.nextLine();

            if("sim".equalsIgnoreCase(valor) || "s".equalsIgnoreCase(valor)){
                //criar o evento
                EventoChegadaAniversariante evento = 
                new EventoChegadaAniversariante(new Date());

                //notificar os observadores!
                observadores.stream().forEach(o -> o.chegou(evento));
                valor = "sair";//assim o programa acaba quando ele chega
            } else{
                System.out.println("Alarme falso!");
            }
        }

        scanner.close();
    }
}
