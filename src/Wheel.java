import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Wheel {
	private String color;
	private int spinValue;
	private List<Integer> valueList = new ArrayList<Integer>();
	
	
	public Wheel(){
		
		
		for(int i = 0; i < 33; i++){
			;
			valueList.add(i);
		}
		valueList.add(0);
		
		
		
	}
	
	
	
	public int getSpinValue() {
		
		
		return spinValue;
	}



	public void setSpinValue(int spinValue) {
		Collections.shuffle(valueList);
		spinValue = valueList.get(0);
		this.spinValue = spinValue;
	}



	public String getColor() {
		return color;
	}
	
	public void setColor(int spinValue) {
		if(spinValue == 0){
			color = "green";
		}else if(spinValue % 2 == 0){
			color = "red";
		}else{
			color = "black";
		}
		
		
	}

}
