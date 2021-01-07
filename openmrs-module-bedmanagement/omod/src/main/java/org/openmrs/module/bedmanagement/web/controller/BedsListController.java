/**
 * 
 */
package org.openmrs.module.bedmanagement.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.openmrs.module.bedmanagement.model.Bed;
import org.openmrs.module.bedmanagement.utils.BedUtil;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.ParameterizableViewController;

/**
 * @author Faustin
 *
 */
public class BedsListController extends ParameterizableViewController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		ModelAndView mav = new ModelAndView();
		List<Bed> bedsList = BedUtil.getBedsList();
		
		mav.addObject("bedsList", bedsList);
		mav.setViewName(getViewName());

		return mav;

	}

}
