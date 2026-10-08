package com.student;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            
            Transaction insertTransaction = session.beginTransaction();
            Student student = new Student(101, "vaishnavi",
                    "vaishnaviramesh26@gmail.com", "AI & DS");
            session.persist(student);
            insertTransaction.commit();
            System.out.println("Student inserted successfully!");

            Transaction updateTransaction = session.beginTransaction();
            Student existing = session.get(Student.class, 101);
            if (existing != null) {
                existing.setCourse("Artificial Intelligence");
                updateTransaction.commit();
                System.out.println("Student updated successfully!");
            } else {
                updateTransaction.rollback();
                System.out.println("Student not found!");
            }

            Student updated = session.get(Student.class, 101);
            if (updated != null) {
                System.out.println("Student ID: " + updated.getId());
                System.out.println("Name: " + updated.getName());
                System.out.println("Email: " + updated.getEmail());
                System.out.println("Course: " + updated.getCourse());
            }

            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            HibernateUtil.shutdown();
        }
    }
}
