/**
 * 
 */
package myJenkins;

import junit.framework.TestCase;

/*-----------------------------------------------------------------------------------------------------------
File name		: CalcTestCase.java
Author			: Anup Jacob
Created Date	: 03/12/2021
Modified Date	: 03/12/2021
Description		: A sample test case to do the testing functionality of calculator function in Java for CI 
				tools testing purpose

-----------------------------------------------------------------------------------------------------------*/

public class CalcTestCase extends TestCase {

	/**
	 * @param name
	 */
	public CalcTestCase(String name) {
		super(name);
	}

	/**
	 * Test method for {@link myJenkins.Calculator#main(java.lang.String[])}.
	 */
	public void testMain() {
		//fail("Not yet implemented"); // TODO
		TestCalc();
	}
	
//	@Test	
	public final void TestCalc()
	{
		
		Calculator result = new Calculator();
	}

}
