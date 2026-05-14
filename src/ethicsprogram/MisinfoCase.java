/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ethicsprogram;

/**
 *
 * @author 342889045
 */
public class MisinfoCase extends EthicsCase {
private String mediaType;

public MisinfoCase(String caseTitle, String description, String mediaType) {
super(caseTitle, description);
this.mediaType = mediaType;
}

public String getMediaType() {
    return mediaType;
}
@Override

public String toString() {
    return "aaa"; //so what do i put for toString?
}
    
}