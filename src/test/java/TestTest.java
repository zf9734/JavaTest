import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author MRFF
 * @create 2021-11-29 1:44
 */
public class TestTest {
    @Test
    public void urlTest()
    {
        HttpURLConnection urlConnection = null;
        InputStream inputStream = null;
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            URL url = new URL("http://localhost:8080/examples/test.txt");
            urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.connect();
            inputStream = urlConnection.getInputStream();

            int length = -1;
            byte[] temp = new byte[5];
            byteArrayOutputStream = new ByteArrayOutputStream();
            while((length = inputStream.read(temp))!=-1)
            {
                byteArrayOutputStream.write(temp,0,length);
            }
            byteArrayOutputStream.flush();

            System.out.println(byteArrayOutputStream.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(byteArrayOutputStream!=null)
            {

                try {
                    byteArrayOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(inputStream!=null)
            {

                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(urlConnection!=null)
            {

                urlConnection.disconnect();
            }
        }

    }




}