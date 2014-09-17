package enumerations;

public enum Porte {

    PEQUENO("Pequeno", Diaria.PEQUENO),
    MEDIO("Médio", Diaria.MEDIO),
    GRANDE("Grande", Diaria.GRANDE);
    private String descricao;
    private Diaria diaria;

    Porte(String descricao, Diaria diaria) {
        this.descricao = descricao;
        this.diaria = diaria;
    }

    @Override
    public String toString() {
        return descricao;
    }

    public Diaria getDiaria() {
        return diaria;
    }
}
