package U4.E8;

public class bombilla {
    public static boolean intG=true;
    private boolean inte;

    public bombilla(){
        inte=false;
    }
    public void encender(){
        inte=true;
    }
    public void apagar(){
        inte=false;
    }
    public boolean estado(){
        boolean est;
        if((intG==true) && (inte==true)){
            est=true;
        }else{
            est=false;
        }
        return est;
    }
    public String mostrar(){
        String estado;
        if(estado()==true){
            estado="Encendido";
        }else{
            estado="Apagado";
        }
        return estado;
    }
}
