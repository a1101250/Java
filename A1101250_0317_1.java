import java.util.Scanner;
public class A1101250_0317_1 {
    public static void main(String[] args) {
        int n,m;
        System.out.println("請輸入n值");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();

        System.out.println("請輸入m值");
        Scanner vc = new Scanner(System.in);
        m=vc.nextInt();
    
        int [][] arr = new int[n][m];
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++){
                arr[i][j] = (i+1) * (j+1);
            }
        }
        
        for(int [] total:arr){
            for(int row:total){
                System.out.print(row + " ");
            }
            System.out.println();
        }


    }
}
