package br.com.aj_sistemas.novo_sgad.utils;

import br.com.aj_sistemas.novo_sgad.controller.CaixaController;
import br.com.aj_sistemas.novo_sgad.model.Caixa;
import br.com.aj_sistemas.novo_sgad.model.UsuarioArquivo;

/**
 *
 * @author Alisson Jaques
 */
public class BibliotecaArquivoDeslizante {
    public static boolean preencherCaixasNoArquivo(){
        CaixaController controle = new CaixaController();
        controle.deletarTodos();
        int id_caixa = 0;
        int rua = 1;
        int avenida = 1;
        int predio = 1;
        int andar = 1;
        int apartamento = 0;
        
        for(int i=0; i<98; i++){
            id_caixa++;
            apartamento++;
            controle.inserir(new Caixa(id_caixa,rua,avenida,predio,andar,apartamento));
            if(andar==7 && apartamento==7){
                avenida++;
                andar = 1;
                apartamento = 0;
            }
            if(apartamento==7){
                andar++;
                apartamento = 0;
            }
        }
        
        return true;
    }
    
    public static void copiaUsuario(UsuarioArquivo copia, UsuarioArquivo modelo){
        copia.setIdUsuario(modelo.getIdUsuario());
        copia.setNome(modelo.getNome());
        copia.setNomeDeUsuario(modelo.getNomeDeUsuario());
        copia.setCpf(modelo.getCpf());
        copia.setSenha(modelo.getSenha());
        copia.setPerfil(modelo.getPerfil());
    }
}
