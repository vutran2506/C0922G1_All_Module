package Case_study_module2.model;

import java.util.Objects;

public abstract class Facility {
    private String id;
    private String nameService;
    private double useArea;
    private double rentCost;
    private int maximumNumberOfPeople;
    private String rentType;

    public Facility() {
    }

    public Facility(String id, String nameService, double useArea,
                    double rentCost, int maximumNumberOfPeople, String rentType) {
        this.id = id;
        this.nameService = nameService;
        this.useArea = useArea;
        this.rentCost = rentCost;
        this.maximumNumberOfPeople = maximumNumberOfPeople;
        this.rentType = rentType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
                "id='" + id + '\'' +
                ", nameService='" + nameService + '\'' +
                ", useArea=" + useArea +
                ", rentCost=" + rentCost +
                ", maximumNumberOfPeople=" + maximumNumberOfPeople +
                ", rentType='" + rentType + '\''
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Facility facility = (Facility) o;
        return Objects.equals(id, facility.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
