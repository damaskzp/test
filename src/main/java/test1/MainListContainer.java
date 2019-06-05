package test1;


public class MainListContainer {
    public static void main(String[] args) throws InterruptedException {

        ListContainer listContainer1=new ListContainer();
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                for (int j = 0; j <1000 ; j++) {
                    listContainer1.addElemR(j);
                }
            }).start();

        }
        Thread.sleep(2000);
        System.out.println(listContainer1.getMoyList().size());
    }
}
