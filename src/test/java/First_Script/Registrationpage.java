package First_Script;

import org.testng.annotations.Test;

public class Registrationpage {
  @Test
  public void ValidName()
  {
	  System.out.println("The name should be in alphabates ");
  }
  @Test
  public void ValidEmailId()
  {
	  System.out.println("The Email Id should match from DB ");
  }
  @Test
  public void ValidMoblieNo()
  {
	  System.out.println("The Moblie no should include country code ");
  }
}
