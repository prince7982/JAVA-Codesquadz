import java.io.*;
class MyFileWriter
{
	public static void main(String s1[])throws IOException
	{
		FileOutputStream fw=new FileOutputStream("lalu.txt");//Write Mode
		//FileOutputStream fw=new FileOutputStream("lalu.txt",true);//Append Mode
		//FileOutputStream fw=new FileOutputStream(new File("D://f2/lalu2.txt"));//Write Mode
		//FileOutputStream fw=new FileOutputStream(new File("D://f2/lalu2.txt"),true);//Append Mode
		
		String s="india is good country in world and with corrupted leader ramdev and family babachorex nirmalbabachor/asaram chor/sudhanshu chor/shrishrichor nityachor radhay ma/bebo/mayachorni/manmohan urf shadow of sonia,robert damad,kalmari,salman khurshid,sharad pawar,chidambaram,mukesh ambani gadagarichor/rahul gandhi is single and ready to mingle(pappu) lal kitab baba,Rampal,ramraheem love charger,lalu yadav, nitish,AK49(shrabi),vijay malya,kanhaiya,akhilesh yadav(pappu 2.0),azam khan,mamta,hardik pagal,raja bhiya, badal and family,digvijay,kapil sibbel,tejesvi yadav(pappu 3.0),nellam modi,priyanka wadera,siddhu,owasi,raj thakre, dhirendra baba";
		
		byte ch[]=s.getBytes();
		//fw.write(ch);
		for(int i=0;i<ch.length;i++)
			fw.write(ch[i]);
		fw.close();
		System.out.println("file created Successfuly");
	}
}

class MyFileReader
{
	public static void main(String s1[])throws IOException
	{
		FileInputStream fr=new FileInputStream("lalu.txt");
		//FileInputStream fr=new FileInputStream(new File("D://f2/lalu2.txt"));
		int i=0;
		
		while((i=fr.read())!=-1)
			System.out.print((char)i);
		fr.close();
	}
}

class MyFileReader1
{
	public static void main(String s1[])throws IOException
	{
		FileInputStream fr=new FileInputStream("lalu.txt");
		//FileInputStream fr=new FileInputStream(new File("D://f2/lalu2.txt"));
		byte b[]=new byte[fr.available()];
		fr.read(b);
		String s=new String(b);
		System.out.print(s);
	}
}