package btkakademi;

public class BtkAkademi {

    public static void main(String[] args) {
        
        double[] myList={1.2,1.3,4.3,5.6};
        double total=0;
        double max=myList[0];
        
        for(double number:myList){
            if (max<number) {
                max=number;
            }
            total=total+number;
            System.out.println(number);
        }
        
        System.out.println("Toplam= "+total);
        System.out.println("En büyük sayı= "+max);
        
        //////////////////////////
        System.out.println("..............");
        
        String mesaj="Bugün hava çok güzel.";
        System.out.println(mesaj);
        
        System.out.println("Eleman sayısı:"+mesaj.length());
        System.out.println("5.eleman "+mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yaşasın!"));
        
        //////////////////////////
        System.out.println("...........");
        
        int number=15;
        boolean asalMi=true;
        
        if (number==1) {
            System.out.println("sayı asal değildir");
            return;
        }
        
        if (number<1) {
            System.out.println("geçersiz sayı");
            return;
        }
        
        for (int i = 2; i < number; i++) {
            
            if (number%i==0) {
                asalMi=false;
            }          
        }
        if (asalMi) {
            System.out.println("sayı asaldır");
        }
        else
            System.out.println("sayı asal değildir");
        
         //////////////////////////
        System.out.println("..............");
        
        char harf='E';
        
        switch(harf){
            case'A':
            case'I':
            case'O':
            case'U':
                System.out.println("Kalın sesli harf");
                break;
            default:
                System.out.println("İnce sesli harf");
        }   
        
        //////////////////////////
        System.out.println("..............");
        
        int sayi=6;
        int toplam=0;
             
        for (int i = 1; i <sayi; i++) {
            
            if (sayi%i==0) {
                toplam+=i;
            }
        }
        
        if (toplam==sayi) {
            System.out.println("Sayı mükemmel sayıdır");
        }
        else
            System.out.println("Sayı mükemmel sayı değildir");
      
        //////////////////////////
        System.out.println("..............");
        
        int sayi1=220;
        int sayi2=284;
        
        int bolenlerToplam1=0;
        int bolenlerToplam2=0;
        
        for (int i = 1; i < sayi1; i++) {     
            
            if (sayi1%i==0) {
                bolenlerToplam1+=i;
            }          
        }
        for (int i = 1; i < sayi2; i++) {     
            
            if (sayi2%i==0) {
                bolenlerToplam2+=i;
            }          
        }
        
        if (sayi2==bolenlerToplam1 && sayi1==bolenlerToplam2) {
            System.out.println("Arkadaş sayılardır");
        }
        else
            System.out.println("Arkadaş sayılar değildir");
      
        //////////////////////////
        System.out.println("..............");
        
        int[]sayilar=new int[]{1,2,5,7,9,0};
        int aranacak=8;
        boolean varMi=false;
        
        for(int aranan:sayilar){
            
            if (aranan==aranacak) {
                varMi=true;
                break;
            }
        }
        if (varMi) {
            System.out.println("Sayı mevcuttur");
        }
        else{
            System.out.println("Sayı mevcut değildir");
        }
        
        //////////////////////////
        System.out.println("..............");
        
        
    }
    
}
