package org.intmo.lesson3;

public class House {
    private Integer numberOfFloors;
    private Integer yearOfConstruction;
    private String title;

    public void printCourse(Integer numberOfFloors, Integer yearOfConstruction, String title) {
        setNumberOfFloors(numberOfFloors);
        setYearOfConstruction(yearOfConstruction);
        setTitle(title);
    }

    public static Double printyearOfConstruction(Double yearOfConstruction) {
        return yearOfConstruction;
    }

    public Integer getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(Integer numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public Integer getYearOfConstruction() {
        return yearOfConstruction;
    }

    public void setYearOfConstruction(Integer yearOfConstruction) {
        this.yearOfConstruction = yearOfConstruction;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "House{" +
                "numberOfFloors=" + numberOfFloors +
                ", yearOfConstruction=" + yearOfConstruction +
                ", title='" + title + '\'' +
                '}';
    }
}
