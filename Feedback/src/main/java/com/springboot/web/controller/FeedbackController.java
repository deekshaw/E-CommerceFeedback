package com.springboot.web.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.springboot.web.model.Feedback;
import com.springboot.web.service.FeedbackService;
import com.springboot.web.service.LoginService;

@Controller
@SessionAttributes("name")
public class FeedbackController {
	
	@Autowired
	FeedbackService service;
				
	@RequestMapping(value = "/listFeedback", method = RequestMethod.GET)
	public String listFeedback(ModelMap model) {
		String name = (String) model.get("name");
		model.put("feedbacks", service.displayFeedback(name));
		return "listFeedback";
	}
	
	@RequestMapping(value = "/feedback", method = RequestMethod.GET)
	public String addFeedback(ModelMap model) {		
		model.addAttribute("feedback", new Feedback(0, (String) model.get("name"), (String) model.get("uemail"), (String) model.get("productPurchased"), (String) model.get("feedback"), (String) model.get("recommend") ));
		return "feedback";
	}
	
	@RequestMapping(value = "/delete-feedback", method = RequestMethod.GET)
	public String deleteFeedback(@RequestParam int id) {
		service.deleteFeedback(id);
		return "redirect:/listFeedback";
	}
	
	@RequestMapping(value = "/update-feedback", method = RequestMethod.GET)
	public String updateFeedback(@RequestParam int id, ModelMap model) {
		Feedback feedback = service.retrieveFeedback(id);
		model.put("feedback", feedback);
		return "feedback";
	}
	
	@RequestMapping(value = "/update-feedback", method = RequestMethod.POST)
	public String updateTodo(ModelMap model, @Valid Feedback feedback,
			BindingResult result) {
		if (result.hasErrors()) {
			return "feedback";
		}
		feedback.setUname((String) model.get("name"));
		service.updateFeedback(feedback);
		return "redirect:/listFeedback";
	}

		
		@RequestMapping(value = "/feedback", method = RequestMethod.POST)
		public String addTodo(ModelMap model, @Valid Feedback feedback, BindingResult result) {

			if (result.hasErrors()) {
				return "feedback";
			}

			service.addFeedback((String) model.get("name"), feedback.getUemail(), feedback.getProductPurchased(),
					feedback.getFeedback(),  feedback.getRecommend());
			return "redirect:/listFeedback";
		
	
	}
}


