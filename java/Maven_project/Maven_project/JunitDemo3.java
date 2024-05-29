package Maven_project.Maven_project;


import org.junit.Assert;
import org.junit.Test;
public class JunitDemo3 {
String name="Hyderabad";
@Test
public void validateName() {
	Assert.assertEquals("Hyderabad",name);
	System.out.println("both are same");
}
int num1 = 10;
 @Test
public void validNum() {
	Assert.assertEquals(10,num1);
	System.out.println("both are same");

}





}