package list.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import list.service.ListService;

@Controller
@RequestMapping(value="/board/*")
public class ListController {
	
	@Resource
	private ListService listService;
	
	@RequestMapping( value="list", method=RequestMethod.GET )
	@ResponseBody
	public JSONObject list( 
			HttpServletRequest request, 
			HttpServletResponse responose, 
			@RequestParam("type") String type ){
		
		JSONObject 	respObj = new JSONObject();
		List<List> list 	= new ArrayList<List>(); 
		
		if( "js".equals(type) ){
			list = listService.retrieveJsList(); 
		}
		
		respObj.put("code", 200);
		respObj.put("list", list);
		
		return respObj;
	}
}
