package ge.exercise;

public class Main {
    public static void main(String[] args) {
        /*Rectangle a1 = new Rectangle();
        Rectangle a2 = new Rectangle(1, 1);
        Rectangle b1 = new Rectangle(2, 2);
        Rectangle b2 = new Rectangle(3, 3);
        Rectangle b3 = new Rectangle(4, 4);
        Rectangle a3 = new Rectangle(23);


        Rectangle[] ar = new Rectangle[]{a2, b1, b2, b3};

        System.out.println("ge.exercise.Rectangle.maxArea = " + Rectangle.maxArea(ar).area()); */

        Figure figure = new Figure("figure 1");
        System.out.println("figure area is " + figure.gerArea());
        System.out.println("figure perimeter is " + figure.getPerimeter());

        Rectangle rect = new Rectangle();
        System.out.println("rectangle perimeter is " + rect.getPerimeter());
        System.out.println("rectangle area is " + rect.gerArea());

        Figure mix = new Rectangle();
        System.out.println("Super Class reference perimeter " + mix.getPerimeter());
        System.out.println("Super Class reference area " + mix.gerArea());

        System.out.println();
        System.out.println("instance of examples: ");
        System.out.println(figure instanceof Rectangle);
        System.out.println(figure instanceof Figure);
        System.out.println(rect instanceof Rectangle);
        System.out.println(rect instanceof Figure);

        System.out.println("overloaded methodes");
        rect.getPerimeter(6,5);
        rect.gerArea(15,26);
    }
}
