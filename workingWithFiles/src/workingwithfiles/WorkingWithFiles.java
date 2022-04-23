
package workingwithfiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WorkingWithFiles {

    public static void main(String[] args) {
        writeFile();
        readFile();
    }
    
    public static void createFile(){
        
        File file=new File("C:\\Users\\asus\\Documents\\btk akademi\\workingWithFiles\\src\\students.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("Dosya oluşturuldu.");
            }
            else{
                System.out.println("Dosya zaten mevcut");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void getFileInfo(){
        
        File file=new File("C:\\Users\\asus\\Documents\\btk akademi\\workingWithFiles\\src\\students.txt");
        if (file.exists()) {
            System.out.println("Dosyanın adı: "+file.getName());
            System.out.println("Dosyanın yolu: "+file.getAbsolutePath());
        }
    }
    public static void readFile(){
        
        File file=new File("C:\\Users\\asus\\Documents\\btk akademi\\workingWithFiles\\src\\students.txt");
        try {
            
            Scanner reader=new Scanner(file);
            
            while(reader.hasNextLine()){
                String line=reader.nextLine();
                System.out.println(line);
            }
            reader.close();
            System.out.println("Okuma işlemi bitti.");
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void writeFile(){
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter("C:\\Users\\asus\\Documents\\btk akademi\\workingWithFiles\\src\\students.txt",true);
            BufferedWriter writer=new BufferedWriter(fileWriter);
            writer.newLine();
            writer.write("Edanur BATUM");
            System.out.println("Dosyaya yazıldı");
            writer.close();
                       
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }
}
