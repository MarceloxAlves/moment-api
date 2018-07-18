package model;

public enum TipoAtividade {
    PALESTRA(1), MINICURSO(2), MESAREDONDA(3);
    private int tipoAtividade;

    TipoAtividade(int i){
        tipoAtividade = i;
    }

    public int getTipoAtividade(){
        return tipoAtividade;
    }

}
