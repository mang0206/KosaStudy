package Lotto;
import day05.MethodTest9;

public class LottoGame {

	public static void main(String[] args) {
		LottoMachine lotto = new LottoMachine();
		lotto.createLottoNums();
		try {
			lotto.checkLottoNums();
			MethodTest9.printArray(lotto.getNums());
		} catch (DuplicateException e){	
			System.out.println("오류 발생 : "+e.getMessage());
		}
		
	}

}
