package never.designPattern.builder;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年08月15日 9:25
 */
public class WebApplication {
    Web web;
    BKServer server;
    DbServer db;

    @Override
    public String toString() {
        return "WebApplication{" +
                "web=" + web +
                ", server=" + server +
                ", db=" + db +
                '}';
    }
}

class Web{
    private String name;
    private String dom;

    public Web(String name, String dom) {
        this.name = name;
        this.dom = dom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDom() {
        return dom;
    }

    public void setDom(String dom) {
        this.dom = dom;
    }

    @Override
    public String toString() {
        return "Web{" +
                "name='" + name + '\'' +
                ", dom='" + dom + '\'' +
                '}';
    }
}

class BKServer{
    private String ip;
    private int port;

    public BKServer(String ip, int port) {
        this.ip = ip;
        this.port = port;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "BKServer{" +
                "ip='" + ip + '\'' +
                ", port=" + port +
                '}';
    }
}
class DbServer{
    private String dbsource;
    private int port;

    public DbServer(String dbsource, int port) {
        this.dbsource = dbsource;
        this.port = port;
    }

    public String getDbsource() {
        return dbsource;
    }

    public void setDbsource(String dbsource) {
        this.dbsource = dbsource;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "DbServer{" +
                "dbsource='" + dbsource + '\'' +
                ", port=" + port +
                '}';
    }
}
