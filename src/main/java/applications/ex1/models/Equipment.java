package applications.ex1.models;

public class Equipment {

    private EquipmentType equipmentType;
    private String name;

    /* .......... */

    public Equipment(EquipmentType equipmentType, String name) {
        this.equipmentType = equipmentType;
        this.name = name;
    }

    public String equipmentInfo(){
        return "Equipment type: "+equipmentType+"\n"+
                "Equipment name: "+name+"\n";
    }
}
