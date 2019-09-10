package java3;
/**
 * code to print exceptions with out our own input.
 */

import java.util.ResourceBundle;

public class PropDemo { 
  /**
  *main program. 
  * @param args bundle.
  */

  public static void main(String[] args) { 
	ResourceBundle rb=ResourceBundle.getBundle("hcltraning");
	System.out.println(rb.getString("Welcome"));
	System.out.println(rb.getString("Lunch"));
	System.out.println(rb.getString("Break"));
	System.out.println(rb.getString("Logout"));
  }
}
