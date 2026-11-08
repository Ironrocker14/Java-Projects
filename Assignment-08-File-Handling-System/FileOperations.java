
import java.io.*;

public class FileOperations 
{

    String filepath;

    public FileOperations(String filepath) 
    {
        this.filepath = filepath;
    }

    void createNewFile() 
    {
        try 
        {
            File file = new File(filepath);

            if (file.exists()) 
            {
                System.out.println("File Already Exists");
            } 
            else 
            {
                if (file.createNewFile()) 
                {
                    System.out.println("File created successfully");
                }
            }
        } 
        catch (IOException e) 
        {
            System.out.println("Error while creating file: " + e.getMessage());
        }
    }

    void readByteFile() 
    {
        try (FileInputStream fis = new FileInputStream(filepath)) 
        {
            int data;

            System.out.println("\n--- File Content (Byte Stream) ---");

            while ((data = fis.read()) != -1) 
            {
                System.out.print((char) data);
            }

            System.out.println("\n----------------------------------");

        } 
        catch (IOException e) 
        {
            System.out.println("Error while reading file: " + e.getMessage());
        }
    }

    void writeByteFile(String data) 
    {
        try (FileOutputStream fos = new FileOutputStream(filepath)) 
        {

            byte[] bytes = data.getBytes();
            fos.write(bytes);

            System.out.println("Data written successfully using Byte Stream");

        } 
        catch (IOException e) 
        {
            System.out.println("Error while writing file: " + e.getMessage());
        }
    }

    void readCharacterFile() 
    {
        try (BufferedReader br = new BufferedReader(new FileReader(filepath)))
        {

            String line;

            System.out.println("\n--- File Content (Character Stream) ---");

            while ((line = br.readLine()) != null)
            {
                System.out.println(line);
            }

            System.out.println("----------------------------------------");

        } 
        catch (IOException e)
        {
            System.out.println("Error while reading file: " + e.getMessage());
        }
    }

    void writeCharacterFile(String data) 
    {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filepath))) 
        {

            bw.write(data);
            bw.newLine();

            System.out.println("Data written successfully using Character Stream");

        } 
        catch (IOException e) 
        {
            System.out.println("Error while writing file: " + e.getMessage());
        }
    }

    void appendDataFile(String data) 
    {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filepath, true))) 
        {

            bw.newLine();
            bw.write(data);

            System.out.println("Data appended successfully");

        } 
        catch (IOException e) 
        {
            System.out.println("Error while appending data: " + e.getMessage());
        }
    }
    
    void DisplayFileInfo()
    {
        File file = new File(filepath);

        System.out.println("\n------------- File Information -------------");
        System.out.println("File Name : " + file.getName());
        System.out.println("File Path : " + file.getAbsolutePath());
        System.out.println("File Length : " + file.length() + " Bytes");
        System.out.println("Readable : " + file.canRead());
        System.out.println("Writable : " + file.canWrite());
        System.out.println("Executable : " + file.canExecute());
        System.out.println("Exists : " + file.exists());
        System.out.println("Is File : " + file.isFile());
        System.out.println("Is Directory : " + file.isDirectory());
        System.out.println("---------------------------------------------");
    }
}
