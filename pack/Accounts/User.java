package pack.Accounts;


// inheritance usage

public class User {

    private int id;

    private String  Name;

    private String  email;

    private String  mobile;

    private String  password;

    private String  role;

    private String  status;

    private String  last_update;

  public String getName() {
      return Name;
  }

  public void setName(String name) {
      Name = name;
  }

  public String getEmail() {
      return email;
  }

  public void setEmail(String email) {
      this.email = email;
  }

  public String getMobile() {
      return mobile;
  }

  public void setMobile(String mobile) {
      this.mobile = mobile;
  }

  public String getPassword() {
      return password;
  }

  public void setPassword(String password) {
      this.password = password;
  }

  public String getRole() {
      return role;
  }

  public void setRole(String role) {
      this.role = role;
  }

  public String getStatus() {
      return status;
  }

  public void setStatus(String status) {
      this.status = status;
  }

  public String getLast_update() {
      return last_update;
  }

  public void setLast_update(String last_update) {
      this.last_update = last_update;
  }

  public int getId() {
      return id;
  }

  public void setId(int id) {
      this.id = id;
  }



  // Method override usage 

  @Override
  public String toString() {
      return "User [id=" + id + ", Name=" + Name + ", email=" + email
              + ", mobile=" + mobile + ", password=" + password + ", role="
              + role + ", status=" + status + ", last_update=" + last_update
              + "]";
  }


}


