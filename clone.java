
/*2. Design a class for a basic point in 2D space. The class should have the following features:
    - Instance variables for the x and y coordinates of the point.
    - A constructor that allows the user to create a point with given x and y coordinates.
    - An equals method that returns true if the given object is a point with the same x and y coordinates, and false otherwise.
    - A clone method that creates and returns a new point with the same x and y coordinates as the original point.*/
import java.util.*;

class point implements Cloneable {
    int x1, y1;

    point(int x, int y) {
        x1 = x;
        y1 = y;
    }

    public Object clone() throws CloneNotSupportedException

    {
        return super.clone();
    }

    boolean equals(int x, int y) {
        boolean result = ((x1 == x) && (y1 == y)) ? true : false;
        return result;
    }

    void show()
    {
        System.out.println("X = " +);
    }

}

class clone {
    public static void main(String args[]) throws CloneNotSupportedException {
        Scanner sc = new Scanner(System.in);
        System.out.printf(" Enter 1st Points : \n");
        System.out.printf("\n Enter X  : ");
        int x = sc.nextInt();
        System.out.printf("Enter Y : ");
        int y = sc.nextInt();

        point ob = new point(x, y);
        point ob1 = (point) ob.clone();

        System.out.printf("\nEnter 2nd points: \n");
        System.out.printf("\nEnter X : ");
        int A = sc.nextInt();
        System.out.printf(" Enter Y : ");
        int B = sc.nextInt();

        boolean ans = ob1.equals(A, B);

        System.out.printf(" the both points are " + ans);

    }
}
