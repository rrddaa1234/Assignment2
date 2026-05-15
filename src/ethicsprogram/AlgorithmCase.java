/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ethicsprogram;

/**
 *
 * @author 342889045
 */
public class AlgorithmCase extends EthicsCase {
private String biasType;

public AlgorithmCase(String caseTitle, String description, String biasType) {
super(caseTitle, description, "Algorithm Case");
this.biasType = biasType;
}

public String getBiasType() {
    return biasType;
}
@Override

public String toString() {
    return "aaa"; //so what do i put for toString?
}
    
}