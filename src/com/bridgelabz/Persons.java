package com.bridgelabz;

public class Persons {
	
		private String first_name;
		private String last_name;
		private String address;
		private String city;
		private String state;
		private String zip;
		private long phone_number;
		private String email;
		
		public String getFirst_name() {
			return first_name;
		}

		public void setFirst_name(String first_name) {
			this.first_name = first_name;
		}

		public String getLast_name() {
			return last_name;
		}

		public void setLast_name(String last_name) {
			this.last_name = last_name;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getZip() {
			return zip;
		}

		public void setZip(String zip) {
			this.zip = zip;
		}

		public long getPhone_number() {
			return phone_number;
		}

		public void setPhone_number(long phone) {
			this.phone_number = phone;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Persons() {
			super();
		}


		public Persons(String first_name, String last_name, String address, String city, String state, String zip,
				long phone_number, String email) {
			super();
			this.first_name = first_name;
			this.last_name = last_name;
			this.address = address;
			this.city = city;
			this.state = state;
			this.zip = zip;
			this.phone_number = phone_number;
			this.email = email;
		}

		@Override
		public String toString() {
			return "Contacts [first_name=" + first_name + ", last_name=" + last_name + ", address=" + address + ", city="
					+ city + ", state=" + state + ", zip=" + zip + ", phone_number=" + phone_number + ", email=" + email
					+ "]";
		}
}
