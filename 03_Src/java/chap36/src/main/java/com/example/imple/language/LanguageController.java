package com.example.imple.language;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.imple.language.mapper.LanguageMapper;
import com.example.standard.controller.StandardController;

@Controller
@RequestMapping("/language")
public class LanguageController implements StandardController{
	@Autowired
	LanguageMapper languageMapper;

	@Override
	public void list(Model model) {
		var list = languageMapper.
		
	}
	
	
}
