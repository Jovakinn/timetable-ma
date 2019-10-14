package com.mainacad.dao;

import com.mainacad.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.List;

public interface LessonDAO extends JpaRepository<Lesson, Integer> {
//    List<Lesson> findByStudentAndStartTimeBetweenFromAndTo(Student student, LocalDateTime from, LocalDateTime to);

    List<Lesson> findByGroupAndStartTimeAfterAndStartTimeBefore(Group group, LocalDateTime from, LocalDateTime to);

    List<Lesson> findBySpecializationAndStartTimeAfterAndStartTimeBefore(Specialization specialization,
                                                                            LocalDateTime from, LocalDateTime to);

    List<Lesson> findByTeacherAndStartTimeAfterAndStartTimeBefore(Teacher teacher, LocalDateTime from,
                                                                     LocalDateTime to);

    List<Lesson> findByStartTimeAfterAndStartTimeBefore(LocalDateTime from, LocalDateTime to);

//    @Query(nativeQuery = true, value =
//            "SELECT l.* FROM lessons l " +
//                    "JOIN students s ON l.group_id=s.group_id " +
//                    "WHERE l.start_time >= :time1 " +
//                    "AND l.start_time <= :time2 " +
//                    "AND s.email = :email"
//    )
    List<Lesson> findNotLectureByStudentAndStartTimeAfterAndStartTimeBefore(String email, LocalDateTime time1,
                                                                            LocalDateTime time2);
}