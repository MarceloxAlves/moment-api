package service.interfaces;

import model.Evento;

public interface EstadoEvento {

    String getEstado();
    void mudarEstado(Evento evento);
}
