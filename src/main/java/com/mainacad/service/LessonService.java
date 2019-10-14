package com.mainacad.service;

import com.mainacad.entity.Group;
import com.mainacad.entity.Lesson;
import com.mainacad.entity.Specialization;
import com.mainacad.entity.Teacher;

import java.time.LocalDateTime;
import java.util.List;

public interface LessonService {

    List<Lesson> findByGroupAndStartTimeAfterAndStartTimeBefore(Group group, LocalDateTime from, LocalDateTime to);

    List<Lesson> findNotLectureByStudentAndStartTimeAfterAndStartTimeBefore(String email, LocalDateTime time1,
                                                                            LocalDateTime time2);

    List<Lesson> findBySpecializationAndStartTimeAfterAndStartTimeBefore(Specialization specialization,
                                                                            LocalDateTime from, LocalDateTime to);

    List<Lesson> findByTeacherAndStartTimeAfterAndStartTimeBefore(Teacher teacher, LocalDateTime from,
                                                                  LocalDateTime to);

    List<Lesson> findByStartTimeAfterAndStartTimeBefore(LocalDateTime from, LocalDateTime to);

}
