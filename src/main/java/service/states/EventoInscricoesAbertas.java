package service.states;

import model.Evento;
import service.interfaces.EstadoEvento;

public class EventoInscricoesAbertas implements EstadoEvento {

    @Override
    public String getEstado() {
        return "INSCRICAO ABERTAS";
    }

    @Override
    public void mudarEstado(Evento evento) {
        evento.setEstadoEvento(new EventoInscricaoEncerrada());
    }
}
