package proj.application;

import proj.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc{

	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
		super(accNo, accNm, charges, deliveryCharge);
		
	}
	
	public void bookProduct(float charges)
	{
		System.out.println("your Normal Account product charges are "+charges+"and delivery charges are " +deliveryCharge);
	}

	@Override
	public String toString() {
		return "GSNormalAcc [deliveryCharge=" + deliveryCharge + ", accNo=" + accNo + ", accNm=" + accNm + ", charges="
				+ charges + "]";
	}
	

}
