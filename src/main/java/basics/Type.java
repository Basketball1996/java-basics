package basics;

import sun.security.provider.SHA;

public class Type {
    public static void main(String[] args) {

        //groupId和artifactId的区别：
        //groupId和artifactId是java项目的坐标,group分为段,一段为域名,一段为公司名称,域又分为com,cn,org等许多,其中org为非盈利组织,com是商业组织。
        //比如我新建一个项目,groupId是com.guolei,artifactId是demo,合起来就是com.guolei.demo


        //java八种基本类型   整型:byte,int,short,Long  浮点型:float,double  布尔型:boolean  字符型：char

        //附加：变量就是申请内存来存储值，也就是说，当创建变量的时候，需要在内存中申请空间，内存管理系统根据变量的类型为变量申请存储空间，分配的空间只能用来存储该类型的数据，
        //因此，根据创建不同类型的变量，可以在内存中存储不同类型的值。

        //byte
        //byte类型是8位，以二进制补码表示的整数(256个数字)占一个字节。
        //最小值是:-128(-2^7)
        //最大值是:127(2^7-默认值是:01)
        //        //
        //byte用在大型数组中节约空间，主要代替整数，因为byte变量占用的空间只有int类型的四分之一

        byte a = 100;
        Byte b = new Byte(a);  //表示指定的byte的值。
        System.out.println(b);

        //byte类型进行运算过程中会提升到int类型或者更高类型，这是因为java在计算过程中会把int类型当作一个int类型的字面值进行处理。

        String str = "12";
        Byte c = new Byte(str);  //表示String参数所表示的byte值
        System.out.println(c);

        //byte类型的4个常量
        System.out.println( Byte.TYPE);  //表示的是byte类型的class实例。
        System.out.println(Byte.SIZE);  //表示的是二进制补码形式表示的byte位数
        System.out.println(Byte.MIN_VALUE);  //byte的最小值
        System.out.println(Byte.MAX_VALUE);  //byte的最大值


        //short
        //short数据类型是16位，有符号的二进制补码表示的整数，占2字节
        //最小值是-32768(-2^15)
        //最大值是32767(2^15-1)
        //节省空间，一个short变量是int类型的二分之一，默认值
        Short s = 100;
        Short sho = new Short(s);
        String strShort = "100";
        System.out.println(Short.decode(strShort));   //以strShort字符串为代表的short值
        System.out.println(Short.reverseBytes(s));  //此方法返回通过反转指定short值的字节数得到的值。


        //int
        //int类型是32位，有符号以二进制补码表示的整数，占3个字符
        //最小值是-2147483648(-2^31)
        //最大值是2147485647(2^31-1)
        //一般的整数变量默认为int类型；
        //默认值是0
        int i = 10;

       // long

//        long数据类型是64位、有符号的以二进制补码表示的整数；占4字节
//        最小值是-9,223,372,036,854,775,808（-2^63）；
//        最大值是9,223,372,036,854,775,807（2^63 -1）；
//        这种类型主要使用在需要比较大整数的系统上；
//        默认值是0L；
//        例子： long a = 100000L，int b = -200000L。
            float f =1.8F;
            System.out.println(f);

        //double

//        double数据类型是双精度、64位、符合IEEE 754标准的浮点数；
//        浮点数的默认类型为double类型；
//        double类型同样不能表示精确的值，如货币；
//        默认值是0.0d；
//        例子：double d1 = 123.4。
        double d = 22.2;
        System.out.println(d);

        //boolean
//        boolean数据类型表示一位的信息；
//        只有两个取值：true和false；
//        这种类型只作为一种标志来记录true/false情况；
//        默认值是false；
//        例子：boolean one = true。


//        char
//        char类型是一个单一的16位Unicode字符；用 ‘’表示一个字符。。java 内部使用Unicode字符集。。他有一些转义字符  ，2字节
//        最小值是’\u0000’（即为0）；
//        最大值是’\uffff’（即为65,535）；可以当整数来用，它的每一个字符都对应一个数字.
        char c1 = 'a';
        char c2 = '上';
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c1 + c2);
    }
}
