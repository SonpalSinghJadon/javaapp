package com.gl.course.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gl.course.form.EnrollmentForm;

@Controller
@RequestMapping("/enrollment.htm")
public class AccountManagementController {
	@GetMapping
	public String showEnrollmentForm(Model model) {
		model.addAttribute("enrollmentForm", new EnrollmentForm());
		return "enrollment";
	}

	@PostMapping
	public String postEnrollmentForm(@ModelAttribute("enrollmentForm") EnrollmentForm enrollmentForm,
			BindingResult errors, Model model) {
		model.addAttribute("enrollmentForm", new EnrollmentForm());
		model.addAttribute("emailId", enrollmentForm.getEmailAddress());
		return "success";
	}
}
