/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.school;


import Students.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

final class School {
    private static final List<Student> studentList = new ArrayList<>();
    public final static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("List of Menu:");
            System.out.println("1. Add new Student");
            System.out.println("2. List of Student");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Select Menu: ");

            String pilihan = scanner.nextLine();

            switch (pilihan) {
                case "1":
                    System.out.print("Insert Student Number: ");
                    Integer insertNumber = Integer.valueOf(scanner.nextLine());
                    System.out.print("Insert Student Class: ");
                    String insertStudentClass = scanner.nextLine();
                    System.out.print("Insert Student Name: ");
                    String insertName = scanner.nextLine();
                    System.out.print("Insert Student Gender: ");
                    String insertGender = scanner.nextLine();
                    System.out.print("Insert Student Age: ");
                    Integer insertAge = Integer.valueOf(scanner.nextLine());
                    Student newStudent = new Student(insertNumber, insertStudentClass,insertName, insertGender, insertAge);
                    studentList.add(newStudent);
                    break;


                case "2":
                    if (studentList.isEmpty()) {
                        System.out.println("There's no students");
                    } else {
                        System.out.println("List of Students:");
                        for (Student student : studentList) {
                            System.out.println("Number : " + student.getStudentNumber());  
                            System.out.println("Class : " + student.getStudentClass());
                            System.out.println("Name: " + student.getName());
                            System.out.println("Gender: " + student.getGender());
                            System.out.println("Age: " + student.getAge());
                            System.out.println("-------------------");
                        }
                    }
                    break;
                case "3":
                    System.out.print("Insert Student Number: ");
                    Integer getStudentNo = Integer.valueOf(scanner.nextLine());
                    System.out.print("Insert New Student Class: ");
                    String updateClass = scanner.nextLine();
                    System.out.print("Insert New Student Age: ");
                    Integer updateAge = Integer.valueOf(scanner.nextLine());
                    boolean findUpdate = false;
                    for (Student student : studentList) {
                                if (student.getStudentNumber().equals(getStudentNo)) {
                                    student.setAge(updateAge);
                                    student.setClass(updateClass);
                                    findUpdate = true;
                                    break;
                                }
                            }   if (!findUpdate) {
                                System.out.println("Student not found");
                            }   
                    break;
                case "4":
                    System.out.print("Insert Student Number to Delete: ");
                    Integer deleteStudent = Integer.valueOf(scanner.nextLine());
                    boolean foundDelete = false;
                    Iterator<Student> iterator = studentList.iterator();
                    while (iterator.hasNext()) {
                        Student student = iterator.next();
                        if (student.getStudentNumber().equals(deleteStudent)) {
                            iterator.remove();
                            foundDelete = true;
                            break;
                        }
                    }   if (!foundDelete) {
                        System.out.println("Student not found");
                    }   
                    break;
                case "5":
                    System.out.println("ThankYou");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }
    }
}
