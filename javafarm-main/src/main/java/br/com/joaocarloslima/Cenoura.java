package br.com.joaocarloslima;

public class Cenoura {

    private int tamanho;
    private int tempoDeVida;
    private int tempoDeCrescimento;

    public Cenoura() {
        tamanho = 1;
        tempoDeVida = 1;
        tempoDeCrescimento = 3;
    }

    public void crescer() {
        tempoDeVida++;

        if ((tempoDeVida - 1) % tempoDeCrescimento == 0 && tamanho < 4) {
            tamanho++;
        }
    }

    public boolean podeColher() {
        return tamanho == 4;
    }

    public String getImagem() {
        return "/br/com/joaocarloslima/images/cenoura" + tamanho + ".png";
    }

    public int getTamanho() {
        return tamanho;
    }

    public int getTempoDeVida() {
        return tempoDeVida;
    }

    public int getTempoDeCrescimento() {
        return tempoDeCrescimento;
    }
}
