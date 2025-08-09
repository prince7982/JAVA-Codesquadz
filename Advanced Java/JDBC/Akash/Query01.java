import java.sql.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;

class Query01
{
	Query01()
	{
		
	}
	
	public static void main(String... ji)
	{
		Connect con=new Connect();
		//new CreateFirstForm();
	}
}
class CreateFirstForm
{
	StringBuffer strQuery=new StringBuffer("select ");//to store prepared query
	StringBuffer orderbyBuffer=new StringBuffer(" ");
	StringBuffer criteriaBuffer=new StringBuffer(" ");
	int createQueryStatus=0;
	
	JFrame jf1;
	JLabel jl1,jl2,jl3,jl4,jl5;
	JComboBox jcom1,jcom2,jcom3;
	JTextField jtf1;
	JList jlist1,jlist2;
	JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7,jbtemp;
	JCheckBox jcb1;
	JRadioButton jrb1,jrb2,jrb3;
	JScrollPane jsp1,jsp2;
	ButtonGroup bg1;
	
	JFrame jfl1;
	JButton jbl1=new JButton("Add");
	JButton jbl2=new JButton("OK");
	JButton jbl3=new JButton("Cancel");
	JComboBox jcoml1;
	JRadioButton jrbl1=new JRadioButton("Ascending");
	JRadioButton jrbl2=new JRadioButton("Descending");
	
	CreateFirstForm()
	{
		jf1=new JFrame("Query Builder");
		jf1.setSize(700,550);
		jf1.setLocation(50,30);
		jf1.setLayout(null);
		
		jl1=new JLabel("Table to be Queried ");
		jl1.setBounds(40,10,200,25);
		jf1.add(jl1);
		
		jcom1=new JComboBox(Connect.tableNames);
		jcom1.setBounds(40,40,200,25);
		jf1.add(jcom1);
		
		jb1=new JButton("Refresh");
		jb1.setBounds(300,40,100,25);
		jf1.add(jb1);
		
		jlist1=new JList(); //add jlist to jscrollpane
		jsp1=new JScrollPane(jlist1,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		jsp1.setBounds(40,80,200,200);
		jf1.add(jsp1);
		
		jb2=new JButton(" >> ");
		jb2.setBounds(280,120,135,25);
		jf1.add(jb2);
		
		jb3=new JButton(" << ");
		jb3.setBounds(280,160,135,25);
		jf1.add(jb3);
		
		jb4=new JButton(" <<< ");
		jb4.setBounds(280,200,135,25);
		jf1.add(jb4);
		
		jcb1=new JCheckBox("Order By");
		jcb1.setBounds(300,250,135,30);
		jf1.add(jcb1);
		
		jlist2=new JList(); //add jlist to jscrollPane
		jsp2=new JScrollPane(jlist2,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		jsp2.setBounds(450,80,200,200);
		jf1.add(jsp2);
		
		jl2=new JLabel("Criteria ");	jl2.setBounds(40,350,200,25);	jf1.add(jl2);
		jl3=new JLabel("Fields :");		jl3.setBounds(40,400,200,25); 	jf1.add(jl3);
		jl4=new JLabel("Operator :");	jl4.setBounds(40,435,200,25);	jf1.add(jl4);
		jl5=new JLabel("Value :");		jl5.setBounds(40,470,200,25);	jf1.add(jl5);
		
		jcom2=new JComboBox();	jcom2.addItem("---None---");
		jcom2.setBounds(150,400,200,25);
		jf1.add(jcom2);
		
		Vector temp=new Vector(0,1);
		temp.add("---None---");
		temp.add("=");
		temp.add("!=");
		temp.add(">");
		temp.add(">=");
		temp.add("<");
		temp.add("<=");
		temp.add("like");
		temp.add("sounder");
		temp.add("between");
		temp.add("in");
		
		jcom3=new JComboBox(temp);
		jcom3.setBounds(150,435,200,25);
		jf1.add(jcom3);
		
		jtf1=new JTextField("Enter Value");
		jtf1.setBounds(150,470,200,25);
		jf1.add(jtf1);
		
		jrb1=new JRadioButton("AND");
		jrb1.setBounds(380,400,60,25);
		jf1.add(jrb1);
		
		jrb2=new JRadioButton("OR");
		jrb2.setBounds(380,435,60,25);
		jf1.add(jrb2);
		
		jrb3=new JRadioButton("None");
		jrb3.setBounds(380,470,60,25);
		jf1.add(jrb3);
		
		bg1=new ButtonGroup();
		bg1.add(jrb1); bg1.add(jrb2); bg1.add(jrb3);
		jrb3.setSelected(true);
		
		jb5=new JButton("Go");
		jb5.setBounds(580,410,100,25);
		jf1.add(jb5);
		
		jb6=new JButton("Query");
		jb6.setBounds(580,440,100,25);
		jf1.add(jb6);
		
		jb7=new JButton("Exit");
		jb7.setBounds(580,470,100,30);
		jf1.add(jb7);
		
		jbtemp=new JButton("Ok");
		jbtemp.setBounds(470,1000,60,25);
		jf1.add(jbtemp);
		
		jf1.setVisible(true);
		
		QueryEvent qev=new QueryEvent(this);
		jb1.addActionListener(qev);
		jb2.addActionListener(qev);
		jb3.addActionListener(qev);
		jb4.addActionListener(qev);
		jb5.addActionListener(qev);
		jb6.addActionListener(qev);
		jb7.addActionListener(qev);
		
		jrb1.addActionListener(qev);
		jrb2.addActionListener(qev);
		jbtemp.addActionListener(qev);
		
		jcb1.addActionListener(qev);		
	}
}

class QueryEvent implements ActionListener
{
	CreateFirstForm cff;
	QueryEvent(CreateFirstForm cff1)
	{
		cff=cff1;
	}
	public void actionPerformed(ActionEvent ae)
	{
		int numberOfColumns=0;
		
		if(ae.getSource()==cff.jb1)
		{
			cff.orderbyBuffer=new StringBuffer(" ");
			cff.criteriaBuffer=new StringBuffer(" ");
			
			cff.jrb3.setSelected(true);
			cff.createQueryStatus=0;
			cff.strQuery=new StringBuffer("select ");
			Connect.fieldNames=new Vector(0,1); //to blank jlist2
			cff.jlist2.setListData(Connect.fieldNames);	//will set column names into jlist2
			
			try{
				Connection c=DriverManager.getConnection(Connect.dsnName);
				Statement s=c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
				
				//now find column names
				String str=cff.jcom1.getSelectedItem().toString();
				ResultSet rs=s.executeQuery("select * from "+str);
				
				ResultSetMetaData rsmd=rs.getMetaData();
				numberOfColumns=rsmd.getColumnCount();
				
				Connect.columnNames=new Vector(0,1);
				for(int i=1;i<=numberOfColumns;i++)
				{
					Connect.columnNames.add(rsmd.getColumnName(i));
				}
				//System.out.println(Connect.columnNames+" "+numberOfColumns);
				cff.jlist1.setListData(Connect.columnNames);//will set column names into list
			}
			catch(SQLException e){System.out.println("Query Event Table does not Exist");}
			catch(Exception e){System.out.println("Query Event Simple Exception");}
			
			cff.jf1.remove(cff.jcom2);	//refreshing jcom2
			
			Vector temp=new Vector(0,1);	
			temp.add("---None---");
			for(int i=0;i<numberOfColumns;i++)
				temp.add(Connect.columnNames.elementAt(i));
			
			cff.jcom2=new JComboBox(temp);
			cff.jcom2.setBounds(150,400,200,25);
			cff.jf1.add(cff.jcom2);
			
			cff.jcom2.showPopup();	cff.jcom2.hidePopup();
			cff.jcom3.setSelectedIndex(0);
			//cff.jcom3.showPopup(); cff.jcom3.hidePopup();
			cff.jtf1.setText("Enter Value");
			
			cff.jf1.setVisible(true);
		}
		
		if(ae.getSource()==cff.jb2)
		{
			int sel[]=new int[10];
			for(int i=0;i<10;i++)
				sel[i]=0;
			
			int count=0;	//count stores no of elements in jlist144
			count=Connect.columnNames.size();
			
			for(int i=0;i<count;i++)//find which indicates are selected in jlist1
				if(cff.jlist1.isSelectedIndex(i)==true)
					sel[i]=1;
			
			for(int i=0;i<count;i++)//add selected indices  of jlist1 to jlist2
				if(sel[i]==1)
					if(Connect.fieldNames.contains(Connect.columnNames.elementAt(i))==false) Connect.fieldNames.add(Connect.columnNames.elementAt(i));
				
			cff.jlist2.setListData(Connect.fieldNames); //will set column names into jlist2
			cff.jlist1.clearSelection();
			
			//System.out.println(" ~~ "+sel[0]+" "+sel[1]+" "+sel[2]+" "+sel[3]+" "+sel[4]+" "+sel[5]+" "+sel[6]+" "+sel[7]+" "+sel[8]+" "+sel[9]+" "+" ~~ ");
				
		}
		else{
			cff.jlist1.clearSelection();
		}
		
		if(ae.getSource()==cff.jb3)
		{
			int sel[]=new int[10];
			for(int i=0;i<10;i++)
				sel[i]=0;
			
			int count=0;	//count stores no of elements in jlist2
			count=Connect.fieldNames.size();
			System.out.println(" ## "+count);
			
			for(int i=0;i<count;i++)	//find which indcies are selected in jlist2
				if(cff.jlist2.isSelectedIndex(i)==true)
					sel[i]=1;
				
			for(int i=0;i<count;i++)	//remove selected indices from jlist2
				if(sel[i]==1)
					Connect.fieldNames.remove(i);
			
			cff.jlist2.setListData(Connect.fieldNames);	//will set column names into jlist2 //System.out.println(" ~~ "+sel[0]+" "+sel[1]+" "+sel[2]+" "+sel[3]+" "+sel[4]+" "+sel[5]+" "+sel[6]+" "+sel[7]+" "+sel[8]+" "+sel[9]+" "+" ~~ ");
		}
		
		if(ae.getSource()==cff.jb4)
		{
			Connect.fieldNames.removeAllElements();
			cff.jlist2.setListData(Connect.fieldNames);//will set column names into jlist2
		}
		
		if(ae.getSource()==cff.jb5)
		{
			new TableResult(cff.strQuery);
		}
		
		if(ae.getSource()==cff.jb6)
		{
			if(cff.createQueryStatus==0)
			{
				int count=Connect.fieldNames.size();
				
				for(int i=0;i<count;i++)
				{
					StringBuffer buf=new StringBuffer(Connect.fieldNames.elementAt(i).toString());
					if(i<count-1)	cff.strQuery.append(buf.append(", "));
					else			cff.strQuery.append(buf);
				}
				if(cff.strQuery.toString().equals("select "))
					cff.strQuery.append("*");
				cff.strQuery.append(" from "+cff.jcom1.getSelectedItem());
				//adding table names to query
				//System.out.println("$$"+cff.criteriaBuffer+"$$ ");
				if(cff.criteriaBuffer.toString().equals(" ")==true)
				{
					//System.out.print(" &&& ");
					
					if((cff.jcom2.getSelectedItem().equals("---None---")==false)
						&& (cff.jcom3.getSelectedItem().equals("---None---")==false)
					&&(cff.jtf1.getText().equals("Enter value")==false))
					{
						cff.criteriaBuffer.append("where ");
						cff.criteriaBuffer.append(cff.jcom2.getSelectedItem().toString());
						cff.criteriaBuffer.append(" "+cff.jcom3.getSelectedItem().toString());
						cff.criteriaBuffer.append(" "+cff.jtf1.getText());
					}
				}
				cff.createQueryStatus=1;
			}
			else
			{
				//System.out.println(" @@@ ");
			}
			
			cff.strQuery.append(cff.criteriaBuffer); //now append criteria clause to Query
			cff.strQuery.append(cff.orderbyBuffer);//now append orderby clause to Query
			cff.orderbyBuffer=new StringBuffer(" ");
			cff.criteriaBuffer=new StringBuffer(" ");
			
			System.out.println(cff.strQuery);
			//cff.strQuery=new StringBuffer(" ");
		}
		
		if(ae.getSource()==cff.jb7)
		{
			System.exit(0);
		}
		
		if(ae.getSource()==cff.jrb1 || ae.getSource()==cff.jrb2)
		{
			if(cff.criteriaBuffer.toString().equals(" "))
			{
				cff.criteriaBuffer.append("where ");
				cff.criteriaBuffer.append(cff.jcom2.getSelectedItem().toString());
				cff.criteriaBuffer.append(" "+cff.jcom3.getSelectedItem().toString());
				cff.criteriaBuffer.append(" "+cff.jtf1.getText());
			}
			System.out.println(cff.criteriaBuffer);
			cff.jbtemp.setBounds(450,400,60,25);
		}
		
		/////////////////
		
		if(ae.getSource()==cff.jbtemp)
		{
			//cff.criteriaBuffer.append("where ");
			//cff.criteriaBuffer.append(cff.jcom2.getSelectedItem().toString());
			if(cff.jrb1.isSelected())
				cff.criteriaBuffer.append(" AND "+cff.jcom2.getSelectedItem().toString());
			//adding table name to query
			else
				cff.criteriaBuffer.equals(" OR "+cff.jcom2.getSelectedItem().toString());
			//adding table names to query
			cff.criteriaBuffer.append(" "+cff.jcom3.getSelectedItem().toString());
			cff.criteriaBuffer.append(" "+cff.jtf1.getText());
			
			System.out.println(cff.criteriaBuffer);
			cff.jbtemp.setBounds(450,1000,60,25);
			cff.jrb3.setSelected(true);
			//cff.jf1.setVisible(true);
			
		}
		
		if(ae.getSource()==cff.jb1)
		{
			cff.jfl1=new JFrame("Order By Options");
			cff.jfl1.setSize(400,350);
			cff.jfl1.setLocation(150,130);
			cff.jfl1.setLayout(null);
			
			JLabel jl1=new JLabel("Order by");
			jl1.setBounds(20,10,1000,25);
			cff.jfl1.add(jl1);
			
			cff.jcoml1=new JComboBox(Connect.columnNames);
			cff.jcoml1.insertItemAt("---None---",0);
			cff.jcoml1.setSelectedIndex(0);
			cff.jcoml1.setBounds(150,40,200,25);
			cff.jfl1.add(cff.jcoml1);
			
			cff.jrbl1.setBounds(100,150,100,25);	cff.jfl1.add(cff.jrbl1);
			cff.jrbl2.setBounds(220,150,100,25);	cff.jfl1.add(cff.jrbl2);
			
			ButtonGroup bg2=new ButtonGroup();
			bg2.add(cff.jrbl1);
			bg2.add(cff.jrbl2);
			cff.jrbl1.setSelected(true);
			
			cff.jbl1.setBounds(150,200,100,25);
			cff.jfl1.add(cff.jbl1);
			
			cff.jbl2.setBounds(150,240,100,25);
			cff.jfl1.add(cff.jbl2);
			
			cff.jbl3.setBounds(150,280,100,25);
			cff.jfl1.add(cff.jbl3);
			
			cff.jfl1.setVisible(true);
			
			cff.jbl1.addActionListener(this);
			cff.jbl2.addActionListener(this);
			cff.jbl3.addActionListener(this);
			
			cff.orderbyBuffer=new StringBuffer(" ");
			cff.orderbyBuffer.append("order by ");
		}
		
		if(ae.getSource()==cff.jbl1)
		{
			if((cff.jcoml1).getSelectedItem().toString().equals("---None---")==false)
			{
				if(cff.orderbyBuffer.toString().equals(" order by ")==false)
					cff.orderbyBuffer.append(", ");
				
				if(cff.jrbl1.isSelected())
					cff.orderbyBuffer.append(" asc ");
				else
					cff.orderbyBuffer.append(" desc ");
			}
			cff.jcoml1.setSelectedIndex(0);
			System.out.println(cff.orderbyBuffer);
		}
		if(ae.getSource()==cff.jbl2)
		{
			if(cff.orderbyBuffer.toString().equals(" order by ")==true)
				cff.orderbyBuffer=new StringBuffer(" ");
			cff.jfl1.dispose();
		}
		if(ae.getSource()==cff.jbl3)
		{
			cff.orderbyBuffer=new StringBuffer(" ");
			cff.jfl1.dispose();
		}
	}
}

class TableResult
{
	Vector rowDataTemp=new Vector(0,1);
	Vector rowDataMain=new Vector(0,1);
	Vector columnNames=new Vector(0,1);
	
	Connection c;
	Statement s;
	ResultSet rs;
	ResultSetMetaData rsmd;
	
	TableResult(StringBuffer sb)
	{
		try
		{
			c=DriverManager.getConnection(Connect.dsnName);
			s=c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			
			String str=sb.toString();
			rs=s.executeQuery(str);
			rsmd=rs.getMetaData();
		}
		catch(SQLException e)
		{
			System.out.println(" TableResult Table does not Exist");
		}
		catch(Exception e)
		{
			System.out.println(" TableResult");
		}
		
		createForm();
		showTable();
	}
	
	JFrame jf;
	JButton jb1,jb2;
	JScrollPane jsp;
	JTable jt;
	void createForm()
	{
		jf=new JFrame("Display Table Data");
		jf.setSize(500,400);
		jf.setLayout(null);
		
		jb1=new JButton("Back");
		jb1.setBounds(100,80,150,30);
		jf.add(jb1);
		
		jb2=new JButton("Exit");
		jb2.setBounds(300,80,100,30);
		jf.add(jb2);
		
		jt=new JTable(5,3);
		//jt.setBounds(0,0,500,500);
		//jt.doLayout();
		
		jsp=new JScrollPane(jt,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		jsp.setBounds(50,150,400,200);
		jf.add(jsp);
		
		jf.setVisible(true);
		
		TableEvent tabev=new TableEvent(this);
		jb1.addActionListener(tabev);
		jb2.addActionListener(tabev);
	}
	
	void showTable()
	{
		try
		{
			int numberOfColumns=rsmd.getColumnCount();
			
			int numberOfRows=0;
			
			columnNames.removeAllElements();
			for(int i=1;i<=numberOfColumns;i++)
			{
				columnNames.add(rsmd.getColumnName(i));
			}
			int j=0;
			rowDataMain=new Vector(0,1);
			
			rs.beforeFirst();
			while(rs.next())
			{
				numberOfRows+=1;
				rowDataTemp=new Vector(0,1);
				
				for(int i=1;i<=numberOfColumns;i++)
				{
					rowDataTemp.add(rs.getString(i));
				}
				rowDataMain.add(rowDataTemp);
				
				//System.out.println(tdb.rowDataTemp+" @@ "+tdb.rowDataTemp.size()+" "+tdb.rowDataTemp.capacity());
				//System.out.println(" ~~ "+tdh.rowDataMain+" ~~ "+rowDataMain.size()+" "+tdb.rowDataMain.capacity());
			}
		}
		catch(SQLException e){	System.out.println(" TableResult Table does not Exist");}
		catch(Exception e){ System.out.println(" TableResult Simple Exception");}
		
		jf.remove(jsp);
		jt=new JTable(rowDataMain,columnNames);
		jsp=new JScrollPane(jt,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		jsp.setBounds(50,150,400,200);
		jf.add(jsp);
	}
}

class TableEvent implements ActionListener
{
	TableResult tr;
	TableEvent(TableResult tr1)
	{
		tr=tr1;
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==tr.jb1)
			tr.jf.dispose();
		
		if(ae.getSource()==tr.jb2)
			System.exit(0);
	}
}

class Connect
{
	static Vector tableNames=new Vector(0,1);
	static Vector columnNames=new Vector(0,1);
	static Vector fieldNames=new Vector(0,1);
	//static Vector tempSelectedNames=new Vector(0,1);
	
	static String dsnName="";
	
	JFrame jf;
	JLabel jl;
	JTextField jtf;
	JButton jb01,jb02;
	Connect()
	{
		jf=new JFrame("Connection builder");
		jf.setSize(400,150);
		jf.setLocation(300,250);
		jf.setLayout(null);
		
		jl=new JLabel("Enter DSN Name : ");
		jl.setBounds(20,20,100,25);
		jf.add(jl);
		
		jtf=new JTextField("dsn1");
		jtf.setBounds(150,20,100,25);
		jf.add(jtf);
		
		jb01=new JButton("OK");
		jb01.setBounds(50,80,100,25);
		jf.add(jb01);
		
		jb02=new JButton("Exit");
		jb02.setBounds(180,80,100,25);
		jf.add(jb02);
		
		jf.setVisible(true);
		
		ConnectEvent conev=new ConnectEvent(this);
		jb01.addActionListener(conev);
		jb02.addActionListener(conev);
	}
	
	public void connectDSN() {
    try {
        String dbName = dsnName; // from input
        String host = "localhost";
        String port = "3306";

        String url = "jdbc:mysql://" + host + ":" + port + "/" + dbName;
        String user = "codesquadz16"; // replace
        String password = "mca6"; // replace

        Class.forName("com.mysql.jdbc.Driver");
        Connection c = DriverManager.getConnection(url, user, password);

        Statement s = c.createStatement(
            ResultSet.TYPE_SCROLL_SENSITIVE,
            ResultSet.CONCUR_UPDATABLE
        );
        DatabaseMetaData dbmd = c.getMetaData();
        ResultSet rs = dbmd.getTables(dbName, null, "%", new String[]{"TABLE"});

        int numberOfTables = 0;

        tableNames.add("---None---");
        while (rs.next()) {
            numberOfTables++;
            tableNames.add(rs.getString("TABLE_NAME"));
        }

        System.out.println(tableNames + "  " + numberOfTables);
    } catch (SQLException e) {
        e.printStackTrace();
        System.out.println("Table does not exist or DB error.");
    } catch (Exception e) {
        e.printStackTrace();
        System.out.println("General Exception");
    }
}
}

class ConnectEvent implements ActionListener
{
	Connect con;
	ConnectEvent(Connect con1)
	{
		con=con1;
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==con.jb01)
		{
			Connect.dsnName=con.jtf.getText();
			con.connectDSN();
			
			con.jf.dispose();
			new CreateFirstForm();
		}
		if(ae.getSource()==con.jb02)
		{
			System.exit(0);
		}
	}
}