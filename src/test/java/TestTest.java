import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author MRFF
 * @create 2021-11-29 1:44
 */
public class TestTest {
    @Test
    public void client()
    {
        System.out.println("客户端启动");
        Socket socket = null;
        OutputStream outputStream = null;
        FileInputStream fileInputStream = null;
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
            socket = new Socket(inetAddress,9987);
            outputStream = socket.getOutputStream();

            //读文件
            fileInputStream = new FileInputStream("client.txt");
            int length = -1;
            byte[] temp = new byte[5];
            byteArrayOutputStream = new ByteArrayOutputStream();
            while((length=fileInputStream.read(temp))!=-1)
            {
                byteArrayOutputStream.write(temp,0,length);
            }
            byteArrayOutputStream.flush();//刷新

            //写到服务端
            outputStream.write(byteArrayOutputStream.toByteArray());
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(outputStream!=null)
            {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            if(byteArrayOutputStream!=null)
            {

                try {
                    byteArrayOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fileInputStream!=null)
            {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            if(socket!=null)
            {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }

    }

    @Test
    public void server()
    {
        System.out.println("服务端启动！");
        ServerSocket serverSocket = null;
        Socket socket = null;
        InputStream inputStream = null;
        ByteArrayOutputStream byteArrayOutputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            serverSocket = new ServerSocket(9987);
            socket = serverSocket.accept();
            inputStream = socket.getInputStream();

            //开始读客户端发来的数据
            byte[] temp = new byte[5];
            int length = -1;
            byteArrayOutputStream = new ByteArrayOutputStream();
            while((length = inputStream.read(temp))!=-1)
            {
                byteArrayOutputStream.write(temp,0,length);
            }
            byteArrayOutputStream.flush();

            //开始写入本地文件
            fileOutputStream = new FileOutputStream("server.txt");
            fileOutputStream.write(byteArrayOutputStream.toByteArray());
            fileOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fileOutputStream!=null)
            {

                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
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
            if(socket!=null)
            {

                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(serverSocket!=null)
            {

                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}