package test1;

public class MainBox {
    public static void main(String[] args) {

        Box<Integer, Double> box2 = new Box<>();
        box2.setItem(10);
    }

    static void openBox(Box<Integer, Double> box) {
        Integer item = box.getItem();
        System.out.println(item * 2);
    }


}
