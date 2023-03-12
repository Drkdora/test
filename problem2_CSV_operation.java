import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class problem2_CSV_operation {

    public static void main(String[] args) {
        String ip_File = "problem2_CSV_operation.csv";// text.csv is our input file
        String line;
        
        try (BufferedReader br = new BufferedReader(new FileReader(ip_File))) 
        {
            // we are creating two files nnamed as follwed
            FileWriter RandDManager = new FileWriter("RandDManager.csv");
            FileWriter singleNamed = new FileWriter("singleNamed.csv");
            // we are reading eachline
            while ((line = br.readLine()) != null) {
                // eachline further splited by comma and storded as an array
                String[] arr = line.split(",");
                // find the one who are managers in R&D
                if (arr[1].equals("Manager") && arr[2].equals("R&D")) {
                    RandDManager.write(line + "\n");
                }
                // find the one who are having single name
                if (arr[0].split(" ").length == 1) {
                    singleNamed.write(line + "\n");
                }
            }
            RandDManager.close();
            singleNamed.close();
            System.out.println("New filtered files created.");
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }

}
