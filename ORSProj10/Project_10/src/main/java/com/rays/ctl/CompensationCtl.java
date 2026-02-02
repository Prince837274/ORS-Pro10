package com.rays.ctl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.CompensationDTO;
import com.rays.form.CompensationForm;
import com.rays.service.CompensationServiceInt;

@RestController
@RequestMapping(value = "Compensation")
public class CompensationCtl  extends BaseCtl<CompensationForm, CompensationDTO, CompensationServiceInt>{

	@GetMapping("/preload")
	public ORSResponse preload() {
		System.out.println("inside preload Rahul");
		ORSResponse res = new ORSResponse(true);
		
		return res;
	}
}
