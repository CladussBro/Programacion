package U7.CORONAVIRUS;

public class main {
    public static void main(String[] args) {
        medicos m1= new medicos("Claudia","Borrachero",1,"Claudia");
        medicos m2= new medicos("Carlos","Puyana",2,"Carlos");
        medicos m3= new medicos("Isidro","Perez",3,"Isidro");

        pacientes p1= new pacientes("Abel",50,82,true,m1,"20");
        pacientes p2= new pacientes("Bob",70,82,false,m2,"19");
        pacientes p3= new pacientes("Clara",18,52,true,m3,"20");
        pacientes p4= new pacientes("Dani",23,56,false,m2,"19-2");
        pacientes p5= new pacientes("Estefania",56,74,true,m3,"20-1");
        pacientes p6= new pacientes("Fani",89,78,false,m1,"19");
        pacientes p7= new pacientes("Gerardo",24,56,true,m1,"19-2");
        pacientes p8= new pacientes("Hilario",74,82,false,m2,"19");
        pacientes p9= new pacientes("Ines",50,73,true,m1,"19");
        pacientes p10= new pacientes("Javier",22,62,false,m3,"20");

        coronavirus c1=new coronavirus("COVID-19","Wuhan");

    }
}
