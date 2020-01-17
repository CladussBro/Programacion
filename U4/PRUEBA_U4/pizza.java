package U4.PruebaU4;

public class pizza {

    static int ING_BARBACOA = 1;
    static int ING_BACON = 2;
    static int ING_CEBOLLA = 3;

    protected String[] ing = {"Barbacoa", "Bacon", "Cebolla" };

    static int TAM_FAMILIAR = 1;
    static int TAM_MEDIANA = 2;

    private boolean tamañoCorrecto;
    private boolean ingCorrectos;

    private int ing1;
    private int ing2;
    private int ing3;

    private int tamañoElegido;
    public int numIngredientes;

    private String tamaño;
    private String ingre1;
    private String ingre2;
    private String ingre3;

    pizza(int tamaño, int ingre1) {
        if (tamaño != pizza.TAM_FAMILIAR || tamaño != pizza.TAM_MEDIANA) {
            if (ingre1 < 4 && ingre1 > -1) {
                this.ingCorrectos = true;
                this.tamañoCorrecto = true;
                this.ing1 = ingre1;
                this.tamañoElegido = tamaño;
                this.numIngredientes = 1;
            } else {
                this.ingCorrectos = false;
            }
        } else {
            this.tamañoCorrecto = false;
        }

    }

    pizza(int tamaño, int ingre1, int ingre2) {
        if (tamaño != pizza.TAM_FAMILIAR || tamaño != pizza.TAM_MEDIANA) {
            if ((ingre1 < 4 && ingre1 > -1) && (ingre2 < 4 && ingre2 > -1)) {
                this.ingCorrectos = true;
                this.tamañoCorrecto = true;
                this.ing1 = ingre1;
                this.ing2 = ingre2;
                this.tamañoElegido = tamaño;
                this.numIngredientes = 2;
            } else {
                this.ingCorrectos = false;
            }
        } else {
            this.tamañoCorrecto = false;
        }
    }

    pizza(int tamaño, int ingre1, int ingre2, int ingre3) {
        if (tamaño != pizza.TAM_FAMILIAR || tamaño != pizza.TAM_MEDIANA) {
            if ((ingre1 < 4 && ingre1 > -1) && (ingre2 < 4 && ingre2 > -1) && (ingre3 < 4 && ingre3 > -1)) {
                this.ingCorrectos = true;
                this.tamañoCorrecto = true;
                this.ing1 = ingre1;
                this.ing2 = ingre2;
                this.ing3 = ingre3;
                this.tamañoElegido = tamaño;
                this.numIngredientes = 3;
            } else {
                this.ingCorrectos = false;
            }
        } else {
            this.tamañoCorrecto = false;
        }
    }
}
