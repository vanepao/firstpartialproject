
package po.pductos;
import java.util.Arrays;

public class Alumno extends Persona {

    //ATRIBUTOS
    private String matricula;
    private String gene;
    private Materia[] materias=new Materia[6];
    private Horario horario;

//MÉTODOS
    public Alumno(String nombre, String fechaNac,char genero, String matricula, String gene) {
        super(nombre, fechaNac, genero);
        this.matricula=matricula;
        this.gene=gene;
        //this.new Materias[6];
    }
                          //SETTERS
public void setHorario(Horario h){
        this.horario=h;

    }

    public void setMaterias(Materia materias[]){
        this.materias=materias;
    }

    //GETTERS
    public Horario getHorario(){
      return  this.horario;

    }
    public Materia[] getMaterias(){
        return this.materias;
    }

    public String getMatricula(){
        return this.matricula;

    }
    public String getGene(){
        return this.gene;

    }


    @Override
    public String toString(){
        String topics="";
        for (int i=0; i<materias.length; i++){
             if(this.materias[i]!=null){
            topics+=(this.materias[i].toString()+"\n");
        } }

        return "Nombre del alumno: " + nombre + "\n"+ "Fecha de nacimiento: " +fechaNac +"\n" + "Género: " +genero + "\n" + "Estatura: "+estatura + "\n"+ "Peso: " + peso+ "\n"+ "Matricula: "+ matricula + "\n"+ "Gene: "+gene +"\n Materias:\n" + topics;
    }
}




//+setMaterias(Materias[]): void
// +getHorario(): Horario
// +getMaterias(): Materias[]
// +getMatricula(): String
//+getGene(): String