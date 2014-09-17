package modelo;

import exceptions.CadastroException;
import java.text.NumberFormat;
import java.util.Date;

public class Estadia {

    private Date dataDeEntrada;
    private Acomodacao acomodacao;
    private Animal animal;
    private int qtdeDiasPrevisto;
    private double taxaDeHospedagem;

    public Estadia(Date dataDeEntrada, Acomodacao acomodacao, Animal animal, int qtdeDiasPrevisto) {
        if (acomodacao == null) {
            throw new CadastroException("Selecione uma acomodação para o animal.");
        }
        if (animal == null) {
            throw new CadastroException("Selecione um animal.");
        }
        if (qtdeDiasPrevisto < 1) {
            throw new CadastroException("O animal deve se hospedar por pelo menos 1 dia.");
        }
        this.dataDeEntrada = dataDeEntrada;
        this.acomodacao = acomodacao;
        this.animal = animal;
        this.qtdeDiasPrevisto = qtdeDiasPrevisto;
        this.taxaDeHospedagem = calculaTaxaHospedagem();
    }

    public Date getDataDeEntrada() {
        return dataDeEntrada;
    }

    public void setDataDeEntrada(Date dataDeEntrada) {
        this.dataDeEntrada = dataDeEntrada;
    }

    public Acomodacao getAcomodacao() {
        return acomodacao;
    }

    public void setAcomodacao(Acomodacao acomodacao) {
        this.acomodacao = acomodacao;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public int getQtdeDiasPrevisto() {
        return qtdeDiasPrevisto;
    }

    public void setQtdeDiasPrevisto(int qtdeDiasPrevisto) {
        this.qtdeDiasPrevisto = qtdeDiasPrevisto;
    }

    public double getTaxaDeHospedagem() {
        return taxaDeHospedagem;
    }

    public void setTaxaDeHospedagem(double taxaDeHospedagem) {
        this.taxaDeHospedagem = taxaDeHospedagem;
    }

    public String imprimirEtiqueta() {
        String etiqueta = "Animal: " + animal.getNome();
     //   etiqueta += "\nDono(a): " + animal.getDono().getNome();
        etiqueta += "\nAcomodação: " + acomodacao.getNumero();
        etiqueta += "\nTaxa: " + NumberFormat.getCurrencyInstance().format(taxaDeHospedagem);

        return etiqueta;
    }

    private double calculaTaxaHospedagem() {
        return qtdeDiasPrevisto * acomodacao.getDimensao().getDiaria().getValorDiaria();
    }

    public double calculaTaxaHospedagem(int qtdeDias, boolean saidaAdiantada) {
        double taxa;

        if (saidaAdiantada) {
            taxa = qtdeDias * acomodacao.getDimensao().getDiaria().getValorDiaria();
        } else {
            double taxaNormal = qtdeDiasPrevisto * acomodacao.getDimensao().getDiaria().getValorDiaria();
            
            int diasExcedentes = qtdeDias - qtdeDiasPrevisto;
            double multa = diasExcedentes * acomodacao.getDimensao().getDiaria().getValorDiaria() * 1.1;
            
            taxa = taxaNormal + multa;
        }

        return taxa;
    }

   /* @Override
    public String toString() {
        return acomodacao + " - " + animal + " - " + animal.getDono();
    }*/
}
