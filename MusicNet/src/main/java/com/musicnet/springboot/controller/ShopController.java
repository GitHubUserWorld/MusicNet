package com.musicnet.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.musicnet.springboot.model.ChargeRequest;
import com.musicnet.springboot.model.Course;
import com.musicnet.springboot.model.ChargeRequest.Currency;
import com.musicnet.springboot.repository.CourseRepository;
import com.musicnet.springboot.service.StripeService;
import com.stripe.exception.StripeException;
import com.stripe.model.Charge;


//@GetMapping("/shop")
	//public String getClassroom(Model model) {
	//	model.addAttribute("title", "Tienda");
	//	return "shop";
	//}

	@Controller
	public class ShopController {
	 
	    //@Value("${STRIPE_PUBLIC_KEY}")
	    private String stripePublicKey = "pk_test_51Gs5e0Fa9TRbJ1I5LcKSPxd87tUlkLQ8K77RlUMEDFihjPHZqB42hvLbXMPpwGzw9hL0k5Jd5HPcRJ4IsKEkC0Mq00mYlE46ct";
	 
	    @Autowired
	    private StripeService paymentsService;
	    @Autowired
		private CourseRepository courseRepository;
	    
	    @RequestMapping("/shop")
	    public String checkout(Model model) {
	    	List<Course> listCourses = courseRepository.findAll();
	    	model.addAttribute("title", "Tienda");
	        model.addAttribute("amount", 50 * 100); // in cents
	        model.addAttribute("stripePublicKey", stripePublicKey);
	        model.addAttribute("currency", ChargeRequest.Currency.EUR);
	        model.addAttribute("courses", listCourses);
	        return "shop";
	    }
	    
	    @PostMapping("/charge")
	    public String charge(String id, ChargeRequest chargeRequest, Model model)
	      throws StripeException {
	        chargeRequest.setDescription("Example charge");
	        chargeRequest.setCurrency(Currency.EUR);
	        Charge charge = paymentsService.charge(chargeRequest);
	        model.addAttribute("title", "Tienda");
	        model.addAttribute("id", charge.getId());
	        model.addAttribute("status", charge.getStatus());
	        model.addAttribute("chargeId", charge.getId());
	        model.addAttribute("balance_transaction", charge.getBalanceTransaction());
	        model.addAttribute("courseId", id);
	        return "result";
	    }
	 
	    @ExceptionHandler(StripeException.class)
	    public String handleError(Model model, StripeException ex) {
	        model.addAttribute("error", ex.getMessage());
	        return "result";
	    }
	    
	}