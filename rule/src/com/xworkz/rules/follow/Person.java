package com.xworkz.rules.follow;


	public abstract class  Person extends Object{
	    private String name;
	    private String address;
	    private String company;
	    private String course;
	    private long mob;
	    
	    abstract boolean  eat();
	    abstract boolean  sleep();
	    
	    
		public Person() {
			// TODO Auto-generated constructor stub
		}


		public Person(String name, String address, String company, String course, long mob) {
			super();
			this.name = name;
			this.address = address;
			this.company = company;
			this.course = course;
			this.mob = mob;
		}
		@Override
		public String toString() {
			return "Person [name=" + name + ", address=" + address + ", company=" + company + ", course=" + course
					+ ", mob=" + mob + "]";
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getCompany() {
			return company;
		}
		public void setCompany(String company) {
			this.company = company;
		}
		public String getCourse() {
			return course;
		}
		public void setCourse(String course) {
			this.course = course;
		}
		public long getMob() {
			return mob;
		}
		public void setMob(long mob) {
			this.mob = mob;
		}
		

}
