

public class Game {
	Wheel wheel;
	Player player;
	int chips;
	int spinValue;
	int bet = 10;
	int spinCount = 0;
	public Game(){
		wheel = new Wheel();
		
		player = new Player();
		player.setName("Chris");
		player.setPlayerColor("black");
		player.setChips(1000);
		chips = player.getChips();
		player.setWinnings(0);
		
		//determine how many turns to meet qualifying exit point.
		//while (player.getWinnings() < (spinCount * 10) || player.getWinnings() == 0 ){
		if(spinCount == 0){
			System.out.println("The bet is:" + bet);
			spin();
			spinCount++;
			System.out.println("Spin Count: " + spinCount );
			System.out.println("winnings: " + player.getWinnings());
			System.out.println("You have won "+ player.getWinnings() / spinCount + " chips per turn."+ "\n");
			
		}
		while (player.getWinnings() / spinCount < 10){
		System.out.println("The bet is:" + bet);
		spin();
		spinCount++;
		System.out.println("Spin Count: " + spinCount );
		System.out.println("winnings: " + player.getWinnings());
		System.out.println("You have won "+ player.getWinnings() / spinCount + " chips per turn."+ "\n");
		
		if(bet <= 0){
			break;
		}
		}
		System.out.println("Spin Count: " + spinCount );
		System.out.println("winnings: " + player.getWinnings());
		System.out.println("You have won "+ player.getWinnings() / spinCount + " chips per turn.");
	}

	

	private void spin() {
		// TODO Auto-generated method stub
		
		wheel.setSpinValue(spinValue);
		spinValue = wheel.getSpinValue();
		wheel.setColor(spinValue);
		System.out.println("Spin is: " + spinValue + " " + wheel.getColor());
		
		
		//
		String wheelColor = wheel.getColor();
		String playerColor = player.getPlayerColor();
		if(wheelColor.equalsIgnoreCase(playerColor)){
			player.setWinnings(player.getWinnings() + bet);
			player.setChips(chips + bet);
		}else if(!wheelColor.equalsIgnoreCase(playerColor)){
			player.setWinnings(player.getWinnings() - bet);
			player.setChips(chips - bet);
			bet = bet + 10;
		}
		
	}
}
