 package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.bean.Student;
import com.example.repo.StudentRepo;

@Controller
public class MainController 
{
	private final StudentRepo srepo;

	public MainController(StudentRepo srepo) 
	{
		this.srepo = srepo;
	}
															//Goto Index Page
	@GetMapping("/")
	public String view()
	{
		return "index";
	}
															//Goto Insert Page
	@GetMapping("/insert")
	public String view1(Student student)
	{
		return "insertPage";
	}
															//Save Student Record
	@PostMapping("/add")
	public String view2(Student stud , Model m)
	{
		srepo.save(stud);
		m.addAttribute("msg", "Record insert successfully...");
		return "insertPage";
	}
															//Display Student All Record
	@GetMapping("/display")
	public String view3(Model m)
	{
		List list = srepo.findAll();
		if(!list.isEmpty())
		{
			m.addAttribute("data", list);
		}
		else {
			m.addAttribute("msg", "Oops! record not found");
		}
		return "displayPage";
	}
															//Goto Update Page
	@GetMapping("/edit/{id}")
	public String view4(@PathVariable("id") Optional<Long> id, Model m)
	{
		if(id.isPresent())
		{
			Student student = srepo.getOne(id.get());
			m.addAttribute("edata", student);
		}
		else {
			m.addAttribute("edata", new Student());
		}
		return "updatePage";
	}
															//Update Student Record
	@PostMapping("/update/{id}")
	public String view5(Student stud, Model m)
	{
		srepo.save(stud);
		m.addAttribute("data",srepo.findAll());
		m.addAttribute("msg", "Update successfully");
		return "displayPage";
	}
															//Delete Student Record
	@GetMapping("/delete/{id}")
	public String view6(@PathVariable("id") Long id, Model m)
	{
		srepo.deleteById(id);
		m.addAttribute("data", srepo.findAll());
		m.addAttribute("msg", "Delete successfully...");
		return "displayPage";
	}
}
