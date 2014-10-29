package modelo;

import enumerations.Especie;
import enumerations.Porte;
import exceptions.CadastroException;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "porteFaixa")
@NamedQueries({
    @NamedQuery(name="findAllPorteFaixa", query="from PorteFaixa"),
   // @NamedQuery(name="findPorteFaixaById", 
    //    query="from PorteFaixa WHERE id = :id")
})
public class PorteFaixa implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_PORTEFAIXA")
    private long id;
    @Column(name =  "ALTURAINICIAL")
    private Double alturaInicial;
    @Column(name = "ALTURAFINAL")
    private Double alturaFinal;
    @Column(name = "COMPRIMENTOINICIAL")
    private Double comprimentoInicial;
    @Column(name = "COMPRIMENTOFINAL")
    private Double comprimentoFinal;
    @Column(name = "ESPECIE")
    private Especie especie;
    @Column(name = "PORTE")
    private Porte porte;

    public PorteFaixa() {
    }

    public PorteFaixa(Double alturaInicial, Double alturaFinal, Double comprimentoInicial, Double comprimentoFinal, Especie especie, Porte porte) {
        super();
        
        if(alturaInicial < 0 || alturaFinal < 0 || comprimentoInicial < 0 || comprimentoFinal < 0) {
            throw new CadastroException("Todos os valores devem ser positivos.");
        }
        if(alturaInicial >= alturaFinal) {
            throw new CadastroException("A altura inicial deve ser menor que a final.");
        }
        if(comprimentoInicial >= comprimentoFinal) {
            throw new CadastroException("O comprimento inicial deve ser menor que o final.");
        }
        
        this.alturaInicial = alturaInicial;
        this.alturaFinal = alturaFinal;
        this.comprimentoInicial = comprimentoInicial;
        this.comprimentoFinal = comprimentoFinal;
        this.especie = especie;
        this.porte = porte;
    }

    public Double getAlturaInicial() {
        return alturaInicial;
    }

    public void setAlturaInicial(Double alturaInicial) {
        this.alturaInicial = alturaInicial;
    }

    public Double getAlturaFinal() {
        return alturaFinal;
    }

    public void setAlturaFinal(Double alturaFinal) {
        this.alturaFinal = alturaFinal;
    }

    public Double getComprimentoInicial() {
        return comprimentoInicial;
    }

    public void setComprimentoInicial(Double comprimentoInicial) {
        this.comprimentoInicial = comprimentoInicial;
    }

    public Double getComprimentoFinal() {
        return comprimentoFinal;
    }

    public void setComprimentoFinal(Double comprimentoFinal) {
        this.comprimentoFinal = comprimentoFinal;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public Porte getPorte() {
        return porte;
    }

    public void setPorte(Porte porte) {
        this.porte = porte;
    }

    public boolean isAnimalDessePorte(Animal animal) {
        if (animal.getEspecie() == especie
                && animal.getAltura() >= alturaInicial
                && animal.getAltura() < alturaFinal
                && animal.getComprimento() >= comprimentoInicial
                && animal.getComprimento() < comprimentoFinal) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return /*especie.toString().toLowerCase() +*/ " teste" /*+ porte.toString().toLowerCase()*/;
    }

    @Override
    public boolean equals(Object o) {
        PorteFaixa outroPorteFaixa = (PorteFaixa) o;
        return ((this.especie.equals(outroPorteFaixa.especie))
                && (this.porte.equals(outroPorteFaixa.porte)));
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (this.especie != null ? this.especie.hashCode() : 0);
        hash = 37 * hash + (this.porte != null ? this.porte.hashCode() : 0);
        return hash;
    }
}
