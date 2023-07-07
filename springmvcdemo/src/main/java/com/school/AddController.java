package com.school;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {

	ModelAndView mv = new ModelAndView();
	@RequestMapping("/addname")
	public ModelAndView add(@RequestParam("firstname") String fname, @RequestParam("lastname") String lname){
		String fullname = fname + " " + lname;
		mv.setViewName("display.jsp");
		mv.addObject("fullname", fullname);
		return mv;
	}
	
	/* Save Data*/
	@RequestMapping(value = "addForm")
	private ModelAndView showForm() {
		mv.setViewName("form-input");
		return mv;
	}
	@RequestMapping(value = "savedata", method = RequestMethod.GET)
	private ModelAndView savedata(HttpServletRequest request, HttpServletResponse response) {
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String gender = request.getParameter("gender");
		String[] vehicle = request.getParameterValues("vehicle");
		String cars = request.getParameter("cars");
		
		List<String> list = new ArrayList<String>();
		list.add(fname);
		list.add(lname);
		list.add(gender);
		for (int i = 0; i < vehicle.length; i++) {
			list.add(vehicle[i]);
		}
		list.add(cars);
		
		mv.setViewName("list-data");
		mv.addObject("lists", list);
		
		return mv;
	}
	
}


















