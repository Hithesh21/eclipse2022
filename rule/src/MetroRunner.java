import com.xworkz.rules.follow.Metro;

public class MetroRunner {

	public static void main(String[] args, Metro metro) {


		Metro metro1=new Metro();
		NammaMetro metro2=new NammaMetro(metro);
		metro2.trainCheck();
		
	}

}
