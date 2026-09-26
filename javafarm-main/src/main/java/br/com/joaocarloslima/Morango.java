package br.com.joaocarloslima;

public class Morango {

    private int tamanho;
    private int tempoDeVida;
    private int tempoDeCrescimento;

    public Morango() {
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
        return "/br/com/joaocarloslima/images/morango" + tamanho + ".png";
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
