package service.states;

import service.interfaces.EstadoEvento;

import java.util.ArrayList;
import java.util.List;

public class FabricaEstadoEvento {
    List<EstadoEvento> estadoEventos;

    public FabricaEstadoEvento() {
        estadoEventos = new ArrayList<>();
        estadoEventos.add(new EventoCancelado());
        estadoEventos.add(new EventoNovo());
        estadoEventos.add(new EventoInscricoesAbertas());
        estadoEventos.add(new EventoInscricaoEncerrada());
    }

    public EstadoEvento getEstado(String valorEstado){
        for (EstadoEvento estadoEvento : estadoEventos){
                if (estadoEvento.getEstado().equals(valorEstado)) return  estadoEvento;
        }
        return  new EventoNovo();
    }

}
