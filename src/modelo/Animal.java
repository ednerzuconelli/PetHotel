package modelo;

import controle.BancoDeDados;
import enumerations.Especie;
import enumerations.Porte;
import exceptions.CadastroException;
import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "animal")
@NamedQueries({
    @NamedQuery(name="findAllAnimal", query="from Animal"),
   // @NamedQuery(name="findAnimalById", 
    //    query="from Animal WHERE id = :id")
})
public class Animal implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_ANIMAL")
    private long id;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "ESPECIE")
    private Especie especie;
    @Column(name = "ALTURA")
    private double altura;
    @Column(name = "COMPRIMENTO")
    private double comprimento;
    @Column(name = "PORTE")
    private Porte porte;
   // @Column(name = "DONO")
    //private Dono dono;

    public Animal() {
    }

    public Animal(String nome, Especie especie, double altura, double comprimento, Dono dono) {
        if (nome.equals("")) {
            throw new CadastroException("Preencha todos os campos.");
        }
        if (dono == null) {
            throw new CadastroException("Selecione um dono para o animal.");
        }
        this.nome = nome;
        this.especie = especie;
        this.altura = altura;
        this.comprimento = comprimento;
        this.porte = classificarPorte();// o porte é calculado pela altura, comprimento e espécie
       // this.dono = dono;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public Porte getPorte() {
        return porte;
    }

    public void setPorte(Porte porte) {
        this.porte = porte;
    }

   /* public Dono getDono() {
        return dono;
    }

    public void setDono(Dono dono) {
        this.dono = dono;
    }

    @Override
    public String toString() {
        return nome;
    }
*/
    private Porte classificarPorte() throws CadastroException {
        Set<PorteFaixa> porteFaixas = BancoDeDados.getInstance().getPorteFaixas();

        for (PorteFaixa porteFaixa : porteFaixas) {
            if (porteFaixa.isAnimalDessePorte(this)) {
                return porteFaixa.getPorte();
            }
        }

        throw new CadastroException("Não foi possível classificar o porte do animal.");
    }

    @Override
    public boolean equals(Object o) {
        Animal outroAnimal = (Animal) o;
        return ((this.nome.equals(outroAnimal.nome))
              //  && (this.dono.equals(outroAnimal.dono))
                && this.especie.equals(outroAnimal.especie));

    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + (this.nome != null ? this.nome.hashCode() : 0);
        hash = 17 * hash + (this.especie != null ? this.especie.hashCode() : 0);
        //hash = 17 * hash + (this.dono != null ? this.dono.hashCode() : 0);
        return hash;
    }
}
