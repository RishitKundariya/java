import java.util.*;
class Circle
    {
        private float radius;

        Circle()
        {
            radius = 0;

        }
        Circle(float r)
        {
            radius = r;

        }

        public double Area()
        {
            return 3.14 * radius * radius;
        }
    }
    class Circle_Area
    {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Radius :- ");
            int r = sc.nextInt();
            Circle c = new Circle(r);
            System.out.println("Area of Circle is " + c.Area());
        }
    }
