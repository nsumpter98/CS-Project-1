package prj1_src;


public class Baby {
    private String name;
    private int rank;
    private int count;
    private String gender;

    public Baby(String name, int rank, int count, String gender) {
        this.name = name;
        this.rank = rank;
        this.count = count;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getRank() {
        return rank;
    }

    public int getCount() {
        return count;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setGender(String g) {
        this.gender = g;
    }


    public String toString() {
        return "Name: " + name + " Rank: " + rank + " Count: " + count + "Gender: " + gender;

    }

}
