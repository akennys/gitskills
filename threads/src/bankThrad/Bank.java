package bankThrad;

public class Bank {

	private Integer balance = 0;

	// 存钱
	public void addMoney(int money) {
		balance += money;
		System.out.println(System.currentTimeMillis() + "存进：" + balance);
	}

	// 取钱
	public void subMoney(int money) {
		/*if (balance - money < 0) {
			System.out.println("余额不足");
			return;
		}*/
		balance -= money;
		System.out.println(+System.currentTimeMillis() + "取出：" + money);
	}

	// 查询
	public void lookMoney() {
		System.out.println("账户余额：" + balance);
	}
}
