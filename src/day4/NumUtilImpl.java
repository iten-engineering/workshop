package day4;

import java.util.ArrayList;
import java.util.List;

public class NumUtilImpl implements NumUtil {

	@Override
	public Integer min(Integer... values) throws IllegalArgumentException {
		this.validate(2, 12, values);

		Integer min = Integer.MAX_VALUE;
		for (Integer value : values) {
			if (value < min) {
				min = value;
			}
		}
		return min;
	}

	@Override
	public Integer max(Integer... values) throws IllegalArgumentException {
		this.validate(2, 12, values);

		Integer max = Integer.MIN_VALUE;
		for (Integer value : values) {
			if (value > max) {
				max = value;
			}
		}
		return max;
	}

	@Override
	public Double sum(List<Integer> values) throws IllegalArgumentException {
		this.validate(1, 100, values);
		return this.createSum(values);
	}

	@Override
	public Double avg(List<Integer> values) throws IllegalArgumentException {
		this.validate(2, 25, values);
		return this.createSum(values) / values.size();
	}

	private Double createSum(List<Integer> values) {
		Double sum = 0.0;
		for (Integer value : values) {
			sum += value;
		}
		return sum;
	}

	private void validate(Integer min, Integer max, Integer... values) throws IllegalArgumentException {

		if (values == null) {
			throw new IllegalArgumentException();
		}

		List<Integer> list = new ArrayList<Integer>();
		for (Integer value : values) {
			list.add(value);
		}

		this.validate(min, max, list);
	}

	private void validate(Integer min, Integer max, List<Integer> values) throws IllegalArgumentException {
		if (values == null || values.isEmpty()) {
			throw new IllegalArgumentException();
		}
		for (Integer value : values) {
			if (value < min || value > max) {
				throw new IllegalArgumentException();
			}
		}
	}

}
