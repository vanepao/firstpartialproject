package po.pductos;

public class Materia{
    private String Nombre;
    private String Clave;
    private Horario horario;
    private Profesor Maestro;

//public Materia(){
    // this.Nombre="";
   // this.Clave="";

//}
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
    public void setHorario(Horario horario){
        this.horario=horario;

    }
public void setMaestro(Profesor Maestro){
        this.Maestro=Maestro;
}

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
    @Override
    public String toString(){
        return Nombre + ", " + Clave + ", de " + horario + ", " + Maestro;
    }
}
//+setHorario(Horario): void
// +setMaestro(Profesor): void


// +getNombre(): String
//+getClave(): String
//+getHorario(): Horario
//+getMaestro(): Profesor
//+to_String(): String