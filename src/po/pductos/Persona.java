package po.pductos;

public abstract class Persona {
    //ATRIBUTOS

    protected String nombre;
    protected String fechaNac;
    protected char genero;
    protected float estatura;
    protected float peso;

//MÉTODOS
    public Persona(String nombre,String fechaNac,char genero){
        this.nombre=nombre;
        this.fechaNac=fechaNac;
        this.genero=genero;
    }

    //SETTERS
    public void setEstatura(float estatura){
        this.estatura=estatura;
    }
    public void setPeso(float peso){
        this.peso=peso;
    }

    //GETTERS
    public String getNombre(){
        return this.nombre;
    }
    public String getFechaNac(){
        return this.fechaNac;
    }
    public char getGenero(){
        return this.genero;
    }
    public float getEstatura(){
        return this.estatura;
    }
    public float getPeso(){
        return this.peso;
    }
   public abstract String toString();
}
