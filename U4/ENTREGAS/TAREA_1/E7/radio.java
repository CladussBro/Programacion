package U4.E7;

public class radio {
    public double freq;
    private static final double step = 0.5;

    public radio(){
        freq=80;
    }
    public radio(double freq){
        if (freq>108) {
            freq=80;
        } else if (freq<80) {
            freq=108;
        }
        this.freq=freq;
    }

    public void up (){
        if((freq+step)>108){
            freq = 80;
        }
        else {freq += step; }
    }
    public void down (){
        if((freq-step)<108){
        freq = 108;}
         else {freq -= step;}
    }
    public void display (){
        System.out.println(freq);
    }


}
