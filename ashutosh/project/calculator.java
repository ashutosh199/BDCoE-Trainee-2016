import java.text.DecimalFormat;
import java.lang.Double;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class calculator extends Applet implements ActionListener
{
int flag=0,eq=0,temp=0;
 TextField t;
 Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bd,bm,ba,bs,be,bdot,bob,bcb,bc,bclear;
 String b="";
 int n[]=new int[2];
 //int c=1,b=0;
 public void init()
 {
     setLayout(null);
     t=new TextField(30);
     b1=new Button("1");
     b2=new Button("2");
     b3=new Button("3");
     b4=new Button("4");
     b5=new Button("5");
     b6=new Button("6");
     b7=new Button("7");
     b8=new Button("8");
     b9=new Button("9");
     b0=new Button("0");
     bd=new Button("/");
     bm=new Button("*");
     ba=new Button("+");
     bs=new Button("-");
     be=new Button("=");
     bob=new Button("(");
     bcb=new Button(")");
     bc=new Button("C");
     bdot=new Button(".");
     bclear=new Button("clear");
     t.setBounds(100,100,200,20);
     b7.setBounds(100,140,40,20);
     b8.setBounds(140,140,40,20);
     b9.setBounds(180,140,40,20);
     bd.setBounds(220,140,40,20);
     bob.setBounds(260,140,40,20);
     b4.setBounds(100,180,40,20);
     b5.setBounds(140,180,40,20);
     b6.setBounds(180,180,40,20);
     bm.setBounds(220,180,40,20);
     bcb.setBounds(260,180,40,20);
     b1.setBounds(100,220,40,20);
     b2.setBounds(140,220,40,20);
     b3.setBounds(180,220,40,20);
     bs.setBounds(220,220,40,20);
     bc.setBounds(260,220,40,20);
     bdot.setBounds(100,260,40,20);
     b0.setBounds(140,260,40,20);
     be.setBounds(180,260,40,20);
     ba.setBounds(220,260,40,20);
     bclear.setBounds(260,260,40,20);
     add(t);
     add(b7);add(b8);add(b9);add(bd);add(bob);
     add(b4);add(b5);add(b6);add(bm);add(bcb);
     add(b1);add(b2);add(b3);add(bs);add(bc);
     add(bdot);add(b0);add(be);add(ba);add(bclear);
     b1.addActionListener(this);b2.addActionListener(this);
     b3.addActionListener(this);b4.addActionListener(this);
     b5.addActionListener(this);b6.addActionListener(this);
     b7.addActionListener(this);b8.addActionListener(this);
     b9.addActionListener(this);b0.addActionListener(this);
     ba.addActionListener(this);bd.addActionListener(this);
     bm.addActionListener(this);bs.addActionListener(this);
     be.addActionListener(this);bdot.addActionListener(this);
     bob.addActionListener(this);bcb.addActionListener(this);
     bc.addActionListener(this);bclear.addActionListener(this);;
 }
 public void actionPerformed(ActionEvent e)
 {   calculator obj=new calculator();
     b=t.getText();
     if(e.getSource()==b1)
     {
         flag=1;
         if(eq==1)
         b="";
         b=b+"1";
         t.setText(b);
     }
     else
     if(e.getSource()==b2)
     {
         flag=1;
         if(eq==1)
         b="";
         b=b+"2";
         t.setText(b);
     }
     else
     if(e.getSource()==b3)
     {
         flag=1;
         if(eq==1)
         b="";
         b=b+"3";
         t.setText(b);
     }
     else
     if(e.getSource()==b4)
     {
         flag=1;
         if(eq==1)
         b="";
         b=b+"4";
         t.setText(b);
     }
     else
     if(e.getSource()==b5)
     {
         flag=1;
         if(eq==1)
         b="";
         b=b+"5";
         t.setText(b);
     }
     else
     if(e.getSource()==b6)
     {
         flag=1;
         if(eq==1)
         b="";
         b=b+"6";
         t.setText(b);
     }
     else
     if(e.getSource()==b7)
     {
         flag=1;
         if(eq==1)
         b="";
         b=b+"7";
         t.setText(b);
     }
     else
     if(e.getSource()==b8)
     {
         flag=1;
         if(eq==1)
         b="";
         b=b+"8";
         t.setText(b);
     }
     else
     if(e.getSource()==b9)
     {
         flag=1;
         if(eq==1)
         b="";
         b=b+"9";
         t.setText(b);
     }
     else
     if(e.getSource()==b0)
     {
         flag=1;
         if(eq==1)
         b="";
         b=b+"0";
         t.setText(b);
     }
     else
     if(e.getSource()==bdot && flag==1)
     {
         flag=0;
         if(eq==1)
         eq=0;
         b=b+".";
         t.setText(b);
     }
     else
     if(e.getSource()==bd && flag==1)
     {
         b=b+"/";
         if(eq==1)
         eq=0;
         t.setText(b);
         flag=0;
     }
     else
       if(e.getSource()==bm && flag==1)
     {
         if(eq==1)
         eq=0;
         b=b+"*";
         t.setText(b);
         flag=0;
     }
     else
     if(e.getSource()==bs )
     {
         if(eq==1)
         eq=0;
         b=b+"-";
         t.setText(b);
         flag=0;
     }
     else
     if(e.getSource()==ba && flag==1)
     {
         if(eq==1)
         eq=0;
         b=b+"+";
         t.setText(b);
         flag=0;
     }
     else
     if(e.getSource()==bob )
     {
         temp++;         
         b=b+"(";
         t.setText(b);
         eq=0;
         flag=0;
     }
     else
     if(e.getSource()==bcb && flag==1 && temp!=0)
     {
         temp--;
         if(eq==1)
         eq=0;
         b=b+")";
         t.setText(b);
     }
     else
     if(e.getSource()==bc)
     {
         b=obj.cancel(b);
         t.setText(b);
     }
     else
     if(e.getSource()==bclear)
     {
         b="";
         t.setText(b);
     }
     else
     if(e.getSource()==be)
     {
         eq=1;
         if(temp==0)
         b=obj.br(b);
         else
         b="Error";
         t.setText(b);
     }     
     
 }
 String cancel(String a)
 {
     int l=a.length();
     String b="";
     for(int i=0;i<(l-1);i++)
     b=b+a.charAt(i);
     return(b);
 }
 String br(String a)
  {
      calculator obj=new calculator();   
      String temp="";
      int l=a.length(),i=0,l1=0,l2=l,j,flag=1,c1=0,c2=0;
      String b="";
      while(i<l)
      {    
          if(a.charAt(i)=='(')
          {
              if(i-1>=0 && (Character.isDigit(a.charAt(i-1))))
              {
                  for(j=0;j<=i-1;j++)
                  b=b+a.charAt(j);
                  b=b+"*";
                  for(j=i;j<l;j++)
                  b=b+a.charAt(j);
                  a=b;
                  l=a.length();
              }
          }
          else
          if(a.charAt(i)==')')
          {
              l2=i;
              if(i+1<l && a.charAt(i+1)=='(')
              {
                  for(j=0;j<=l2;j++)
                  b=b+a.charAt(j);
                  b=b+"*";
                  for(j=l2+1;j<l;j++)
                  b=b+a.charAt(j);
                  a=b;
                  l=a.length();
              }
              
          }
          b="";
          i++;
      }
      i=0;
      l=a.length();
      /*while(flag!=0)
      {
          flag=0;
          i=0;*/
      while(i<l)
      {
          if(a.charAt(i)=='(')
          {
              l1=i+1;
              
          }
          else if(a.charAt(i)==')')
          {
              l2=i;
              if(i+1<l && a.charAt(i+1)=='(')
              {
                  for(j=0;j<=l2;j++)
                  b=b+a.charAt(j);
                  b=b+"*";
                  for(j=l2+1;j<l;j++)
                  b=b+a.charAt(j);
                  a=b;
                  l=a.length();
              }
              break;
          }
          i++;
      }
      
      temp=a.substring(l1,l2);
      temp=obj.d(temp);
      temp=obj.ad(temp);
      if(temp.charAt(0)=='-')
      c1=1;
      if( l1-2>=0 && a.charAt(l1-2)=='-')
      c2=1;
      if(c1==1 && c2==0)
      l1--;
      if(c1==1 &&c2==1)
      {
          l1--;
          temp="+"+temp.substring(1);
      }
      for(i=0;i<l1-1;i++)
      b=b+a.charAt(i);
      b=b+temp;
      for(i=l2+1;i<l;i++)
      b=b+a.charAt(i);
      a=b;
      b="";
      l=a.length();
      l1=0;
      l2=l;
      /*for(i=0;i<l;i++)
      if(a.charAt(i)=='/' || a.charAt(i)=='*' || a.charAt(i)=='-' || a.charAt(i)=='-' || a.charAt(i)=='(' || a.charAt(i)==')')
      flag++;
      }*/
      return(a);
  }
  String d(String a)
 {
     a=a.trim();
     a=" "+a+" ";
     int l=a.length(),i,j,flag=0,l1=0,l2=0,k=0,temp=0,tem=0;
     float n1=0.0f,n2=0.0f,result=0.0f;
     char c=' ';
     String b="";
     for(i=0;i<l;i++)
     if(a.charAt(i)=='/' || a.charAt(i)=='*')
     flag++;
     
     while(flag>0)
     {
         for(i=0;i<l;i++)
         {
             if(a.charAt(i)=='/' || a.charAt(i)=='*')
             {
                 c=a.charAt(i);
                 l2=i;
                 for(j=i-1;j>=0;j--)
                 {
                     if(a.charAt(j)=='+'||a.charAt(j)=='-'||a.charAt(j)=='*'|| a.charAt(j)==' '|| a.charAt(j)=='/')
                     {
                         l1=j+1;
                         k=l1;
                         n1=Float.parseFloat(a.substring(l1,l2));
                         if(a.charAt(j)=='-')
                         {
                             tem=1;
                             k--;
                         }
                         break;
                     }
                 }
                 if(a.charAt(i+1)=='-')
                 {
                     temp=1;
                     i++;
                 }
                 l1=i+1;
             for(j=i+1;j<l;j++)
             {
                 if(a.charAt(j)=='+'||a.charAt(j)=='-'||a.charAt(j)=='*'|| a.charAt(j)==' '|| a.charAt(j)=='/')
                 {
                     l2=j;
                     n2=Float.parseFloat(a.substring(l1,l2));
                     break;
                 }
             }
             if(c=='/')
             result=(float)n1/n2;
             else
             result=(float)n1*n2;
             if(temp!=tem)
             result=-(result);
             for(i=0;i<k;i++)
             b=b+a.charAt(i);
             b=b+String.valueOf(result);
             for(i=l2;i<l;i++)
             b=b+a.charAt(i);
             a=b;
             b="";
             l=a.length();
             temp=0;
             tem=0;
         }
     }
     flag--;
     }
     a=a.trim();
     return(a);
 }
 String ad(String a)
  {
      a=a.trim();
      if(a.charAt(0) != '-')
      a="+"+a+" ";
      else 
      a=a+" ";
      int l=a.length();
      int i,flag=0,k=0;
      char c1=' ',c2=' ';
      float n1=0.0f,n2=0.0f,result=0.0f;
      String b="";
      for(i=0;i<l;i++)
      if(a.charAt(i)=='+' || a.charAt(i)=='-')
      flag++;
      while(flag>1)
      {
          c1=a.charAt(0);
          for(i=1;i<l;i++)
          {
              if(a.charAt(i)=='+' || a.charAt(i)=='-' )
              {
                  c2=a.charAt(i);
                  n1=Float.parseFloat(a.substring(1,i));
                  k=i+1;
                  break;
              }
          }
          for(i=k;i<l;i++)
          {
              if(a.charAt(i)=='+' || a.charAt(i)=='-' || a.charAt(i)==' ' )
              {
                  n2=Float.parseFloat(a.substring(k,i));
                  k=i;
                  break;
              }
          }
          if(c1=='+' && c2=='-')
              {
                  result=n1-n2;
              }
              else if(c1=='-' && c2=='+')
              {
                  result=n2-n1;
              }
              else if(c1=='-' && c2=='-')
              {
                  result=-(n1+n2);
              }
              else if(c1=='+' && c2=='+')
              {
                  result=n1+n2;
              }
              /*if(!(String.valueOf(result)).equals("NaN"))
              {
              DecimalFormat resultFormat = new DecimalFormat("#.00");
              result=Float.parseFloat(resultFormat.format(result));}*/
              if(result>=0)
              b=b+"+"+String.valueOf(result);
              else
              b=b+String.valueOf(result);
              for(i=k;i<l;i++)
              b=b+a.charAt(i);
              a=b;
              b="";
              l=a.length();
              flag--;
          }
          a=a.trim();
          if(a.charAt(0)=='+')
          return(a.substring(1,l-1));
          else
          return(a);
      }
}
     
     
 