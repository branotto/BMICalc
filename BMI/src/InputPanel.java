import javax.swing.*;

import java.awt.*;


/**
 * The Input Panel class displays the calculator 
 * input and out put fields in a panel.
 * 
 * @author Brandon Otto
 *
 */

public class InputPanel extends JPanel
{
	//Labels for the panel
	private JLabel weight, height, bmi;	
	private JLabel weightUnits;
	private JLabel heightUnits;
	
	//Textfields for input/output
	private JTextField enteredWeight, enteredHeight, calculatedBMI;
	
	/**
	 * Constructor
	 * 
	 */
	
	public InputPanel()
	{
		//Create a grid layout
		setLayout(new GridLayout(3,3));
		
		//Add a border around the panel
		setBorder(BorderFactory.createTitledBorder("Input your data."));
		
		//Create 8 JPanels for the components
		JPanel panelA = new JPanel();
		JPanel panelB = new JPanel();
		JPanel panelC = new JPanel();
		JPanel panelD = new JPanel();
		JPanel panelE = new JPanel();
		JPanel panelF = new JPanel();
		JPanel panelG = new JPanel();
		JPanel panelH = new JPanel();
		
		
		//Create the labels
		weight = new JLabel("Enter your weight:");
		height = new JLabel("Enter your height:");
		bmi = new JLabel("Your BMI is:");
		weightUnits = new JLabel("pounds or kilograms");
		heightUnits = new JLabel("inches or meters");
		
		//Create the textfields
		enteredWeight = new JTextField(10);
		enteredHeight = new JTextField(10);
		calculatedBMI = new JTextField(15);
		
		//Set the BMI Field to not accept edits.
		calculatedBMI.setEditable(false);
		
		//Add the components to the panels.
		panelA.add(weight);
		panelB.add(enteredWeight);
		panelC.add(weightUnits);
		
		panelD.add(height);
		panelE.add(enteredHeight);
		panelF.add(heightUnits);
		
		panelG.add(bmi);
		panelH.add(calculatedBMI);
		
		//Add all the panels to the grid
		add(panelA);
		add(panelB);
		add(panelC);
		add(panelD);
		add(panelE);
		add(panelF);
		add(panelG);
		add(panelH);
		
	}
	
	public void setBMI(double bmi)
	{
		calculatedBMI.setText(Double.toString(bmi));
	}
	
	public double getWeight()
	{
		return Double.parseDouble(enteredWeight.getText());
	}
	
	public double getHeightAmount()
	{
		return Double.parseDouble(enteredHeight.getText());
	}
	
	//main to test the class
		public static void main (String[ ] args)
		{
			JFrame window = new JFrame();
			window.setTitle("Test");
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			InputPanel panel = new InputPanel();
			window.add(panel);
			
			window.setVisible(true);
			
					
		}
}
