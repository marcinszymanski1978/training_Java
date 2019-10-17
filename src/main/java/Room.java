public class Room {

    private int room_ID;
    private boolean cooling_status;
    private AirConditioner airConditionerType;
    private double volume_m3;
    private double temp_actual;
    private double temp_set;


    public Room(int room_ID, double volume, double temp_actual) {
        this.room_ID = room_ID;
        this.volume_m3 = volume;
        this.temp_actual = temp_actual;
    }

    public int getRoom_ID() {
        return room_ID;
    }

    public void setRoom_ID(int room_ID) {
        this.room_ID = room_ID;
    }

    public boolean isCooling_status() {
        return cooling_status;
    }

    public void setCooling_status(boolean cooling_status) {
        this.cooling_status = cooling_status;
    }

    public AirConditioner getAirConditionerType() {
        return airConditionerType;
    }

    public void setAirConditionerType(AirConditioner airConditionerType) {
        this.airConditionerType = airConditionerType;
    }

    public double getVolume_m3() {
        return volume_m3;
    }

    public void setVolume_m3(double volume_m3) {
        this.volume_m3 = volume_m3;
    }

    public double getTemp_actual() {
        return temp_actual;
    }

    public void setTemp_actual(double temp_actual) {
        this.temp_actual = temp_actual;
    }

    public double getTemp_set() {
        return temp_set;
    }

    public void setTemp_set(double temp_set) {
        this.temp_set = temp_set;
    }



    @Override
    public String toString() {
        return "Room{" +
                "room_ID=" + room_ID +
                ", cooling_status=" + cooling_status +
                ", airConditionerType=" + airConditionerType +
                ", volume_m3=" + volume_m3 +
                ", temp_actual=" + temp_actual +
                ", temp_set=" + temp_set +
                '}';
    }
}
