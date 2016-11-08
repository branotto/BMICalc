import java.awt.event.*;

/**
 * Controller for BMI Calculator
 * @author Brandon Otto
 *
 */


public class BMI_Controller 
{
	private BMI_Model model;
	private BMI_View view;
 
	 
	/**
	 * Constructor
	 * @param bmiModel The model for the calculator
	 * @param bmiView	The view for the calculator
	 */
	
	public BMI_Controller(BMI_Model bmiModel, BMI_View bmiView)
	{
		model = bmiModel;
		view = bmiView;
		
		//Add button listeners.
		view.addCalcListener(new CalcListener());
		view.addResetListener(new ResetListener());
	}
	
	private class CalcListener implements ActionListener
	{
		public void actionPerformed (ActionEvent e)
		{
			model.calculate();
		}
	}
	
	private class ResetListener implements ActionListener
	{
		public void actionPerformed (ActionEvent e)
		{
			model.reset();
		}
	}
}
