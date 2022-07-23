public class week11b {
    public static void main(String[] args) {
        Reserve r=new Reserve(1);
        Thread t1=new Thread(r);
        Thread t2=new Thread(r);
        t1.setName("First passenger");
        t2.setName("Second passenger");
        t1.start();
        t2.start();
    }
    static class Reserve implements Runnable{
        int available=2;
        int wanted;
        Reserve(int wanted){
            this.wanted=wanted;
        }
        public void run() {
            synchronized (this){
                System.out.println("Available seats="+available);
                if(available>=wanted){
                    String name=Thread.currentThread().getName();
                    System.out.println(wanted+"berths reserved for"+name);
                    try{
                        Thread.sleep(1500);
                        available-=wanted;
                    }catch (InterruptedException ie){
                        ie.printStackTrace();
                    }
                }else{
                    System.out.println("Sorry no berths");
                }
            }
        }
    }
}
