package modelo;

public class Produtos {

    private String nome;
    private String descicao;
    private double preco;
    private int estoqueDisponivel;

    public Produtos(String nome, String descicao, double preco, int estoqueDisponivel) {
        this.nome = nome;
        this.descicao = descicao;
        this.preco = preco;
        this.estoqueDisponivel = estoqueDisponivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescicao() {
        return descicao;
    }

    public void setDescicao(String descicao) {
        this.descicao = descicao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEstoqueDisponivel() {
        return estoqueDisponivel;
    }

    public void setEstoqueDisponivel(int estoqueDisponivel) {
        this.estoqueDisponivel = estoqueDisponivel;
    }
}
