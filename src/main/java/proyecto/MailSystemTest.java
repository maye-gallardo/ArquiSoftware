package proyecto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MailSystemTest {

	@Test
	void whenCountIsOneMailboxSizeShouldBeOne() {
		int count = 1;
		MailSystem mailSystem = new MailSystem(count);
		assertEquals(1, mailSystem.getMailBoxes().size());
	}
	
	@Test
	void ifFindMailboxIsIncorrectShouldReturnNull() {
		int count = 1;
		MailSystem mailSystem = new MailSystem(count);
		String ext = "3";
		assertEquals(null, mailSystem.findMailbox(ext));
	}

}
