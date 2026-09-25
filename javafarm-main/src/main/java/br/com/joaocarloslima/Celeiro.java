package br.com.joaocarloslima;

public class Celeiro {
    private int capacidade;
    private int qtdeBatatas;
    private int qtdeCenouras;
    private int qtdeMorangos;

    public Celeiro() {
        capacidade = 20;
        qtdeBatatas = 5;
        qtdeCenouras = 3;
        qtdeMorangos = 1;
    }

    public void armazenarBatata() {
        verificarEspacoParaArmazenar();
        qtdeBatatas += 2;
    }

    public void armazenarCenoura() {
        verificarEspacoParaArmazenar();
        qtdeCenouras += 2;
    }

    public void armazenarMorango() {
        verificarEspacoParaArmazenar();
        qtdeMorangos += 2;
    }

    public void consumirBatata() {
        if (qtdeBatatas <= 0) {
            throw new RuntimeException("Não há batatas no celeiro.");
        }
        qtdeBatatas--;
    }

    public void consumirCenoura() {
        if (qtdeCenouras <= 0) {
            throw new RuntimeException("Não há cenouras no celeiro.");
        }
        qtdeCenouras--;
    }

    public void consumirMorango() {
        if (qtdeMorangos <= 0) {
            throw new RuntimeException("Não há morangos no celeiro.");
        }
        qtdeMorangos--;
    }

    public int getEspacoDisponivel() {
        return capacidade - getTotalArmazenado();
    }

    public double getOcupacao() {
        return (double) getTotalArmazenado() / capacidade;
    }

    public boolean celeiroCheio() {
        return getTotalArmazenado() >= capacidade;
    }

    private int getTotalArmazenado() {
        return qtdeBatatas + qtdeCenouras + qtdeMorangos;
    }

    private void verificarEspacoParaArmazenar() {
        if (getEspacoDisponivel() < 2) {
            throw new RuntimeException("O celeiro não possui espaço para armazenar o produto.");
        }
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getQtdeBatatas() {
        return qtdeBatatas;
    }

    public int getQtdeCenouras() {
        return qtdeCenouras;
    }

    public int getQtdeMorangos() {
        return qtdeMorangos;
    }
}
