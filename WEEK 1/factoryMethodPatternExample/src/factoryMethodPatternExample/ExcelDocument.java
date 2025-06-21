package factoryMethodPatternExample;

public class ExcelDocument implements Document{

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("Opening ExcelDocument");
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("Saving the ExcelDocument");
	}

}
