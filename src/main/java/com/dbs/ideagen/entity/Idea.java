package com.dbs.ideagen.entity;
import java.io.Serializable;
/*
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;*/
//@Entity
//@Table(name="ideas")
public class Idea implements Serializable { 
	private static final long serialVersionUID = 1L;
	//@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	//@Column(name="idea_id")
    private int ideaId;  
	//@Column(name="problemStatement")
    private String problemStatement;
  //@Column(name="solutionProposed")	
  	private String solutionProposed;
  //@Column(name="highLevelDesign")
    private String highLevelDesign;
  //@Column(name="skillsRequired")	
  	private String skillsRequired;
  //@Column(name="toolRequired")
    private String toolRequired;
  //@Column(name="dependencies")	
  	private String dependencies;
  //@Column(name="benefitAndImpact")
    private String benefitAndImpact;
  //@Column(name="priority")	
  	private String priority;
  //@Column(name="manualEffortSpent")
    private String manualEffortSpent;
  //@Column(name="performedFrequency")	
  	private String performedFrequency;
  //@Column(name="executions")
    private String executions;
  //@Column(name="totalHoursPerMonth")	
  	private String totalHoursPerMonth;
  //@Column(name="smeContactPhone")
    private String smeContactPhone;
  //@Column(name="smeContactMail")	
  	private String smeContactMail;  
  	
	public String getHighLevelDesign() {
		return highLevelDesign;
	}
	public void setHighLevelDesign(String highLevelDesign) {
		this.highLevelDesign = highLevelDesign;
	}
	public String getSkillsRequired() {
		return skillsRequired;
	}
	public void setSkillsRequired(String skillsRequired) {
		this.skillsRequired = skillsRequired;
	}
	public String getToolRequired() {
		return toolRequired;
	}
	public void setToolRequired(String toolRequired) {
		this.toolRequired = toolRequired;
	}
	public String getDependencies() {
		return dependencies;
	}
	public void setDependencies(String dependencies) {
		this.dependencies = dependencies;
	}
	public String getBenefitAndImpact() {
		return benefitAndImpact;
	}
	public void setBenefitAndImpact(String benefitAndImpact) {
		this.benefitAndImpact = benefitAndImpact;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getManualEffortSpent() {
		return manualEffortSpent;
	}
	public void setManualEffortSpent(String manualEffortSpent) {
		this.manualEffortSpent = manualEffortSpent;
	}
	public String getPerformedFrequency() {
		return performedFrequency;
	}
	public void setPerformedFrequency(String performedFrequency) {
		this.performedFrequency = performedFrequency;
	}
	public String getExecutions() {
		return executions;
	}
	public void setExecutions(String executions) {
		this.executions = executions;
	}
	public String getTotalHoursPerMonth() {
		return totalHoursPerMonth;
	}
	public void setTotalHoursPerMonth(String totalHoursPerMonth) {
		this.totalHoursPerMonth = totalHoursPerMonth;
	}
	public String getSmeContactPhone() {
		return smeContactPhone;
	}
	public void setSmeContactPhone(String smeContactPhone) {
		this.smeContactPhone = smeContactPhone;
	}
	public String getSmeContactMail() {
		return smeContactMail;
	}
	public void setSmeContactMail(String smeContactMail) {
		this.smeContactMail = smeContactMail;
	}
	public String getProblemStatement() {
		return problemStatement;
	}
	public void setProblemStatement(String problemStatement) {
		this.problemStatement = problemStatement;
	}
	public String getSolutionProposed() {
		return solutionProposed;
	}
	public void setSolutionProposed(String solutionProposed) {
		this.solutionProposed = solutionProposed;
	}	
	public int getIdeaId() {
		return ideaId;
	}
	public void setIdeaId(int ideaId) {
		this.ideaId = ideaId;
	}	
} 