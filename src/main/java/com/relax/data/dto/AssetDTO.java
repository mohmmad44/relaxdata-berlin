package com.relax.data.dto;

import java.util.Date;

public class AssetDTO {
	
	public String address;
	public String zipcode;
	public String city;
	public Number year_of_construction;
	public Boolean restricted_area;
	public Number number_of_units;
	public Number total_rent;
	public Number total_area;
	public Number area_rented;
	public Number vacancy;
	public Number walt;
	public Date latest_update;
	
	
	
	
	
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Number getYear_of_construction() {
		return year_of_construction;
	}
	public void setYear_of_construction(Number year_of_construction) {
		this.year_of_construction = year_of_construction;
	}
	public Boolean getRestricted_area() {
		return restricted_area;
	}
	public void setRestricted_area(Boolean restricted_area) {
		this.restricted_area = restricted_area;
	}
	public Number getNumber_of_units() {
		return number_of_units;
	}
	public void setNumber_of_units(Number number_of_units) {
		this.number_of_units = number_of_units;
	}
	public Number getTotal_rent() {
		return total_rent;
	}
	public void setTotal_rent(Number total_rent) {
		this.total_rent = total_rent;
	}
	public Number getTotal_area() {
		return total_area;
	}
	public void setTotal_area(Number total_area) {
		this.total_area = total_area;
	}
	public Number getArea_rented() {
		return area_rented;
	}
	public void setArea_rented(Number area_rented) {
		this.area_rented = area_rented;
	}
	public Number getVacancy() {
		return vacancy;
	}
	public void setVacancy(Number vacancy) {
		this.vacancy = vacancy;
	}
	public Number getWalt() {
		return walt;
	}
	public void setWalt(Number walt) {
		this.walt = walt;
	}
	public Date getLatest_update() {
		return latest_update;
	}
	public void setLatest_update(Date latest_update) {
		this.latest_update = latest_update;
	}
	
	
	@Override
	public String toString() {
		return "AssetDTO [address=" + address + ", zipcode=" + zipcode + ", city=" + city + ", year_of_construction="
				+ year_of_construction + ", restricted_area=" + restricted_area + ", number_of_units=" + number_of_units
				+ ", total_rent=" + total_rent + ", total_area=" + total_area + ", area_rented=" + area_rented
				+ ", vacancy=" + vacancy + ", walt=" + walt + ", latest_update=" + latest_update + "]";
	}
	
	
	
	
}
