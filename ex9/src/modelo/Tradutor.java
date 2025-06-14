package modelo;

public class Tradutor{
    private String palavraPortugues;
    private String palavraIngles;

    public Tradutor(String palavraPortugues, String palavraIngles) {
        this.palavraPortugues = palavraPortugues;
        this.palavraIngles = palavraIngles;
    }

    public String getPalavraPortugues() {
        return palavraPortugues;
    }

    public void setPalavraPortugues(String palavraPortugues) {
        this.palavraPortugues = palavraPortugues;
    }

    public String getPalavraIngles() {
        return palavraIngles;
    }

    public void setPalavraIngles(String palavraIngles) {
        this.palavraIngles = palavraIngles;
    }
}
