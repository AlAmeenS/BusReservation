package com.shoppingcart.Ecart.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shoppingcart.Ecart.model.Authenticate;

@Controller
public class HomeController {
	@Autowired
	UserInfo userInfo;
	@Autowired
	UserInfo userInfo2;
	@Autowired
	UserInfo userInfo3;
	@Autowired
	UserInfo userInfo4;
	
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
    public String viewHome() {
		return "index";
    }
	
	@RequestMapping(value = "/signup", method = RequestMethod.POST, consumes= MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
    public ArrayList<UserInfo> showForm(@RequestBody Authenticate authentiate) {
		ArrayList<UserInfo> userInfoArry = new ArrayList<>();
        System.out.println("Called");
        userInfo.setName(authentiate.getUserName());
        userInfo.setAge(21);
        userInfo.setPrime(false);
        userInfoArry.add(userInfo);
        userInfo2.setName("qwe");
        userInfo2.setAge(27);
        userInfo2.setPrime(false);
        userInfoArry.add(userInfo2);
        userInfo3.setName("errr");
        userInfo3.setAge(27);
        userInfo3.setPrime(true);
        userInfoArry.add(userInfo3);
        userInfo4.setName("345");
        userInfo4.setAge(34568876);
        userInfo4.setPrime(false);
        userInfoArry.add(userInfo4);
        
		return userInfoArry;
    } 
}