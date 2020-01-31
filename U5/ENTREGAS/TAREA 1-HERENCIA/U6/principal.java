package U5.T1.U6;

import U5.T1.U5.Instrumento;

public class principal {
    public static void main(String[] args) {
        Campana c = new Campana();
        c.add(Instrumento.Nota.DO);
        c.add(Instrumento.Nota.RE);
        c.add(Instrumento.Nota.MI);
        c.add(Instrumento.Nota.FA);
        c.add(Instrumento.Nota.SOL);
        c.add(Instrumento.Nota.LA);
        c.add(Instrumento.Nota.SI);
        c.interpretar();

        Piano p = new Piano();
        c.add(Instrumento.Nota.DO);
        c.add(Instrumento.Nota.RE);
        c.add(Instrumento.Nota.MI);
        c.add(Instrumento.Nota.FA);
        c.add(Instrumento.Nota.SOL);
        c.add(Instrumento.Nota.LA);
        c.add(Instrumento.Nota.SI);
        c.interpretar();
    }
}
