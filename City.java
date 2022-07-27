public class City {
    private int no;
    private String pref;
    private String city;

    public City(int no, String pref, String city) {
        this.no = no;
        this.pref = pref;
        this.city = city;
    }



    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getPref() {
        return pref;
    }

    public void setPref(String pref) {
        this.pref = pref;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
