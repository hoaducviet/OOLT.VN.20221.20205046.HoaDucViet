import java.util.Scanner;
 
public class Phuongtrinhbac2 {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("ax^2 + bx + c ");
        System.out.println("a = ");
        float a = Phuongtrinhbac2.scanner.nextFloat();
        System.out.println("b = ");
        float b = Phuongtrinhbac2.scanner.nextFloat();
        System.out.println("c = ");
        float c = scanner.nextFloat();
        Phuongtrinhbac2.giaiPTBac2(a, b, c);
    }
    
    public static void giaiPTBac2(float a, float b, float c) {
      
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo nghiem!");
            } else {
                System.out.println("Phuong trinh co 1 nghiem: "
                        + "x = " + (-c / b));
            }
            return;
        }
        
        //delta
        float delta = b*b - 4*a*c;
        float x1;
        float x2;

        // tính nghiệm
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phuong trinh co 2 nghiem la: "
                    + "x1 = " + x1 + " va x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phuong trinh co nghiem kep: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phuong trinh vo nghiem!");
        }
    }
