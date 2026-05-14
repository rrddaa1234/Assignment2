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
    private String caseTitle;
    private String studentVerdict;
    private String reason;
    
    Verdict(){
        
    }
    Verdict(String caseTitle, String verdict, String reason){
        this.caseTitle = caseTitle;
        this.verdict = studentVerdict;
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
    public String toString(){
        
        //Incomplete
        return "Title: " + caseTitle + "";
    }
}

