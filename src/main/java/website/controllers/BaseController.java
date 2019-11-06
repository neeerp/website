package website.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController
{

	@RequestMapping("/")
	public String index()
	{
		return "It aint much, but it doesn't 404!";
	}
}
