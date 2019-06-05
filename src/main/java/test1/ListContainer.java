package test1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;

public class ListContainer {
    ReentrantLock reentrantLock = new ReentrantLock();

    private List<Integer> moyList = Collections.synchronizedList(new ArrayList<>());
   // private List<Integer> moyList = new CopyOnWriteArrayList<>();

    public List<Integer> getMoyList() {
        return moyList;
    }


    public void addElemR(Integer elem) {
        reentrantLock.lock();
        try {
            moyList.add(elem);
        } finally {
            reentrantLock.unlock();
        }
    }
    // или
    public synchronized void addElemS(Integer elem) {
        moyList.add(elem);
    }

}

