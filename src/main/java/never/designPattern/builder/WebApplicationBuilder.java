package never.designPattern.builder;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年08月15日 9:26
 */
public abstract class WebApplicationBuilder {
    abstract WebApplicationBuilder buildWeb();
    abstract WebApplicationBuilder buildServer();
    abstract WebApplicationBuilder buildDb();
    abstract WebApplication  build();

}
