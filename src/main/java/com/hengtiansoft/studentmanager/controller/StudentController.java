package com.hengtiansoft.studentmanager.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hengtiansoft.studentmanager.R.R;
import com.hengtiansoft.studentmanager.domain.Student;
import com.hengtiansoft.studentmanager.service.StudentService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: Logan
 * @CreateTime: 2024/7/10 22:31
 * @Description:
 */

@RestController
@RequestMapping("student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/{id}")
    @Operation(summary = "根据id查询某一学生信息")
    public R getStudent(@PathVariable int id) {
        return R.ok().data("data", studentService.getById(id));
    }

    @GetMapping
    @Operation(summary = "分页查询所有学生")
    public R getStudents(@RequestParam int current, @RequestParam int size) {
        Page page = studentService.page(new Page(current, size));
        return R.ok().data("page", page);
    }

    @PostMapping
    @Operation(summary = "新增学生")
    public R addStudent(@RequestBody Student student) {
        if (studentService.save(student)) {
            return R.ok();
        }
        return R.error().message("新增学生失败");
    }
}
