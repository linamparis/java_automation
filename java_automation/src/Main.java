public class Main {
    public static void main(String[] args) {
        Charmader charmanderUno = new Charmader(0.6,8,"Macho","Mar llamas");
        //Charmader charmanderDos = new Charmader(0.8,9,"Hembra","Mar llama");
        Bulbasaur bulbasaurUno = new Bulbasaur(0.7,6,"Indefinido","Espesura");
        charmanderUno.ataqueMarLlamas(bulbasaurUno,50);
        System.out.println(charmanderUno.getPuntosVida());

       // charmanderUno.setTipo("Tierra");
        //System.out.println(charmanderUno.getTipo());
    }
}