/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopInherit;

/**
 *
 * @author 2211510280 - Firdhan Happyanda
 */
public class graduateStudent extends student {
    private final String thesisTopic;

    public graduateStudent(int studentId, String name, String email, String thesisTopic) {
        super(studentId, name, email);  // panggil constructor Student
        this.thesisTopic = thesisTopic;
    }

    public String getThesisTopic() {
        return thesisTopic;
    }
}
