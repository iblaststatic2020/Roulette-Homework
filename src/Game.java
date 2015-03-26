

public class Game {
	Wheel wheel;
	Player player;
	int chips;
	int spinValue;
	public Game(){
		wheel = new Wheel();
		
		player = new Player();
		player.setName("Chris");
		player.setPlayerColor("black");
		player.setChips(1000);
		chips = player.getChips();
		turn();
		
		
	}

	private void turn() {
		// TODO Auto-generated method stub
		
		int spinCount = 0;
		
		if(chips > 0){
			System.out.println(chips);
			while(chips < 1000 ){
				chips = player.getChips();
				spinCount++;
				System.out.println(spinCount);
				//System.out.println(chips);
				spin();
			}
		}
		
		System.out.println(spinCount);
	}

	private void spin() {
		// TODO Auto-generated method stub
		wheel.setSpinValue(spinValue);
		spinValue = wheel.getSpinValue();
		System.out.println(spinValue);
		
		wheel.setColor(spinValue);
		
		String wheelColor = wheel.getColor();
		System.out.println("wheel color is: " + wheelColor);
		String playerColor = player.getPlayerColor();
		if(wheelColor.equalsIgnoreCase(playerColor)){
			player.setChips(chips + 20);
		}else if(!wheelColor.equalsIgnoreCase(playerColor)){
			player.setChips(chips - 10);
		}
		
	}
}
