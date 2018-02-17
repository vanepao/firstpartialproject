package po.pductos;

public class FormatoHora {
    //ATRIBUTOS
    private int horas;
    private int minutos;
    private int segundos;

    //MÉTODOS
    public FormatoHora(int horas, int minutos, int segundos){
        this.horas=horas;
        this.minutos=minutos;
        this.segundos=segundos;
    }


   private boolean validarHrs(int horas){
        if (horas==00 || horas<=23){
            return true;
} else{
            return false;
        }
    }
  private  boolean validarMS(int minutos, int segundos) {
        if ((minutos == 00) || (minutos <= 59) && (segundos == 00) || (segundos <= 59)) {
            return true;
        } else {
            return false;
        }
    }

    //GETTER DE FORMATO HORA
    public int getHoras(){
        return horas;
    }
    public int getMinutos(){
        return minutos;
    }
    public int getSegundos(){
        return segundos;
    }

    @Override
    public String toString(){
    return horas + ":" + minutos+ ":" + segundos;
    }
}

