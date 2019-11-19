# JAVA-
姓名：杜栩辰  学号：2018310755  班级：计181

实验目的
利用已学的字符串处理知识，如substring和substring等方法，编程完成《长恨歌》古诗的整理对齐工作。并练习使用throw完成一下工作：
1.	每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”
2.	允许提供输入参数，统计古诗中某个字或词出现的次数，并输出结果。
3.	考虑操作中可能出现的统计的字符不存在的异常，在程序中设计异常处理程序。在输入字符不存在时抛出异常。

实验过程
1.通过建立一个字符串数组并进行赋值，来实现将字符串用逗号和句号分隔的功能。
  String a[]=new String[34];
		
		//将输入参数用标点分隔
		for(int i=0;i<34;i=i+2) {
			a[i]=string.substring(x,y);
			m=i+1;
			a[m]=string.substring(p,q);
		    System.out.print(a[i]+"，"+a[m]+"。"+"\n");
		    x=x+14;
		    y=y+14;
		    p=p+14;
		    q=q+14;
		}
2.利用indexOf方法和substring方法统计参数中指定字符个数。其中indexof方法用来查找指定字符在字符串中第一次出现的位置，并返回一个int值，substring用来
  获取指定位置上的子字符串。我用了一个循环将两种方法结合，每次循环查找该字符第一次出现的位置，并获取从该位置到原字符串末尾的子字符串，计数加一，以此
  类推，直到子字符串中不再含有该字符，跳出循环。
  //统计指定字符出现的次数
		for(int i=0;i<100;i++) {
		    r1=string1.indexOf(string2);
				if(r1==-1)
			        break;
			string1 = string1.substring(r1+1,string1.length()-1);
		    s++;
		}
3. 建立异常处理机制，用来识别当要查询的字符不存在时出现提示。
   public class E extends Exception{
    E(String s) {
	    System.out.println(s);
	    }
   }
   try {
			Tongji t = new Tongji();
			t.T(str,"生");
		}
		catch(E e){
			System.out.println("统计的汉字不存在！");
		}
 实验运行截图
 查找《长恨歌》中有多少“生”字
 
 
 
 
 
