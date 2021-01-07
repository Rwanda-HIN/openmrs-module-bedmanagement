package org.openmrs.module.bedmanagement.model;

import java.util.Date;
import java.util.List;

import org.openmrs.User;

public class Ward {
	
	private int wardId ;	
	private String wardName;
	private String description;
	private boolean voided;
	private Date voidedDate;
	private String voidedReason;
	private User voidedBy;
	
	private Date createdDate;
	private Date changedDate;
	private User creator;
	private User changedBy;	
	private List<Bed> bedsList;
	
	/**
	 * @param wardName
	 * @param createdDate
	 */
	public Ward(String wardName, String description, Date createdDate) {
		
		this.wardName = wardName;
		this.createdDate = createdDate;
		this.description=description;
	}
	/**
	 * @return the wardId
	 */
	public int getWardId() {
		return wardId;
	}
	/**
	 * @param wardId the wardId to set
	 */
	public void setWardId(int wardId) {
		this.wardId = wardId;
	}
	/**
	 * @return the wardName
	 */
	public String getWardName() {
		return wardName;
	}
	/**
	 * @param wardName the wardName to set
	 */
	public void setWardName(String wardName) {
		this.wardName = wardName;
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
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
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
	 * @return the bedsList
	 */
	public List<Bed> getBedsList() {
		return bedsList;
	}
	/**
	 * @param bedsList the bedsList to set
	 */
	public void setBedsList(List<Bed> bedsList) {
		this.bedsList = bedsList;
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
