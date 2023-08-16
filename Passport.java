public class Passport {
     private double dateOfBirth;
     private String country;
     private String gender;

     public Passport(double dateOfBirth, String country, String gender) {
          this.dateOfBirth = dateOfBirth;
          this.country = country;
          this.gender = gender;

     }
     public double getDateOfBirth() {
          return dateOfBirth;
     }

     public void setDateOfBirth(double dateOfBirth) {
          this.dateOfBirth = dateOfBirth;
     }

     public String getCountry() {
          return country;
     }

     public void setCountry(String country) {
          this.country = country;
     }

     public String getGender() {
          return gender;
     }

     public void setGender(String gender) {
          this.gender = gender;
     }

     @Override
     public String toString() {
          return "Passport{" +
                  "dateOfBirth=" + dateOfBirth +
                  ", country='" + country + '\'' +
                  ", gender='" + gender + '\'' +
                  '}';
     }
}
