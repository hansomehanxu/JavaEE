package Test;

import org.junit.*;

import utility.DBUtil;


public class DBUtilTest {
	
	private DBUtil dbu;
	@Before
	public void setUp() throws Exception {
		dbu=new DBUtil();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddpp() {
		
        int result=dbu.addpp(4, 5);
		Assert.assertEquals(9, result);
	    //Assert.fail("Not yet implemented");
	
		//fail("Not yet implemented");
	}



}
