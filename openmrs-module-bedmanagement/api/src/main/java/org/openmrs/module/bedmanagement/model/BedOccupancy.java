/**
 * 
 */
package org.openmrs.module.bedmanagement.model;

/**
 * @author Faustin
 *
 */
public class BedOccupancy {
	
	private Ward ward;
	private int countFreeBeds;	
	private int countBusyBeds;
	private int totalBeds;
	/**
	 * @param ward
	 * @param countFreeBeds
	 * @param countBusyBeds
	 */
	public BedOccupancy(Ward ward, int countFreeBeds, int countBusyBeds,int totalBeds) {
	
		this.ward = ward;
		this.countFreeBeds = countFreeBeds;
		this.countBusyBeds = countBusyBeds;
		this.totalBeds =totalBeds;
	}
	/**
	 * @return the ward
	 */
	public Ward getWard() {
		return ward;
	}
	/**
	 * @param ward the ward to set
	 */
	public void setWard(Ward ward) {
		this.ward = ward;
	}
	/**
	 * @return the countFreeBeds
	 */
	public int getCountFreeBeds() {
		return countFreeBeds;
	}
	/**
	 * @param countFreeBeds the countFreeBeds to set
	 */
	public void setCountFreeBeds(int countFreeBeds) {
		this.countFreeBeds = countFreeBeds;
	}
	/**
	 * @return the totalBeds
	 */
	public int getTotalBeds() {
		return totalBeds;
	}
	/**
	 * @param totalBeds the totalBeds to set
	 */
	public void setTotalBeds(int totalBeds) {
		this.totalBeds = totalBeds;
	}
	/**
	 * @return the countBusyBeds
	 */
	public int getCountBusyBeds() {
		return countBusyBeds;
	}
	/**
	 * @param countBusyBeds the countBusyBeds to set
	 */
	public void setCountBusyBeds(int countBusyBeds) {
		this.countBusyBeds = countBusyBeds;
	}
}
