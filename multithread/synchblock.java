class shared{
    public void sharedblock(String t) throws InterruptedException{
        System.out.println(t+ "is ready to run");
        synchronized(this){
            System.out.println(t+"enters block");
            Thread.sleep(100);
            System.out.println(t+"exits block");
        }
    }
}
class mt extends Thread{
    shared o;
    mt(shared o){this.o=o;}
    public void run(){
        try{
            for(int i=0;i<2;i++){
                o.sharedblock(this.getName());
            }
        }catch(InterruptedException e){}
    }
}
class synchblock{
    public static void main(String args[]){
        shared o=new shared();
        new mt(o).start();
        new mt(o).start();
    }
}