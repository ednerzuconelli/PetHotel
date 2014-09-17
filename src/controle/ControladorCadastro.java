package controle;

import enumerations.AcomodacaoEstado;
import enumerations.Especie;
import enumerations.Porte;
import exceptions.CadastroException;
import exceptions.SemAcomodacaoLivreException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import modelo.Acomodacao;
import modelo.Animal;
import modelo.Dono;
import modelo.Estadia;
import modelo.PorteFaixa;
import modelo.Servico;

public class ControladorCadastro {

    public static void cadastrar(Object entidade) throws CadastroException {
        boolean cadastrou = false;

        if (entidade instanceof Acomodacao) {
            cadastrou = BancoDeDados.getInstance().getAcomodacoes().add((Acomodacao) entidade);
        } else if (entidade instanceof Animal) {
            cadastrou = BancoDeDados.getInstance().getAnimais().add((Animal) entidade);
        } else if (entidade instanceof Dono) {
            cadastrou = BancoDeDados.getInstance().getDonos().add((Dono) entidade);
        } else if (entidade instanceof Estadia) {
            cadastrou = BancoDeDados.getInstance().getEstadias().add((Estadia) entidade);
        } else if (entidade instanceof PorteFaixa) {
            cadastrou = BancoDeDados.getInstance().getPorteFaixas().add((PorteFaixa) entidade);
        } else if (entidade instanceof Servico) {
            cadastrou = BancoDeDados.getInstance().getServico().add((Servico) entidade);
        }
        
        System.out.println("Acomodações: " + BancoDeDados.getInstance().getAcomodacoes());
        System.out.println("Animais: " + BancoDeDados.getInstance().getAnimais());
        System.out.println("Donos: " + BancoDeDados.getInstance().getDonos());
        System.out.println("Estadias: " + BancoDeDados.getInstance().getEstadias());
        System.out.println("Faixas de porte: " + BancoDeDados.getInstance().getPorteFaixas());
        System.out.println("Serviços: " + BancoDeDados.getInstance().getServico());
        System.out.println("----------------------------------------------------");

        if (!cadastrou) {
            throw new CadastroException("Não foi possível cadastrar, pois um identificador repetido já foi cadastrado.");
        }
    }

    // A acomodação é adequada quando é da mesma espécie que o animal, mesmo porte e está desocupada
    public static Object[] listarAcomodacoesAdequadas(Animal animal) {
        Set<Acomodacao> acomodacoes = BancoDeDados.getInstance().getAcomodacoes();
        java.util.List<Acomodacao> adequadas = new ArrayList<Acomodacao>();

        for (Acomodacao acomodacao : acomodacoes) {
            if (acomodacao.getAla().equals(animal.getEspecie())
                    && acomodacao.getDimensao().equals(animal.getPorte())
                    && acomodacao.getEstado().equals(AcomodacaoEstado.DESOCUPADO)) {
                adequadas.add(acomodacao);
            }
        }

        if (adequadas.isEmpty()) {
            throw new SemAcomodacaoLivreException(animal);
        }

        Collections.sort(adequadas);

        return adequadas.toArray();
    }

    // A acomodação é adequada quando é da mesma espécie que o animal, mesmo porte e está desocupada
    public static List<Acomodacao> listarAcomodacoesFiltro(Especie especie, Porte porte, AcomodacaoEstado acomodacaoEstado) {
        Set<Acomodacao> acomodacoes = BancoDeDados.getInstance().getAcomodacoes();
        java.util.List<Acomodacao> filtradas = new ArrayList<Acomodacao>();

        for (Acomodacao acomodacao : acomodacoes) {
            if ((especie == null ? true : acomodacao.getAla().equals(especie))
                    && (porte == null ? true : acomodacao.getDimensao().equals(porte))
                    && (acomodacaoEstado == null ? true : acomodacao.getEstado().equals(acomodacaoEstado))) {
                filtradas.add(acomodacao);
            }
        }

        Collections.sort(filtradas);

        return filtradas;
    }
}
