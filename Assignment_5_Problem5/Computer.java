package Assignment_5_Problem5;

import java.util.Objects;

public class Computer {
    String manufacturer;
    String processor;
    int ramSize;
    double processorSpeed;

    public Computer(String manufacturer, String processor, int ramSize, double processorSpeed){
        this.manufacturer=manufacturer;
        this.processor=processor;
        this.ramSize=ramSize;
        this.processorSpeed=processorSpeed;
    }

    public int getRamSize(){
        return ramSize;
    }

    public double getProcessorSpeed() {
        return processorSpeed;
    }

    public double computePower(){
        return ramSize * processorSpeed;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "manufacturer='" + manufacturer + '\'' +
                ", processor='" + processor + '\'' +
                ", ramSize=" + ramSize +
                ", processorSpeed=" + processorSpeed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return ramSize == computer.ramSize && Double.compare(processorSpeed, computer.processorSpeed) == 0 && Objects.equals(manufacturer, computer.manufacturer) && Objects.equals(processor, computer.processor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, processor, ramSize, processorSpeed);
    }
}
