package enumerations;

public enum Especie {

    CACHORRO("Cachorro"),
    GATO("Gato"),
    PASSARO("Pássaro"),
    PEIXE("Peixe"),
    REPTIL("Réptil"),
    ROEDOR("Roedor");
    private String descricao;

    Especie(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
