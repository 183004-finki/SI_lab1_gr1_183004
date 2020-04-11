package sis;
import java.io.*;
import java.util.*;

public class Student {
	int index;
	String firstName;
	String lastName;
	int[] labPoints = new int[100];
	int brLabs;

	public Student(int index, String firstName, String lastName, int labPoints[], int brLabs) {
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
		this.brLabs = brLabs;
		for(int i = 0; i<brLabs; i++) {
			this.labPoints[i] = labPoints[i];
		}
		//TODO constructor
	}
	
	

	
	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int[] getLabPoints() {
		return labPoints;
	}

	public void setLabPoints(int[] labPoints) {
		this.labPoints = labPoints;
	}

	public int getBrLabs() {
		return brLabs;
	}

	public void setBrLabs(int brLabs) {
		this.brLabs = brLabs;
	}


	//TODO seters & getters

	public double getAverage() {
		int suma = 0;
		for(int i =0; i < brLabs; i++) {
			suma+=labPoints[i];
		}
		double average = (suma/brLabs) ;
		return average;
	}

	public boolean hasSignature() {
		if(brLabs > 8) return true;
		else return false;
		//TODO
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
