public class Kotelo extends AbstractLaiteosa {
    Emolevy emolevy;

    public Kotelo(int hinta) {
        this.hinta = hinta;
    }

    public Kotelo kokoa(AbstractTietokoneFactory tf) {
        emolevy = tf.getEmolevy();
        emolevy.kokoa(tf);
        return this;
    }

    @Override
    public int getHinta() {
        return hinta + emolevy.getHinta();
    }
}
