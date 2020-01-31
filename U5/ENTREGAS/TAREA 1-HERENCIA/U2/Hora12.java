package U5.T1.U2;

import U5.T1.U1.Hora;

public class Hora12 extends Hora {
    protected String meridiano="";

    //Constructor
    public Hora12(int hora, int minutos) {
        super(hora, minutos);
        if (this.hora < 13) {
            meridiano="AM";
        } else {
            this.hora=this.hora-12;
            meridiano="PM";
        }
    }

    //Metodos

    @Override
    public String toString(){
        return (super.toString()+ " " + meridiano);
    }
}
