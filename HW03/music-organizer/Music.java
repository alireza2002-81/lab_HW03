public class Music {
    private String address;
    private String singer;
    private int year;

    /**
     * Constructor
     * @param address
     * @param singer
     * @param year
     */

    public Music(String address,String singer, int year){
        this.address = address;
        this.singer = singer;
        this.year = year;
    }

    /**
     * getAddress method
     * @return
     */
    public String getAddress() {
        return address;
    }

    /**
     * getSinger method
     * @return
     */
    public String getSinger() {
        return singer;
    }

    /**
     * getYear method
     * @return
     */
    public int getYear() {
        return year;
    }
}
