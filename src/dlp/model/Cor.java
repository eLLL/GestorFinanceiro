package dlp.model;

public enum Cor
{

    BRANCO(255, 255, 255), VERMELHO(255, 0, 0), AZUL(0, 0, 255), VERDE(0, 255, 0), ROSA(255, 0, 255), AMARELO(
            255, 255, 0), CYAN(0, 255, 255), ROXO(126, 29, 87);

    private int r, g, b;

    private Cor(int r, int g, int b)
    {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public int getR()
    {
        return r;
    }

    public void setR(int r)
    {
        this.r = r;
    }

    public int getG()
    {
        return g;
    }

    public void setG(int g)
    {
        this.g = g;
    }

    public int getB()
    {
        return b;
    }

    public void setB(int b)
    {
        this.b = b;
    }
}
