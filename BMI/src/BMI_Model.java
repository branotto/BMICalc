
/**
 * BMI Calculator Model
 * Calculates the users BMI using both the
 * US and Metric Systems.
 * 
 * @author Brandon Otto
 *
 */

public class BMI_Model 
{
	private double height;
	private double weight;
	private double bmiCalc;
	private BMI_View view;
	
	/**
	 * Constructor
	 */
	
	public BMI_Model()
	{
		height = 0.0;
		weight = 0.0;
	}
	
	/**
	 * Set's the view to be used.
	 * 
	 * @param bmiView Reference to the view.
	 */
	
	public void setObserver(BMI_View bmiView)
	{
		view = bmiView;
	}
	
	/**
	 * The calculate method checks which radio button
	 * is selected and then calls the appropriate 
	 * method to do the calculation.
	 */
	
	public void calculate()
	{
		//Ask the view which radio button is checked
		if(view.checkUnits())
		{
			//Calculate using the US formula
			calcUS();
		} else 
		{
			//Calculate using the Metric formula
			calcMetric();
		}
		
	}
	
	public void calcUS()
	{
		//Get the height and weight
		weight = view.retrieveWeight();
		height = view.retrieveHeight();
		
		//Calculate BMI
		bmiCalc = ( weight / (height * height)) * 703;
		
		//Notify the view to display the BMI.
		view.notifyView();
	}
	
	public void calcMetric()
	{
		//Get the height and weight
		weight = view.retrieveWeight();
		height = view.retrieveHeight();
		
		//Calculate BMI
		bmiCalc = weight / (height * height);
		
		//Notify the view to display the BMI.
		view.notifyView();
	}
	
	public void reset()
	{
		height = 0.0;
		weight = 0.0;
		bmiCalc = 0.0;
		view.notifyView();
	}
	
	public double getBMI()
	{
		return bmiCalc;
	}
}
