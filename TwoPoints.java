import java.util.Scanner;

public class TwoPoints {
    public static int computePointOfInterception(int x,int y)
    {
        if (x==0)
            return 12;
        if (x==y)
            return x;
        return computePointOfInterception((x+2)%12,(y+1)%12);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the position of X :");
        int x = sc.nextInt();
        System.out.println("Enter the position of Y :");
        int y = sc.nextInt();

        System.out.println("X and Y will meet at position "+computePointOfInterception(x , y));
    }
}