package Entities;



public class Users {
		private int nationalityId;
		private String firstName;
		private String lastName;
		private String dateOfBirth;
		
		public Users() {
			
		}
		
		public Users(int nationalityId, String firstName, String lastName, String dateOfBirth) {
			this.nationalityId = nationalityId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.dateOfBirth = dateOfBirth;
		}
		
		
		public int getNationalityId() {
			return nationalityId;
		}
		public void setNationalityId(int nationalityId) {
			this.nationalityId = nationalityId;
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
		public String getDateOfBirth() {
			return dateOfBirth;
		}
		public void setDateOfBirth(String dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}

}
