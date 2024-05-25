package akhi.io.inheritance;

public class MountainByke extends Bicycle{

    int seatHeight;

    public MountainByke(int gear, int speed, int seatHeight) {
        super(gear, speed);
        this.seatHeight = seatHeight;
    }

    @Override
    public String toString() {
        return (super.toString() + "\nseat height is "
                + seatHeight);
    }
}
