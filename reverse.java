import java.util.Scanner;
class reverse {
    public static void main(String[] args) {
        Scanner sin = new Scanner (System.in);
        int num=sin.nextInt();
        for(int i=num;i>=1;i--)
        { 
            System.out.println(i);
        }
    }
}