public class CarroEletrico extends Carro implements ModuloEletrico, SistemaDeTransporte {
    // atributos
    // contrutor
    // metodos

    public CarroEletrico(String modelo, Integer ano) {
        super(modelo, ano);
    }

    @Override
    public void acelerar(int velocidade) {
        System.out.println("Carro acelerando");
    }

    @Override
    public void frear(int velocidade) { // freIo
        System.out.println("Carro freando");
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
