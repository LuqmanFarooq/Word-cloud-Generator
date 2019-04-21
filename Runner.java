package ie.gmit.sw;
 
public class Runner extends Menu{

	public static void main(String[] args) throws Exception {
		
		Parser r1 = new Parser();
		r1.printMenu();
		r1.Parse();
		}
}