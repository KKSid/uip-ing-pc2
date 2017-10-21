import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio {

    public static void main (String[]args) throws IOException {
        boolean cap = true;
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        while (cap == true){
            String Elec="S";
            String nombre;
            String tipo;
            double venta;
            double comision;


            System.out.println("NoEstoyEntendiendo - Módulo de ventas");
            System.out.print("Vendedor: ");
            nombre = sc.readLine();
            System.out.print("Tipo(A/Z): ");
            tipo = sc.readLine();
            System.out.print("VENTA MENSUAL: ");
            venta = Double.parseDouble(sc.readLine());



              switch (tipo.toUpperCase()){

                case "A":
                        if (venta > 9999.99) {
                            comision = venta * 0.15;

                            System.out.println(nombre + " ," + " del tipo " + tipo + ", con venta mensual $" + venta + ", tiene comision de $" + comision);

                        } else if (4999.99 < venta && venta < 9999.99) {
                            comision = venta * 0.10;

                            System.out.println(nombre + " ," + " del tipo " + tipo + ", con venta mensual $" + venta + ", tiene comision de $" + comision);

                        }else if (999.99 >= venta || venta >= 4999.99) {
                            comision = venta * 0.05;

                            System.out.println(nombre + " ," + " del tipo " + tipo + ", con venta mensual $" + venta + ", tiene comision de $" + comision);

                        } else {
                            comision = venta * 0.02;

                            System.out.println(nombre + " ," + " del tipo " + tipo + ", con venta mensual $" + venta + ", tiene comision de $" + comision);



                }
                break;

                case "Z":
                    if (venta > 5000) {
                        comision = venta * 0.07;

                        System.out.println(nombre + " ," + " del tipo " + tipo + ", con venta mensual $" + venta + ", tiene comision de $" + comision);
                    } else {
                        comision = 0;
                        System.out.println(nombre + " ," + " del tipo " + tipo + ", con venta mensual $" + venta + ", tiene comision de $" + comision);
                    }
                break;
default:
    System.out.println("Opcion no valida");



            }
            System.out.println("Continuar S/N");
            Elec = sc.readLine();
            switch (Elec.toUpperCase()) {

                case "N":
                    cap = false;
                    break;
                case "S":
                    cap = true;


            }
        }

        }

    }

