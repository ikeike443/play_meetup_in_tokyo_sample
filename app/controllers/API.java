package controllers;

import java.util.List;

import models.User;
import play.mvc.Controller;

public class API extends Controller {
	public static void user(String name){
		List<User> rt = name!=null? User.find("byName", name).<User>fetch() : User.<User>findAll();
		
		renderJSON(rt);
	}
}
