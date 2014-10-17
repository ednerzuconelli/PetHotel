package modelo;

import enumerations.AcomodacaoEstado;
import enumerations.Especie;
import enumerations.Porte;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "acomodacao")
/*@NamedQueries({
    @NamedQuery(name="findAllAnimal", query="from Animal"),
   // @NamedQuery(name="findAnimalById", 
    //    query="from Animal WHERE id = :id")
})*/
public class Acomodacao implements Comparable<Acomodacao> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "numero")
    private int numero;
    @Column(name = "ala")
    private Especie ala;
    @Column(name = "dimensao")
    private Porte dimensao;
    @Column(name = "estado")
    private AcomodacaoEstado estado;

    public Acomodacao(int numero, Especie ala, Porte dimensao) {
        this.numero = numero;
        this.ala = ala;
        this.dimensao = dimensao;
        this.estado = AcomodacaoEstado.DESOCUPADO;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Especie getAla() {
        return ala;
    }

    public void setAla(Especie ala) {
        this.ala = ala;
    }

    public Porte getDimensao() {
        return dimensao;
    }

    public void setDimensao(Porte dimensao) {
        this.dimensao = dimensao;
    }

    public AcomodacaoEstado getEstado() {
        return estado;
    }

    public void setEstado(AcomodacaoEstado estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        Acomodacao outraAcomodacao = (Acomodacao) o;
        return this.numero == outraAcomodacao.numero;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + this.numero;
        return hash;
    }

    @Override
    public String toString() {
        return "#" + numero;
    }

    @Override
    public int compareTo(Acomodacao a) {
        return this.numero - a.numero;
    }
}
