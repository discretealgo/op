class point{
    int x,y;
    point(int a,int b){
        x=a;y=b;
    }
    point(point o){
        x=o.x;
        y=o.y;
    }
    static double distance(point o1,point o2){
        return Math.sqrt((o1.x-o2.x)*(o1.x-o2.x)+(o1.y-o2.y)*(o1.y-o2.y));

    }
    public static void main(String args[]){
        System.out.println("Distance between : "+ distance(new point(1,2),new point(4,7)));
    }
}