package javaStudy.castingInterface;

public class VehicleEx {
    public static void main(String[] args){

        Vehicle vehicle = new Bus();

        vehicle.run();
        // Vehicle 인터페이스에서는 checkFare 메소드가 없음
        // vehicle.checkFare();

        // 강제 타입 변환
        Bus bus = (Bus) vehicle;

        bus.run();
        // Bus 클래스에서는 checkFare()가 있음
        bus.checkFare();

    }
}
