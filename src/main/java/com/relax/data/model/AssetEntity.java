package com.relax.data.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name="asset")
public class AssetEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Integer id;
	
	@Column(name = "portfolio")
	private String portFolio;
	
	@Column(name="asset_ref")
	private String assetRef;
	
	@Column(name="asset_address")
	private String assetAddress;
	
	@Column(name="asset_zipcode")
	private String assetZipCode;
	
	@Column(name="asset_city")
	private String assetCity;
	
	@Column(name="asset_is_restricted", columnDefinition = "TINYINT")
	@Type(type = "org.hibernate.type.NumericBooleanType")
	private Boolean assetResticted;
	
	@Column(name="asset_yoc")
	private Integer assetYoc;
	
	@Column(name="unit_ref")
	private String unitRef;
	
	@Column(name="unit_size")
	private Integer unitSize;
	
	@Column(name="unit_is_rented", columnDefinition = "TINYINT")
	@Type(type = "org.hibernate.type.NumericBooleanType")
	private Boolean unitRented;
	
	@Column(name="unit_rent")
	private Integer unitRent;
	
	@Column(name="unit_type")
	private String unitType;
	
	@Column(name="unit_tenant")
	private String unitTenant;
	
	@Column(name="unit_lease_start")
	private String unitLeaseStart;
	
	@Column(name="unit_lease_end")
	private String unitLeaseEnd;
	
	@Column(name="data_timestamp")
	private String dataTimeStamp;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPortFolio() {
		return portFolio;
	}

	public void setPortFolio(String portFolio) {
		this.portFolio = portFolio;
	}

	public String getAssetRef() {
		return assetRef;
	}

	public void setAssetRef(String assetRef) {
		this.assetRef = assetRef;
	}

	public String getAssetAddress() {
		return assetAddress;
	}

	public void setAssetAddress(String assetAddress) {
		this.assetAddress = assetAddress;
	}

	public String getAssetZipCode() {
		return assetZipCode;
	}

	public void setAssetZipCode(String assetZipCode) {
		this.assetZipCode = assetZipCode;
	}

	public String getAssetCity() {
		return assetCity;
	}

	public void setAssetCity(String assetCity) {
		this.assetCity = assetCity;
	}

	public Boolean getAssetResticted() {
		return assetResticted;
	}

	public void setAssetResticted(Boolean assetResticted) {
		this.assetResticted = assetResticted;
	}

	public Integer getAssetYoc() {
		return assetYoc;
	}

	public void setAssetYoc(Integer assetYoc) {
		this.assetYoc = assetYoc;
	}

	public String getUnitRef() {
		return unitRef;
	}

	public void setUnitRef(String unitRef) {
		this.unitRef = unitRef;
	}

	public Integer getUnitSize() {
		return unitSize;
	}

	public void setUnitSize(Integer unitSize) {
		this.unitSize = unitSize;
	}

	public Boolean getUnitRented() {
		return unitRented;
	}

	public void setUnitRented(Boolean unitRented) {
		this.unitRented = unitRented;
	}

	public Integer getUnitRent() {
		return unitRent;
	}

	public void setUnitRent(Integer unitRent) {
		this.unitRent = unitRent;
	}

	public String getUnitType() {
		return unitType;
	}

	public void setUnitType(String unitType) {
		this.unitType = unitType;
	}

	public String getUnitTenant() {
		return unitTenant;
	}

	public void setUnitTenant(String unitTenant) {
		this.unitTenant = unitTenant;
	}

	public String getUnitLeaseStart() {
		return unitLeaseStart;
	}

	public void setUnitLeaseStart(String unitLeaseStart) {
		this.unitLeaseStart = unitLeaseStart;
	}

	public String getUnitLeaseEnd() {
		return unitLeaseEnd;
	}

	public void setUnitLeaseEnd(String unitLeaseEnd) {
		this.unitLeaseEnd = unitLeaseEnd;
	}

	public String getDataTimeStamp() {
		return dataTimeStamp;
	}

	public void setDataTimeStamp(String dataTimeStamp) {
		this.dataTimeStamp = dataTimeStamp;
	}

	@Override
	public String toString() {
		return "AssetEntity [id=" + id + ", portFolio=" + portFolio + ", assetRef=" + assetRef
				+ ", assetAddress=" + assetAddress + ", assetZipCode=" + assetZipCode + ", assetCity=" + assetCity
				+ ", assetResticted=" + assetResticted + ", assetYoc=" + assetYoc + ", unitRef=" + unitRef
				+ ", unitSize=" + unitSize + ", unitRented=" + unitRented + ", unitRent=" + unitRent + ", unitType="
				+ unitType + ", unitTenant=" + unitTenant + ", unitLeaseStart=" + unitLeaseStart + ", unitLeaseEnd="
				+ unitLeaseEnd + ", dataTimeStamp=" + dataTimeStamp + "]";
	}




	
	
	

}
