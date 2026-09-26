package br.com.joaocarloslima;

public class Terreno {

    private Batata batata;
    private Cenoura cenoura;
    private Morango morango;
    private int x;
    private int y;

    public Terreno(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void plantar(Batata batata) {
        verificarTerrenoLivre();
        this.batata = batata;
    }

    public void plantar(Cenoura cenoura) {
        verificarTerrenoLivre();
        this.cenoura = cenoura;
    }

    public void plantar(Morango morango) {
        verificarTerrenoLivre();
        this.morango = morango;
    }

    public void colher(Celeiro celeiro) {
        if (batata != null) {
            if (!batata.podeColher()) {
                throw new RuntimeException("A batata ainda não está pronta para colher.");
            }
            celeiro.armazenarBatata();
            batata = null;
            return;
        }

        if (cenoura != null) {
            if (!cenoura.podeColher()) {
                throw new RuntimeException("A cenoura ainda não está pronta para colher.");
            }
            celeiro.armazenarCenoura();
            cenoura = null;
            return;
        }

        if (morango != null) {
            if (!morango.podeColher()) {
                throw new RuntimeException("O morango ainda não está pronto para colher.");
            }
            celeiro.armazenarMorango();
            morango = null;
            return;
        }

        throw new RuntimeException("Não há produto plantado neste terreno.");
    }

    public boolean estaOcupado() {
        return batata != null || cenoura != null || morango != null;
    }

    private void verificarTerrenoLivre() {
        if (estaOcupado()) {
            throw new RuntimeException("O terreno já está ocupado.");
        }
    }

    public Batata getBatata() {
        return batata;
    }

    public Cenoura getCenoura() {
        return cenoura;
    }

    public Morango getMorango() {
        return morango;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

