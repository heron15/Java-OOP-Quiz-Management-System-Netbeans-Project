package quizapp;

public class UserInfo {

    private String name;
    private String username;
    private String password;
    private String gender;
    private String natonality;
    private String address;

    public UserInfo(String name, String username, String password, String gender, String natonality, String address) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.gender = gender;
        this.natonality = natonality;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNatonality() {
        return natonality;
    }

    public void setNatonality(String natonality) {
        this.natonality = natonality;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
    
}
