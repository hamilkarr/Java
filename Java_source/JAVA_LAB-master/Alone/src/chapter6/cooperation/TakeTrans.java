package chapter6.cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		// ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ ï¿½Ð»ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½
		Student studentJames = new Student("James", 5000);
		Student studentTomas = new Student("Tomas", 10000);

		Bus bus100 = new Bus(100);
		studentJames.takeBus(bus100); // jamesï¿½ï¿½ 100ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ Å½
		studentJames.showInfo(); // james ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿?
		bus100.showInfo(); // ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿?

		Subway subwayGreen = new Subway("2È£ï¿½ï¿½");
		studentTomas.takeSubway(subwayGreen); // Tomasï¿½ï¿½ 2È£ï¿½ï¿½ï¿½ï¿½ Å½
		studentTomas.showInfo(); // Tomas ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿?
		subwayGreen.showInfo();

		Student studentEdward = new Student("Edward", 30000);
		Taxi taxi = new Taxi("ì¹´ì¹´?˜¤ ì½?");
		studentEdward.takeTaxi(taxi); // Edwardï¿½ï¿½ ï¿½Ã½Ã¸ï¿½ Å½
		studentEdward.showInfo();
		taxi.showInfo();
	}
}
