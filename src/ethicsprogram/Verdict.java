/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ethicsprogram;

/**
 *
 * @author 342889045
 */
public class Verdict {
    // variables 
    private String caseTitle;
    private String studentVerdict;
    private String reason;
    // 
    private final String D_reason = "Default";
    
    Verdict(){
        // sets reason as default
        this.caseTitle = "";
        this.studentVerdict = "";
        this.reason = D_reason;
    }
    Verdict(String caseTitle, String studentVerdict, String reason){
        this.caseTitle = caseTitle;
        this.studentVerdict = studentVerdict;
        this.reason = reason;
    }
    
    public void setCaseTitle(String title){
        this.caseTitle = title;
    }
    public String getCaseTitle(){
        return caseTitle;
    }
    public void setReason(String reason){
        this.reason = reason;
    }
    public String getReason(){
        return reason;
    }
    public void setStudentVerdict(String verdict){
        this.studentVerdict = verdict;
    }
    public String getStudentVerdict(){
        return studentVerdict;
    }
    @Override
    public String toString(){
        
        //returns the title to the user in string form
        return "Title: " + caseTitle + " verdict: "+ studentVerdict;
    }
}

