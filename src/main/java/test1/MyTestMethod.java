package test1;

public class MyTestMethod<T extends Number> {

    int calcNum(T array[], T maxElem) {
        int count = 0;
        for (T t : array) {
            if (t.doubleValue() > maxElem.doubleValue()) {
                count++;
            }
        }
        return count;
    }
}
