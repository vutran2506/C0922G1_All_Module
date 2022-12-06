package Case_study_module2.model;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String nameService, double useArea, double rentCost, int maximumNumberOfPeople, String rentType,
                String freeService) {
        super(nameService, useArea, rentCost, maximumNumberOfPeople, rentType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    public String toString() {
        return "Room{" + super.toString()+
                "dichVuFree='" + freeService + '\'' +
                '}';
    }
   public  StringBuilder formatRoom(){
        return new StringBuilder(this.getNameService()+","+this.getUseArea()+","+this.getRentCost()+","+this.getMaximumNumberOfPeople()+","
                +this.getRentCost()+","+this.getFreeService()) ;
   }
}
