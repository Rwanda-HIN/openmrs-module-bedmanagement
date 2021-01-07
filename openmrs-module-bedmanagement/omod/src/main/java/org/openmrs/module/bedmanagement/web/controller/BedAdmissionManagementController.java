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
public class BedAdmissionManagementController extends ParameterizableViewController {
	
	/**
	 *Get beds occupancy per ward
	 * 1.Get bed assignments
	 * 3. Get all beds list per selected/clicked  ward
	 * 
	 */
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		ModelAndView mav = new ModelAndView();	
		
		String wardIdStr = (request.getParameter("wardId") != null
				&& request.getParameter("wardId").trim().compareTo("") != 0)
						? request.getParameter("wardId"): null;						
		if (wardIdStr !=null) {
			//===============To do======================
			/**
			 *Get beds  per ward
			  */
			List<Bed> bedsList = BedUtil.getBedsList();			
			mav.addObject("bedsList", bedsList);						
		}				
		
		
		mav.addObject("wardsList", BedUtil.getWardsList());
		mav.setViewName(getViewName());

		return mav;
	}
	
	
	
	

}
