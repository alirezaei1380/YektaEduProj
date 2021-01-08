public class BaseAdvertising {

    private int clicks;
    private int views;

    public BaseAdvertising() {
        this.clicks = 0;
        this.views = 0;
    }

    public int getClicks() {
        return clicks;
    }

    public int getViews() {
        return views;
    }

    public void incClicks() {
        clicks++;
    }

    public void incViews() {
        views++;
    }

    public String describeMe() {
        return "This class is designed to reduce duplicated code via inheritance.";
    }
}
