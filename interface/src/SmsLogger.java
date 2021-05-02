
public class SmsLogger implements Logger {

	@Override
	public void log(String message) {
		// TODO Auto-generated method stub
		System.out.println("Sms gönderildi:"+ message);
	}

}
