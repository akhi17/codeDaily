package akhi.io.design.builder;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
//        director.constructSportsCar(builder);
//        director.constructCityCar(builder);
        director.constructTESLA(builder);

        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();

        // Director may know several building recipes.
//        director.constructSportsCar(manualBuilder);
//        director.constructCityCar(manualBuilder);
        director.constructTESLA(manualBuilder);

        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}
