package prj1_src;


/**
 * The type Baby.
 */
public class Baby {
    private String name;
    private int rank;
    private String count;
    private String gender;

    /**
     * Instantiates a new Baby.
     *
     * @param name   the name
     * @param rank   the rank
     * @param count  the count
     * @param gender the gender
     */
    public Baby(String name, int rank, String count, String gender) {
        this.name = name;
        this.rank = rank;
        this.count = count;
        this.gender = gender;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets rank.
     *
     * @return the rank
     */
    public int getRank() {
        return rank;
    }

    /**
     * Gets count.
     *
     * @return the count
     */
    public String getCount() {
        return count;
    }

    /**
     * Gets gender.
     *
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets rank.
     *
     * @param rank the rank
     */
    public void setRank(int rank) {
        this.rank = rank;
    }

    /**
     * Sets count.
     *
     * @param count the count
     */
    public void setCount(String count) {
        this.count = count;
    }

    /**
     * Sets gender.
     *
     * @param g the g
     */
    public void setGender(String g) {
        this.gender = g;
    }


    public String toString() {
        return "Name: " + name + ", Rank: " + rank + ", Count: " + count + ", Gender: " + gender;

    }

}
