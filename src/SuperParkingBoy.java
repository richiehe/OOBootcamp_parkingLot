import java.util.List;

public class SuperParkingBoy extends ParkingStaffBase {
    public SuperParkingBoy(ParkingLot parkingLot) {
        super(parkingLot);
    }

    public SuperParkingBoy(List<ParkingLot> parkingLotList) {
        super(parkingLotList);
    }

    public CarTicket park(Car car) {
        ParkingLot max = parkingLots.get(0);
        for (ParkingLot parkingLot : parkingLots) {
            if(parkingLot.vacancyRate() > max.vacancyRate()){
                max = parkingLot;
            }
        }
        return max.park(car);
    }
}