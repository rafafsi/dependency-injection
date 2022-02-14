package dependencyInjectionExemplo;

public class HorarioQuadra {
    public static void main(String[] args) {
        HorarioQuadra horario = new HorarioQuadra(new Basquete());
        horario.modalidade();
    }

    private Esporte esporte;

    public HorarioQuadra(Esporte esporte1) {
        this.esporte = esporte1;
    }

    public void modalidade() {
        esporte.type();
    }
}
