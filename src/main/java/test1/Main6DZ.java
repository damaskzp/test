package test1;

public class Main6DZ {
    public static void main(String[] args) {

    }

    public static void throwExeption(int type) {
        try {
            Object o = null;
            Object o1 = new Object();
            byte[] array = new byte[]{1};
            switch (type) {
                case 0:
                    o.toString();
                    break;
                case 1:
                    ((Integer) o1).byteValue();
                    break;
                case 2:
                    System.out.println(array[1]);
                    break;
            }
        } catch (NullPointerException | ClassCastException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException(e);
        }
    }
}
