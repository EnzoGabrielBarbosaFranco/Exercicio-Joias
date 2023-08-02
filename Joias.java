public class Joias {
    private double valor;
    private double peso;
    private String materialPrincipal;
    private int quantidadeEstoque;
    private String tipo;

    public Joias(double valor, double peso, String materialPrincipal, int quantidadeEstoque, String tipo) {
        this.valor = valor;
        this.peso = peso;
        this.materialPrincipal = materialPrincipal;
        this.quantidadeEstoque = quantidadeEstoque;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Tipo: " + tipo + "\nValor: R$" + valor + "\nPeso: " + peso + " gramas" +
                "\nMaterial Principal: " + materialPrincipal + "\nQuantidade em Estoque: " + quantidadeEstoque;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getMaterialPrincipal() {
        return materialPrincipal;
    }

    public void setMaterialPrincipal(String materialPrincipal) {
        this.materialPrincipal = materialPrincipal;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}