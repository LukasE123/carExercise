public class Car {
    private int id;
    private String brand;
    private double speed = 0.0;
    private int milage = 0;
    private String owner;
    private int value;

    public Car(int id, String brand, String owner, int value) {

        this.id = id;
        this.brand = brand;
        this.owner = owner;
        this.value = value;


    }


    public void speedUp(double increase) {

        if (speed + increase < 220) {
            speed = speed + increase;

        } else {
            System.out.println("Du har nått maxhastigheten");
        }

    }

    public void slowDown(double decrease) {

        if (speed - decrease > 0) {
            speed = speed - decrease;

        } else {
            System.out.println("Din hastighet är redan 0");
        }

    }

    public void stop() {

        speed = 0;

    }

    public int getValue() {
        return value;
    }

    public String getBrand() {
        return brand;
    }

    public int getId() {
        return id;
    }

    public double getSpeed() {
        return speed;
    }

    public int getMilage() {
        return milage;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {

        if (owner == null || owner.isEmpty()) {

            System.out.println("Fel input");
        } else {
            this.owner = owner;
        }

    }
}
