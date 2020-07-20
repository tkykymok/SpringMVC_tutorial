package in.bushansirgur.springmybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmployeeController {

	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String index() {

		return "list-employees";

	}

}
