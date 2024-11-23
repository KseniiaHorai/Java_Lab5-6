package org.example;

public abstract class PassengerBaseCar extends BaseCar {

    private static final int LIMIT = 380;

    protected int passengerCount;
    protected int bagsCount;
    protected final int comfortLevel;

    public PassengerBaseCar(int passengerCount, int bagsCount, int comfortLevel) {
        super(LIMIT);

        if (passengerCount + bagsCount > LIMIT) {
            throw new IllegalArgumentException("INVALID NUMBER OF PEOPLE AND BAGS");
        }

        this.passengerCount = passengerCount;
        this.bagsCount = bagsCount;
        this.comfortLevel = comfortLevel;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public int getBagsCount() {
        return bagsCount;
    }

    public int getComfortLevel() {
        return comfortLevel;
    }

    public void setPassengerCount(int count) {
        if (count >= 0 && count <= LIMIT - bagsCount) {
            this.passengerCount = count;
        }
    }

    public void setbagsCount(int count) {
        if (count >= 0 && count <= LIMIT - passengerCount) {
            this.bagsCount = count;
        }
    }

    @Override
    public String toString() {
        return "CAR CLASS: " + getClass().getSimpleName() +
                ", passengers: " + passengerCount + ", bags: " + bagsCount +
                ", comfort tier: " + comfortLevel;
    }
}
