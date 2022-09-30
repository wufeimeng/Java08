class CSphere
{
private int x; // 圓心的 x 座標
private int y; // 圓心的 y 座標
private int z; // 圓心的 z 座標
private int radius;
void setLocation(int a ,int b,int c){
    x=a;y=b;z=c;
}
void setRadius(int r){
    radius=r;
}
Double surfaceArea(){
    return 4*3.14*(radius*radius*radius); 
}
Double volume(){
   return ((double)(3.0/4)*3.14*radius*radius*radius);
}
void showCenter(){
    System.out.println("x="+x+", y="+y+", z="+z);
}
}
public class w16 {
    public static void main(String[] args) {
        CSphere cs=new CSphere();
        cs.setLocation(3, 4, 5);
        cs.setRadius(1);
        cs.showCenter();
        System.out.println("surfaceArea="+cs.surfaceArea());
        System.out.println("volume="+cs.volume());

    }
    
}

