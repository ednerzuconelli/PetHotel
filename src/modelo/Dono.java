package modelo;

public class Dono extends Pessoa {

    private int codigo;
    private Pessoa segundoResponsavel;

    public Dono(int codigo, Pessoa segundoResponsavel, String nome, String telefone) {
        super(nome, telefone);
        this.codigo = codigo;
        this.segundoResponsavel = segundoResponsavel;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Pessoa getSegundoResponsavel() {
        return segundoResponsavel;
    }

    public void setSegundoResponsavel(Pessoa segundoResponsavel) {
        this.segundoResponsavel = segundoResponsavel;
    }

    @Override
    public boolean equals(Object o) {
        Dono outroDono = (Dono) o;
        return this.codigo == outroDono.codigo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + this.codigo;
        return hash;
    }
}
