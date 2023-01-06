import java.util.Scanner;
public class PrintSpecialCharacters{

public static void insao(int i){
    for (int j = 1; j <= i ;j++) {
     for(int k = 1; k <= j ; k++)
        System.out.print("*");
        System.out.print("\n");
    }

}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input height of triangle: ");
    int n = sc.nextInt();
    insao(n);
}

}