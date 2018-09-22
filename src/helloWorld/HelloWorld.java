package helloWorld;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorld tester = new HelloWorld();
		
		tester.printMessage("This is a test");
		tester.printMessage("Hello World test");
		
		AwsRDSConnectionTest rdbmsConnection = new AwsRDSConnectionTest();
		rdbmsConnection.getConnection();
		
	}
	
	private void printMessage(String inputMessage) {
		System.out.println(inputMessage);
	}

}
