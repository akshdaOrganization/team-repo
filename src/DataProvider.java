wimport org.testng.annotations.Test;

public class DataProvider {
	
/*
 * 
 It has only one attribute 'name'. 


For example, if the DataProvider returns an array of 2*3 objects, 
the corresponding testcase will be invoked 2 times with 3 parameters each time. 

If the data provider returns an array of 2*3 objects, the coresponding test case will be invoked 
2 times with 3 parameters each.  

 * 
 */
		
		@Test(dataProvider="getData")
		public void setData(String username, String password)
		{
			System.out.println("you have provided username as::"+username);
			System.out.println("you have provided password as::"+password);
//			System.out.println("you have provided password as::"+mailId);
//			System.out.println("you have provided password as::"+catcha);
		}

      
		
		
		@org.testng.annotations.DataProvider
		public Object[][] getData()
		{
		//Rows - Number of times your test has to be repeated.
		//Columns - Number of parameters in test data.
		Object[][] data = new Object[2][2];

		// 1st row
		data[0][0] ="sampleuser1";
		data[0][1] = "abcdef";
//		data[0][2] = "abcdef@mailcom";
//		data[0][3] = "abcdef";

		// 2nd row
		data[1][0] ="testuser2";
		data[1][1] = "zxcvb";
//		data[1][2] = "zxcvb@mail.com";
//		data[1][3] = "zxcvb";
//		
		
	
		

		return data;
		}
	}
	
	
	
	
	
	
	


