import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

         int i=1,total_n=1,total_r=1,total=1,com;
        Scanner inp=new Scanner(System.in);

        System.out.println(" n sayisini giriniz:");
        int n=inp.nextInt();
        System.out.println(" r sayisini giriniz:");
        int r=inp.nextInt();

        for(i=1;i<=n;i++){
            total_n=total_n*i;
        }
        System.out.println("total_n: "+total_n);
        for (i=1;i<=r;i++){
            total_r=total_r*i;
        }
        System.out.println("total_r: "+total_r);
        for(i=1;i<=(n-r);i++)
            total=total*i;
        System.out.println("total-t(n-r): "+total);

        com=total_n/(total_r*total);
        System.out.println("Combination-C(n,r): "+com);


    }
}
