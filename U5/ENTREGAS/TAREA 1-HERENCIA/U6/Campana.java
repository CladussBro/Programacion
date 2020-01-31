package U5.T1.U6;

import U5.T1.U5.Instrumento;

public class Campana extends Instrumento {
    public Campana(){
        super();
    }
    @Override
    public void interpretar(){
        for (int i=0;i<numNotas;i++){
            switch (notas[i]){
                case DO:
                    System.out.println("DAN");
                    break;
                case RE:
                    System.out.println("DEN");
                    break;
                case MI:
                    System.out.println("DIN");
                    break;
                case FA:
                    System.out.println("DON");
                    break;
                case SOL:
                    System.out.println("DUN");
                    break;
                case LA:
                    System.out.println("DAAN");
                    break;
                case SI:
                    System.out.println("DOON");
                    break;
            }
        }
    }
}
