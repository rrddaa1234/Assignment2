/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ethicsprogram;

/**
 *
 * @author 342889045
 */
public class IntelPropCase extends EthicsCase {
    // a subclass
private String ipType;

public IntelPropCase(String caseTitle, String description, String ipType) {
    // super gives the case title to the super class.
super(caseTitle, description, "Intellectual Property");
this.ipType = ipType;
}
// gives the type back to user
public String getipType() {
    return ipType;
}
@Override

public String toString() {
    return "aaa"; //so what do i put for toString?
}
    
}