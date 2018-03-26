public class Emolevy extends AbstractLaiteosa {
    Suoritin suoritin;
    Näytönohjain näytönohjain;
    Verkkokortti verkkokortti;
    Muistipiiri muistipiiri;

    public Emolevy(int hinta) {
        this.hinta = hinta;
    }

    @Override
    public int getHinta() {
        return hinta + suoritin.getHinta() + näytönohjain.getHinta() + muistipiiri.getHinta() + verkkokortti.getHinta();
    }

    public Emolevy kokoa(AbstractTietokoneFactory tf) {
        suoritin = tf.getSuoritin();
        näytönohjain = tf.getNäytönohjain();
        verkkokortti = tf.getVerkkoKortti();
        muistipiiri = tf.getMuistipiiri();

        return this;
    }
}
