import java.util.Scanner;
public class NumberIncreasingPyramid{
    public static void main(String args[]){
        Scanner snr=new Scanner(System.in);
	System.out.println("Enter the number of rows to print");
        int n=snr.nextInt();
        int s=1;
	System.out.println("The pattern is: ");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
                s++;
            }
            System.out.println();
        }
    }
}