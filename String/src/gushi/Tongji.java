package gushi;

public class Tongji {
	public void T(String string1,String string2) throws E{
		int r1,r2,s=0;
		//统计指定字符出现的次数
		for(int i=0;i<100;i++) {
		    r1=string1.indexOf(string2);
				if(r1==-1)
			        break;
			string1 = string1.substring(r1+1,string1.length()-1);
		    s++;
		}
				
        //构造异常
		if(s==0) {
			E e=new E("抛出异常");
			throw e;
		}
		
		System.out.print("\n"+string2+"字出现的字数为： "+s);
	}
}
