
package recapdemo;

public class ReCapDemo {

    public static void main(String[] args) {
        DortIslem dortIslem=new DortIslem();
        int sonuc= dortIslem.Bol(8, 2);
        System.out.println(sonuc);
        
        /*/*//*/*/
        System.out.println("............");
        
        int toplam=0;
        
        for (int i = 1; i < 100; i++) {
            if (i%2==0) {
                toplam+=i;
            }
        }
        System.out.println(toplam);
        
    }
    
}
