package Maven_project.Maven_project;
import org.junit.Assert;
import org.junit.Test;
public class JunitDemo1 {
String str1 = "Junit";
String str2 = null;
@Test
public void notNull() {
	Assert.assertNotNull(str1);
	System.out.println("String1 is not null");
	
	Assert.assertNotNull(str2);
	System.out.println("String2 is  null");
	
	Assert.assertNull(str2);
	System.out.println("String2 is  null");
}
	
}
