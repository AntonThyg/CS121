package Q1.Activity_12;

public class Company {
    String name;
    int revenue,yrFounded;
    public Company(){
        this.name="";
        this.revenue=0;
        this.yrFounded=1891;
    }
    public Company(String name, int revenue, int yrFounded){
        this.name=name;
        this.revenue=revenue;
        this.yrFounded=yrFounded;
    }

    public int getRevenue() {
        return revenue;
    }

    public int getYrFounded() {
        return yrFounded;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRevenue(int revenue) {
        this.revenue = revenue;
    }

    public void setYrFounded(int yrFounded) {
        this.yrFounded = yrFounded;
    }

    public String toString() {
        System.out.println("Company{" +
                "name='" + name + '\'' +
                ", revenue=" + revenue +" Billion"+
                ", yrFounded=" + yrFounded +
                '}');
        return "Company{" +
                "name='" + name + '\'' +
                ", revenue=" + revenue +
                ", yrFounded=" + yrFounded +
                '}';
    }
}
