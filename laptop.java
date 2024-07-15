import java.util.Objects;

public class laptop {
    
    private int ram;
    private int ssd;
    private String OpSystem;
    private String model;
    private String color;
    

    public laptop (int ram, int ssd, String OpSystem, String model, String color){
      this.ram = ram;
      this.ssd = ssd;
      this.OpSystem = OpSystem;
      this.model = model;
      this.color = color;
    }

    public int getRam() {
        return ram;
    }
    public int getSsd() {
        return ssd;
    }
    public String getOpSystem() {
        return OpSystem;
    }
    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }
    public void setSsd(int ssd) {
        this.ssd = ssd;
    }
    public void setOpSystem(String opSystem) {
        OpSystem = opSystem;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
            
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
            
        }
        laptop laptop = (laptop) obj;
        return ram == laptop.ram && ssd == laptop.ssd && OpSystem == laptop.OpSystem && 
        model == laptop.model && color == laptop.color;
    }
    @Override
    public int hashCode() {
        return Objects.hash(ram,ssd,OpSystem,model,color);
    }
    @Override
    public String toString() {
        return "Модель: " + model+ System.lineSeparator() + "SSD: " +  ssd + " ГБ " + System.lineSeparator() + "Операционная система: " + OpSystem + System.lineSeparator() 
        + "Озу: " + ram + " ГБ "+ System.lineSeparator()  + "Цвет: " + color;
    }
}
