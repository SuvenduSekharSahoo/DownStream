import org.testng.annotations.Test;

public class DownStream {
	
	@Test(groups= {"smoke"})
	public void create()
	{
		System.out.println("create done");
	}

	@Test(groups={"regression"})
	public void delete()
	{
		System.out.println("delete done");
	}

}
