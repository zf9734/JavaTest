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
        InputStream inputStream = null;
        FileInputStream fileInputStream = null;
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
            socket = new Socket(inetAddress,9987);
            outputStream = socket.getOutputStream();
            inputStream = socket.getInputStream();
            byteArrayOutputStream = new ByteArrayOutputStream();

            //读文件并写到服务端
            fileInputStream = new FileInputStream("client.txt");
            int length = -1;
            byte[] temp = new byte[5];
            while((length=fileInputStream.read(temp))!=-1)
            {
                outputStream.write(temp,0,length);
            }
            outputStream.flush();
            socket.shutdownOutput();

            int length1 = -1;
            byte[] temp1 = new byte[5];
            while((length1=inputStream.read(temp1))!=-1)
            {
                byteArrayOutputStream.write(temp1,0,length1);
            }
            byteArrayOutputStream.flush();
            socket.shutdownInput();

            System.out.println(byteArrayOutputStream.toString());



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
            if(inputStream!=null)
            {
                try {
                    inputStream.close();
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
            if(byteArrayOutputStream!=null)
            {
                try {
                    byteArrayOutputStream.close();
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
        FileOutputStream fileOutputStream = null;
        OutputStream outputStream = null;
        try {
            serverSocket = new ServerSocket(9987);
            socket = serverSocket.accept();
            inputStream = socket.getInputStream();
            outputStream = socket.getOutputStream();
            fileOutputStream = new FileOutputStream("server.txt");

            //开始读客户端发来的数据并写到本地文件
            byte[] temp = new byte[5];
            int length = -1;
            while((length = inputStream.read(temp))!=-1)
            {
                fileOutputStream.write(temp,0,length);
            }
            fileOutputStream.flush();
            socket.shutdownInput();

            System.out.println("服务端写入文件完毕");

            outputStream.write("服务端写入文件完毕，向客户端发送通知".getBytes());
            outputStream.flush();
            socket.shutdownOutput();


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
            if(inputStream!=null)
            {

                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(outputStream!=null)
            {
                try {
                    outputStream.close();
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