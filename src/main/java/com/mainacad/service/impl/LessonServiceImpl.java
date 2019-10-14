package com.mainacad.service.impl;

import com.mainacad.dao.LessonDAO;
import com.mainacad.entity.Group;
import com.mainacad.entity.Lesson;
import com.mainacad.entity.Specialization;
import com.mainacad.entity.Teacher;
import com.mainacad.service.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class LessonServiceImpl implements LessonService {

    @Autowired
    LessonDAO lessonDAO;

    @Override
    public List<Lesson> findByGroupAndStartTimeAfterAndStartTimeBefore(Group group, LocalDateTime from, LocalDateTime to) {
        return lessonDAO.findByGroupAndStartTimeAfterAndStartTimeBefore(group, from, to);
    }

    @Override
    public List<Lesson> findNotLectureByStudentAndStartTimeAfterAndStartTimeBefore(String email, LocalDateTime time1, LocalDateTime time2) {
        return lessonDAO.findNotLectureByStudentAndStartTimeAfterAndStartTimeBefore(email, time1, time2);
    }

    @Override
    public List<Lesson> findBySpecializationAndStartTimeAfterAndStartTimeBefore(Specialization specialization, LocalDateTime from,
                                                                                LocalDateTime to) {
        return lessonDAO.findBySpecializationAndStartTimeAfterAndStartTimeBefore(specialization, from, to);
    }

    @Override
    public List<Lesson> findByTeacherAndStartTimeAfterAndStartTimeBefore(Teacher teacher, LocalDateTime from, LocalDateTime to) {
        return lessonDAO.findByTeacherAndStartTimeAfterAndStartTimeBefore(teacher, from, to);
    }

    @Override
    public List<Lesson> findByStartTimeAfterAndStartTimeBefore(LocalDateTime from, LocalDateTime to) {
        return lessonDAO.findByStartTimeAfterAndStartTimeBefore(from, to);
    }
}
