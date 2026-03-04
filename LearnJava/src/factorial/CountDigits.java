package factorial;

public class CountDigits {
	int count = 0;

	public void countDigi(int num) {
			
		while (num > 0) {
			num = num / 10;
			count++;
		}

		System.out.println(" the number of digits is"+ count);
	
}


	public static void main(String[] args) {
		CountDigits cd = new CountDigits();
		cd.countDigi(678543);
	}

}
