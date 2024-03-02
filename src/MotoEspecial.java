public class MotoEspecial extends Moto implements ModuloEletrico, SistemaDeTransporte {
    public MotoEspecial(
            String modelo,
            Integer ano) {
        super(modelo, ano);
    }

    @Override
    public void ativarModoEco() {

    }

    @Override
    public void carregar(int voltagem) {

    }

    @Override
    public void controleDeCarga(double peso, int distancia) {

    }

    @Override
    public void calcularRota(String[] pontosDeEntrega) {

    }
}
