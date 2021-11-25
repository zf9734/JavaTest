import java.util.ArrayList;
import java.util.Collections;

import static java.lang.System.currentTimeMillis;

/**
 * @author MRFF
 * @create 2021-10-29 14:46
 */
public class SortTest {
    public static void main(String[] args) {
        int[] base_data = new int[100000];//排好序的数组
        ArrayList sorted_data_list = new ArrayList();//待排序的数组集合
        for (int i = 0; i < base_data.length; i++) {
            base_data[i] = i;
            sorted_data_list.add(i);
        }
        Collections.shuffle(sorted_data_list);//随机打乱
        int[] sorted_data = new int[100000];
        for (int i = 0; i < sorted_data_list.size(); i++) {
            sorted_data[i] = (int)sorted_data_list.get(i);
        }

        //至此，base_data为排好序的数组，sorted_data为未排序的数组

//        Long start = currentTimeMillis();
//        //开始排序算法
//        method1(sorted_data);
//        //结束排序算法
//        Long stop = currentTimeMillis();
//        Long spendTime = stop - start;
//        System.out.println("冒泡排序-》花费时间："+spendTime);
//        correctTest(base_data,sorted_data);

//        Long start = currentTimeMillis();
//        //开始排序算法
//        method1_1(sorted_data);
//        //结束排序算法
//        Long stop = currentTimeMillis();
//        Long spendTime = stop - start;
//        System.out.println("冒泡排序（优化）-》花费时间："+spendTime);
//        correctTest(base_data,sorted_data);

//        Long start = currentTimeMillis();
//        //开始排序算法
//        method2(sorted_data);
//        //结束排序算法
//        Long stop = currentTimeMillis();
//        Long spendTime = stop - start;
//        System.out.println("选择排序-》花费时间："+spendTime);
//        correctTest(base_data,sorted_data);

//        Long start = currentTimeMillis();
//        //开始排序算法
//        method2_1(sorted_data);
//        //结束排序算法
//        Long stop = currentTimeMillis();
//        Long spendTime = stop - start;
//        System.out.println("选择排序(优化)-》花费时间："+spendTime);
//        correctTest(base_data,sorted_data);

//        Long start = currentTimeMillis();
//        //开始排序算法
//        method3(sorted_data);
//        //结束排序算法
//        Long stop = currentTimeMillis();
//        Long spendTime = stop - start;
//        System.out.println("插入排序-》花费时间："+spendTime);
//        correctTest(base_data,sorted_data);

//        Long start = currentTimeMillis();
//        //开始排序算法
//        method3_1(sorted_data);
//        //结束排序算法
//        Long stop = currentTimeMillis();
//        Long spendTime = stop - start;
//        System.out.println("插入排序(优化)-》花费时间："+spendTime);
//        correctTest(base_data,sorted_data);

//        Long start = currentTimeMillis();
//        //开始排序算法
//        method4(sorted_data);
//        //结束排序算法
//        Long stop = currentTimeMillis();
//        Long spendTime = stop - start;
//        System.out.println("希尔排序（希尔序列）-》花费时间："+spendTime);
//        correctTest(base_data,sorted_data);

//        Long start = currentTimeMillis();
//        //开始排序算法
//        method4_1(sorted_data);
//        //结束排序算法
//        Long stop = currentTimeMillis();
//        Long spendTime = stop - start;
//        System.out.println("希尔排序（Hibbard序列）-》花费时间："+spendTime);
//        correctTest(base_data,sorted_data);

//        Long start = currentTimeMillis();
//        //开始排序算法
//        method4_2(sorted_data);
//        //结束排序算法
//        Long stop = currentTimeMillis();
//        Long spendTime = stop - start;
//        System.out.println("希尔排序（Sedgewick序列）-》花费时间："+spendTime);
//        correctTest(base_data,sorted_data);

//        Long start = currentTimeMillis();
//        //开始排序算法
//        int[] temp = new int[sorted_data.length];
//        method5(sorted_data,0, sorted_data.length-1, temp);
//        //结束排序算法
//        Long stop = currentTimeMillis();
//        Long spendTime = stop - start;
//        System.out.println("归并排序(递归) -》花费时间："+spendTime);
//        correctTest(base_data,sorted_data);

//        Long start = currentTimeMillis();
//        //开始排序算法
//        int[] temp = new int[sorted_data.length];
//        method5_1(sorted_data, temp);
//        //结束排序算法
//        Long stop = currentTimeMillis();
//        Long spendTime = stop - start;
//        System.out.println("归并排序(迭代) -》花费时间："+spendTime);
//        correctTest(base_data,sorted_data);

//        Long start = currentTimeMillis();
//        //开始排序算法
//        method6(sorted_data, 0,sorted_data.length-1);
//        //结束排序算法
//        Long stop = currentTimeMillis();
//        Long spendTime = stop - start;
//        System.out.println("快速排序（递归）-》花费时间："+spendTime);
//        correctTest(base_data,sorted_data);

//        Long start = currentTimeMillis();
//        //开始排序算法
//        method6_1(sorted_data, 0,sorted_data.length-1);
//        //结束排序算法
//        Long stop = currentTimeMillis();
//        Long spendTime = stop - start;
//        System.out.println("快速排序（递归,三数中数枢轴）-》花费时间："+spendTime);
//        correctTest(base_data,sorted_data);

//        Long start = currentTimeMillis();
//        //开始排序算法
//        method6_2(sorted_data, 0,sorted_data.length-1);
//        //结束排序算法
//        Long stop = currentTimeMillis();
//        Long spendTime = stop - start;
//        System.out.println("快速排序（尾部递归优化）-》花费时间："+spendTime);
//        correctTest(base_data,sorted_data);

//        Long start = currentTimeMillis();
//        //开始排序算法
//        method7(sorted_data);
//        //结束排序算法
//        Long stop = currentTimeMillis();
//        Long spendTime = stop - start;
//        System.out.println("堆排序（自下而上shiftdown+就地）-》花费时间："+spendTime);
//        correctTest(base_data,sorted_data);

        Long start = currentTimeMillis();
        //开始排序算法
        method8(sorted_data);
        //结束排序算法
        Long stop = currentTimeMillis();
        Long spendTime = stop - start;
        System.out.println("计数排序（原始）-》花费时间："+spendTime);
        correctTest(base_data,sorted_data);

    }

    public static void correctTest(int[] base_data, int[] tested_data)
    {
        if(base_data.length != tested_data.length)
        {
            System.out.println("错误：数组长度不匹配");
            return;
        }
        else
        {
            for (int i = 0; i < base_data.length; i++)
            {
                if(base_data[i] != tested_data[i])
                {
                    System.out.println("错误：数组排序错误");
                    return;
                }
            }
            System.out.println("正确");
            return;
        }
    }

    public static void swap(int[] arr, int x, int y)
    {
        int xx = arr[x];
        int yy = arr[y];
        arr[x] = yy;
        arr[y] = xx;
    }


    public static void method1(int[] data)//冒泡排序
    {
        for(int i=0 ; i<data.length ; i++)
        {
            for(int j=0 ; j<data.length-i-1 ; j++)
            {
                if(data[j]>data[j+1])
                {
                    swap(data , j ,j+1);
                }
            }
        }
    }

    public static void method1_1(int[] data)//冒泡排序(优化)
    {
        boolean is_swap = false;
        for(int i=0 ; i<data.length ; i++)
        {
            is_swap = false;
            for(int j=0 ; j<data.length-i-1 ; j++)
            {
                if(data[j]>data[j+1])
                {
                    swap(data , j ,j+1);
                    is_swap = true;
                }
            }
            if(is_swap == false) return;
        }
    }

    public static void method2(int[] data)//选择排序
    {
        int min = 0;//记录初始：数组首元素
        for(int cur_p = 0; cur_p < data.length-1; cur_p++) {
            min = cur_p;
            for (int i = cur_p + 1; i < data.length; i++) {
                if(data[i]<data[min])
                {
                    min = i;
                }
            }
            if(min != cur_p)
            {
                swap(data,min, cur_p);
            }
        }
    }

    public static void method2_1(int[] data)//选择排序(优化) ，貌似是负优化了
    {
        int min = 0;//记录初始：数组首元素
        int max = data.length-1;
        int cur_p_min = 0;
        int cur_p_max = data.length-1;
        while(cur_p_min<cur_p_max)
        {
            for (int i = cur_p_min; i <= cur_p_max; i++) {
                if(i > cur_p_min && data[i]<data[min])
                {
                    min = i;
                }
                if(i< cur_p_max && data[i]>data[max])
                {
                    max = i;
                }
            }
            //这里交换的时候必须分情况讨论
            if(max == cur_p_min && min != cur_p_max)
            {
                swap(data,max,cur_p_max);
                swap(data,min,cur_p_min);
            }
            else if(max == cur_p_min && min == cur_p_max)
            {
                swap(data,min,cur_p_min);
            }
            else if(max != cur_p_min && min == cur_p_max)
            {
                swap(data,min,cur_p_min);
                swap(data,max,cur_p_max);
            }
            else
            {
                if (min != cur_p_min) {
                    swap(data, min, cur_p_min);
                }
                if (max != cur_p_max) {
                    swap(data, max, cur_p_max);
                }
            }
            cur_p_min++;
            cur_p_max--;
            min = cur_p_min;
            max = cur_p_max;
        }
    }

    public static void method3(int[] data)//插入排序
    {
        //从第二个元素开始
        for (int i = 1; i < data.length; i++) {
            int temp = data[i];
            int j = i;
            while(j>0 && data[j-1]>temp)
            {
                data[j] = data[j-1];
                j--;
            }
            if(j != i)
            {
                data[j] = temp;
            }
        }
    }

    public static void method3_1(int[] data)//插入排序（优化1：在有序区查询插入位置时，用二分法，减少了查询时候的比较次数）
    {
        //还是从第二个元素开始
        for (int i = 1; i < data.length; i++) {
            int temp = data[i];
            int start = 0;
            int end = i-1;
            int mid = (start + end)/2;
            while(start <= end)
            {
                mid = (start + end)/2;
                if(data[mid] > temp)
                {
                    end = mid - 1;
                }
                else
                {
                    start = mid + 1;
                }
            }
            //end+1就是要插入的位置
            if(end + 1 != i)
            {
                for(int j = i ; j > end+1 ; j--)
                {
                    data[j] = data[j-1];
                }
                data[end+1] = temp;
            }
        }
    }

    public static void method4(int[] data)//希尔排序：直接插入的优化算法（希尔序列）
    {
        int step = 0;
        int temp = 0;
        for(step = data.length/2 ; step >= 1 ;step/=2)//循环步数从大到小
        {
            for(int i = step ; i<data.length ; i++)
            {
                temp = data[i];//每次第一次执行这个for循环，temp都是第一组的第二个数
                int j = i ;
                while(j - step>=0 && data[j-step]>temp)
                {
                    data[j] = data[j-step];
                    j = j-step;
                }
                if(j != i)
                {
                    data[j] = temp;
                }
            }
        }
    }

    public static void method4_1(int[] data)//希尔排序：直接插入的优化算法（Hibbard序列）
    {
        //首先要获取Hibbard序列
        int temp = 1;
        ArrayList<Integer> hibbard = new ArrayList<Integer>();
        while(temp <= data.length)
        {
            hibbard.add(temp);
            temp = ((temp+1) << 1) -1;//2^n-1
        }
        Collections.reverse(hibbard);//倒序hibbard序列
        //然后开始常规希尔排序的操作
        int step = 0;
        for (int i = 0; i < hibbard.size(); i++) {//遍历hibbard序列
            step = hibbard.get(i).intValue();//注意这里要把Integer对象转换为int
            for(int j = step ; j<data.length ; j++)
            {
                temp = data[j];
                int k = j;
                while(k-step >=0 && data[k-step]>temp)
                {
                    data[k] = data[k-step];
                    k = k-step;
                }
                if(k!=j)
                {
                    data[k] = temp;
                }
            }
        }
    }

    public static void method4_2(int[] data)
    {
        //首先要获取Sedgewick序列
        ArrayList<Integer> sedgewick = new ArrayList<Integer>();
        int i=0;
        int j=0;
        int tempi=0;
        int tempj=0;
        while(true)
        {
            //9*2^2i-9*2^i+1,2^(2j+4)-3*2^(j+2)+1
            if(tempi == 0)
            {
                tempi = 9*(1 << (2*i))-9*(1 << i)+1;
            }
            if(tempj == 0)
            {
                tempj = (1 << (2*j+4)) - 3*(1<<(j+2))+1;
            }
            if(tempi>data.length && tempj>data.length) break;
            if(tempi < tempj)
            {
                sedgewick.add(tempi);
                tempi=0;
                i++;
            }
            else if(tempi == tempj)
            {
                sedgewick.add(tempi);
                tempi=0;
                tempj=0;
                i++;
                j++;
            }
            else if(tempi > tempj)
            {
                sedgewick.add(tempj);
                tempj = 0;
                j++;
            }
        }

        Collections.reverse(sedgewick);//倒序sedgewick序列
        //然后开始常规希尔排序的操作
        int step = 0;
        int temp = 0;
        for (i = 0; i < sedgewick.size(); i++) {//遍历sedgewick序列
            step = sedgewick.get(i).intValue();//注意这里要把Integer对象转换为int
            for(j = step ; j<data.length ; j++)
            {
                temp = data[j];
                int k = j;
                while(k-step >=0 && data[k-step]>temp)
                {
                    data[k] = data[k-step];
                    k = k-step;
                }
                if(k!=j)
                {
                    data[k] = temp;
                }
            }
        }
    }

    //归并排序中的合并操作
    public static void merge(int[] data, int low, int mid, int high, int[] temp)//传入辅助数组指针，防止多次调用merge函数时创建很多个辅助数组
    {
        for(int i=low ; i<=high ; i++)
        {
            temp[i] = data[i];
        }
        int low2 = mid+1;//这里需要表明一下第二个数组的起始位置
        int p = low;//写入原数组的指针位置
        while(low<=mid && low2<=high)
        {
            if(temp[low] <= temp[low2])//等号保证稳定性
            {
                data[p] = temp[low];
                low++;
            }
            else if(temp[low] > temp[low2])
            {
                data[p] = temp[low2];
                low2++;
            }
            p++;
        }
        //最后把两个数组中有剩余的那个数组剩下的所有元素并入data中
        if(low > mid)//说明第二个数组有剩余
        {
            for(int i=low2 ; i<=high ; i++)
            {
                data[p] = temp[i];
                p++;
            }
        }
        if(low2 > high)
        {
            for (int i = low; i <= mid; i++)
            {
                data[p] = temp[i];
                p++;
            }
        }
    }

    public static void method5(int[] data, int start, int end, int[] temp)//归并排序(递归，自顶向下)
    {
        if(start >= end) return;
        int mid = (start+end)/2;
        method5(data, start, mid, temp);
        method5(data, mid+1, end, temp);
        //优化
        if(data[mid] > data[mid+1]) {
            merge(data, start, mid, end, temp);
        }
    }

    public static void method5_1(int[] data, int[] temp)//归并排序（迭代，自底向上）
    {
        int i=0;
        int start=0;
        int end=0;
        int mid=0;
        int size=0;
        for(size=2; size <= data.length; size*=2)
        {
            i=0;
            while(true)
            {
                start = i*size;
                end = start + size -1;
                if(end >= data.length) end = data.length-1;
                mid = start + size/2 -1;//这里mid可能会爆炸，但恰好被下面的条件约束住了
                if(end-start+1>size/2 && data[mid]>data[mid+1])  merge(data,start,mid,end,temp);
                if(end==data.length-1) break;
                i++;
            }
        }
        merge(data,0,start-1,data.length-1,temp);
    }

    public static int partition(int[] data, int start, int end)//选取最左值为枢轴
    {
        int i =start;
        int j =end;
        int standard = data[start];
        while(j>i)
        {
            while(j>start && data[j]>=standard) j--;
            while(i<end && data[i]<=standard) i++;
            if(j>i)
            {
                swap(data,i,j);
            }
        }
        if(j!=start) swap(data,start,j);
        return j;
    }

    public static int partition2(int[] data, int start, int end)//选取左中右三个数的中数为枢轴
    {
        //将情况变为取最左为枢轴的情况
        int mid = (start + end)/2;
        if(data[mid]>data[end]) swap(data,mid,end);
        if(data[start]>data[end]) swap(data,start,end);
        if(data[mid]>data[start]) swap(data,start,mid);
        //结束，此时data[start]就是三数中数，剩下和之前都一样了

        int i =start;
        int j =end;
        int standard = data[start];
        while(j>i)
        {
            while(j>start && data[j]>=standard) j--;
            while(i<end && data[i]<=standard) i++;
            if(j>i)
            {
                swap(data,i,j);
            }
        }
        if(j!=start) swap(data,start,j);
        return j;
    }

    public static void method6(int[] data, int start, int end)//快速排序(左侧枢轴)
    {
        if(start<end)
        {
            int mid = partition(data,start,end);
            method6(data,start,mid-1);
            method6(data,mid+1,end);
        }
    }

    public static void method6_1(int[] data, int start, int end)//快速排序(三数中数枢轴)
    {
        if(start<end)
        {
            int mid = partition2(data,start,end);
            method6(data,start,mid-1);
            method6(data,mid+1,end);
        }
    }
    
    public static void method6_2(int[] data,int start, int end)//快速排序（最左枢轴，尾递归优化，应该说是减少了一个递归的堆栈消耗）
    {
        int mid = 0;
        while(start<end)
        {
            mid = partition(data,start,end);
            method6_2(data,start,mid-1);
            start = mid+1;
        }
    }

    //堆排序需要的方法
    public static void shiftdown(int[] data, int node, int end)
    {
        if(node*2+1 > end) return;//如果当前节点的左孩子超过了有效数组的最右端说明是叶子节点，直接返回
        //当前节点是非叶子节点(注意：可能只有左孩子，没有右孩子)
        int left = node*2+1;
        int right = node*2+2;
        int judge = 0;//0表示不动，1表示要往左掉，2表示要往右掉，为了减少交换次数设置的这个
        if(data[left]>data[node])
        {
            if(right<=end)//存在右孩子
            {
                if(data[left]>=data[right]) judge=1;
            }
            else judge=1;//不存在右孩子
        }
        if(right<=end && data[right]>data[node] && data[right]>data[left]) judge=2;
        //开始根据judge来交换
        if(judge==1)
        {
            swap(data,node,left);
            shiftdown(data,left,end);
        }
        if(judge==2)
        {
            swap(data,node,right);
            shiftdown(data,right,end);
        }
    }

    public static void Heapify(int[] data)
    {
        for (int i = data.length/2-1; i >=0 ; i--) {
            shiftdown(data,i,data.length-1);
        }
    }

    public static void method7(int[] data)//堆排序(原地+自下而上的shiftdown，即出队)
    {
        Heapify(data);
        int end = data.length-1;
        while(end>0)
        {
            swap(data,0,end);
            end--;
            shiftdown(data,0,end);
        }
    }

    public static void method8(int[] data)//计数排序
    {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        //找到最大值和最小值
        for (int i = 0; i < data.length; i++) {
            max = Math.max(max,data[i]);
            min = Math.min(min,data[i]);
        }
        int[] count = new int[max-min+1];//计数数组
        //开始计数
        for (int i = 0; i < data.length; i++) {
            count[data[i]-min]++;
        }
        //开始计算每个元素的截止位置(实际位置应该-1，在后面处理)
        for (int i = 1; i < count.length; i++) {
            count[i] = count[i]+count[i-1];
        }
        int[] temp = new int[data.length];
        //为了保证稳定性，得从后往前遍历data数组
        for (int i = data.length-1; i >=0 ; i--) {
            temp[count[data[i]-min]-1] = data[i];
            count[data[i]-min]--;
        }
        //把临时数组复制回原数组
        for (int i = 0; i < temp.length; i++) {
            data[i]=temp[i];
        }
    }
}
