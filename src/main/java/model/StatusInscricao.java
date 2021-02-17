package model;

public enum StatusInscricao {
    
	PAGO(1), NAOPAGO(2);
    
	private int statusInscricao;

    StatusInscricao(int i){
        statusInscricao = i;
    }

    public int getStatusInscricao() {
        return statusInscricao;
    }
}
