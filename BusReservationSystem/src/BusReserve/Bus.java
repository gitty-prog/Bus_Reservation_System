package BusReserve;

public class Bus {
	private int busNo;
	private boolean ac;
	private int capacity;
	
	Bus(int no,boolean ac,int cap){
		this.busNo =no;
		this.ac=ac;
		this.capacity=cap;
	}
	public int getCapacity(){
		return capacity;
		
	}
	public void setCapacity(int cap){
		this.capacity=cap;
		
	}
	public int getBusNo() {
		return busNo;
	}
	public void setBusNo(int busNo) {
		this.busNo = busNo;
	}
	public boolean isAc() {
		return ac;
	}
	public void setAc(boolean ac) {
		this.ac = ac;
	}
	
	public void displayBusInfo() {
		System.out.println("Bus No: "+busNo + "AC:" +ac + "Total Capacity :" +capacity);
	}

}
