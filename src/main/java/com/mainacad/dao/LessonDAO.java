package com.mainacad.dao;

import com.mainacad.entity.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonDAO extends JpaRepository<Lesson, Integer> {
}
