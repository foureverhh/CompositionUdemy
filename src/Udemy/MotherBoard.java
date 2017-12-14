package Udemy;

public class MotherBoard
{
    private String model;
    private String manufacturer;
    private int ramslots;
    private int carSlots;
    private String bios;

    public MotherBoard(String model, String manufacturer, int ramslots, int carSlots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramslots = ramslots;
        this.carSlots = carSlots;
        this.bios = bios;
    }

    public void loadProgram(String programName)
    {
        System.out.println("Program "+programName+" is now loading......");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getRamslots() {
        return ramslots;
    }

    public void setRamslots(int ramslots) {
        this.ramslots = ramslots;
    }

    public int getCarSlots() {
        return carSlots;
    }

    public void setCarSlots(int carSlots) {
        this.carSlots = carSlots;
    }

    public String getBios() {
        return bios;
    }

    public void setBios(String bios) {
        this.bios = bios;
    }
}
