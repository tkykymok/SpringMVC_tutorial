package in.bushansirgur.springmybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import in.bushansirgur.springmybatis.dao.EmployeeMapper;
import in.bushansirgur.springmybatis.entity.Employee;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeMapper mapper;

	@RequestMapping(path = "/", method = RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView("list-employees");
		mav.addObject("listemployees", mapper.getAllEmployees());
		return mav;
	}

	@RequestMapping("showFormForAddEmployee")
	public ModelAndView showForm() {
		ModelAndView mav = new ModelAndView("add-employee");
		mav.addObject("employee", new Employee());
		return mav;
	}

	@RequestMapping("/saveProcess")
	public String saveProcess(@ModelAttribute("employee") Employee employee) {
		
		mapper.saveEmployee(employee);
		return "redirect:/";
	}
}
