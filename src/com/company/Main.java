package com.company;
import sun.font.FontRunIterator;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        // write your code herepublic class zhishu{
//            int i,j;
//            int count=0;
//            for(i=1;i<=100;i++)
//            {
//                for(j=2;j<i;j++)
//                {
//                    if(i%j==0)
//                    {
//                        break;
//                    }
//                }
//                if(i==j)
//                {
//                    count++;
//                    System.out.println(i);
//                }
//            }System.out.println("素数总共有："+count);
//        }
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = {n};
//        for (int i = 0; i <= arr.length - 1; i++) {
//            System.out.println(arr[i]);
//        }
//        int [] arr={7,8,6,9,5};
//        int max=arr[0];
//        for(int i=1;i<arr.length;i++){
//            if(max<arr[i]){
//                max=arr[i];
//            }
//        }System.out.println(max);

//        System.out.print("请输入您的成绩：");
//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//        if (number > 100 || number < 0) {
//            System.out.println("您的成绩无效，正确成绩区间为0～100");
//        } else {
//            int n = number / 10;
//            switch (n) {
//                case 9:
//                    System.out.println("您的成绩为A等");
//                    break;
//                case 8:
//                    System.out.println("您的成绩为B等");
//                    break;
//                case 7:
//                    System.out.println("您的成绩为C等");
//                    break;
//                case 6:
//                    System.out.println("您的成绩为D等");
//                    break;
//                case 10:
//                    System.out.println("您的成绩为A等");
//                    break;
//                default:
//                    System.out.println("您的成绩为E等");
//                    break;
//            }
//        }
//        System.out.print("请输入您的工龄：");
//        Scanner sc = new Scanner(System.in);
//        int i = sc.nextInt();
//        System.out.print("请输入您的基本工资：");
//        int j = sc.nextInt();
//        int sum=0;
//        int a=0;
//        switch (i){
//            case 0:
//                a=200;
//                sum=a+j;
//                System.out.print("您目前工作了"+i+"年，基本工资为"+j+"元，应涨工资"+a+"元，涨后工资"+sum+"元");
//                break;
//            case 1:
//            case 2:
//                a=500;
//                sum=a+j;
//                System.out.print("您目前工作了"+i+"年，基本工资为"+j+"元，应涨工资"+a+"元，涨后工资"+sum+"元");
//                break;
//            case 3:
//            case 4:
//                a=1000;
//                sum=a+j;
//                System.out.print("您目前工作了"+i+"年，基本工资为"+j+"元，应涨工资"+a+"元，涨后工资"+sum+"元");
//                break;
//            case 5:
//            case 6:
//            case 7:
//            case 8:
//            case 9:
//                a=2500;
//                sum=a+j;
//                System.out.print("您目前工作了"+i+"年，基本工资为"+j+"元，应涨工资"+a+"元，涨后工资"+sum+"元");
//                break;
//            case 10:
//            case 11:
//            case 12:
//            case 13:
//            case 14:
//                a=5000;
//                sum=a+j;
//                System.out.print("您目前工作了"+i+"年，基本工资为"+j+"元，应涨工资"+a+"元，涨后工资"+sum+"元");
//                break;
//                default:
//
//                    System.out.print("您输入的工龄有误，请重新输入，谢谢！");
//                    break;
////        }
//        Scanner sc = new Scanner(System.in);
//        System.out.print("请输入第一个整数：");
//        int i = sc.nextInt();
//        System.out.print("请输入第二个整数：");
//        int j = sc.nextInt();
//        System.out.print("请输入第三个整数：");
//        int k = sc.nextInt();
//        int temp=0;
//        if(i>j){
//            temp=i;
//            i=j;
//            j=temp;
//        }
//        if (i>k){
//            temp=i;
//            i=k;
//            k=temp;
//        }if(j>k){
//            temp=j;
//            j=k;
//            k=temp;
//        }
//        System.out.println("按照从小到大排序后的顺序为："+i+" "+j+" "+k);
//
//        int x=2;
//        int y=3;
//
//        switch(x)
//        {
//            default:
//                y++;
//            case 3:
//                y++;
//                break;
//            case 4:
//                y++;
//        }
//
//        System.out.println("y="+y);
//
//
//        int[][] arr={{22,66,44},{77,33,88},{25,45,65},{11,66,99}};
//        int sum=0;
//        for (int i=0;i<arr.length;i++){
//            for (int j=0;j<arr[i].length;j++){
//                System.out.println(arr[i][j]);
//                sum+=arr[i][j];
//            }
//        }
//        System.out.println(sum);
//        Scanner sc = new Scanner(System.in);
//        int [] arr=new int[3];
//        for(int i=0;i<arr.length;i++){
//        System.out.print("请输入一个整数：");
//         arr[i] = sc.nextInt();
//        }
//        for(int a=0;a<3;a++){
//
//            System.out.println(arr[a]);}
/*        int area = getArea(4, 5);
        System.out.println(area);
        getju();
        System.out.println("请输入一个值：");
        getInt();
        geta(5,5);
        getavg(1,2,3);

    }

    public static int getArea(int w, int h) {
        return w * h;
    }

    public static void getju() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static int getInt(){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(a);
        return a;
    }
    public static void geta(int x,int y){
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static int getavg(int x,int y,int z){
        int c=(x+y+z)/3;

        System.out.println(c);
        return c;
    }        */
      /*  String []names = new String[4];
        addStudent(names);
        printStudentName(names);
        String name = randomStudentName(names);
        System.out.println(name);

    }

    public static void addStudent(String[] name) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < name.length;i++) {
            System.out.println("请输入第" + (i + 1) + "个学生的姓名:");
            name[i] = sc.next();
        }
    }

    public static void printStudentName(String[] names) {
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }

    public static String randomStudentName(String[] names) {
        Random ran = new Random();
        int index = ran.nextInt(names.length);
        return names[index];
    } */
    /*    System.out.print("请输入一个整数：");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.print("请输入一个小数：");
        double b=sc.nextDouble();
        sum(a,b);


        System.out.print("请输入一个整数：");
        Scanner sc1=new Scanner(System.in);
        int c=sc1.nextInt();
        System.out.print("请输入一个小数：");
        double d=sc.nextDouble();
        dengyu(c,d);


        System.out.print("请输入一个整数：");
        Scanner sc2=new Scanner(System.in);
        int e=sc2.nextInt();
        System.out.print("请输入一个小数：");
        double f=sc2.nextDouble();
        int g=sc2.nextInt();
        System.out.print("请输入一个整数：");
        bijiao(e,f,g); */
   /*     System.out.println("--------------------第（1）问-------------------");
        sum(1, 2.0);
        sum(3.0, 4.2);
        sum(0.1, 1);
        sum(0.3, 1);
        System.out.println("--------------------第（2）问-------------------");
        equal(1, 3);
        equal(3, 3.0);
        equal(14.0, 3);
        equal(10.0, 3.0);
        System.out.println("--------------------第（3）问-------------------");
        sum(1, 2.0, 3);
        sum(3.1, 2, 1);
        sum(2, 1.9, 3);
        System.out.println("--------------------第（4）问-------------------");
        System.out.println("请输入两个整数：");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        rectangle(m,n);
        System.out.println("--------------------第（5）问-------------------");
        System.out.println("请输入一个整数：");
        Scanner sc1 = new Scanner(System.in);
        int h = sc.nextInt();
        nn(h);
        System.out.println("--------------------第（6）问-------------------");
        area(12,14);
        area(10);
    }

    public static void sum(int a, double b) {
        double s = a + b;
        System.out.println("两个数据之和为：" + s);
    }

    public static void sum(double a, double b) {
        double s = a + b;
        System.out.println("两个数据之和为：" + s);
    }

    public static void sum(double a, int b) {
        double s = a + b;
        System.out.println("两个数据之和为：" + s);
    }

    public static void sum(int a, int b) {
        double s = a + b;
        System.out.println("两个数据之和为：" + s);
    }

    public static void equal(int c, double d) {
        if (c == d) {
            System.out.println("相等");
        } else {
            System.out.println("不相等");

        }
    }

    public static void equal(int c, int d) {
        if (c == d) {
            System.out.println("相等");
        } else {
            System.out.println("不相等");

        }
    }

    public static void equal(double c, double d) {
        if (c == d) {
            System.out.println("相等");
        } else {
            System.out.println("不相等");

        }
    }

    public static void equal(double c, int d) {
        if (c == d) {
            System.out.println("相等");
        } else {
            System.out.println("不相等");

        }
    }

    public static void sum(int e, double f, int g) {
        if (e > f && e > g) {
            System.out.println(e);
        } else if (f > e && f > g) {
            System.out.println(f);
        } else System.out.println(g);
    }

    public static void sum(double e, double f, int g) {
        if (e > f && e > g) {
            System.out.println(e);
        } else if (f > e && f > g) {
            System.out.println(f);
        } else System.out.println(g);
    }
    public static void rectangle(int m,int n){

        for (int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }System.out.println();
        }

    }
    public static void nn(int a){
        for (int i=1;i<=a;i++){
            for(int j=1;j<=a;j++){
                System.out.println(i+"*"+j+"="+(i*j));
            }System.out.println();
        }

    }
    public static void area(int a,int b){
        int c=a*b;
        System.out.println("长方形面积为："+c);
    }
    public static void area(int a){
        double b=3.14*a*a;
        System.out.println("圆形的面积为："+b);
    }*/
 /*       jump9();
        jump9(5);
    }

    public static void jump9() {
        for (int i = 1; i <= 100; i++) {
            if ((i / 10) == 9 || (i % 10) == 9) {
                continue;
            }
            System.out.println(i);
        }
    }

    public static void jump9(int a) {
        int count = 0;
        for (int i = 1; i <= 100; i++) {

            if ((i / 10) == 9 || (i % 10) == 9) {
                continue;
            }
            System.out.print(i+",");
            count++;
            if (count % 5 == 0) {
                System.out.println(" ");
            }

        }*/
 /*  sushu();
    }
    public static void sushu () {
        int count = 0;
        int i,j;
        for ( i = 2; i <= 100; i++) {
            for ( j = 2; j < i; j++) {
                if(i % j == 0) {
                    break;
                }
            }
            if(j>=i){
                System.out.print(i+",");
                count++;
                if (count%5==0){
                    System.out.println(" ");
                }
            }
        }
        System.out.println("质数总共有"+count);
    }  */


//        String [] students =new String[3];
//        Scanner sc = new Scanner(System.in);
//        name(students);
//        names( "张三","李四","王五");
//    }
//    public static void names(String a,String b,String c){
//
//    }
//    public static void name(String[]name){
//
//        String [] name1 =[] students;
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < name1.length; i++) {
//            System.out.println("存储第"+(i+1)+"个名称：");
//            name1[i] = sc.next();
//        }
//    }
//    public static void name(){
//        for (int i=0;i<students.length)
//    }
//}String[] arr=new String[4];
  /*      System.out.println("--------随机点名器--------");
        String[] arr=new String[3];
        name(arr);
        BianLi(arr);
        random(arr);
        System.out.println("被点到的学生是: "+random(arr));
    }
    //创建输入学生姓名的类
    public static void name(String[] arr){
        System.out.print("请输入三个学生的姓名： ");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
            arr[i]=sc.next();
    }
    //遍历学生姓名
    public static void BianLi(String[] name){
        for(int i=0;i<name.length;i++)
            System.out.println(name[i]);
        System.out.println("---------------------------------------------------------");
    }
    //产生随机数
    public static String random(String[] name){
        Random r=new Random();
        int a = r.nextInt(name.length);
        return name[a];
    }    */
     /*   System.out.println("请输入一个值：");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>=60){
            System.out.println("OK");
        }else{
            System.out.println("sorry");
        } */
      /*  for(int i=1;i<20;i++){
            System.out.print(i+"个一元硬币，");
            int b=2*(20-i);
            System.out.println(b+"个5角硬币");
        }
*/

//        int[] arr = {1, 2, 3, 3, 2, 1, 1, 2, 3, 4, 5, 6, 7};
//        int[] arr1 = {1, 2, 3, 3, 2, 1, 1, 2, 3, 4, 5, 6, 7};
//
//        int i,j;
//        if(arr[arr.length]==arr1[arr.length-1])
//        {
//            System.out.println(arr[arr.length]);
//        }else{
//            System.out.println("  ");
//        }
//        for (i = 0; i < arr.length; i++) {
//            for ( j=1; j < arr.length;j++){
//                if(arr[i]==arr[j])
//                break;
//            }
//            System.out.println(i+"--"+j);
//            if(arr[i]!=arr[j]){
//            System.out.println(arr[i]);}
//        }
    /*    int[] arr = {1,2,3,3,2,1,1,2,3,4,5,6,7};
        boolean[] flags = new boolean[arr.length];
        for (int i = 0; i < arr.length-1; i++) {
            System.out.println(i+"-------");
            for (int j = i+1; j < arr.length; j++) {
                System.out.println(i+"=========="+j);
                System.out.println(arr[i]+"*********"+arr[j]);
                if (arr[i] == arr[j]){
                    flags[j] = true;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (!flags[i]){
                System.out.println(arr[i]);
            }
        } */
  /*  boolean isPrimeNum;
        int count=0;
        for(int i=100;i<1000;i++){
            isPrimeNum =true;
            for (int j=2;j<i;j++){
                if (i%j==0){
                    isPrimeNum=false;
                    break;
                }
            }if (isPrimeNum){
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count+"个素数！");    */

 /*       ArrayList<String> array=new ArrayList<>();
        array.add("abc");
        array.add("itcast");
        array.add("love");
        array.add("java");
        for(int i=0;i < array.size();i++){
            System.out.println(array.get(i));
        }
*/
 /* ArrayList<StudentName>array=new ArrayList<StudentName>();
        add(array);
        printArrayList(array);
        randomStudentName(array);
    }*/
    /*
   定义方法,实现存储学生的姓名和年龄
   创建StudentName类型变量,存储到集合中
*/
  /*  public static void add(ArrayList<StudentName>array){
        //创建StudentName类型变量
        StudentName sn1=new StudentName();
        StudentName sn2=new StudentName();
        StudentName sn3=new StudentName();
        StudentName sn4=new StudentName();
        StudentName sn5=new StudentName();

        sn1.name="张11";
        sn1.age=11;
        sn2.age=11;
        sn2.name="张22";
        sn3.age=11;
        sn3.name="张33";
        sn4.age=11;
        sn4.name="张44";
        sn5.age=11;
        sn5.name="张55";

        //将StudentName变量,存储到集合中
        array.add(sn1);
        array.add(sn2);
        array.add(sn3);
        array.add(sn4);
        array.add(sn5);
    } */
    /*
	    总览学生的信息,遍历集合
	*/
 /*   public static void printArrayList(ArrayList<StudentName>array){
        for (int i = 0; i < array.size(); i++) {

            //存储集合的时候, 集合.add(sn1)  sn1 是StudentName类型变量
            //获取的时候,集合.get方法,获取出来的是什么, 还是StudentName类型变量
            StudentName s=array.get(i);
            System.out.println(s.name+"  "+s.age);
        }

    } */
    /*
      随机数,当作集合的索引,到集合中找到元素
    */
/*    public static void randomStudentName(ArrayList<StudentName>array) {
        Random r=new Random();
        int number =r.nextInt(array.size());
        //随机数,索引,到集合中get
        StudentName s=array.get(number);
        System.out.println(s.name+" "+s.age);
    }*/

//    String r ="123456";
//        System.out.println(r.length());

    /*    ArrayList<Student>A=new ArrayList<Student>();
        saveStudent(A);
        printStudent(A);
        maxAge(A);

    }*/
    /*
     定义方法,实现存储学生的姓名和年龄
     创建Student类型变量,存储到集合中
  */
  /*  public static void saveStudent(ArrayList<Student>A) {
       // 创建Student类型变量
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();

        s1.name="穿山甲";
        s1.age=100;
        s1.sex='男';
        s2.name="蛇精";
        s2.age=999;
        s2.sex='女';
        s3.name="蝎子精";
        s3.age=1000;
        s3.sex='男';

        //将StudentName变量,存储到集合中
        A.add(s1);
        A.add(s2);
        A.add(s3);
    }
    public static void printStudent(ArrayList<Student>A){
        for (int i = 0; i <A.size() ; i++) {
            Student a=A.get(i);
            System.out.println(a.name+" "+a.age);
        }
    }
//求出年龄最大的学生，让后将该对象的姓名变为：葫芦娃。
    public static void maxAge(ArrayList<Student>A) {
            Student a=A.get(0);
            Student b=A.get(1);
            Student c=A.get(2);

            if (a.age>b.age&&a.age>c.age){
                a.name="葫芦娃";
                System.out.println("年龄最大的为："+a.name+",他有"+a.age+"岁");

            }else if (b.age>a.age&&b.age>c.age){
                b.name="葫芦娃";
                System.out.println("年龄最大的为："+b.name+",他有"+b.age+"岁");

        }else if (c.age>a.age&&c.age>b.age){
                c.name="葫芦娃";
                System.out.println("年龄最大的为："+c.name+",他有"+c.age+"岁");

            }*/
      /*  ArrayList<Phone>b=new ArrayList<Phone>();
        inputPhone(b);
        outputPhone(b);
    }

    public static void inputPhone(ArrayList<Phone>b) {
        //创建四个手机("小米"、"华为"、"乐视"、"奇酷")对象存入ArrayList集合中
        Phone p1=new Phone();
        Phone p2=new Phone();
        Phone p3=new Phone();
        Phone p4=new Phone();

        p1.brand="小米";
        p1.color="银色";
        p1.price=1999;
        p2.brand="华为";
        p2.color="黑色";
        p2.price=2850;
        p3.brand="乐视";
        p3.color="金色";
        p3.price=1800;
        p4.brand="奇酷";
        p4.color="白色";
        p4.price=899;

        b.add(p1);
        b.add(p2);
        b.add(p3);
        b.add(p4);
    }

    public static void outputPhone(ArrayList<Phone>b) {
        //遍历输出
        for (int i = 0; i <b.size() ; i++) {
            Phone a=b.get(i);
            System.out.println(a.brand+" "+a.color+" "+a.price);
        }*/

   /*   ArrayList<Employee>e=new ArrayList<Employee>();
        inputEmployee(e);
        outputEmployee(e);

    }
    public static void inputEmployee(ArrayList<Employee>e) {
        //创建3个对象存入ArrayList集合中
        Employee e1=new Employee();
        Employee e2=new Employee();
        Employee e3=new Employee();

        e1.name="老王";
        e1.number=110;
        e1.money=8000;

        e2.name="老彭";
        e2.number=111;
        e2.money=4000;

        e3.name="老张";
        e3.number=101;
        e3.money=18000;

        e.add(e1);
        e.add(e2);
        e.add(e3);


    }

    public static void outputEmployee(ArrayList<Employee>e) {
//遍历输出
        for (int i = 0; i <e.size() ; i++) {
            Employee a=e.get(i);
            System.out.println("姓名："+a.name+" 工号："+a.number+" 工资："+a.money);
        }*/
        //求取100～999之间的水仙花数，并计算个数，
   /*     int bai=0;
        int shi=0;
        int ge=0;
        int count=0;
      //  定义这个数的百位，十位，各位，然后循环判断
        for (int i = 100; i <1000 ; i++) {
            bai=i/100;
            shi=i/10%10;
            ge=i%10;
            if (bai*bai*bai+shi*shi*shi+ge*ge*ge==i){
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
*/
/*
        for (int i = 1; i <10 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+"*"+i+"="+i*j+"\t");
            }
            System.out.println();
        }    */
/*
   数组的逆序:
     数组中的元素,进行位置上的交换
	 逆序 不等于 反向遍历
	 就是数组中最远的两个索引,进行位置交换,实现数组的逆序
	 使用的是数组的指针思想,就是变量,思想,可以随时变换索引
	 反转 reverse
	 实现步骤:
	   1. 定义方法,实现数组的逆序
	   2. 遍历数组
	     实现数组的最远索引换位置
		 使用临时的第三方变量
*/

    /*    int [] arr={1,3,5,7,9,10};
        reverse(arr);//调用数组的逆序方法
        printArray(arr);		//看到数组的元素,遍历

    }
    /*
       定义方法,实现数组的逆序
       返回值: 没有返回值
       参数:   数组就是参数
    */
 /*   public static void reverse(int []arr) {
        //利用循环,实现数组遍历,遍历过程中,最远端换位
        //for的第一项,定义2个变量, 最后,两个变量++ --

        for (int min = 0,max=arr.length-1; min <max ; min++,max--) {

            //对数组中的元素,进行位置交换
            //min索引和max索引的元素交换
            int temp =arr[min];      //定义变量,保存min索引
            arr[min]=arr[max];		//max索引上的元素,赋值给min索引
            arr[max]=temp;		   //临时变量,保存的数据,赋值到max索引上
        }
    }
    /*
   定义方法,实现功能
   返回值: void
   方法参数: 数组
*/
 /*   public static void printArray(int [] arr){
        System.out.print("[");		//输出一半中括号,不要换行打印
        //数组进行遍历

        for (int i = 0; i <arr.length ; i++) {

            //判断遍历到的元素,是不是数组的最后一个元素
            //如何判断 循环变量 到达 length-1
            if (i==arr.length-1){
                //输出数组的元素和]

                System.out.print(arr[i]+"]");
            }else {
                //不是数组的最后一个元素,输出数组元素和逗号

                System.out.print(arr[i]+",");
            }
        }
        System.out.println();
    }*/
    /*    int [] arr={7,3,2,7,1,10};
        selectShort(arr);
        printArray(arr);
    }

    public static void selectShort(int[]arr) {
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i]>arr[j]){
                    int temp =arr[i];      //定义变量,保存min索引
                    arr[i]=arr[j];		//max索引上的元素,赋值给min索引
                    arr[j]=temp;
                }
            }
        }

    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i <arr.length ; i++) {

            //判断遍历到的元素,是不是数组的最后一个元素
            //如何判断 循环变量 到达 length-1
            if (i==arr.length-1){
                //输出数组的元素和]

                System.out.print(arr[i]+"]");
            }else {
                //不是数组的最后一个元素,输出数组元素和逗号

                System.out.print(arr[i]+",");
            }
        }
        System.out.println();    */

     /*   int count=0;
        for (int i = 1; i <= 100; i++) {
            if (i / 10 == 9 || i % 10 == 9) {
                continue;
            }
            System.out.print(i + " ");
            count++;
            if (count%5==0)
            System.out.println(" ");
        }  */
    /*    equal();
    }
//按照从大到小的顺序输出四位数中的个位+百位=十位+千位(3553,2332,1166,8228,3773)的数字及个数
    public static void equal() {
        int count=0;
        for (int i = 10000; i >=1000 ; i--) {
            int ge=i%10;
            int shi=i/10%10;
            int bai=i/100%10;
            int qian=i/1000;

            if (ge+bai==shi+qian){
                System.out.print(i+" ");
                count++;
                //每行输出5个满足条件的数，之间用空格分隔

                if (count%5==0){
                    System.out.println(" ");
                }
            }
        }
        System.out.println(count);   */
        //	(1)倒着打印九九乘法表
/*
        for (int i = 9; i >0 ; i--) {
            for (int j = 1; j<=i ; j++) {
                int a=i*j;
                System.out.print(i+"*"+j+"="+a+"\t");
            }System.out.println();
        }*/
     /*   int sum=0;
        for (int i = 15; i <=1005 ; i+=10) {
            sum+=i;
        }
        System.out.println(sum);  */

   /*  int [] arr={6,2,9,15,1,5,20,7,18};
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                int max=0;
                if (arr[i]>arr[j]){
                    max=arr[i];
                    System.out.println(max);
                }  */

//        Scanner s=new Scanner(System.in);
//定义一个int类型的一维数组，内容为{6,2,9,15,1,5,20,7,18}
    /*    int[] arr = {6, 2, 9, 15, 1, 5, 20, 7, 18};
        int indexmax=findMax(arr);
        int indexmin=findMin(arr);
        int temp = 0;
        temp=arr[arr.length-1];
        arr[arr.length-1]=arr[indexmax];
        arr[indexmax]=temp;
        temp=arr[0];
        arr[0]=arr[indexmin];
        arr[indexmin]=temp;
        printArray(arr);
    }
//	提示思路：先查找最大值和最小值出现的索引。
    public static int findMax(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
//        System.out.println(max);
        return max;
    }
    public static int findMin(int[] arr) {
        int min = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[min] > arr[j]) {
                min = j;
            }
        }
//        System.out.println(min);
        return min;
    }
    //将数组最大元素与最后一位元素进行交换,最小元素与第一位元素进行交换，并打印数组
    public static void printArray(int[]arr){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }    */

  /*      int[]arr=new int[6];
        saveArray(arr);
    }

    public static void saveArray(int[]arr) {
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + i + "个数:");
            arr[i] = s.nextInt();
        }
    }

    public static void receive(int[]arr) {
        for (int start=0,end=arr.length-1;start<end;start++,end--){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        }       */

/*

                int[] arr=new int[6];
                scan(arr);
                bianLi(arr);
                fanZhuan(arr);
                System.out.println("");
                System.out.println("反转后的数据：");
                bianLi(arr);
                //调用奇数角标互换
                huHuan(arr);
                System.out.println("");
                System.out.println("奇数互换后的数据：");
                bianLi(arr);
                System.out.println("");
                System.out.println("数组最后一个角标为奇数的元素 和数组中第一个角标为奇数的元素交换");

                int temp=0;
                temp=arr[1];
                arr[1]=arr[5];
                arr[5]=temp;
                bianLi(arr);

            }//奇数角标互换
            public static void huHuan(int[] arr){
                int temp=0;
                for(int a=1;a<arr.length-1;a+=2){
                    temp=arr[a];
                    arr[a]=arr[a+2];
                    arr[a+2]=temp;
                }
            }


            //键盘录入值
            public static void scan(int[] arr){
                Scanner sc=new Scanner(System.in);
                System.out.println("请输入6个整型的数据：");
                for(int i=0;i<arr.length;i++){
                    arr[i]=sc.nextInt();
                }
            }
            //遍历
            public static void bianLi(int[] arr){
                System.out.print("[");
                for(int i=0;i<arr.length;i++){
                    if(i==arr.length-1){
                        System.out.print(arr[i]+"]");
                    }
                    else
                        System.out.print(arr[i]+"  ");
                }
            }
            //将数组中的内容反转
            public static void fanZhuan(int[] arr){
                int temp=0;
                for(int a=0,b=arr.length-1;a<b;a++,b--){
                    temp=arr[a];
                    arr[a]=arr[b];
                    arr[b]=temp;
                }  */
//        int count = 0;
//        int i, j;
//        for (i = 1000; i <= 10000; i++) {
//            for (j = 2; j < i; j++) {
//                if (i % j == 0) {
//                    break;
//                }
//            }
//            if (j >= i) {
//                count++;
//                System.out.println(count);
//            }
//        }
    /*    int []arr={3,6,9,1,5,8,12};
        int a=11;

        int []array=addTwoNum(arr,a);
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }

    }

    public static int[] addTwoNum(int[]arr,int num) {
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 1; j <arr.length ; j++) {
                if (arr[i]+arr[j]==num){
//                    System.out.println("["+i+j+"]");
                    int [] array={i,j};

                }
            }
        }
        return arr;} */
    ArrayList<students> arr=new ArrayList<students>();

        addStudents(arr);
     int abc = changeNameMax(arr);
           students aaa= arr.get(abc);
        aaa.name="熊大";

        int cba=changeNamemin(arr);
        students bbb=arr.get(cba);
        bbb.name="熊二";
        printSN(arr);

    }
    public static void addStudents(ArrayList<students>arr){
        //2.	利用new关键字创建4个学生
        Scanner sc=new Scanner(System.in);
        students e1=new students();
        students e2=new students();
        students e3=new students();
        students e4=new students();
        //	为4个学生的姓名和年龄赋值
        System.out.println("请输入一个学生姓名");
        e1.name=sc.next();
        System.out.println("请输入一个学生年龄");
        e1.age=sc.nextInt();

        System.out.println("请输入一个学生姓名");
        e2.name=sc.next();
        System.out.println("请输入一个学生年龄");
        e2.age=sc.nextInt();

        System.out.println("请输入一个学生姓名");
        e3.name=sc.next();
        System.out.println("请输入一个学生年龄");
        e3.age=sc.nextInt();

        System.out.println("请输入一个学生姓名");
        e4.name=sc.next();
        System.out.println("请输入一个学生年龄");
        e4.age=sc.nextInt();

//        3.	将这四个学生添加到集合中
        arr.add(e1);
        arr.add(e2);
        arr.add(e3);
        arr.add(e4);

    }
//    将集合中年龄最大的学生改名为“熊大”
    public static int changeNameMax(ArrayList<students>arr) {
        int temp=0;
        for (int i = 0; i <arr.size(); i++) {
            students a=arr.get(temp);
            students b=arr.get(i);
                if (a.age<b.age){
                    temp=i;
                }
            }
//        System.out.println(temp);
        return temp;
    }
//    年龄最小的学生改名为“熊二”；
    public static int changeNamemin(ArrayList<students>arr) {
        int temp1=0;
        for (int i = 0; i <arr.size(); i++) {
            students a=arr.get(temp1);
            students b=arr.get(i);
            if (a.age>b.age){
                temp1=i;
            }
        }
//        System.out.println(temp1);
        return temp1;
    }

    public static void printSN(ArrayList<students>arr) {
        for (int i = 0; i <arr.size() ; i++) {
            students abc=arr.get(i);
            System.out.println("姓名："+abc.name+"   年龄"+abc.age);
        }
    }
}










