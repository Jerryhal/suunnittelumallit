public class TietokoneKasaaja implements AbstractTietokoneFactory {
    @Override
    public Kotelo getKotelo() {
        return new Kotelo(1);
    }

    @Override
    public Verkkokortti getVerkkoKortti() {
        return new Verkkokortti(10);
    }

    @Override
    public Näytönohjain getNäytönohjain() {
        return new Näytönohjain(100);
    }

    @Override
    public Emolevy getEmolevy() {
        return new Emolevy(1000);
    }

    @Override
    public Suoritin getSuoritin() {
        return new Suoritin(10000);
    }

    @Override
    public Muistipiiri getMuistipiiri() {
        return new Muistipiiri(100000);
    }
}
