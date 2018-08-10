package service.states;

import model.Evento;
import service.interfaces.EstadoEvento;

public class EventoInscricaoEncerrada implements EstadoEvento {

    @Override
    public String getEstado() {
        return "INSCRICAO ENCERRADA";
    }

    @Override
    public void mudarEstado(Evento evento) {

    }
}
