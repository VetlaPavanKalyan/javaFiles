public class week11a {
    public static void main(String[] args) {
        First f=new First();
        Second s=new Second();
        Third t=new Third();
        f.start();
        s.start();
        t.start();
    }
    static class First extends Thread{
        public void run(){
            for(int i=1;i<=10;i++){
                System.out.println("Good Morning");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    static class Second extends Thread{
        public void run(){
            for(int i=1;i<=10;i++){
                System.out.println("Hello");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    static class Third extends Thread{
        public void run(){
            for(int i=1;i<=10;i++){
                System.out.println("Welcome");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
