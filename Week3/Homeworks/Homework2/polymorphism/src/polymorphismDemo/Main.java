package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
		BaseLogger[] loggers = {new FileLogger(),new EmailLogger(),new DatabaseLogger()};

	}

}
