package TScript;

import org.testng.annotations.Test;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import Com.lib.General2;

public class TC01 extends General2 {
//public static void main(String[] args) throws Exception {
	
	@Test
	public void m1() throws Exception {
	DOMConfigurator.configure("Log4j.xml");
	General2 s = new General2();
	   s.openapp();
	   s.loginapp(); 
	   s.Add();
	   s.Edit();
	   s.delete();
	   s.closeapp();
}
}
