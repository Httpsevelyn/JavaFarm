package br.com.joaocarloslima;

import java.util.ArrayList;
import java.util.List;

public class Fazenda {

    private List<Terreno> terrenos;
    private Celeiro celeiro;

    public Fazenda() {
        terrenos = new ArrayList<>();
        celeiro = new Celeiro();

        for (int x = 0; x < 13; x++) {
            for (int y = 0; y < 13; y++) {
                terrenos.add(new Terreno(x, y));
            }
        }
    }

    public void plantarBatata(int x, int y) {
        if (celeiro.getQtdeBatatas() <= 0) {
            throw new RuntimeException("Não há batatas no celeiro.");
        }

        Terreno terreno = getTerreno(x, y);
        terreno.plantar(new Batata());
        celeiro.consumirBatata();
    }

    public void plantarCenoura(int x, int y) {
        if (celeiro.getQtdeCenouras() <= 0) {
            throw new RuntimeException("Não há cenouras no celeiro.");
        }

        Terreno terreno = getTerreno(x, y);
        terreno.plantar(new Cenoura());
        celeiro.consumirCenoura();
    }

    public void plantarMorango(int x, int y) {
        if (celeiro.getQtdeMorangos() <= 0) {
            throw new RuntimeException("Não há morangos no celeiro.");
        }

        Terreno terreno = getTerreno(x, y);
        terreno.plantar(new Morango());
        celeiro.consumirMorango();
    }

    public Terreno getTerreno(int x, int y) {
        if (x < 0 || x >= 13 || y < 0 || y >= 13) {
            throw new RuntimeException("Posição de terreno inválida.");
        }

        return terrenos.get(x * 13 + y);
    }

    public void colher(int x, int y) {
        getTerreno(x, y).colher(celeiro);
    }

    public Celeiro getCeleiro() {
        return celeiro;
    }

    public List<Terreno> getTerrenos() {
        return terrenos;
    }
}
