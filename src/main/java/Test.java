

/**
 * @author MRFF
 * @create 2021-10-22 21:17
 */
public class Test {

    public static void main(String[] args) {

//        //试除法
//        method1();
//        //简单筛
//        method2();
        //欧拉筛
//        method3();
//        Clerk cl = new Clerk();
////        Productor p = new Productor(cl);
////        Customer c = new Customer(cl);
////        p.setName("生产者1");
////        c.setName("消费者1");
////        p.start();
////        c.start();

        //master分支
        //用RandomAccess实现插入操作
//        RandomAccessFile reader = null;
//        RandomAccessFile writer = null;
//        try {
//            reader = new RandomAccessFile("src.txt","r");
//            writer = new RandomAccessFile("src.txt","rw");
//            ArrayList<Byte> arrayList = new ArrayList<Byte>();
//            byte[] b = new byte[5];
//            int length = -1;
//            //把插入点后面的字符串读入到arraylist中
//            reader.seek(3);
//            while((length = reader.read(b))!=-1)
//            {
//                for (int i = 0; i < length; i++) {
//                    arrayList.add(b[i]);
//                }
//            }
//            //开始写入xyz
//            writer.seek(3);
//            writer.write("xyz".getBytes());
//            //开始追加之前存的字符串
//            byte[] b2 = new byte[arrayList.size()];
//            Iterator<Byte> iterator = arrayList.iterator();
//            int p =0;
//            while(iterator.hasNext())
//            {
//                b2[p] = iterator.next();
//                p++;
//            }
//            writer.write(b2);
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            //关闭
//            if(reader!=null)
//            {
//                try {
//                    reader.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//
//            }
//            if(writer!=null)
//            {
//                try {
//                    writer.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//
//            }
//        }


    }

//    public static void method1()
//    {
//        //method 1
//        System.out.println("输出100000000以内的质数");
//        Long start = currentTimeMillis();
//        int[] arr = new int[100000000];
//        int count = 0;
//        arr[count]=2;
//        count++;
//
//        boolean isZ = true;
//
//        for (int i = 3; i < 100000001; i += 2) {
//            isZ = true;
//            for (int j = 0; j < count; j++) {
//                if (arr[j] > sqrt(i)) break;
//                if (i % arr[j] == 0) {
//                    isZ = false;
//                    break;
//                }
//            }
//            if (isZ) {
//                arr[count]=i;
//                count++;
//            }
//        }
//
//        Long stop = currentTimeMillis();
//        Long spendTime = stop - start;
//        System.out.println("共有"+count+"个质数");
//        System.out.println("花费时间："+spendTime);
//    }
//
//    public static void method2()
//    {
//        //method2
//        System.out.println("输出100000000以内的质数");
//        int[] arr = new int[100000001];
//        arr[0]=1;
//        arr[1]=1;
//        int count = 0;
//        Long start = currentTimeMillis();
//        for (int i = 2; i < 100000001; i++) {
//            if(arr[i] == 1) continue;
//            for (int j = 2; j < 50000001; j++) {
//                if(i*j>100000000) break;
//                arr[i*j] = 1;
//            }
//        }
//
//        for (int i = 0; i < 100000001; i++) {
//            if(arr[i] == 0)
//            {
//                count++;
//            }
//        }
//
//        Long stop = currentTimeMillis();
//        Long spendTime = stop - start;
//        System.out.println("共有"+count+"个质数");
//        System.out.println("花费时间："+spendTime);
//
//
//    }
//
//    public static void method3()
//    {
//        System.out.println("输出100000000以内的质数");
//        int[] arr = new int[100000001];
//        int[] zhishu = new int[50000000];
//        int count = 0;
//
//        arr[0]=1;
//        arr[1]=1;
//        Long start = currentTimeMillis();
//        for (int i = 2; i < 100000001; i++) {
//            if(arr[i] == 0)
//            {
//                zhishu[count] = i;
//                count++;
//            }
//
//            for (int j = 0; j < count; j++) {
//                if(zhishu[j] * i >100000000) break;
//                arr[i*zhishu[j]] = 1;
//                if(i % zhishu[j] == 0) break;
//            }
//        }
//
//        Long stop = currentTimeMillis();
//        Long spendTime = stop - start;
//        System.out.println("共有"+count+"个质数");
//        System.out.println("花费时间："+spendTime);
//
//    }
//


}





