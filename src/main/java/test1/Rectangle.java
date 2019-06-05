package test1;

public class Rectangle {
    private int width;
    private int hight;
    private String color;

    public static void main(String[] args) {
        Rectangle rectangle1 = Rectangle.parseRectangle("red:20,30");
        rectangle1.print();
    }

    private static Rectangle parseRectangle(String stringToParce) {

        Rectangle rectangle1 = new Rectangle();
        rectangle1.color = stringToParce.substring(0, stringToParce.indexOf(':'));

        int start=stringToParce.indexOf(':');
        int end = stringToParce.indexOf(',');

        rectangle1.hight = Integer.valueOf(stringToParce.substring((start+1), end));
        rectangle1.width = Integer.valueOf(stringToParce.substring(end+1));

        return rectangle1;

    }

    private void print() {
        System.out.println(
                "Width: " + width + '\n'+
                        "Hight: " + hight +'\n' +
                        "Color: " + color);

    }


}
