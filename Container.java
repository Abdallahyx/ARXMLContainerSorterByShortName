public class Container implements Comparable<Container>{
    private String id;
    private String shortName;
    private String longName;

    public Container(String id, String shortName, String longName) {
        this.id = id;
        this.shortName = shortName;
        this.longName = longName;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getShortName() {
        return this.shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getLongName() {
        return this.longName;
    }

    public void setLongName(String longName) {
        this.longName = longName;
    }
    
    @Override
    public int compareTo(Container o){
        return this.shortName.compareTo(o.getShortName());
    }
}
