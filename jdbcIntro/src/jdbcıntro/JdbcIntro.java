
package jdbcıntro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class JdbcIntro {
    
    public static void main(String[] args) throws SQLException {   
        
        //selectDemo();
        //insertData();
        //updateData();
        deleteData();
        
               
    }
    public static void selectDemo()throws SQLException{
        
        Connection connection=null;
        DbHelper helper=new DbHelper();
        Statement statement=null;
        ResultSet resultSet;
        
        try{
            
            connection= helper.getConnection();
            statement=connection.createStatement();
            resultSet=statement.executeQuery("select name,quantity from inventory");
            ArrayList<Inventory>inventoryList=new ArrayList<>();
            while(resultSet.next()){
                inventoryList.add(new Inventory(resultSet.getString("name"),resultSet.getInt("quantity")));
                
            }
            System.out.println(inventoryList.size());
            
        }catch(SQLException exception){
            helper.showErrorMessage(exception);
        }
        finally{
            connection.close();
        }
    }
    public static void insertData() throws SQLException{
        Connection connection=null;
        DbHelper helper=new DbHelper();
        PreparedStatement statement=null;
        ResultSet resultSet;
        
        try{   
            connection= helper.getConnection();
            statement=connection.prepareStatement("INSERT INTO inventory (name, quantity) VALUES ('strawberyy', '300')");
            statement.executeUpdate();
            System.out.println("Kayıt eklendi");
            
        }catch(SQLException exception){
            helper.showErrorMessage(exception);
        }
        finally{
            statement.close();
            connection.close();
        }
    }
    
    public static void updateData()throws SQLException{
        
        Connection connection=null;
        DbHelper helper=new DbHelper();
        PreparedStatement statement=null;
        ResultSet resultSet;
        
        try{   
            connection= helper.getConnection();
            statement=connection.prepareStatement("UPDATE inventory SET quantity = 200 WHERE id = 12");
            statement.executeUpdate();
            System.out.println("Kayıt güncellendi");
            
        }catch(SQLException exception){
            helper.showErrorMessage(exception);
        }
        finally{
            statement.close();
            connection.close();
        }
    }
    
    public static void deleteData() throws SQLException{
        Scanner scanner=new Scanner(System.in);
        Connection connection=null;
        DbHelper helper=new DbHelper();
        PreparedStatement statement=null;
        ResultSet resultSet;
        
        try{   
            connection= helper.getConnection();
            System.out.println("Kayıdı silmek istediğiniz id'yi giriniz");
            int id=scanner.nextInt();
            String sql="DELETE FROM inventory WHERE id = ?";
            statement=connection.prepareStatement(sql);
            statement.setInt(1,id);
            statement.executeUpdate();
            System.out.println("Kayıt silindi");
            
        }catch(SQLException exception){
            helper.showErrorMessage(exception);
        }
        finally{
            statement.close();
            connection.close();
        }
    }
}
