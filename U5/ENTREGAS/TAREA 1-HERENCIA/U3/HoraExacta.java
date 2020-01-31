package U5.T1.U3;

import U5.T1.U1.Hora;

public class HoraExacta extends Hora {
    protected int segundo;

    public HoraExacta(int hora,int minuto,int segundo){
        super(hora,minuto);
        this.segundo=segundo;
    }
    public void setSegundo(int segundo) {
        if (segundo>=0 && segundo<60) {
            this.segundo=segundo;
        }
    }
    @Override
    public void inc(){
        segundo=segundo+1;
    }
    @Override
    public String toString(){
        return super.toString()+":"+segundo;
    }
}
