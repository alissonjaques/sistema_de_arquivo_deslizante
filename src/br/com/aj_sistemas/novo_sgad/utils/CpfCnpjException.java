package br.com.aj_sistemas.novo_sgad.utils;

/**
 *
 * @author Alisson Jaques
 */
public class CpfCnpjException extends Exception{
    
    private final boolean cpf;

    public CpfCnpjException(boolean cpf, String string) {
        super(string);
        this.cpf = cpf;
    }

    public CpfCnpjException(boolean cpf) {
        this.cpf = cpf;
    }

    @Override
    public String getMessage() {
        String ret = super.getMessage() + "\n";
        if(cpf)
            ret += "Tipo do erro: CPF invalido!";
        else
            ret += "Tipo do erro: CNPJ invalido!";
        
        return ret;
    }    
}
