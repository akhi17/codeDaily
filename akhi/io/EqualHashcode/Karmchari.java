package akhi.io.EqualHashcode;

public class Karmchari {
    String empName;
    String city;

    public Karmchari(String empName, String city) {
        this.empName = empName;
        this.city = city;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Karmchari{" +
                "empName='" + empName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
