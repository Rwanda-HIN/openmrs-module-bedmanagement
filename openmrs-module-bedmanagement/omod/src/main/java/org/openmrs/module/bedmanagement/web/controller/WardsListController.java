/**
 * 
 */
package org.openmrs.module.bedmanagement.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.openmrs.module.bedmanagement.utils.BedUtil;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.ParameterizableViewController;

/**
 * @author Faustin
 *
 */
public class WardsListController extends ParameterizableViewController {
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {		
		ModelAndView mav = new ModelAndView();
		
		
		mav.addObject("wardsList",BedUtil.getWardsList());
		mav.setViewName(getViewName());	
		
		
		return mav;
		
	}
	
}
