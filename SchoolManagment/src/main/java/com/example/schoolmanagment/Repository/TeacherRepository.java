package com.example.schoolmanagment.Repository;

import com.example.schoolmanagment.Model.Student;
import com.example.schoolmanagment.Model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher,Integer> {
    Teacher findTeacherById(Integer id);
    Teacher findTeacherBySalaryGreaterThanEqual(Integer salary);
}
