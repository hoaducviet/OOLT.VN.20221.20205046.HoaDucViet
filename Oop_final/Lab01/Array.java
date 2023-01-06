import java.util.Scanner;
public class Array{
    
    public static void Sort(int a[], int n){
        for (int i=0;i<n;i++)
            for(int j=i;j<n;j++)
                if(a[i]>a[j]){
                    int tg = a[i];
                        a[i] = a[j];
                        a[j] = tg;
                }
        System.out.print("Mang da duoc xep tu nho toi lon la: ");
        for (int i=0;i<n;i++) System.out.print(a[i]+", ");
        System.out.println("\n");
    }

    public static void SumEndAverage(int a[], int n){
        long sum=0;
        for (int i=0;i<n;i++) sum+=a[i];
        System.out.print("Tong cua mang la: " + sum + "\nTrung binh cua mang la: " + sum/n);
        System.out.println("\n");
    }
   
    public static void PrintArray(int a[], int n){
        System.out.println("Mang ban vua nhap la: ");
        for (int i=0;i<n;i++) System.out.print(a[i]+", ");
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so luong phan tu cua mang: ");
        int n = sc.nextInt();
        int[] a=new int[100] ;
        for (int i=0;i<n;i++){
            System.out.print("a["+i+"]: ");
            a[i] = sc.nextInt();
        }
        PrintArray(a,n);
        Sort(a, n);
        SumEndAverage(a,n);
    }
}