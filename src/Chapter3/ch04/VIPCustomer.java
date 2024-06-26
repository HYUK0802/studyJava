package Chapter3.ch04;

public class VIPCustomer extends Customer {



    private int agentID;
    double salesRatio;

	/*public VIPCustomer() {
		customerGrade = "VIP";    //오류 발생
		bonusRatio = 0.05;
		salesRatio = 0.1;

		System.out.println("VIPCustomer() 생성자 호출");
	}
	*/

    public VIPCustomer(int customerID, String customerName) {
        super(customerID, customerName);

        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;


    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        price -= (int)(price * salesRatio);
        return price;
    }

    public int getAgentID() {
        return agentID;
    }
}
