package factoryMethodPatternExample;

public class PdfDocument implements Document{

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("Opening PdfDocument");
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("Saving the PdfDocument");
	}
	

}
