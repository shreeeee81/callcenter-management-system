
class USer {
    private int custID;
    private String name, address, city, state, cname;
    private int zip;
    public USer(int custID, String name, String address, String city, String state, int zip, String cname){
    this.custID=custID;
    this.name=name;
    this.address=address;
    this.city=city;
    this.state=state;
    this.zip=zip;
    this.cname=cname;
    }
    public int getcustID(){
        return (custID);
}
    public String getname(){
        return name;
    }
    public String getaddress(){
        return address;
    }
    public String getcity(){
        return city;
    }
    public String getstate(){
        return state;
    }
    public int getzip(){
        return zip;
    }
    public String getcname(){
        return cname;
    }
}