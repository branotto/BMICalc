import javax.swing.*;
import java.awt.*;

/**
 * The UnitsPanel class displays the calculator 
 * units and radio buttons in a panel.
 * 
 * @author Brandon Otto
 *
 */

public class UnitsPanel extends JPanel
{
	private JLabel units; 					//To display units.
	private JRadioButton usButton;			//US radio button.
	private JRadioButton metricButton;		//Metric radio button.
	
	/**
	 * Constructor
	 */
	
	public UnitsPanel()
	{
		//Create a grid layout manager with 1 row and 3 columns
		setLayout(new GridLayout(1,3));
		
		//Create 3 panels for the layout
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		
		
		//Create the label
		units = new JLabel("Please select one.");
		
		//Create the radio buttons
		usButton = new JRadioButton("US Standard", true);
		metricButton = new JRadioButton("Metric");
		
		//Create a ButtonGroup object
		ButtonGroup group = new ButtonGroup();
		
		//Add the buttons to the group
		group.add(usButton);
		group.add(metricButton);
		
		//Add a border around the panel
		setBorder(BorderFactory.createTitledBorder("Measurement System"));
		
		//Add the components to each panel
		panel1.add(units);
		panel2.add(usButton);
		panel3.add(metricButton);
		
		//Add the panels to the grid
		add(panel1);
		add(panel2);
		add(panel3);
		
	}
	
	/**
	 * The getUnits() method checks which radio button
	 * is selected. If the US Button is selected it
	 * returns true, if the Metric Button is selected
	 * it returns false.
	 * @return Which radio button is selected.
	 * 
	 */
	
	public boolean getUnits()
	{
		return usButton.isSelected();
	}
	
	//main to test the class
	public static void main (String[ ] args)
	{
		JFrame window = new JFrame();
		window.setTitle("Test");
		window.setSize(450, 350);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		UnitsPanel panel = new UnitsPanel();
		window.add(panel);
		
		window.setVisible(true);
				
	}
	
}
