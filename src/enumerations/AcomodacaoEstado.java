package enumerations;

public enum AcomodacaoEstado {

    OCUPADO("Ocupado"),
    DESOCUPADO("Desocupado");
    private String descricao;

    AcomodacaoEstado(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
