package homeModule;

import org.testng.annotations.Test;

public class Demo {
	@Test
public void disp() {
		String destination = System.getProperty("user.dir");
		System.out.println(destination);
	}
}
