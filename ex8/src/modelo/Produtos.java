package modelo;

public class Produtos {

    private String nome;
    private String descricao;
    private double preco;
    private int estoqueDisponivel;

    public Produtos(String nome, String descicao, double preco, int estoqueDisponivel) {
        this.nome = nome;
        this.descricao = descicao;
        this.preco = preco;
        this.estoqueDisponivel = estoqueDisponivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
