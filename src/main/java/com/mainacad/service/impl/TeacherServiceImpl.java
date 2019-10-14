package com.mainacad.service.impl;

import com.mainacad.dao.TeacherDAO;
import com.mainacad.entity.Group;
import com.mainacad.entity.Teacher;
import com.mainacad.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    TeacherDAO teacherDAO;

    @Override
    public List<Teacher> findByGroupAndStartTimeAfterAndStartTimeBefore(Group group, LocalDateTime from, LocalDateTime to) {
        return teacherDAO.findByGroupAndStartTimeAfterAndStartTimeBefore(group, from, to);
    }
}
