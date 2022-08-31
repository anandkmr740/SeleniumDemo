package maven.demo;

import org.testng.annotations.Test;

public class AppiumTest {
	@Test
	public void nativeApp() {
		System.out.println("Native App");
	}
	@Test
	public void iosAppAndroid() {
		System.out.println("ios Android");
	}
	
	@Test
	public void macAppAndroid() {
		System.out.println("mac Android");
	}
}
