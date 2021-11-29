
import org.junit.Test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author MRFF
 * @create 2021-11-29 1:44
 */
public class TestTest {
    @Test
    public void sender()
    {
        DatagramSocket datagramSocket = null;
        try {
            datagramSocket = new DatagramSocket();
            String s = "我是用UDP方式发送的导弹！";
            DatagramPacket datagramPacket = new DatagramPacket(s.getBytes(),0,s.getBytes().length, InetAddress.getByName("127.0.0.1"),9987);
            datagramSocket.send(datagramPacket);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(datagramSocket!=null)
            {

                datagramSocket.close();
            }
        }
    }

    @Test
    public void receiver()
    {
        DatagramSocket datagramSocket = null;
        try {
            datagramSocket = new DatagramSocket(9987);
            byte[] temp = new byte[100];
            DatagramPacket datagramPacket = new DatagramPacket(temp,0,temp.length);
            datagramSocket.receive(datagramPacket);
            System.out.println(new String(datagramPacket.getData(),0,datagramPacket.getLength()));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(datagramSocket!=null)
            {

                datagramSocket.close();
            }
        }

    }



}