package po.pductos;

public class Profesor extends Persona{
    private String nomina;
    private Horario horario;

    public Profesor(String nombre, String fechaNac, char genero,String nomina){
       super(nombre,fechaNac,genero);
       this.nomina=nomina;
    }
    public void setHorario(Horario h) {
    this.horario=h;
    }

public Horario getHorario() {
    return this.horario = horario;
}

public String getNomina(){
    return this.nomina;
        }
    @Override
    public String toString(){
        return "Nombre del profesor: " + nombre + "\n"+ "Fecha de nacimiento: " +fechaNac +"\n" + "Género: " +genero + "\n" + "Estatura: "+estatura + "\n"+ "Peso: " + peso+ "\n"+ "Nomina: "+ nomina + "\n"+ "Horario: "+horario;
    }

    //    +getHorario(): Horario
// +getMaterias(): Materias[]
// +getNomina(): String
}
