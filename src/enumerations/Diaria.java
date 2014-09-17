package enumerations;

public enum Diaria {

    PEQUENO(40),
    MEDIO(60),
    GRANDE(100);
    private int valorDiaria;

    Diaria(int valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public int getValorDiaria() {
        return valorDiaria;
    }
}
