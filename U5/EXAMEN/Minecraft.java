package U5.EXAMEN;

public class Minecraft {

    public void Materiales(){
    int [] materiales = new int[10];
    int [] masa = new int[10];
    for (int j = 0; j <masa.length ; j++) {
        masa[j]= (int) (Math.random()*1001);
    }
    int [] quemarse = new int[10];
    for (int k = 0; k <quemarse.length ; k++) {
        quemarse[k]= (int) (Math.random()*101);
    }
    int [] diluirse = new int[10];
    for (int l = 0; l <diluirse.length ; l++) {
        diluirse[l]= (int) (Math.random()*101);
    }
    }
}
