package com.hengtiansoft.studentmanager.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hengtiansoft.studentmanager.domain.Student;
import com.hengtiansoft.studentmanager.service.StudentService;
import com.hengtiansoft.studentmanager.mapper.StudentMapper;
import org.springframework.stereotype.Service;

/**
 * @author Kilig
 * @description 针对表【student】的数据库操作Service实现
 * @createDate 2024-07-12 00:33:44
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {

}




