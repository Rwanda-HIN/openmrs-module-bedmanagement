/**
 * 
 */
package org.openmrs.module.bedmanagement.utils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openmrs.module.bedmanagement.model.Bed;
import org.openmrs.module.bedmanagement.model.BedOccupancy;
import org.openmrs.module.bedmanagement.model.Ward;

/**
 * @author Faustin
 *
 */
public class BedUtil {

	public static List<Ward> getWardsList() {
		ArrayList<Ward> wardList = new ArrayList<Ward>();
		wardList.add(new Ward("Internal Medecine", "Internal Medecine", new Date()));
		wardList.add(new Ward("Surgery ", "Surgery", new Date()));
		wardList.add(new Ward("Pediatric ", "Pediatric", new Date()));

		return wardList;

	}

	public static List<Bed> getBedsList() {

		ArrayList<Bed> bedsList = new ArrayList<Bed>();
		Ward ward = new Ward("A General ward ", "A General ward ", new Date());
		bedsList.add(new Bed("001", ward, new Date()));
		bedsList.add(new Bed("002", ward, new Date()));
		bedsList.add(new Bed("003", ward, new Date()));
		bedsList.add(new Bed("004", ward, new Date()));
		bedsList.add(new Bed("005", ward, new Date()));
		bedsList.add(new Bed("006", ward, new Date()));
		return bedsList;

	}
	

}
