import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LightBulbTest {

	LightBulb b;
	
	@Before
	public void setUp() throws Exception {
	b=new LightBulb(300);
	}

	@Test
	public void test() {
		assertEquals(b.wattage,b.getBulbWattage());
	}

}
