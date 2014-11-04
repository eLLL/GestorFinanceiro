package dlp.model;

enum Cor
{
    BRANCO, VERMELHO, AZUL, VERDE, ROXO, ROSA, AMARELO
}

public class Categoria
{
    private int id;
    private String nome;
    private Cor cor;

    public Categoria()
    {
        // TODO Auto-generated constructor stub
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public Cor getCor()
    {
        return cor;
    }

    public void setCor(Cor cor)
    {
        this.cor = cor;
    }

}
