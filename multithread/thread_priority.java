public class thread_priority{
    public static void main(String args[]){
        Thread t1 = new Thread(new mr(),"thread 1");
        Thread t2 = new Thread(new mr(),"thread 2");
        Thread t3 = new Thread(new mr(),"thread 3");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();

    }
    static class mr implements Runnable{
        public void run(){
            for(int i=0;i<5;i++){
                System.out.println(Thread.currentThread().getName()+ " "+ Thread.currentThread().getPriority());
            }
        }
    }
}