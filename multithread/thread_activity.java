public class thread_activity{
    public static void main(String[] args){
        Thread MainnThread = Thread.currentThread();
        MainnThread.setName("Mythread");
        Thread currentThread = MainnThread;
        System.out.println("THread id"+ currentThread.getId());
        System.out.println("THread state " + currentThread.getState());
        System.out.println("Thread priority"+ currentThread.getPriority());
        System.out.println("Daemon thread  : "+currentThread.isDaemon());
        System.out.println("Alive thread : "+currentThread.isAlive());
        System.out.println("Thread group: "+currentThread.getThreadGroup().getName());
        System.out.println("MainnThread name is: " + currentThread.getName());
}
}