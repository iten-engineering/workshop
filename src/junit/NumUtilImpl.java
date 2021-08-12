package junit;


import java.util.List;

public class NumUtilImpl implements NumUtil {

	@Override
	public Integer min(Integer... values) throws IllegalArgumentException {

		validate(2, 12, values);
		
		
		Integer min = null;
		for (Integer value: values) {
			if (min == null) {
				min = value;
				continue;
			}
			
			if (min > value) {
				min = value;
			}
		}
		
		return min;
	}

	
	@Override
	public Integer max(Integer... values) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double sum(List<Integer> values) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double avg(List<Integer> values) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	private void validate(Integer from, Integer to, Integer... values) {
		for (Integer value : values) {
			validate(from, to, value);
		}
	}
	
	private void validate(Integer from, Integer to, Integer value) 
		throws IllegalArgumentException {
		
		if (value < from || value > to) {
		 	String msg = "Invalid value: " + value 
					+ " is not in allowed range " 
		 			+ from + "-" + to;
			
			throw new IllegalArgumentException(msg);
		}
	}
		
}
