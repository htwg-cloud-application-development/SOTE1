package uebung13;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Codegenerator cg = new Codegenerator();
		Student student = new Student("Max", 123456);
		
		cg.generateStatement(student.getClass());

	}

}
