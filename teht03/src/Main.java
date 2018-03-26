public class Main {
    public static void main(String[] args) {
        Tietokone tietokone = new Tietokone();
        AbstractTietokoneFactory tk = new TietokoneKasaaja();
        tietokone.kasaa(tk);
        System.out.println("hinnaksi tuli " + tietokone.getHinta() + "€");
    }
}
