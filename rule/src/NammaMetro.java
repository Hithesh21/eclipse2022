import com.xworkz.rules.follow.Metro;

public class NammaMetro {
	private Metro metro;
	
	public NammaMetro() {
		
	}

	public NammaMetro(Metro metro) {
		super();
		this.metro = metro;
	}
	
	public void trainCheck() {
		
		if(this.metro!=null) {
			System.out.println("running metro check");
			boolean wearMask=metro.wearMask();
			double timing=metro.timing();
			if(wearMask==true && timing==4) {
				System.out.println("namma metro following the rules");
			}else
			{
				System.out.println("namma metro not following the rules");
			}
		}
	}
	
	

}
