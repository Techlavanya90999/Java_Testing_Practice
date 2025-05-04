package Practice;

public class Demo1 {

@Test(Priority=1)
public void pqr()
{
	System.out.println("pqr");
	}
@Test(Priority=-5)
public void xyz() {
	System.out.println("xyz");
}
@Test(Priority=5)
public void abc() {
	System.out.println("abc");
}

}
