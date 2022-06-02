package ge.exercise;

public class Figure {

    public Figure(String name){
        System.out.println("name of figure is " + name);
    }

    public int gerArea(){
        return 300;
    }

    public int getPerimeter(){
        return 301;
    }

    public final static void sayHello(){
        System.out.println("Hello!!!");
    }
}
