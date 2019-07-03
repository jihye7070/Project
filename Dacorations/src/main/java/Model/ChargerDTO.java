package Model;

import java.io.Serializable;

public class ChargerDTO implements Serializable{
	
	/*
	CHARGE_NUM	NUMBER	NOT NULL,	--담당자번호
	CHARGE_ID	VARCHAR2(15)	NOT NULL,	--담당자아이디
	CHARGE_PW	VARCHAR2(25)	NOT NULL,	--담당자비밀번호
	CHARGE_TELL	VARCHAR2(12)	NOT NULL	--담당자휴대폰번호
	 */
	
	
	private int chargeNum;
	private String chargeId;
	private String chargePw;
	private String chargeTell;
	
	public ChargerDTO() {};
	public ChargerDTO(int chargeNum, String chargeId, String chargePw, String chargeTell) {
		super();
		this.chargeNum = chargeNum;
		this.chargeId = chargeId;
		this.chargePw = chargePw;
		this.chargeTell = chargeTell;
	}

	public int getChargeNum() {
		return chargeNum;
	}

	public void setChargeNum(int chargeNum) {
		this.chargeNum = chargeNum;
	}

	public String getChargeId() {
		return chargeId;
	}

	public void setChargeId(String chargeId) {
		this.chargeId = chargeId;
	}

	public String getChargePw() {
		return chargePw;
	}

	public void setChargePw(String chargePw) {
		this.chargePw = chargePw;
	}

	public String getChargeTell() {
		return chargeTell;
	}

	public void setChargeTell(String chargeTell) {
		this.chargeTell = chargeTell;
	}
	
	
	

}
