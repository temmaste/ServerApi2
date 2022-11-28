package com.model;
// Generated Nov 29, 2022 12:51:20 AM by Hibernate Tools 4.3.5.Final

/**
 * TruyenNdId generated by hbm2java
 */
public class TruyenNdId implements java.io.Serializable {

	private int matruyen;
	private int mand;

	public TruyenNdId() {
	}

	public TruyenNdId(int matruyen, int mand) {
		this.matruyen = matruyen;
		this.mand = mand;
	}

	public int getMatruyen() {
		return this.matruyen;
	}

	public void setMatruyen(int matruyen) {
		this.matruyen = matruyen;
	}

	public int getMand() {
		return this.mand;
	}

	public void setMand(int mand) {
		this.mand = mand;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TruyenNdId))
			return false;
		TruyenNdId castOther = (TruyenNdId) other;

		return (this.getMatruyen() == castOther.getMatruyen()) && (this.getMand() == castOther.getMand());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getMatruyen();
		result = 37 * result + this.getMand();
		return result;
	}

}
