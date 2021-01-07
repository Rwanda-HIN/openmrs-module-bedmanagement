/**
 * 
 */
package org.openmrs.module.bedmanagement.web.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.openmrs.module.bedmanagement.model.BedOccupancy;
import org.openmrs.module.bedmanagement.model.Ward;
import org.openmrs.module.bedmanagement.utils.BedUtil;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.ParameterizableViewController;

/**
 * @author Faustin
 *
 */
public class BedOccupancyReportController extends ParameterizableViewController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		ModelAndView mav = new ModelAndView();

		List<Ward> wardsList = BedUtil.getWardsList();

		List<BedOccupancy> bedsOcccupancies = new ArrayList<BedOccupancy>();

		for (Ward ward : wardsList) {
			BedOccupancy bOccupancy = new BedOccupancy(ward, 12, 20, 12 + 20);
			bedsOcccupancies.add(bOccupancy);

		}

		mav.addObject("bedOccupancies", bedsOcccupancies);
		mav.setViewName(getViewName());
		return mav;
	}

}
