package Cardemo;

public class Drive {
    public static void main(String[] args) {
        Car car = new Car("911", 1976, "Porsche","Coupe", 180);
        car.stop();
        if(car.isStopped())
            car.accelerate(200);
        System.out.println("Current speed: " + car.currentSpeed());
    }
}
