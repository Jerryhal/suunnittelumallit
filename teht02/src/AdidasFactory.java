public class AdidasFactory implements AbstractFactory {

    @Override
    public AbstractPaita createPaita() {
        return new AdidasPaita();
    }

    @Override
    public AbstractHattu createHattu() {
        return new AdidasHattu();
    }

    @Override
    public AbstractHousut createHousut() {
        return new AdidasHousut();
    }
}
