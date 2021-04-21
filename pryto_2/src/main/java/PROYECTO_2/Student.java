package PROYECTO_2;

public class Student{
    private String user;
    private String password;
    
    public Student(String user, String password) {
        setUser(user);
        setPassword(password);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }


}