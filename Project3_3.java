import javax.swing.*; //Import GUI application
import java.text.*; //Import Decimal Format Object
public class Project3_3 { //Initialize the class
	public static void main(String [] args) { //Initialize public static void main
		
		String weightStr, heightStr;  //Declare String variable to read from GUI input
		double weight, height, newWeight, newHeight; //Variable declarations for the weight and height
		
		DecimalFormat df = new DecimalFormat("0.00"); //To initialize the decimal format object
		
		weightStr = JOptionPane.showInputDialog(null, "Enter weight in pounds: "); //Ask input for weight and read it
		weight = Double.parseDouble(weightStr); //Convert weight to a double
		
		heightStr = JOptionPane.showInputDialog(null, "Enter height in feet: "); //Ask input for height and read it 
		height = Double.parseDouble(heightStr); //Convert height to a double
		
		newWeight = weight / 2.205; //Change weight to metric system
		newHeight = height / 3.281; //Change height to metric system
		
		JOptionPane.showMessageDialog(null, "The Weight in Kilograms is: " + df.format(newWeight) + "\n The Height in Metres is: " + df.format(newHeight)); //Print out new weight and height
		
		}//Close public static void main bracket
	
}	//Close the class project


