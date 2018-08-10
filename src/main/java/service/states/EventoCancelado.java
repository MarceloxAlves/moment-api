package service.states;

import model.Evento;
import service.interfaces.EstadoEvento;

public class EventoCancelado implements EstadoEvento {

    @Override
    public void mudarEstado( Evento evento) {

    }

    @Override
    public String getEstado() {
        return  "CANCELADO";
    }


}
