
package sistemadevendas;

import java.util.ArrayList;


public class RepositorioCliente {
    private ArrayList<Cliente> lista;
    private static RepositorioCliente instanciaRep;
    
    private RepositorioCliente (){
        this.lista = new ArrayList<Cliente>();
    }
    
    public static RepositorioCliente obterInstancia(){
        if(instanciaRep == null){
            instanciaRep = new RepositorioCliente();
        }
        return instanciaRep;
    
    }
    
    public ArrayList<Cliente> listarTodos(){
        return this.lista;
    
    }
    
    public void inserir (Cliente cliente) throws Exception {
        if (cliente == null) {
            throw new Exception("O cliente não foi instanciado");
        }
        if (cliente .getCpf() == null) {
            throw new Exception ("Informar o Cpf do cliente");
        }
        if (cliente.getNome() == null) {
            throw new Exception("Informar o nome do cliente");
        }
    }
    
    public void remover (Cliente cliente) throws Exception {
    
    }
    
    public void atualizar (Cliente cliente) throws Exception {
    
    }
    
    public int verificarExistencia (Cliente cliente){
        int retorno = -1;
        for (int i = 0; i < this.lista.size(); i++){
            if (cliente.getCpf().trim().equals(this.lista.get(i).getCpf().trim())){
                retorno = i;
                break;
            }
        }
        return retorno;
    
    }
}
