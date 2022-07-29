package never.doTest.BO;

import java.io.IOException;
import java.io.OutputStream;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年07月29日 10:10
 */
public class MyResponse {
    private OutputStream outputStream;

    public MyResponse(OutputStream outputStream){
        setOutputStream(outputStream);
    }
    public void write(String str){
        StringBuilder sb = new StringBuilder();
        sb.append("HTTP/1.1 200 OK\n")
                .append("Content-Type: text/html\n")
                .append("\r\n")
                .append("<html>\n")
                .append("<body>\n")
                .append("<p>"+str+"</p>")
                .append("</body>")
                .append("</html>");
        try {
            this.outputStream.write(sb.toString().getBytes());
            this.outputStream.flush();
            this.outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public OutputStream getOutputStream() {
        return outputStream;
    }

    public void setOutputStream(OutputStream outputStream) {
        this.outputStream = outputStream;
    }
}
