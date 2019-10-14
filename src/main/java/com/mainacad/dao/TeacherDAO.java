package com.mainacad.dao;

import com.mainacad.entity.Group;
import com.mainacad.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface TeacherDAO extends JpaRepository<Teacher, Integer> {

    List<Teacher> findByGroupAndStartTimeAfterAndStartTimeBefore(Group group, LocalDateTime from, LocalDateTime to);

}
