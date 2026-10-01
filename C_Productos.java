import java.util.Scanner;

public class C_Productos {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double envio=80;

        double precio;
        int cantidad;
        double subT;
        double descuento ;
        double ConD ;
        double costoEnvio ;

        System.out.println("Precio del producto: ");
        precio= sc.nextDouble();
        System.out.println("Cauntos productos son?:");
        cantidad=sc.nextInt();

        subT=precio*cantidad;
        if (subT>=1000){
            descuento=subT*0.10;
        }else {
            descuento=0;
        }
        ConD=subT-descuento;
        if (ConD >= 1500){
            costoEnvio=0;
        }else{
            costoEnvio=envio;
        }
        System.out.println("Precio del producto: "+precio);
        System.out.println("Cantidad: "+cantidad);
        System.out.println("Subtotal:$ "+subT);
        System.out.println("Descuento:$ "+descuento);
        System.out.println("Total con descuento:$ "+ConD);
        System.out.println("Envío:$ "+(int)costoEnvio);
        System.out.println("Total Final:$ "+(ConD+costoEnvio));
    }
}
