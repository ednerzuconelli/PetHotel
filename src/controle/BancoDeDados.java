package controle;

import java.util.HashSet;
import java.util.Set;
import modelo.Acomodacao;
import modelo.Animal;
import modelo.Dono;
import modelo.Estadia;
import modelo.PorteFaixa;
import modelo.Servico;

public class BancoDeDados {

    private Set<Acomodacao> acomodacoes;
    private Set<Animal> animais;
    private Set<Dono> donos;
    private Set<Estadia> estadias;
    private Set<PorteFaixa> porteFaixas;
    private Set<Servico> servico;
    private static BancoDeDados instance;
    

    private BancoDeDados() {
        // Inicializa os conjuntos
        acomodacoes = new HashSet<Acomodacao>();
        animais = new HashSet<Animal>();
        donos = new HashSet<Dono>();
        estadias = new HashSet<Estadia>();
        porteFaixas = new HashSet<PorteFaixa>();
        servico = new HashSet<Servico>();
    }

    public static BancoDeDados getInstance() {
        if (instance == null) {
            instance = new BancoDeDados();
        }
        return instance;
    }

    public Set<Acomodacao> getAcomodacoes() {
        return acomodacoes;
    }

    public Set<Animal> getAnimais() {
        return animais;
    }

    public Set<Dono> getDonos() {
        return donos;
    }

    public Set<Estadia> getEstadias() {
        return estadias;
    }

    public Set<PorteFaixa> getPorteFaixas() {
        return porteFaixas;
    }

    public Set<Servico> getServico() {
        return servico;
    }

    
    
}
