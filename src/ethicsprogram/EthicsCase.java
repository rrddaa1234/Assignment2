/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ethicsprogram;

/**
 *
 * @author 342889045
 */
public class EthicsCase {
     private String caseTitle;
    private String description;
    private String category;
    public Verdict verdict;
    
    EthicsCase(String caseTitle, String description, String category){
    this.caseTitle = caseTitle;
    this.description = description;
    this.category = category;
    this.verdict = new Verdict();
    
    }
    
    public String getCaseTitle(){
        return caseTitle;
    }
    
    public String getCaseDescription(){
        return description;
    }
    
    public String getCategory(){
        return category;
    }
    
    public String toString(){
        
        
        // Incomplete will fix as we go on.
        return "The case "+ caseTitle + "";
    }
}
