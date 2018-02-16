package fr.eni.bo;



import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;



public class CalculatriceTest {
	private  Calculatrice calculatrice;

	@BeforeClass
	public void setUpBeforeClass() throws Exception {
		calculatrice = new Calculatrice();
	}
	
	
	@AfterClass
	public void tearDownAfterClass() throws Exception {
		calculatrice = null;
		
	}
	
	
	@Test
	public void testAdditionner() {
		double expected = 30;
		double actual = 0 ;
		
		actual = Calculatrice.additionner(10,20);
		
		Assert.assertEquals(expected, actual, 0.00001);
		
		
	}
	
	@Test
	public void testDiviser(){
		double expected = 2;
		double actual = 0 ;
		
		actual = Calculatrice.diviser(20,10);
		
		Assert.assertEquals(expected, actual, 0.00001);
	}

	@Test
	public void testSoustraire() {
		double expected = 10;
		double actual = 0 ;
		
		actual = Calculatrice.soustraire(20,10);
		
		Assert.assertEquals(expected, actual, 0.00001);
	}

}
