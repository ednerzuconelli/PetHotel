package exceptions;

import modelo.Animal;

public class SemAcomodacaoLivreException extends RuntimeException {

    public SemAcomodacaoLivreException(Animal animal) {

        super("Não há acomodação livre para "
                + animal.getEspecie().toString().toLowerCase()
                + " " + animal.getPorte().toString().toLowerCase());
    }
}
