package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.PositionDTO;
import com.rays.form.PositionForm;
import com.rays.service.PositionServiceInt;

@RestController
@RequestMapping(value = "Position")
public class PositionCtl  extends BaseCtl<PositionForm, PositionDTO, PositionServiceInt>{

}
