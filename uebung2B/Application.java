package uebung2B;


public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Logger logger = new SysOutLogger();
		Logger logger2 = new FileLogger();
		Logger logger3 = new SysErrLogger();
		
		Auto auto = new Auto(logger2);
		
		auto.ausgeben();
		
	}

}
