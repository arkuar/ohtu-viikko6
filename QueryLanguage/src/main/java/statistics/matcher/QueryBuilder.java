package statistics.matcher;

public class QueryBuilder {

    Matcher query;

    public QueryBuilder() {
        query = new And();
    }

    public Matcher build() {
        Matcher m = query;
        query = new And();
        return m;
    }

    public QueryBuilder playsIn(String team) {
        this.query = new And(query, new PlaysIn(team));
        return this;
    }

    public QueryBuilder hasAtLeast(int val, String category) {
        this.query = new And(query, new HasAtLeast(val, category));
        return this;
    }

    public QueryBuilder hasFewerThan(int val, String category) {
        this.query = new And(query, new HasFewerThan(val, category));
        return this;
    }
    
    public QueryBuilder oneOf(Matcher... matchers){
        this.query = new Or(matchers);
        return this;
    }

}
