/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oopInherit;

/**
 *
 * @author 2211510280 - Firdhan Happyanda
 */
public class main {
    public static void main(String[] args) {
        // Student biasa (undergraduate)
        student undergrad = new student(101, "Alice", "alice@school.com");

        // GraduateStudent (inherit dari Student + punya thesisTopic)
        graduateStudent gradStudent = new graduateStudent(
            202,
            "Bob",
            "bob@school.com",
            "Quantum Computing"
        );

        // Tampilkan data Student biasa
        System.out.println("=== Undergraduate Student ===");
        System.out.println("ID: " + undergrad.getStudentId());
        System.out.println("Name: " + undergrad.getName());
        System.out.println("Email: " + undergrad.getEmail());

        // Tampilkan data GraduateStudent
        System.out.println("\n=== Graduate Student ===");
        System.out.println("ID: " + gradStudent.getStudentId());
        System.out.println("Name: " + gradStudent.getName());
        System.out.println("Email: " + gradStudent.getEmail());
        System.out.println("Thesis: " + gradStudent.getThesisTopic());
    }
}
