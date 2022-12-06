package Case_study_module2.model;

public abstract class Facility {
    private String nameService;
    private double useArea;
    private double rentCost;
    private int maximumNumberOfPeople;
    private String rentType;

    public Facility() {
    }

    public Facility(String nameService, double useArea, double rentCost, int maximumNumberOfPeople,
                    String rentType) {
        this.nameService = nameService;
        this.useArea = useArea;
        this.rentCost = rentCost;
        this.maximumNumberOfPeople = maximumNumberOfPeople;
        this.rentType = rentType;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getUseArea() {
        return useArea;
    }

    public void setUseArea(double useArea) {
        this.useArea = useArea;
    }

    public double getRentCost() {
        return rentCost;
    }

    public void setRentCost(double rentCost) {
        this.rentCost = rentCost;
    }

    public int getMaximumNumberOfPeople() {
        return maximumNumberOfPeople;
    }

    public void setMaximumNumberOfPeople(int maximumNumberOfPeople) {
        this.maximumNumberOfPeople = maximumNumberOfPeople;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    @Override
    public String toString() {
        return
                "nameService='" + nameService + '\'' +
                ", useArea=" + useArea +
                ", rentCost=" + rentCost +
                ", maximumNumberOfPeople=" + maximumNumberOfPeople +
                ", rentType='" + rentType + '\'' +
                '}';
    }
}
