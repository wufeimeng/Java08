class CWin
{
    int width;
    int heigh;
    String name;
    void setW(int w)
    {
        width=w;
    }
    void setH(int h )
    {
        heigh=h;
    }
    void setName(String s)
    {
        name=s;
    }
    public void show()
    {
        System.out.println("name="+name);
        System.out.println("W="+width+",H="+heigh);

    }
    void setWindows(int w,int h,String s)
    {
        heigh=h;
        width=w;
        name=s;
    }
}
public class w12 {
    public static void main(String[] args) {
        CWin cw=new CWin();
        cw.setName("1st Windows");
        cw.setH(5);
        cw.setW(3);
        cw.show();
        
        cw.setWindows(6,8,"2nd Windows");
        cw.show();
        cw.setWindows(4,2,"3rd Windows");
        cw.show();
        
    }
}
