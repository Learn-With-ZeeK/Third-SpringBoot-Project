package net.javaguides.springboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {
	
	@GetMapping("/itteration")
	public String boottstrap(Model model) {
	List<Employees> employees= new ArrayList();
	
	employees.add(new Employees("Harry","Potter","harry@gmail.com"));
	employees.add(new Employees("Lily","Flower","lily@gmail.com"));
	employees.add(new Employees("James","Riddle","jamey@gmail.com"));
	employees.add(new Employees("Severus","Snape","love@gmail.com"));
	employees.add(new Employees("Naruto","Uzumaki","hokage@gmail.com"));
	
	model.addAttribute("employees", employees);
	return "itteration";
	}
}
