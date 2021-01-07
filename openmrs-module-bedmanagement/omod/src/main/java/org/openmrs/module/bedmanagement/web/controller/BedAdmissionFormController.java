/**
 * 
 */
package org.openmrs.module.bedmanagement.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.openmrs.Patient;
import org.openmrs.api.context.Context;
import org.openmrs.module.bedmanagement.model.Bed;
import org.openmrs.module.bedmanagement.utils.BedUtil;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.ParameterizableViewController;

/**
 * @author Faustin
 *
 */
public class BedAdmissionFormController extends ParameterizableViewController {
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		ModelAndView mav = new ModelAndView();
		
		String patientIdStr = (request.getParameter("patientId") != null
				&& request.getParameter("patientId").trim().compareTo("") != 0)
						? request.getParameter("patientId"): null;	
						
		if (patientIdStr !=null) {
			
			Patient patient = Context.getPatientService().getPatient(Integer.valueOf(patientIdStr));
			mav.addObject("patient", patient);
			List<Bed> bedsList = BedUtil.getBedsList();			
			mav.addObject("bedsList", bedsList);
					
		}						
		
		mav.setViewName(getViewName());
		
		
		return mav;
		
		
		
	}

}
