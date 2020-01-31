package U5.T1.U6;

import U5.T1.U5.Instrumento;

public class Piano extends Instrumento {
    public Piano(){
        super();
    }
    @Override
    public void interpretar() {
        for (int i = 0; i < numNotas; i++) {
            switch (notas[i]) {
                case DO:
                    System.out.println("TAN");
                    break;
                case RE:
                    System.out.println("TEN");
                    break;
                case MI:
                    System.out.println("TIN");
                    break;
                case FA:
                    System.out.println("TON");
                    break;
                case SOL:
                    System.out.println("TUN");
                    break;
                case LA:
                    System.out.println("TAAN");
                    break;
                case SI:
                    System.out.println("TIIN");
                    break;
            }
        }
    }
}
