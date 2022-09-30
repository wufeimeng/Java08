class Cbox{
    int length;
    int width;
    int heigh;
    int volume()
    {
        return length*width*heigh;
    }
    int surfaceArea()
    {
        return (length*width+heigh*width+length*heigh)*2;
    }
    void showData(){
        System.out.println("length="+length);
        System.out.println("width="+width);
        System.out.println("heigh="+heigh);
        
    }
    void showAll(){
        System.out.println("surface area="+surfaceArea());
        System.out.println("vloume="+volume());

    }


}

public class w05 {
    public static void main(String[] args) {
        Cbox box=new Cbox();
        box.length=3;
        box.width=6;
        box.heigh=9;
        box.showData();
        box.showAll();
    }
}
