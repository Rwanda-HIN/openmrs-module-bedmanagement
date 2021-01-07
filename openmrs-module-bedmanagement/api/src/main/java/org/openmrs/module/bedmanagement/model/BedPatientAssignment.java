/**
 * 
 */
package org.openmrs.module.bedmanagement.model;

import java.util.Date;

import org.openmrs.Encounter;
import org.openmrs.Patient;

/**
 * @author Faustin
 *
 */
public class BedPatientAssignment {
	
private Integer id;
	
	private Bed bed;
	
	private Patient patient;
	
	private Date startDatetime;
	
	private Date endDatetime;
	
	private Encounter encounter;

}
