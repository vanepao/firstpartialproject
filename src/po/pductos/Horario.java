package po.pductos;

import java.text.Format;

public class Horario {
    //ATRIBUTOS
    private FormatoHora inicio;
    private FormatoHora fin;
    private String aula;
    private Horario horario;
    private FormatoHora duracion;

//MÉTODOS
    public Horario(FormatoHora inicio, FormatoHora fin, String aula){
        this.inicio=inicio;
        this.fin=fin;
        this.aula=aula;
    }
    public Horario(FormatoHora inicio, FormatoHora fin) {
        this.inicio=inicio;
        this.fin=fin;
    }

    //SETTER
    public void setAula(String aula){
        this.aula=aula;
    }
    //GETTERS
    public FormatoHora getIncio() {
        return inicio;
    }

    public FormatoHora getFin() {
        return fin;
    }

    public String getAula() {
        return aula;
    }

    //MÉTODO
    public FormatoHora CalculaDuracion(){
        int HI = inicio.getHoras();
        int MI= inicio.getMinutos();
        int SI=  inicio.getSegundos();
        int HF = fin.getHoras();
        int MF= fin.getMinutos();
        int SF=  fin.getSegundos();

            if(MF<MI){
            HF = HF-1;
            MF = MF+60;
            }

            else{
                HF = HF;
                MF = MF;
            }

            if (SF<SI){
                MF = MF-1;
                SF = SF+60;
            }

            else{
                MF = MF;
                SF = SF;
            }

            return new FormatoHora(HF-HI, MF-MI, SF-SI);
        }

//String devuelve datos de clase horario

    @Override
    public String toString(){
    return inicio + " a " + fin + "aula: " + aula;
    }

}