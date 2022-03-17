package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author mounika
 *PROCEDURE:
 *1.Creating arraylist object
 *2.created constructor
 *3.To display ArrayList Content
 *4.method to add person details to array list
 *5.Method to edit person details from array list
 *6.Method to delete values from arraylist
 */
public class AddressBook {


	/**
	 * 1.Creating arraylist object
	 */
	ArrayList<Persons> persons;

	/**
	 * 2.created constructor
	 */
	public AddressBook() {
		persons=new ArrayList<Persons>();

	}
	/**
	 * 3.To display ArrayList Content
	 */
	public void display() {
		for (Persons person : persons)

			System.out.println("Person details " + person.getFirst_name() +"\t" +person.getLast_name()+"\t"+person.getAddress()+"\t" 
					+person.getCity()+"\t"+person.getState()+ "\t"+person.getZip()+"\t"+person.getPhone_number()+"\t"+person.getEmail());

	}
	/**
	 * 4.method to add person details to array list
	 */
	public void addPerson() {
		//creating Scanner object to get input from user

		Scanner sc=new Scanner(System.in);
		//taking input from user using scanner object
		System.out.println("Enter First Name");
		String first_name=sc.next();


		System.out.println("Enter Last Name");
		String last_name=sc.next();

		System.out.println("Enter Address");
		String address=sc.next();

		System.out.println("Enter City");
		String city=sc.next();

		System.out.println("Enter State");
		String state=sc.next();

		System.out.println("Enter Zip code");
		String zip=sc.next();

		System.out.println("Enter Phone Number");
		int phone_number=sc.nextInt();

		System.out.println("Enter email");
		String email=sc.next();

		Persons p=new Persons(first_name,last_name,address,city,state,zip,phone_number,email);
		boolean isInList=false;
		for(Persons per : persons){
			if(per.getFirst_name().equals(p.getFirst_name())){
				System.out.printf("Person Name already exists... ");
				isInList=true;
			}
			System.out.println();
		}
		if(!isInList){
			this.persons.add(p);
			System.out.println("Person details added successfully");
		}
	}
	/**
	 * 5.Method to edit person details from array list
	 */
	public void editPerson() {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name of the person to Edit");
		String editpersonname=sc.next();
		for(int i=0;i<persons.size();i++) {
			Persons p=(Persons)persons.get(i);
			System.out.println("person details are");
			if(editpersonname.equalsIgnoreCase(p.getFirst_name()))
			{


				System.out.println("Enter Last Name");
				String last_name=sc.next();

				System.out.println("Enter Address");
				String address=sc.next();

				System.out.println("Enter City");
				String city=sc.next();

				System.out.println("Enter State");
				String state=sc.next();

				System.out.println("Enter Zip code");
				String zip=sc.next();

				System.out.println("Enter Phone Number");
				int phone_number=sc.nextInt();

				System.out.println("Enter email");
				String email=sc.next();


				p.setLast_name(last_name);
				p.setAddress(address);
				p.setCity(city);
				p.setState(state);
				p.setZip(zip);
				p.setPhone_number(phone_number);
				p.setEmail(email);
			}
		}
	}
	/**
	 * 6.Method to delete values from arraylist
	 */
	public void deletePerson() {
		Scanner sc1=new  Scanner(System.in);
		System.out.println("Enter person name to Delete");
		String fname=sc1.next();
		for(int i=0;i<persons.size();i++) {
			Persons p=(Persons)persons.get(i);
			System.out.println("person details are");
			if(fname.equals(p.getFirst_name()))
			{
				persons.remove(i);
				System.out.println("Record deleted successfully");
			}
		}
	}
	/**
	 * method to search persons by city of ther person or state of the person
	 * @param city - input element to search
	 * @param state - input element to search
	 */
	public void searchPerson(String city,String state) {
		int count=0;
		for(int i=0;i<persons.size();i++)
		{
			Persons p=(Persons)persons.get(i);
			if(city.equals(p.getCity()) || state.equals(p.getState())) {
				count++;
				System.out.println(p);
			}
		}
		System.out.println("No of contact persons is  :"+count);
	}
	


}