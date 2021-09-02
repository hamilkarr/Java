package cooperation;

public class Bus {
	int busNumber; // ���� ��ȣ
	int passengerCount; // �°� ��
	int money; // ������ ����

	public Bus(int busNumebr) // ���� ��ȣ�� �Ű������� �޴� ������
	{
		this.busNumber = busNumebr;
	}

	public void take(int money) // �°��� �� ���� ����
	{
		this.money += money; // ������ ���� ����
		passengerCount++; // �°� �� ����
	}

	public void showInfo() { // ���� ������ ����ϴ� �Լ�
		System.out.println("버스 " + busNumber + "번의 승객은" + passengerCount + "명이고, 수입은 " + money + "입니다.");
	}

}
