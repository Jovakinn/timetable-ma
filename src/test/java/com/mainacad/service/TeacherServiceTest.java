package com.mainacad.service;

import com.mainacad.ApplicationRunner;
import com.mainacad.dao.TeacherDAO;
import com.mainacad.entity.Group;
import com.mainacad.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.web.WebAppConfiguration;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

@WebAppConfiguration
@ContextConfiguration
@SpringJUnitConfig(ApplicationRunner.class)
class TeacherServiceTest {

    @MockBean
    TeacherDAO teacherDAO;

    @Autowired
    TeacherService teacherService;

    @Test
    void findByGroupAndStartTimeAfterAndStartTimeBefore() {
        when(teacherDAO.findByGroupAndStartTimeAfterAndStartTimeBefore(any(Group.class),

                eq(LocalDateTime. of(2019, 10, 1, 19, 30, 0)),
                eq(LocalDateTime.of(2019, 10, 3, 19, 30, 0)))).

                thenReturn(Arrays.asList(new Teacher()));

        List<Teacher> teachers = teacherService.findByGroupAndStartTimeAfterAndStartTimeBefore(new Group(),

                LocalDateTime. of(2019, 10, 1, 19, 30, 0),
                LocalDateTime.of(2019, 10, 3, 19, 30, 0));

        assertNotNull(teachers);
        assertFalse(teachers.isEmpty());
    }
}