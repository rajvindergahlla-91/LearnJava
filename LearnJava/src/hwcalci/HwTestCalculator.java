package hwcalci;

public class HwTestCalculator {
	public static void main(String[] args) {
		HwCalculator hc = new HwCalculator();
		hc.addTwo(4, 8);
		hc.addThree(1, 2, 3);
		hc.minusTwo(6, 10);
		hc.minusThree(2,5,8);
		hc.multiply(5, 6, "multiplication result is:");
		hc.divide(10, 5, "division result is:");
	}

}
