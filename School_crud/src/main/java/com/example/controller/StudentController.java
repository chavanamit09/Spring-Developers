package com.example.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Student;
import com.example.repository.StudentRepository;
@RestController
public class StudentController {
@Autowired
StudentRepository st;

@GetMapping("/studentget")      
public Student getStud(@RequestParam int id) {
	Optional<Student> s=st.findById(id);
	return s.get();                                     //return student type object
}

@PostMapping("/studentpost")
public String postStud(@RequestBody Student s) {
	st.save(s);                                         //value inserted in database
	return "done";
}

@PutMapping("/studentput")                                
public String putStud(@RequestBody Student s) {
	st.save(s);                                          // value Updated 
	return "done";
}
@DeleteMapping("/studentdelete")
public String deleteStud(@RequestParam int id) {
	st.deleteById(id);                                    //value deleted
	return "done";
}

}
