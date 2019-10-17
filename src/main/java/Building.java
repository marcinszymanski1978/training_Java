import java.util.Arrays;

public class Building {

    private String name;
    private Room[] room;


    public Building(String name, int room_qty) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Room[] getRoom() {
        return room;
    }

    public void setRoom(Room[] room) {
        this.room = room;
    }

    public void getCoolDown(Room room){

        if ((room.getTemp_actual()>room.getTemp_set())&&(room.isCooling_status())){
            double temp_new = room.getTemp_actual() - (room.getAirConditionerType().getCapacity()/room.getVolume_m3());

            room.setTemp_actual(temp_new);
        }
    }

    @Override
    public String
    toString() {
        return "Building{" +
                "name='" + name + '\'' +
                ", room=" + Arrays.toString(room) +
                '}';
    }
}
