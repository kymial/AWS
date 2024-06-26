package tset01;



interface Vehicle{
		
public abstract void accelerate();
public abstract void stop();
public abstract void setStart(Boolean isStart);

	}

class Car{
	private String vin;
	private String color;
	private Boolean isStart;
	
	String getVin() {
		return vin;
	}
	
	void setVin(String vin) {
		this.vin = vin;
	}
	
	String getColor() {
		return color;
	}
	
	void setColor(String color) {
		this.color = color;
	}
	
	Boolean getIsStart() {
		return isStart;
	}
	
	void setIsStart(Boolean isStart) {
		this.isStart = isStart;
	}
	
}

class Train{
	private String trainNumber;
	private String departureStation;
	private String arrivalStation;
	private Boolean isStart;
	
	String TrainNumber() {
		return trainNumber;
	}
	
	void setTrainNumber(String trainNumber) {
		this.trainNumber = trainNumber;
	}
	
	String getDepartureStation() {
		return departureStation;
	}
	
	void setDepartureStation(String departureStation) {
		this.departureStation = departureStation;
	}
	
	String getArrivalStation() {
		return arrivalStation;
	}
	
	void setArrivalStation(String arrivalStation) {
		this.arrivalStation = arrivalStation;
	}
	
	Boolean getIsStart() {
		return isStart;
	}
	
	void setIsStart(Boolean isStart) {
		this.isStart = isStart;
	}
}

class ManualCar extends Car implements Vehicle{
	protected int Gear;
	
	
	void setGear() {
		if(Gear>=0 && Gear<7) {
			System.out.println(Gear);
		}
	}
	
	
	int getGear() {
		return Gear;
	}
	
	void setGear2(int Gear) {
		this.Gear = Gear;
	}
	
	
	@Override
	public void accelerate() {
		System.out.println("수동 변속기 자동차가 가속합니다!");
		
		
	}

	@Override
	public void stop() {
		System.out.println("수동 변속기 자동차가 정차합니다!");
		
	}

	@Override
	public void setStart(Boolean isStart) {
		isStart = !isStart;
		
	}	
	
	
}

class AutomaticCar extends Car implements Vehicle{

	@Override
	public void accelerate() {
		System.out.println("자동 변속기 자동차가 가속합니다!");
		
	}

	@Override
	public void stop() {
		System.out.println("자동 변속기 자동차가 정차합니다!");
		
	}

	@Override
	public void setStart(Boolean isStart) {
		isStart = !isStart;
		
	}
	
}

class PassengerTrain extends Train implements Vehicle{
	int passengerCount;
	
	int getPassengerCount() {
		return passengerCount;
	}
	
	void setPassengerCount(int passengerCount) {
		this.passengerCount = passengerCount;
	}
	
	

	@Override
	public void accelerate() {
		System.out.println("여객 열차가 천천히 가속합니다");
		
	}

	@Override
	public void stop() {
		System.out.println("여객 열차가 천천히 정차합니다!");
		
	}

	@Override
	public void setStart(Boolean isStart) {
		isStart = !isStart;	
	}
}

class FreightTrain extends Train implements Vehicle{
	double cargoWeight;
	
	double getCargoWeight() {
		return cargoWeight;
	}
	
	void setCargoWeight(double cargoWeight) {
		this.cargoWeight = cargoWeight;
	}

	@Override
	public void accelerate() {
		System.out.println("화물 열차가 느리게 가속합니다!");
		
	}

	@Override
	public void stop() {
		System.out.println("화물 열차가 느리게 정차합니다!");
		
	}

	@Override
	public void setStart(Boolean isStart) {
		isStart = !isStart;	
		
	}
}

public class T_Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
