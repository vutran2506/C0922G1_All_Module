package Case_study_module2.model;

public class Villa extends Facility {
    private String roomStandard;
    private double poolArea;
    public int floorNumber;

    public Villa() {
    }

    public Villa(String id, String nameService, double useArea, double rentCost, int maximumNumberOfPeople, String rentType, String roomStandard, double poolArea, int floorNumber) {
        super(id, nameService, useArea, rentCost, maximumNumberOfPeople, rentType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.floorNumber = floorNumber;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    @Override
    public String toString() {
        return "Villa{" +super.toString()+
                "roomStandard='" + roomStandard + '\'' +
                ", poolArea=" + poolArea +
                ", floorNumber=" + floorNumber +
                '}';
    }


    public StringBuilder formatVilla(){
        return new StringBuilder(this.getId()+","+this.getNameService()+","+this.getUseArea()+","+this.getRentCost()+","+this.getMaximumNumberOfPeople()
        +","+this.getRentType()+","+this.roomStandard+","+this.poolArea+","+this.floorNumber);
    }
}