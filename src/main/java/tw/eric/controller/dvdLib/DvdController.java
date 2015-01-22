package tw.eric.controller.dvdLib;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import tw.eric.domain.Director;
import tw.eric.domain.Dvd;
import tw.eric.service.DvdService;

@Controller
public class DvdController {

	@Autowired
	private DvdService dvdService;

	@RequestMapping("/dvd/list")
	public String list(Model m) {
		System.out.println("list");
		m.addAttribute("dvds", dvdService.getDvds());
		return "list";
	}

	@RequestMapping("/dvd/add")
	public String add(@RequestParam("title") String title,
			@RequestParam("year") Integer year,
			@RequestParam("duration") Integer duration,
			@RequestParam("director") String director, Model m) {
		System.out.println("add");
		Dvd dvd = new Dvd("eric", 1987, 20, new Director("ERIC"));
		dvdService.addDvd(dvd);
		m.addAttribute("dvd", dvd);
		return "success";
	}
}
