import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

/**
 * The BMI_View class creates the GUI
 * for the BMI Calculator.
 * 
 * @author Brandon Otto
 *
 */

public class BMI_View extends JFrame 
{
	private BMI_Model model;
	private UnitsPanel units;
	private InputPanel input;
	
	private JPanel buttonPanel;
	private JButton calcButton;
	private JButton resetButton;
	
	/**
	 * Constructor
	 * 
	 * @param bmiModel reference to the Model
	 */
	
	public BMI_View(BMI_Model bmiModel)
	{
		model = bmiModel;
		
		setTitle("BMI Calculator");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		
		units = new UnitsPanel();
		input = new InputPanel();
		
		buildPanel();
		
		add(units, BorderLayout.NORTH);
		add(input, BorderLayout.CENTER);
		add(buttonPanel, BorderLayout.SOUTH);
		
		pack();
	}
	
	/**
	 * Private method to build a panel with  
	 * calculate and reset buttons
	 */
	
	private void buildPanel()
	{
		//Create a button to calculate
		calcButton = new JButton("Calculate");
		
		//Create a button to reset
		resetButton = new JButton("Reset");
		
		//Create the panel with a 1 x 2 grid layout
		buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(1,2));
		
		//Create panels for the buttons
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		//Add the buttons to the panel
		panel1.add(calcButton);
		panel2.add(resetButton);
		
		//Add the panels to the grid
		buttonPanel.add(panel1);
		buttonPanel.add(panel2);
		
		this.pack();
	}
	
	/**
	 * Method to add action listener to the 
	 * calculate button.
	 * 
	 * @param al The action listener from the controller.
	 */
	
	public void addCalcListener(ActionListener al)
	{
		calcButton.addActionListener(al);
	}
	
	/**
	 * Method to add action listener to the
	 * rest button.
	 * 
	 * @param al The action listener from the controller.
	 */
	
	public void addResetListener(ActionListener al)
	{
		resetButton.addActionListener(al);
	}
	
	/**
	 * Notify view function. Called by the model when
	 * the model changes.
	 */
	
	public void notifyView()
	{
		setBMIField();
	}
	
	private void setBMIField()
	{
		double bmi = model.getBMI();
		input.setBMI(bmi);
	}
	
	public double retrieveWeight()
	{
		return input.getWeight();
	}
	
	public double retrieveHeight()
	{
		return input.getHeightAmount();
	}
	
	
	/**
	 * Method to check which radio button is
	 * selected, US or Metric. 
	 * @return True if US is selected, false if
	 * metric is selected.
	 */
	
	public boolean checkUnits()
	{
		//Call the getUnits method from the
		//UnitsPanel class.
		return units.getUnits();
	}

}
