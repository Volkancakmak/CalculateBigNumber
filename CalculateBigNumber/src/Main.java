import java.util.Scanner;

class Largest
{
    public static void main(String args[])
    {
        int x, y, z;
        System.out.println("Enter 3 numbers to compare");
        Scanner in = new Scanner(System.in);

        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();

        if (x > y && x > z)
            System.out.println("First number is greatest.");
        else if (y > x && y > z)
            System.out.println("Second number is greatest.");
        else if (z > x && z > y)
            System.out.println("Third number is greatest.");
        else
            System.out.println("All numbers are equal.");
    }
}