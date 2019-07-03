package Model;

import java.io.Serializable;
import java.util.Date;

public class FestivalDTO implements Serializable{
	private String FESTIVALNUM;
	private String PRODUCTNUM;
	private String CATEGORYNUM;
	private String FESTIVALADD;
	private String FESTIVALTERM;
	private String FESTIVALINFORM;
	private String FESTIVALKING;
	private String FESTIVALSTARTDATE;
	private String FESTIVALTELL;
	private String FESTIVALFARE;
	private String FESTIVALNAME;
	private String FESTIVALAREA;
	private String FESTIVALIMG;
	private Date festivalFinalDate; 
	private String categoryName;
	
	
	public Date getFestivalFinalDate() {
		return festivalFinalDate;
	}
	public void setFestivalFinalDate(Date festivalFinalDate) {
		this.festivalFinalDate = festivalFinalDate;
	}
	
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getFESTIVALNUM() {
		return FESTIVALNUM;
	}
	public void setFESTIVALNUM(String fESTIVALNUM) {
		FESTIVALNUM = fESTIVALNUM;
	}
	public String getPRODUCTNUM() {
		return PRODUCTNUM;
	}
	public void setPRODUCTNUM(String pRODUCTNUM) {
		PRODUCTNUM = pRODUCTNUM;
	}
	public String getCATEGORYNUM() {
		return CATEGORYNUM;
	}
	public void setCATEGORYNUM(String cATEGORYNUM) {
		CATEGORYNUM = cATEGORYNUM;
	}
	public String getFESTIVALADD() {
		return FESTIVALADD;
	}
	public void setFESTIVALADD(String fESTIVALADD) {
		FESTIVALADD = fESTIVALADD;
	}
	public String getFESTIVALTERM() {
		return FESTIVALTERM;
	}
	public void setFESTIVALTERM(String fESTIVALTERM) {
		FESTIVALTERM = fESTIVALTERM;
	}
	public String getFESTIVALINFORM() {
		return FESTIVALINFORM;
	}
	public void setFESTIVALINFORM(String fESTIVALINFORM) {
		FESTIVALINFORM = fESTIVALINFORM;
	}
	public String getFESTIVALKING() {
		return FESTIVALKING;
	}
	public void setFESTIVALKING(String fESTIVALKING) {
		FESTIVALKING = fESTIVALKING;
	}
	public String getFESTIVALSTARTDATE() {
		return FESTIVALSTARTDATE;
	}
	public void setFESTIVALSTARTDATE(String fESTIVALSTARTDATE) {
		FESTIVALSTARTDATE = fESTIVALSTARTDATE;
	}
	public String getFESTIVALTELL() {
		return FESTIVALTELL;
	}
	public void setFESTIVALTELL(String fESTIVALTELL) {
		FESTIVALTELL = fESTIVALTELL;
	}
	public String getFESTIVALFARE() {
		return FESTIVALFARE;
	}
	public void setFESTIVALFARE(String fESTIVALFARE) {
		FESTIVALFARE = fESTIVALFARE;
	}
	public String getFESTIVALNAME() {
		return FESTIVALNAME;
	}
	public void setFESTIVALNAME(String fESTIVALNAME) {
		FESTIVALNAME = fESTIVALNAME;
	}
	public String getFESTIVALAREA() {
		return FESTIVALAREA;
	}
	public void setFESTIVALAREA(String fESTIVALAREA) {
		FESTIVALAREA = fESTIVALAREA;
	}
	public String getFESTIVALIMG() {
		return FESTIVALIMG;
	}
	public void setFESTIVALIMG(String fESTIVALIMG) {
		FESTIVALIMG = fESTIVALIMG;
	}
	
}
