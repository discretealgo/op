class mthread extends Thread{
    int count;
    mthread(int i){
        count =i;

    }
    public void run(){
        try{
            for(int i=0;i<5;i++){
                System.out.println("Thread"+count+"is running for "+ i+ "time");
                Thread.sleep(100);

            }
        }catch(InterruptedException e){}
    }
}
public class alive_child_thread{
    public static void main(String args[]){
        mthread m= new mthread(1);
        m.start();
        if(m.isAlive()){
            System.out.println("Child thread is still active");
        }
        else{
            System.out.println("Child thread is not active");
        }
        try{
            m.join();
        }catch(InterruptedException e){}
        if(m.isAlive()){
            System.out.println("Thread is still acitve");
        }
        else{
            System.out.println("Thread has terminated");

        }
    }
}