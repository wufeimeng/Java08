class CTest{
    void test(int n){
        System.out.print(n);        
    
    if (n%2==0){
        System.out.println("此數為偶數");
    
    }
    else if(n%2!=0){
        System.out.println("此數為奇數");
    }
    else{
        System.out.println("此數為0");

    }
}
}
public class w07 {
    public static void main(String[] args) {
        CTest ans=new CTest();
        ans.test(3);
        ans.test(0);
        ans.test(8);
        
    }
}
