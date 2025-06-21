package factoryMethodPatternExample;

public class WordDocument implements Document{

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("Opening WordDocument");
		}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("Saving the WordDocument");
	}
	

}
