/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Students;
public class Student {
    final private Integer studentNumber;
    private String studentClass;
    final private String studentName;
    final private String studentGender;
    private Integer studentAge;
    
    public Student(Integer studentNumber, String studentClass, String studentName, String studentGender, Integer studentAge){
        this.studentNumber = studentNumber;
        this.studentClass = studentClass;
        this.studentName = studentName;
        this.studentGender = studentGender;
        this.studentAge = studentAge;
    }
    
    public void setAge(Integer studentAge) {
        this.studentAge = studentAge;
    }
    public void setClass(String studentClass) {
        this.studentClass = studentClass;
    }
    public Integer getStudentNumber() {
        return studentNumber;
    }
    public String getStudentClass(){
        return studentClass;
    }
    public String getName() {
        return studentName;
    }
    public String getGender() {
        return studentGender;
    }
    public Integer getAge() {
        return studentAge  ;
    }
}
