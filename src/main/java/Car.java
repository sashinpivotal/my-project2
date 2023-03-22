public class Car {

    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String getInfo() {
        return model + " "+ year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}

class Main {
    public static void main(String[] args) {

        System.out.println("line1\n");
        System.out.println("line3");


    }
}