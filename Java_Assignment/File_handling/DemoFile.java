import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DemoFile {

	public static void main(String[] args) {
		
		
		//write the data into the DemoFile.txt file
		try {
            // Create a BufferedWriter object
            BufferedWriter writer = new BufferedWriter(new FileWriter("DemoFile.txt"));

            // Write data to the file
            writer.write("Hello, this is the first line.");
            writer.newLine();  // adds a new line
            writer.write("This is the second line.");
            writer.newLine();
            writer.write("This is the Third line.");

            // Always close the writer
            writer.close();

            System.out.println("Data written successfully!");
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
		
		
		//read the data into the DemoFile.txt file 
//	try {
////          // Create a BufferedWriter object
//          BufferedReader reader = new BufferedReader(new FileReader("DemoFile.txt"));
//          
//          String line;
//
//          // Read file line by line
//          while ((line = reader.readLine()) != null) {
//              System.out.println(line);
//          }
//
//          // Close the reader
//          reader.close();
//           
//      } 
//      catch (IOException e) {
//          e.printStackTrace();
//      }
	
	//write the data into the NewTextFile.txt file
    
	try {
        BufferedReader reader = new BufferedReader(new FileReader("DemoFile.txt"));
		BufferedWriter writer = new BufferedWriter(new FileWriter("NewTextFile.txt"));
		
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("\nData successfully!");
        
            reader.close();
            writer.close();
        
	} 
	catch (IOException e) 
	{
		e.printStackTrace();
	}

    
      
    }

}
