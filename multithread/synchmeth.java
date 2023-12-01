class synchmeth{
    public static void main(String args[]){
        Shared o = new Shared();
        new myythread(o).start();
        new myythread(o).start();
    }
}
class Shared{
    public synchronized void shared_meth(String t) throws InterruptedException{
        System.out.println("Thread "+t+" enters shared method");
        Thread.sleep(100);
        System.out.println("Thread"+ t +"exits shared method");
    }
}
class myythread extends Thread{
    Shared o;
    myythread(Shared o){
        this.o=o;
    }
    public void run(){
        try{
        for(int i=0;i<5;i++){
            o.shared_meth(this.getName());
            Thread.sleep(500);
        }
    }catch(InterruptedException e){}
    }
}