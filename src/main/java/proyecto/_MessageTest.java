package proyecto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _MessageTest {

	@Test
	void testGetText() {
		Message message = new Message("Texto aqu�");
		assertEquals("Texto aqu�", message.getText());
	}

}
