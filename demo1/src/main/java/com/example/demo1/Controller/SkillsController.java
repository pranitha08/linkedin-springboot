package com.example.demo1.Controller;

import com.example.demo1.Services.SkillsServices;
import com.example.demo1.entity.Skills;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/skills")
public class SkillsController {
    @Autowired
    SkillsServices skillTypeServices;

    @GetMapping(value = "/{id}")
    public Skills getById(@PathVariable Integer id) {
        return skillTypeServices.getById(id);
    }

    @PostMapping("/post/{id}")
    public Skills createSkillType(@PathVariable Integer id,@RequestBody Skills skillType){
        return skillTypeServices.createSkillType(id,skillType);
    }


    @DeleteMapping("/{id}")
    public void deleteSkillType(@PathVariable Integer id) {
        skillTypeServices.deleteSkillType(id);
    }
}
