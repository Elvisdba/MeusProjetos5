
package sistemadevendas;

import java.util.ArrayList;

public class Venda {
    private String data;
    private int numero;
    
    private ArrayList<ItemVenda> itensDaVenda;
    
    private Cliente cliente;
    
    public Venda(){
        this.itensDaVenda = new ArrayList<>();
        this.cliente = new Cliente();
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the itensDaVenda
     */
    public ArrayList<ItemVenda> getItensDaVenda() {
        return itensDaVenda;
    }

    /**
     * @param itensDaVenda the itensDaVenda to set
     */
    public void setItensDaVenda(ArrayList<ItemVenda> itensDaVenda) {
        this.itensDaVenda = itensDaVenda;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    //loop
    
    public float getValorTotal(){
        float retorno = 0;
        for (ItemVenda itensDaVenda1 : this.itensDaVenda) {
            float valor = (itensDaVenda1).getQuantidade() * itensDaVenda1.getPreco();
            retorno = retorno + valor;
        }
            return retorno;
    }
}
