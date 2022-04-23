
package repositorydemo;

public class RepositoryDemo {

    public static void main(String[] args) {
        Validator validator=new Validator();
        Customer customer=new Customer();
        validator.validate(customer);
    }
    
}
