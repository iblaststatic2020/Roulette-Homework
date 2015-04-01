import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Tests {

	
	@Test
	public void create_wheel_with_thirty_three_values(){
		List<Integer> valueList = new ArrayList<Integer>();
		Wheel sut = Wheel.getInstance();
		
		assertThat(valueList.size(), is(34));
	}
}
