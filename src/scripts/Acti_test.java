package scripts;

import org.testng.annotations.Test;

import pom.Acti_Login;

public class Acti_test extends Acti_generic
{
  @Test
  public void run() throws InterruptedException
  {
	  Acti_Login al=new Acti_Login(driver);
	  Thread.sleep(3000);
	  al.us();
	  Thread.sleep(3000);
	  al.pd();
	  Thread.sleep(3000);
	  al.btn();
	  
  }
}
