package week3.day1;

public class SmartPhone extends AndroidPhone {

	public void connectWhatsApp()
	{
		System.out.println("Connect Whatsapp");
	}
	
	public void takeVideo()
	{
		System.out.println("Take Video overriding method");
	}
	
	public static void main (String args [])
	{
		SmartPhone phone = new SmartPhone();
		AndroidPhone androidPhone = new AndroidPhone();
		
		phone.makeCall();
		phone.saveContact();
		phone.sendMessage();
		phone.takeVideo();
		phone.connectWhatsApp();
		androidPhone.takeVideo();
	}
}

