package inherit;

class Room{
    public int length;
    public int breadth;
    public int height;
    public int area;
    public Room(int length,int breadth,int height){
       this.length=length;
       this.breadth=breadth;
       this.height=height;
    }
    
    public int calc_ler(int length,int breadth,int height){
        
        
        area=length*breadth*height;
        // System.out.println("Area is "+area);
        return area;
    }
    public void displayarea(){
        System.out.println("Length: "+length);
        System.out.println("Breadth: "+breadth);
        System.out.println("Height: "+height);
        int are = calc_ler(length,breadth,height);
        System.out.println("Area: "+are);
    }
    
}
class Bedroom extends Room{
    public Bedroom(int length,int breadth,int height){
        super(length,breadth,height);
    }
      
    boolean AttachedBathroom=true;
    boolean Studytable=true;
    boolean nightlamp=true;
    public void display(){
        System.out.println("Inside Bedroom");
        super.displayarea();
        
        if(AttachedBathroom){
            System.out.println("Attached bathroom exists");
        }
        if(Studytable){
                System.out.println("Study table exists");
        }
        if(nightlamp){
                System.out.println("Night lamp exists");
        }
    }
}


class Drawingroom extends Room{
    
    public Drawingroom(int length,int breadth,int height){
        super(length,breadth,height);
    }
    boolean sofa=true;
    boolean wallcabinet=true;
   
    public void display(){
        System.out.println("Inside Drawing room");
        super.displayarea();
        
        if(sofa){
            System.out.println("SOFA exists");
        }
        if(wallcabinet){
                System.out.println("wall cabINET exists");
        }
        
    }
}
class Roompr{
    public static void main(String args[]){
        int length=20;
        int breadth=15;
        int height=10;
       Drawingroom rm=new Drawingroom(length,breadth,height);
    //    System.out.println("Drawing room area is :"+rm.calc_ler());
       rm.display();
       Bedroom rm2=new Bedroom(30,15,12);
      // System.out.println(" Bedroom area is :"+rm2.calc_ler());
       rm2.display();
    }
} 