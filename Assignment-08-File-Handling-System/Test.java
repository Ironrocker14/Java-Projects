
import java.util.Scanner;

public class Test 
{

    public static void main(String[] args)
    {

        Scanner sobj = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("       FILE HANDLING SYSTEM");
        System.out.println("====================================");

        System.out.println("Enter File Name: ");
        String filepath = sobj.nextLine();

        FileOperations file = new FileOperations(filepath);

        file.createNewFile();

        int choice;

        do 
        {
            System.out.println("\n---------- MENU ----------");
            System.out.println("1 - File Read using Byte Stream");
            System.out.println("2 - File Write using Byte Stream");
            System.out.println("3 - File Read using Character Stream");
            System.out.println("4 - File Write using Character Stream");
            System.out.println("5 - File Information");
            System.out.println("6 - Append Data to File");
            System.out.println("7 - Exit");
            System.out.println("--------------------------");

            System.out.print("Enter Choice: ");
            choice = sobj.nextInt();
            sobj.nextLine();

            switch (choice)
            {

                case 1:
                    file.readByteFile();
                    break;

                case 2:
                    System.out.print("Enter Data to Write: ");
                    String byteData = sobj.nextLine();
                    file.writeByteFile(byteData);
                    break;

                case 3:
                    file.readCharacterFile();
                    break;

                case 4:
                    System.out.print("Enter Data to Write: ");
                    String charData = sobj.nextLine();
                    file.writeCharacterFile(charData);
                    break;

                case 5:
                    file.DisplayFileInfo();
                    break;

                case 6:
                    System.out.print("Enter Data to Append: ");
                    String appendData = sobj.nextLine();
                    file.appendDataFile(appendData);
                    break;

                case 7:
                    System.out.println("Exiting File Handling System...");
                    break;

                default:
                    System.out.println("Invalid Choice! Try Again.");
            }

        } 
        
        while (choice != 7);

        sobj.close();
    }
}
