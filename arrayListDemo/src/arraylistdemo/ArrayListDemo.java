
package arraylistdemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<String>sehirler=new ArrayList<String>();
        
        sehirler.add("SAMSUN");
        sehirler.add("ANKARA");
        sehirler.add("İSTANBUL");
               
        sehirler.remove("ANKARA");
        Collections.sort(sehirler);
        
        for (String sehir:sehirler) {
            System.out.println(sehir);
        }
        
        ArrayList<Customer>customers=new ArrayList<Customer>();
        customers.add(new Customer(1, "Edanur", "Batum"));
        customers.add(new Customer(2, "Engin", "Demiroğ"));
        customers.add(new Customer(3, "Kübra", "Özdemir"));
        
        for (Customer customer:customers) {
            System.out.println(customer.firstName);
        }
    }
    
}
