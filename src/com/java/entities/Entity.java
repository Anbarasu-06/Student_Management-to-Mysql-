package com.java.entities;

public class Entity {
	
	private int ID;
	private String NAME;
	private String EMAIL;
	private String COURSE;
	
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public String getEMAIL() {
		return EMAIL;
	}
	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}
	public String getCOURSE() {
		return COURSE;
	}
	public void setCOURSE(String cOURSE) {
		COURSE = cOURSE;
	}
	
	
	@Override
	public String toString() {
		return "ID=" + ID + ", NAME=" + NAME + ", EMAIL=" + EMAIL + ", COURSE=" + COURSE + "";
	}
	
	
	

}
