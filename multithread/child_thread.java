class mythread extends Thread{
    int count;
    mythread(int i){
        count = i;
    }
    public void run(){
        try{
        for(int i=0;i<5;i++){
            System.out.println("child Thread "+count+" is running");
            Thread.sleep(200);
        }
    }
    catch(InterruptedException e){}
}
}





public class child_thread{
    public static void main(String args[]){
        mythread childthread1 = new mythread(1);
        mythread childthread2 = new mythread(2);
        System.out.println("Main thread is starting");
        childthread1.start();
        childthread2.start();
        try{
            Thread.sleep(3000);

        }catch(InterruptedException e){}
        System.out.println("Main thread is stopping");
    }
}