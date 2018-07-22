package com.exec.o2o.web.superAdmin;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.exec.o2o.entity.Area;
import com.exec.o2o.service.AreaService;

@Controller
@RequestMapping("/superadmin")
public class AreaController {
	@Autowired
	private AreaService areaService; 
	@RequestMapping(value="/listarea" ,method=RequestMethod.GET)
	@ResponseBody 
	private Map<String , Object> listArea(){
		Map<String, Object> modelMap =new HashMap<>();
		List<Area> list= new ArrayList<>();
		try {
			list = areaService.getAreaList();
			modelMap.put("rows", list);
			modelMap.put("total", list.size());
		} catch (Exception e) {
			e.printStackTrace();
			//错误的信息状态值设置为false
			modelMap.put("success", false);
			modelMap.put("errMsg",e.toString());
			
		}
		
		return modelMap;
	}
}