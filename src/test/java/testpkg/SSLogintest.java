package testpkg;



import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepkg.SSLoginpage;

import utilitiespkg.ExcelUtils;


public class SSLogintest extends Baseclass{
	
	@Test
	public void loginvalidationtest() throws InterruptedException
	{
		SSLoginpage lp=new SSLoginpage(driver);
		String xl="C:\\Users\\Feba G Joseph\\Downloads\\LOGINCRED.xlsx";
		String Sheet="Sheet1";
		int rowCount=ExcelUtils.RowCount(xl, Sheet);
		
		
		lp.AccountBtn();
		for(int i=1;i<=rowCount;i++)
		{
			String Email=ExcelUtils.getCellvalue(xl, Sheet, i, 0);
			System.out.println("Email--->"+Email);
			String Password=ExcelUtils.getCellvalue(xl, Sheet, i, 1);
			System.out.println("Password--->"+Password);
			
			lp.setlogincred(Email, Password);
			//ob.clickLogin();
			
			String expURL="https://www.sassafras.in/account";
			String actURL=driver.getCurrentUrl();
			
			if(actURL.equals(expURL))
			{
				System.out.println("valid credentials -->"+actURL);
				
				lp.Logoutfn();
				
			
			}
			else
			{
				System.out.println("Invalid credentials");
			}
			
			
			
	
		}
				
	}

}
