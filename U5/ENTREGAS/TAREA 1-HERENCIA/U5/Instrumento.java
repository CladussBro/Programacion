package U5.T1.U5;

public abstract class Instrumento {
    public enum Nota{DO,RE,MI,FA,SOL,LA,SI};
    protected Nota notas[];
    protected int numNotas;
    static protected int TAM_MAX_TABLA=100;

    public Instrumento(){
        notas= new Nota[TAM_MAX_TABLA];
        numNotas=0;
    }
    public void add(Nota n){
        if (numNotas<notas.length){
            notas[numNotas]=n;
            numNotas++;
        }
    }
    public abstract void interpretar();
}
