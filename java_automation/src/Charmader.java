public class Charmader {
    private String nombre = "Charmander";
    private String tipo = "Fuego";
    private double altura;
    private double peso;
    private String sexo;
    private String habilidad;
    //private String[] debilidades = new String[3];
    private String[] debilidades2 = {"Agua","Tierra","Roca"};

    private boolean isDisponible = true;

    private int puntosVida = 100;

    //CONSTRUCTOR
      public Charmader(double altura, float peso,String sexo, String habilidad){
             this.altura = altura;
             this.peso = peso;
             this.sexo = sexo;
             this.habilidad=habilidad;
      }


      public Charmader(){

      }
    //GETTER Y SETTER


    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isDisponible() {
        return isDisponible;
    }

    public void setDisponible(boolean disponible) {
        isDisponible = disponible;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    public void setNombre(String nombrePokemon){
          this.nombre = nombrePokemon;
    }

    public String getNombre(){
          return nombre;
    }

    public  void setAltura(double alturaPokemon){
          this.altura = alturaPokemon;
    }

    public double getAltura(){
          return  altura;
    }

    public double getPeso() {
        return peso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public String[] getDebilidades2() {
        return debilidades2;
    }

    public void setDebilidades2(String[] debilidades2) {
        this.debilidades2 = debilidades2;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getTipo(){
        return tipo;
    }

    public  void setTipo(String tipoPokemon){
        this.tipo = tipoPokemon;
    }

    //METODOS ADICIONALES
    public void  ataqueMarLlamas(Bulbasaur rival, int dano){
          System.out.println((nombre + "ataca al pokemon" + rival.getNombre() + "y le causa" + dano = "No"));
           rival.recibirDano(dano);
    }
}
