package service.states;

import model.Evento;
import service.interfaces.EstadoEvento;

public class EventoNovo implements EstadoEvento {

    @Override
    public void mudarEstado(Evento evento) {
        evento.setEstadoEvento(new EventoInscricoesAbertas());
    }

    @Override
    public String getEstado() {
        return "NOVO";
    }

}
