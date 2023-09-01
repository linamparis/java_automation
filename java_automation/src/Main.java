public class Main {
    public static void main(String[] args) {
        Charmader charmanderUno = new Charmader(0.6,8,"Macho","Mar llamas");
        //Charmader charmanderDos = new Charmader(0.8,9,"Hembra","Mar llama");
        //Bulbasaur bulbasaurUno = new Bulbasaur(0.7,6,"Indefinido","Espesura");
        Bulbasaur bulbasaurUno = new Bulbasaur();
        bulbasaurUno.setAltura(0.7);
        bulbasaurUno.setPeso(6.9f);
        bulbasaurUno.setSexo("Macho");
        bulbasaurUno.setHabilidad("Espesura");
        String[] debilidades = new String[4];
        debilidades[0] = "hablar";
        debilidades[1] = "bailar";
        debilidades[2] = "comer";
        debilidades[3] = "beber";
        bulbasaurUno.setDebilidades(debilidades);
        charmanderUno.ataqueMarLlamas(bulbasaurUno, 23);
        System.out.println("Los puntos de vida restantes son: ");
        System.out.println(bulbasaurUno.getPuntosVida());

        //charmanderUno.ataqueMarLlamas(bulbasaurUno,50);
        //System.out.println(charmanderUno.getPuntosVida());
       // charmanderUno.setTipo("Tierra");
        //System.out.println(charmanderUno.getTipo());
    }
}