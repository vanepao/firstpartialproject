package po.pductos;

public class Main {

    public static void main(String[] args) {

//SE INSTANCIA OBJETO
        Alumno alumni = new Alumno("VANESSA","26 DE SEPTIEMBRE 1975",'F',"A00502038","1990");
        FormatoHora formatoinicio= new FormatoHora(8,45,3);
        FormatoHora formatofin=new FormatoHora(10,30,1);
        Horario horarioinicio= new Horario(formatoinicio,formatofin,"Aula 3");
        Profesor leon= new Profesor("LEON","23 DE MARZO DE 1998",'H',"12131415");
        Materia materiamate= new Materia("Matemáticas","23456",horarioinicio,leon);

       Materia [] materias = {materiamate,null,null,null,null,null};
        alumni.setMaterias(materias);
System.out.println(alumni.toString());
}
    }

