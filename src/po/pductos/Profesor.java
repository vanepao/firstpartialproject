package po.pductos;

public class Profesor extends Persona{
    //ATRIBUTOS
    private String nomina;
    private Horario horario;

    //MÉTODOS
    public Profesor(String nombre, String fechaNac, char genero,String nomina){
       super(nombre,fechaNac,genero);
       this.nomina=nomina;
    }

    //SETTERS
    public void setHorario(Horario h) {
    this.horario=h;
    }
   //GETTERS
public Horario getHorario() {
    return this.horario = horario;
}
public String getNomina(){
    return this.nomina;
        }

        //DEVUELVE ATRIBUTOS DE CLASE PROFESOR
    @Override
    public String toString(){
        return "Nombre del profesor: " + nombre + "\n"+ "Fecha de nacimiento: " +fechaNac +"\n" + "Género: " +genero + "\n" + "Estatura: "+estatura + "\n"+ "Peso: " + peso+ "\n"+ "Nomina: "+ nomina + "\n"+ "Horario: "+horario;
    }

    //    +getHorario(): Horario
// +getMaterias(): Materias[]
// +getNomina(): String
}
