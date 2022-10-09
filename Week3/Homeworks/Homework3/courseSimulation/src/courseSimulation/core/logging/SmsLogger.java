package courseSimulation.core.logging;

public class SmsLogger implements ILogger {

	@Override
	public void log(String message) {
		System.out.println("SMS ile loglandı: "+message);
		
	}

}
