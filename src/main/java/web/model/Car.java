package web.model;

public class Car {

    private int model;
    private String series;
    private int age;

    public Car() {
    }

    public Car(int model, String series, int age) {
        this.model = model;
        this.series = series;
        this.age = age;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + model + '\'' +
                ", series=" + series +
                ", dateOfProduction=" + age +
                '}';
    }
}
