public class Jasper {
    AbstractPaita paita;
    AbstractHousut housut;
    AbstractHattu hattu;

    public Jasper() {
        pukeudu(new AdidasFactory());
    }

    public void pukeudu(AbstractFactory af) {
        housut = af.createHousut();
        paita = af.createPaita();
        hattu = af.createHattu();
    }

    public void valmistu() {
        pukeudu(new BossFactory());
    }

    public void esittely() {
        String esittely = "Hei olen Jasper, ja päälläni on " + housut + ", " + paita + " ja " + hattu + ".";
        System.out.println(esittely);
    }

}
