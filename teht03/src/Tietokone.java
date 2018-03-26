public class Tietokone {
    Kotelo kotelo;
    Näytönohjain näytönohjain;
    Verkkokortti verkkokortti;
    Suoritin suoritin;
    Muistipiiri muistipiiri;
    Emolevy emolevy;


    public void kasaa(AbstractTietokoneFactory tf) {
        kotelo = tf.getKotelo();
        kotelo.kokoa(tf);
    }

    public int getHinta() {
        return kotelo.getHinta();
    }
}
