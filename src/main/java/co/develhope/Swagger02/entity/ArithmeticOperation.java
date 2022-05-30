package co.develhope.Swagger02.entity;

import lombok.Data;

@Data
public class ArithmeticOperation {

    private String name;
    private int minNumberOFOperands;
    private String description;
    private String[] properties;

    public ArithmeticOperation(){
    }

    public ArithmeticOperation(String name, int minNumberOFOperands, String description, String[] properties) {
        this.name = name;
        this.minNumberOFOperands = minNumberOFOperands;
        this.description = description;
        this.properties = properties;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinNumberOFOperands() {
        return minNumberOFOperands;
    }

    public void setMinNumberOFOperands(int minNumberOFOperands) {
        this.minNumberOFOperands = minNumberOFOperands;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getProperties() {
        return properties;
    }
}
