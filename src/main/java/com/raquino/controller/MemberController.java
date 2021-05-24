package com.raquino.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.raquino.entity.Member;
import com.raquino.service.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@GetMapping("/list")
	public String listMembers(Model theModel) {
		List < Member > theMembers = memberService.getMembers();
		theModel.addAttribute("members", theMembers);
		return "list-members";
			
	}
	
	@GetMapping("/showForm")
	public String showFormForAdd(Model theModel) {
		Member theMember = new Member();
		theModel.addAttribute("member", theMember);
		return "member-form";
	}
	
	@PostMapping("/saveMember")
	public String saveMember(@ModelAttribute("member") Member theMember) {
		memberService.saveMember(theMember);
		return "redirect:/member/list";
	}
	
	@GetMapping("/updateForm")
	public String showFormForUpdate(@RequestParam("memberId") int theId, Model theModel) {
		Member theMember = memberService.getMember(theId);
		theModel.addAttribute("member", theMember);
		return "member-form";
	}
	
	@GetMapping("/delete")
	public String deleteMember(@RequestParam("memberId") int theId) {
		memberService.deleteMember(theId);
		return "redirect:/member/list";
	}
	
	

}
