package test1;

import java.util.List;

public class MySumCount extends Thread {
    private int startIndex;
    private int stopIndex;
    private long resultSum;
    List<Integer> list;

    public void setList(List<Integer> list) {
        this.list = list;
    }

    void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    void setStopIndex(int stopIndex) {
        this.stopIndex = stopIndex;
    }

    long getResultSum() {
        return resultSum;
    }

    @Override
    public void run() {
        for (int i = startIndex; i < stopIndex; i++) {
            resultSum += list.get(i);
        }

    }
}
