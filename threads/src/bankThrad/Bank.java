package bankThrad;

public class Bank {

	private Integer balance = 0;

	// ��Ǯ
	public void addMoney(int money) {
		balance += money;
		System.out.println(System.currentTimeMillis() + "�����" + balance);
	}

	// ȡǮ
	public void subMoney(int money) {
		/*if (balance - money < 0) {
			System.out.println("����");
			return;
		}*/
		balance -= money;
		System.out.println(+System.currentTimeMillis() + "ȡ����" + money);
	}

	// ��ѯ
	public void lookMoney() {
		System.out.println("�˻���" + balance);
	}
}
