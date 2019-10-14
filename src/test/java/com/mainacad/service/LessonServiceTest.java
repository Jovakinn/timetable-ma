package com.mainacad.service;

import com.mainacad.ApplicationRunner;
import com.mainacad.dao.LessonDAO;
import com.mainacad.entity.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringJUnitConfig(ApplicationRunner.class)
class LessonServiceTest {

    @MockBean
    LessonDAO lessonDAO;

    @Autowired
    LessonService lessonService;

    @Test
    void testFindLessonsByStudent(){

        when(lessonDAO.findNotLectureByStudentAndStartTimeAfterAndStartTimeBefore(anyString(),

                eq(LocalDateTime. of(2019, 10, 1, 19, 30, 0)),
                eq(LocalDateTime.of(2019, 10, 3, 19, 30, 0)))).

                thenReturn(Arrays.asList(new Lesson()));

        List<Lesson> lessons = lessonService.findNotLectureByStudentAndStartTimeAfterAndStartTimeBefore("",

                LocalDateTime.of(2019, 10, 1, 19, 30, 0),
                LocalDateTime.of(2019, 10, 3, 19, 30, 0));

        assertNotNull(lessons);
        assertFalse(lessons.isEmpty());

    }

    @Test
    void testFindLessonsByGroup(){

        when(lessonDAO.findByGroupAndStartTimeAfterAndStartTimeBefore(any(Group.class),

               eq(LocalDateTime.of(2019, 10, 1, 19, 30, 0)),
               eq(LocalDateTime.of(2019, 10, 3, 19, 30, 0)))).

               thenReturn(Arrays.asList(new Lesson()));

        List<Lesson> lessons = lessonService.findByGroupAndStartTimeAfterAndStartTimeBefore(new Group(),
                LocalDateTime.of(2019, 10, 1, 19, 30, 0),
                LocalDateTime.of(2019, 10, 3, 19, 30, 0));

        assertNotNull(lessons);
        assertFalse(lessons.isEmpty());

    }

    @Test
    void testFindLessonsBySpecialisation(){

        when(lessonDAO.findBySpecializationAndStartTimeAfterAndStartTimeBefore(any(Specialization.class),

                eq(LocalDateTime.of(2019, 10, 1, 19, 30, 0)),
                eq(LocalDateTime.of(2019, 10, 3, 19, 30, 0)))).

                thenReturn(Arrays.asList(new Lesson()));

        List<Lesson> lessons = lessonService.findBySpecializationAndStartTimeAfterAndStartTimeBefore(new Specialization(),
                LocalDateTime.of(2019, 10, 1, 19, 30, 0),
                LocalDateTime.of(2019, 10, 3, 19, 30, 0));

        assertNotNull(lessons);
        assertFalse(lessons.isEmpty());

    }

    @Test
    void testFindLessonsByTeacher(){
        when(lessonDAO.findByTeacherAndStartTimeAfterAndStartTimeBefore(any(Teacher.class),

                eq(LocalDateTime.of(2019, 10, 1, 19, 30, 0)),
                eq(LocalDateTime.of(2019, 10, 3, 19, 30, 0)))).

                thenReturn(Arrays.asList(new Lesson()));

        List<Lesson> lessons = lessonService.findByTeacherAndStartTimeAfterAndStartTimeBefore(new Teacher(),
                LocalDateTime.of(2019, 10, 1, 19, 30, 0),
                LocalDateTime.of(2019, 10, 3, 19, 30, 0));

        assertNotNull(lessons);
        assertFalse(lessons.isEmpty());

    }

    @Test
    void testFindLessonsByPeriod(){
        when(lessonDAO.findByStartTimeAfterAndStartTimeBefore(

                eq(LocalDateTime.of(2019, 10, 1, 19, 30, 0)),
                eq(LocalDateTime.of(2019, 10, 3, 19, 30, 0)))).

                thenReturn(Arrays.asList(new Lesson()));

        List<Lesson> lessons = lessonService.findByStartTimeAfterAndStartTimeBefore(
                LocalDateTime.of(2019, 10, 1, 19, 30, 0),
                LocalDateTime.of(2019, 10, 3, 19, 30, 0));

        assertNotNull(lessons);
        assertFalse(lessons.isEmpty());

    }
}