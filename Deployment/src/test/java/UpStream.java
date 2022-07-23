import org.testng.annotations.Test;

public class UpStream {
	@Test(groups={"regression"})
	public void edit()
	{
		System.out.println("edit done");
	}
	
	@Test(groups= {"smoke"})
	public void delete()
	{
		System.out.println("delete done");
	}

}
