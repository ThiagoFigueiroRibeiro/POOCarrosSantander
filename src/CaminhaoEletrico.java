public class CaminhaoEletrico extends Caminhao implements ModuloEletrico {

    @Override
    public void acelerar(int velocidade) {

    }

    @Override
    public void frear(int velocidade) {

    }

    public CaminhaoEletrico(
            String modelo,
            Integer ano
    ) {
        super(modelo, ano);
    }

    @Override
    public void ativarModoEco() {

    }

    public void carregar(int voltagem) {
    }

}
