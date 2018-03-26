public class BossFactory implements AbstractFactory {

    @Override
    public AbstractPaita createPaita() {
        return new BossPaita();
    }

    @Override
    public AbstractHattu createHattu() {
        return new BossHattu();
    }

    @Override
    public AbstractHousut createHousut() {
        return new BossHousut();
    }
}
