package never.designPattern.builder;

/**
 * @Description: builder类
 * @author: Bo Li
 * @date: 2022年08月15日 9:34
 */
public class ComplexBuilder extends WebApplicationBuilder{
    WebApplication webApplication = new WebApplication();
    @Override
    WebApplicationBuilder buildWeb() {
        Web web = new Web("前端服务", "vue模型");
        webApplication.web = web;
        return this;
    }

    @Override
    WebApplicationBuilder buildServer() {
        BKServer bkServer = new BKServer("10.172.1.0", 8080);
        webApplication.server = bkServer;
        return this;
    }
    @Override
    WebApplicationBuilder buildDb() {
        DbServer dbServer = new DbServer("datapool", 1521);
        webApplication.db =dbServer;
        return this;
    }

    @Override
    WebApplication build() {
        return webApplication;
    }

    public static void main(String[] args) {
        WebApplication WebApplication = new ComplexBuilder().buildWeb().buildDb().buildServer().build();
        System.out.println(WebApplication);
    }
}
