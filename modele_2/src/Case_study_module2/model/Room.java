package Case_study_module2.model;

import java.util.Objects;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    public Room(String id, String nameService, double useArea, double rentCost, int maximumNumberOfPeople, String rentType, String freeService) {
        super(id, nameService, useArea, rentCost, maximumNumberOfPeople, rentType);
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" + super.toString()+
                "freeService='" + freeService + '\'' +
                '}';
    }
       public  StringBuilder formatRoom(){
        return new StringBuilder(this.getId()+","+this.getNameService()+","+this.getUseArea()+","+this.getRentCost()+","+this.getMaximumNumberOfPeople()+","
                +this.getRentCost()+","+this.getFreeService()) ;
   }


}
