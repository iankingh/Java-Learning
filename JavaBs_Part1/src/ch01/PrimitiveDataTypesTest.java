package JavaBs_Part1.src.ch01;


/**
 * 
 * 
 * <p/>
 * Package: ch1 <br>
 * File Name: PrimitiveDataTypesTest <br>
 * <p/>
 * Purpose: <br>
 * 
 * @ClassName: ch1.PrimitiveDataTypesTest
 * @Description: 測試基本數據類型
 * @Copyright : Copyright (c) Corp. 2020. All Rights Reserved.
 * @Company: ian Team.
 * @author ian
 * @version 1.0, 2020年5月18日
 */
public class PrimitiveDataTypesTest {

    static byte b;
    static short s;
    static int i;
    static long l;
    static float f;
    static double d;
    static char c;
    static boolean bo;
    public static void main(String[] args) {

        System.out.println("byte的大小：" + Byte.SIZE + " byte的預設值：" + b + " byte的資料範圍：" + Byte.MIN_VALUE + "~"
                + Byte.MAX_VALUE);
        System.out.println("----------------------------------------------------");
        System.out.println("short的大小：" + Short.SIZE + " short的預設值：" + s + " short的資料範圍：" + Short.MIN_VALUE + "~"
                + Short.MAX_VALUE);
        System.out.println("----------------------------------------------------");
        System.out.println("int的大小：" + Integer.SIZE + " int的預設值：" + i + " int的資料範圍：" + Integer.MIN_VALUE + "~"
                + Integer.MAX_VALUE);
        System.out.println("----------------------------------------------------");
        System.out.println("long的大小：" + Long.SIZE + " long的預設值：" + l + " long的資料範圍：" + Long.MIN_VALUE + "~"
                + Long.MAX_VALUE);
        System.out.println("----------------------------------------------------");
        System.out.println("float的大小：" + Float.SIZE + " float的預設值：" + f + " float的資料範圍：" + Float.MIN_VALUE + "~"
                + Float.MAX_VALUE);
        System.out.println("----------------------------------------------------");
        System.out.println("double的大小：" + Double.SIZE + " double的預設值：" + d + " double的資料範圍：" + Double.MIN_VALUE
                + "~" + Double.MAX_VALUE);
        System.out.println("----------------------------------------------------");
        System.out.println("char的大小：" + Character.SIZE + " char的預設值：" + c + " char的資料範圍：" + Character.MIN_VALUE
                + "~" + Character.MAX_VALUE);
        System.out.println("----------------------------------------------------");
        System.out.println("boolean的大小：" + Byte.SIZE + " boolean的預設值：" + bo + " boolean的資料範圍：" + Byte.MIN_VALUE
                + "~" + Byte.MAX_VALUE);




    }

}
