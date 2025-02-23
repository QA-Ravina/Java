package Abstact_Interface;

public class testShape {

    public static void main(String[] args) {
        Circle cir = new Circle(5);
        Square sq = new Square(10.3);

        System.out.println(cir.calculateArea());
        System.out.println(sq.calculateArea());
    }




}
