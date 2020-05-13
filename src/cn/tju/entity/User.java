package cn.tju.entity;

public class User {

        private int userno;
        private String username;
        private  String password;
        private String dept;
        private String phone;
        private String email;

    public User(int userno) {
        this.userno = userno;
    }

    public User(String username, String password){
            this.username=username;
            this.password=password;
        }

    public User(int userno, String username, String password, String dept, String phone, String email) {
        this.userno = userno;
        this.username = username;
        this.password = password;
        this.dept = dept;
        this.phone = phone;
        this.email = email;
    }

    public int getUserno() {
            return userno;
        }

        public void setUserno(int userno) {
            this.userno = userno;
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

        public String getDept() {
            return dept;
        }

        public void setDept(String dept) {
            this.dept = dept;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

    @Override
    public String toString() {
        return "User{" +
                "userno=" + userno +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", dept='" + dept + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
