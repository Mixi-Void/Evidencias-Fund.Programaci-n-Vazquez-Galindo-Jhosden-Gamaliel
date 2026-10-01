import java.util.Scanner;

public class Salario {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int Limite=40;

        String nombre;
        double horasT;
        double PagoPH;
        double total;
        System.out.println("Escribe tu nombre");
        nombre= sc.nextLine();
        System.out.println("Escribe las horas trabajadas");
        horasT= sc.nextInt();
        System.out.println("Pago por horas:");
        PagoPH= sc.nextInt();

if (horasT<=Limite){
    total=horasT*PagoPH;
}else{
    total=Limite*PagoPH+(horasT-Limite)*PagoPH*2;
}
System.out.println("Nombre: "+nombre);
System.out.println("HorasTrabajadas: "+horasT);
if (horasT<=Limite){
    System.out.println("Horas normales: "+(int)horasT);
    System.out.println("Horas extra: 0");
}else {
    System.out.println("Horas Normales: "+Limite);
    System.out.println("Horas Extra: "+(int)(horasT-Limite));
}
System.out.println("Salario:$ "+total);

    }
}
