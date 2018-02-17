package po.pductos;

public class Materia{
    //ATRIBUTOS
    private String Nombre;
    private String Clave;
    private Horario horario;
    private Profesor Maestro;

//MÉTODOS
    public Materia(String Nombre, String Clave){
        this.Nombre=Nombre;
        this.Clave=Clave;
    }
    public Materia(String Nombre, String Clave, Horario horario, Profesor Maestro){
        this.Nombre=Nombre;
        this.Clave=Clave;
        this.horario=horario;
        this.Maestro=Maestro;
    }

    //SETTERS
    public void setHorario(Horario horario){
        this.horario=horario;

    }
    public void setMaestro(Profesor Maestro){
            this.Maestro=Maestro;
    }

    //GETTERS
    public String getNombre(){
            return Nombre;
    }

    public String getClave(){
            return Clave;
    }
    public Horario getHorario(){
            return horario;
    }
    public Profesor getMaestro(){
            return Maestro;
    }

    //STRING DEVUELVE UNA CADENA TIPO STRING, LA CUAL CONTIENE TODOS LOS ATRIBUTOS DE LA CLASE MATERIA.
        @Override
        public String toString(){
            return Nombre + ", " + Clave + ", de " + horario + ", " + Maestro;
        }
    }
