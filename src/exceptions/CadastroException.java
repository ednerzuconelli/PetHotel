package exceptions;

public class CadastroException extends RuntimeException {

    public CadastroException(String mensagemDeErro) {
        super(mensagemDeErro);
    }
}
