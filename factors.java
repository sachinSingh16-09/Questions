import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n, count=0;
        System.out.println("Enter the no.");
        Scanner sc= new Scanner(System.in);
        n= sc.nextInt();
        for(int i= 1;i<=n;i++){
                if(n%i == 0){
                    if(i%3 ==0)
                        count+=1;
            }
        }
        System.out.println(count);
    }
}
