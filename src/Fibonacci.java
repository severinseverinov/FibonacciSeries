import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int nbr,nbrTemp1=0,nbrTemp2=1,total=0;

        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number : ");
        nbr=input.nextInt();

        for(int i=0;i<nbr;i++){
            System.out.print(total+" ");
            total=nbrTemp1+nbrTemp2;
            nbrTemp1=nbrTemp2;
            nbrTemp2=total;
        }
    }
}
