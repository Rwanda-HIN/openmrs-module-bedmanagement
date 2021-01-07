/**
 * 
 */
package org.openmrs.module.bedmanagement.model;

import java.util.Date;
import org.openmrs.User;

/**
 * @author Faustin
 *
 */
public class Bed {

	private Integer bedId;

	private String bedNumber;	
	private Ward ward;	
	private boolean voided;
	private Date voidedDate;
	private String voidedReason;
	private User voidedBy;
	
	private Date createdDate;
	private Date changedDate;
	private User creator;
	private User changedBy;
	
	/**
	 * @param bedNumber
	 * @param ward
	 */
	public Bed(String bedNumber, Ward ward,Date createdDate) {
	
		this.bedNumber = bedNumber;
		this.ward = ward;
		this.createdDate=createdDate;
	}
	/**
	 * @return the bedId
	 */
	public Integer getBedId() {
		return bedId;
	}
	/**
	 * @param bedId the bedId to set
	 */
	public void setBedId(Integer bedId) {
		this.bedId = bedId;
	}
	/**
	 * @return the bedNumber
	 */
	public String getBedNumber() {
		return bedNumber;
	}
	/**
	 * @param bedNumber the bedNumber to set
	 */
	public void setBedNumber(String bedNumber) {
		this.bedNumber = bedNumber;
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
	 * @return the voided
	 */
	public boolean isVoided() {
		return voided;
	}
	/**
	 * @param voided the voided to set
	 */
	public void setVoided(boolean voided) {
		this.voided = voided;
	}
	/**
	 * @return the voidedDate
	 */
	public Date getVoidedDate() {
		return voidedDate;
	}
	/**
	 * @param voidedDate the voidedDate to set
	 */
	public void setVoidedDate(Date voidedDate) {
		this.voidedDate = voidedDate;
	}
	/**
	 * @return the voidedReason
	 */
	public String getVoidedReason() {
		return voidedReason;
	}
	/**
	 * @param voidedReason the voidedReason to set
	 */
	public void setVoidedReason(String voidedReason) {
		this.voidedReason = voidedReason;
	}
	/**
	 * @return the voidedBy
	 */
	public User getVoidedBy() {
		return voidedBy;
	}
	/**
	 * @param voidedBy the voidedBy to set
	 */
	public void setVoidedBy(User voidedBy) {
		this.voidedBy = voidedBy;
	}
	/**
	 * @return the createdDate
	 */
	public Date getCreatedDate() {
		return createdDate;
	}
	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	/**
	 * @return the changedDate
	 */
	public Date getChangedDate() {
		return changedDate;
	}
	/**
	 * @param changedDate the changedDate to set
	 */
	public void setChangedDate(Date changedDate) {
		this.changedDate = changedDate;
	}
	/**
	 * @return the creator
	 */
	public User getCreator() {
		return creator;
	}
	/**
	 * @param creator the creator to set
	 */
	public void setCreator(User creator) {
		this.creator = creator;
	}
	/**
	 * @return the changedBy
	 */
	public User getChangedBy() {
		return changedBy;
	}
	/**
	 * @param changedBy the changedBy to set
	 */
	public void setChangedBy(User changedBy) {
		this.changedBy = changedBy;
	}
	

}
