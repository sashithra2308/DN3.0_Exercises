public class BuilderPatternExample {
    public static void main(String[] args) {
        // Create a basic Computer configuration
        Computer basicComputer = new Computer.Builder("Intel Core i3", 8)
                .withStorage(256)
                .build();
        System.out.println("Basic Computer: " + basicComputer);

        // Create a gaming Computer configuration
        Computer gamingComputer = new Computer.Builder("Intel Core i7", 16)
                .withStorage(512)
                .withGraphicsCard()
                .withWifi()
                .build();
        System.out.println("Gaming Computer: " + gamingComputer);

        // Create a budget Computer configuration
        Computer budgetComputer = new Computer.Builder("Intel Core i5", 4)
                .withStorage(128)
                .build();
        System.out.println("Budget Computer: " + budgetComputer);
    }
}