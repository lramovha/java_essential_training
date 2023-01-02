package objects;

public class HomeCalculatorWithMethods {
    public static void main(String [] args){
        Rectangle kitchen = new Rectangle(300, 500);
        Rectangle bathroom = new Rectangle(300, 500);
        double totalArea = calculateTotalArea(kitchen, bathroom);

        System.out.println("The total Area is: "+totalArea);
    }

    public static double calculateTotalArea(Rectangle room1, Rectangle room2){
        return room1.calculateArea() + room2.calculateArea();
    }
}
