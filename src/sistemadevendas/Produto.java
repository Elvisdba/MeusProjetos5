package sistemadevendas;


public class Produto {
    private String codigodebarras;
    private String descricao;
    private float preco;

    /**
     * @return the codigodebarras
     */
    public String getCodigodebarras() {
        return codigodebarras;
    }

    /**
     * @param codigodebarras the codigodebarras to set
     */
    public void setCodigodebarras(String codigodebarras) {
        this.codigodebarras = codigodebarras;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the preco
     */
    public float getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(float preco) {
        this.preco = preco;
    }
}
