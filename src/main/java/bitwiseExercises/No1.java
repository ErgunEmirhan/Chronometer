package bitwiseExercises;

public class No1 {
	public static void main(String[] args) {
		var obj = new No1();
		obj.isPalindrome(121);
	}
	public boolean isPalindrome(int x) {
		if (x < 0) return false;
		else if (x  <10) return true;
		else{
			int digitCount = (int)(Math.floor(Math.log(x)) + 1);
			for(int i = 1; i <= digitCount/2; i++){
				if (findNthDigit(x, i) != findNthDigit(x, digitCount - i + 1)) return false;
			}
			return true;
		}
	}
	
	private int findNthDigit(int x, int n){
		if (n <= 0) throw new RuntimeException();
		return (int)(x/Math.pow(10, n - 1)) - ((int)(x/Math.pow(10, n))) * 10;
	}
}