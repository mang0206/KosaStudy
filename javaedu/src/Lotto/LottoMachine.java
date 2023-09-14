package Lotto;
import java.util.Random;

public class LottoMachine {
	private int[] nums;
	
	public LottoMachine() {
		
	}
	
	public void createLottoNums() {
		nums = new int[6];
		Random ran = new Random();
		for(int i=0; i<nums.length;i++)
			nums[i] = ran.nextInt(20) + 1;
	}
	
	public void checkLottoNums() throws DuplicateException{
		for(int i=1; i<nums.length; i++) {
			for(int j=0; j <i; j++) {
				if(nums[i] == nums[j])
					throw new DuplicateException();
			}
		}
	}
	
	public int[] getNums() {
		return nums;
	}
}
