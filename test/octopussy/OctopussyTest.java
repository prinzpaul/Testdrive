package octopussy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import octopussy.*;

public class OctopussyTest {
	Octopussy oc = new Octopussy();
	@Test
	void testAusgabe() {
		assertEquals("1", oc.game(1));
	}
	@Test
	void testAusga() {
		assertEquals("Octopussy", oc.game(8));
	}
	@Test
	void testAusgaba() {
		assertEquals("Octopussy", oc.game(16));
	}
	@Test
	void testAusgabee() {
		assertEquals("Octopussy", oc.game(18));
	}
	@Test
	void testAusgab() {
		assertEquals("Octopussy", oc.game(80));
	}
	@Test
	void testAus() {
		assertEquals("17", oc.game(17));
	}
	@Test
	void testAll() {
		for(int i = 1; i<= 200; i++) {
			if(i%8==0) {
				assertEquals("Octopussy", oc.game(i));
			}
			else if(Integer.toString(i).contains("8")) {
				assertEquals("Octopussy", oc.game(i));
			}
			else {
				assertEquals(Integer.toString(i), oc.game(i));
			}
		}
	}
}
