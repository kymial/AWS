package tset01;

public class App  {

	public static void main(String[] args) {
		ManualCar manu = new ManualCar();
		AutomaticCar auto = new AutomaticCar();
		PassengerTrain pt = new PassengerTrain();
		FreightTrain ft = new FreightTrain();
		
		manu.setVin("10가1234");
		manu.setColor("blue");
		manu.setIsStart(false);
		manu.setGear2(0);
		
		auto.setVin("10가1234");
		auto.setColor("blue");
		auto.setIsStart(false);
		
		pt.setTrainNumber("KTX001");
		pt.setDepartureStation("서울");
		pt.setArrivalStation("부산");
		pt.setIsStart(false);
		pt.setPassengerCount(200);
		
		ft.setTrainNumber("Cargo001");
		ft.setDepartureStation("부산");;
		ft.setArrivalStation("구미");;
		ft.setIsStart(true);
		ft.setCargoWeight(100.0);
		
				

	}

}
