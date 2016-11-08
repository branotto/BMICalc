import javax.swing.*;

/**
 * Driver for BMI Calculator.
 * 
 * @author Brandon Otto
 *
 */

public class BMI_MVC 
{
	public static void main (String[ ] arg)
	{
		BMI_Model model =  new BMI_Model();
		BMI_View view = new BMI_View(model);
		model.setObserver(view);
		BMI_Controller controller = new BMI_Controller(model, view);
		
		view.setVisible(true);
	}
}
