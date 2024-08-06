public class Computer {
    private final String cpu;
    private final int ram;
    private final int storage;
    private final boolean graphicsCard;
    private final boolean wifi;

    // Private constructor to prevent instantiation
    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.wifi = builder.wifi;
    }

    // Static nested Builder class
    public static class Builder {
        private String cpu;
        private int ram;
        private int storage;
        private boolean graphicsCard;
        private boolean wifi;

        // Mandatory parameters
        public Builder(String cpu, int ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        // Optional parameters
        public Builder withStorage(int storage) {
            this.storage = storage;
            return this;
        }

        public Builder withGraphicsCard() {
            this.graphicsCard = true;
            return this;
        }

        public Builder withWifi() {
            this.wifi = true;
            return this;
        }

        // build() method to return an instance of Computer
        public Computer build() {
            return new Computer(this);
        }
    }

    // toString() method to display Computer configuration
    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                ", graphicsCard=" + graphicsCard +
                ", wifi=" + wifi +
                '}';
    }
}