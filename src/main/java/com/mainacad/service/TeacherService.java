package com.mainacad.service;

import com.mainacad.entity.Group;
import com.mainacad.entity.Teacher;

import java.time.LocalDateTime;
import java.util.List;

public interface TeacherService {

    List<Teacher> findByGroupAndStartTimeAfterAndStartTimeBefore(Group group, LocalDateTime from, LocalDateTime to);

}
