package objects;

public class Instrument {

    private long instrumentGroupId;
    private String name;
    private String exchange;
    private long id;

    public long getInstrumentGroupId() {
        return instrumentGroupId;
    }

    public String getName() {
        return name;
    }

    public String getExchange() {
        return exchange;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "{" +
                "instrumentGroupId=" + instrumentGroupId +
                ", name='" + name + '\'' +
                ", exchange='" + exchange + '\'' +
                ", id=" + id +
                '}';
    }
}
