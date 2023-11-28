package net.student.db.actions.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.student.db.actions.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}