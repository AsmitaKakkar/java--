package code_with_harry;

interface tvRemote
{
	void power();
	
	void mute();
	
	void settings();
	
	void volume();
}

interface smarttvRemote extends tvRemote
{
	void ledLights();
	void voiceSearch();
	
}

class bacha implements smarttvRemote
{
	public void ledLights()
	{
		System.out.println("Turn on the LED lights of the TV cabinet !!");
	}
	
	public void voiceSearch()
	{
		System.out.println("Alexa !! listen to me !!");
	}
	
	public void power()
	{
		System.out.println("Switch on the tv !!");
	}
	
	public void mute ()
	{
		System.out.println("Mute out the volume !!");
	}
	
	public void settings()
	{
		System.out.println("Want to change the settings ? \n Click on red button please!!");
	}
	
	public void volume()
	{
		System.out.println("Please increase the volume upto some points !!");
	}
}

public class Practice_set_prob6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		bacha b= new bacha();
		
		b.power();
		b.mute();
		b.ledLights();
	

	}

}
