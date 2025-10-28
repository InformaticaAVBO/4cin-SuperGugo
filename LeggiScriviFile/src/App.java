import java.io.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {       

        // Leggi nome file
        Scanner filenameScan = new Scanner(System.in);
        System.out.println("Nome del file di input: ");
        String filenameIn = filenameScan.nextLine();
        System.out.println("Nome del file di output: ");
        String filenameOut = filenameScan.nextLine();

        // Leggi
        File f = new File(filenameIn);
        FileWriter myWriter = new FileWriter(filenameOut);

        Scanner scan = new Scanner(f);
        while (scan.hasNextLine()) {
            String s = scan.nextLine();
            myWriter.write(s);
            myWriter.write("\n");
        }

        myWriter.close();
    }
}
