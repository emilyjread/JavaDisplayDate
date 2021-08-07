package com.example.displaydate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class MainController {
	

	
	@RequestMapping("/")
	public String index(Model model) {
		return "index.jsp";
		
	}
	

	@RequestMapping("/date")
	
	public String date(Model model) {
		Date d= new Date();
		
		SimpleDateFormat dayofweekformat = new SimpleDateFormat("EEEE");
		String dayofweek = dayofweekformat.format(d);
		
		SimpleDateFormat dayformat = new SimpleDateFormat("dd");
		String day = dayformat.format(new Date());
		
		SimpleDateFormat monthformat = new SimpleDateFormat("MMMM");
		String monthyear = monthformat.format(d);
		
		SimpleDateFormat yearformat = new SimpleDateFormat("yyyy");
		String year = yearformat.format(d);
		
		
		model.addAttribute("dayofweek", dayofweek);
		model.addAttribute("day", day);
		model.addAttribute("month", monthyear);
		model.addAttribute("year", year);
		
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	
	public String time(Model model) {
		Date d= new Date();
		
		SimpleDateFormat timeformat = new SimpleDateFormat("hh:mm aa");
		String time = timeformat.format(d);
		
		
		model.addAttribute("time", time);

		return "time.jsp";
		
	}
	

}
