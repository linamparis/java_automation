public class Bulbasaur {
    private String nombre = "Bulbasaur";
    private String[] tipo = {"Planta","Veneno"};
    private double altura;
    private float peso;
    private String sexo;
    private String habilidad;

    private String[] debilidades;

    private boolean isDisponible = true;
    private int puntosVida = 100;


    public Bulbasaur(double altura, float peso,String sexo, String habilidad){
        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
        this.habilidad=habilidad;
    }

    public Bulbasaur(){

    }

    //GETTER Y SETTER


    public boolean isDisponible() {
        return isDisponible;
    }

    public void setDisponible(boolean disponible) {
        isDisponible = disponible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String[] getTipo() {
        return tipo;
    }

    public void setTipo(String[] tipo) {
        this.tipo = tipo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
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

    public String[] getDebilidades() {
        return debilidades;
    }

    public void setDebilidades(String[] debilidades) {
        this.debilidades = debilidades;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    //Metodos adicionales

    public void recibirDano (int dano){
        puntosVida = puntosVida - dano;

    }
}
