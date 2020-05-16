package RECUP;

public class ej_9 {
    public static void main(String[] args) {
        System.out.println("La melodía generada es la siguiente: ");
        int num=2;
        do{
            num=(int)((Math.random()*28)+4);
        }while(num%2!=0);
        String espacio=" ";
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < 4; j++) {
                int nota1=(int)(Math.random()*7);
                String nota=" ";
                switch (nota1){
                    case 0:
                        nota="do";
                        break;
                    case 1:
                        nota="re";
                        break;
                    case 2:
                        nota="mi";
                        break;
                    case 3:
                        nota="fa";
                        break;
                    case 4:
                        nota="sol";
                        break;
                    case 5:
                        nota="la";
                        break;
                    case 6:
                        nota="si";
                        break;
                }
                if((i==0)&&(j==0)){
                    espacio=nota;
                }
                if((i==num-1)&&(j==3)){
                    nota=espacio;
                }
                System.out.print(nota+" ");
            }
            System.out.print("|");
        }
        System.out.print("|");
    }
}
