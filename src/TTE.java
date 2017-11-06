
import java.io.*;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

import javax.swing.event.*;

import javax.swing.text.*;

public class TTE implements ActionListener

{

String enk[]= {"a","aa","i","ii","u","uu","e","ee","ai","o","oo","au","k","ng","s","nj","d","N","th","n-",
"p","m","y","r","l","v","zh","L","R","n","j","S","sh","h","ka","kaa","ki","kii","ku","kuu","ke","kee","kai","ko",
"koo","kau","nga","ngaa","ngi","ngii","ngu","nguu","nge","ngee","ngai","ngo","ngoo","ngau","sa","saa","si","sii",
"su","suu","se","see","sai","so","soo","sau","nja","njaa","nji","njii","nju","njuu","nje","njee","njai","njo","njoo","njau",
"da","daa","di","dii","du","duu","de","dee","dai","do","doo","dau","Na","Naa","Ni","Nii","Nu","Nuu","Ne","Nee","Nai",
"No","Noo","Nau","tha","thaa","thi","thii","thu","thuu","the","thee","thai","tho","thoo","thau","n-a","n-aa","n-i","n-ii",
"n-u","n-uu","n-e","n-ee","n-ai","n-o","n-oo","n-au","pa","paa","pi","pii","pu","puu","pe","pee","pai","po","poo","pau","ma",
"maa","mi","mii","mu","muu","me","mee","mai","mo","moo","mau","ya","yaa","yi","yii","yu","yuu","ye","yee","yai","yo","yoo",
"yau","ra","raa","ri","rii","ru","ruu","re","ree","rai","ro","roo","rau","la","laa","li","lii","lu","luu","le","lee","lai","lo","loo","lau","va",
"vaa","vi","vii","vu","vuu","ve","vee","vai","vo","voo","vau","zha","zhaa","zhi","zhii","zhu","zhuu","zhe","zhee","zhai","zho","zhoo",
"zhau","La","Laa","Li","Lii","Lu","Luu","Le","Lee","Lai","Lo","Loo","Lau","Ra","Raa","Ri","Rii","Ru","Ruu","Re","Ree","Rai","Ro",
"Roo","Rau","na","naa","ni","nii","nu","nuu","ne","nee","nai","no","noo","nau","ja","jaa","ji","jii","ju","juu","je","jee","jai","jo","joo",
"jau","Sa","Saa","Si","Sii","Su","Suu","Se","See","Sai","So","Soo","Sau","sha","shaa","shi","shii","shu","shuu","she","shee","shai","sho","shoo","shau",
"ha","haa","hi","hii","hu","huu","he","hee","hai","ho","hoo","hau","sree",
" ",".",",","\'","\"","?","~","`","!","@","#","$","%","^","&","*","(",")","-","+","=","[","]","{","}","|","\\",":",";","/","1","2","3","4","5","6","7","8","9","0"};

String tak[]={"\u0B85","\u0B86","\u0B87","\u0B88","\u0B89","\u0B8A","\u0B8E","\u0B8F","\u0B90","\u0B92","\u0B93","\u0B94",
"\u0B95\u0BCD","\u0B99\u0BCD","\u0B9A\u0BCD","\u0B9E\u0BCD","\u0B9F\u0BCD","\u0BA3\u0BCD","\u0BA4\u0BCD",
"\u0BA8\u0BCD","\u0BAA\u0BCD","\u0BAE\u0BCD","\u0BAF\u0BCD","\u0BB0\u0BCD","\u0BB2\u0BCD","\u0BB5\u0BCD",
"\u0BB4\u0BCD","\u0BB3\u0BCD","\u0BB1\u0BCD","\u0BA9\u0BCD","\u0B9C\u0BCD","\u0BB8\u0BCD","\u0BB7\u0BCD",
"\u0BB9\u0BCD","\u0B95","\u0B95\u0BBE","\u0B95\u0BBF","\u0B95\u0BC0","\u0B95\u0BC1","\u0B95\u0BC2","\u0B95\u0BC6",
"\u0B95\u0BC7","\u0B95\u0BC8","\u0B95\u0BCA","\u0B95\u0BCB","\u0B95\u0BCC","\u0B99","\u0B99\u0BBE","\u0B99\u0BBF",
"\u0B99\u0BC0","\u0B99\u0BC1","\u0B99\u0BC2","\u0B99\u0BC6","\u0B99\u0BC7","\u0B99\u0BC8","\u0B99\u0BCA","\u0B99\u0BCB",
"\u0B99\u0BCC","\u0B9A","\u0B9A\u0BBE","\u0B9A\u0BBF","\u0B9A\u0BC0","\u0B9A\u0BC1","\u0B9A\u0BC2","\u0B9A\u0BC6",
"\u0B9A\u0BC7","\u0B9A\u0BC8","\u0B9A\u0BCA","\u0B9A\u0BCB","\u0B9A\u0BCC","\u0B9E","\u0B9E\u0BBE","\u0B9E\u0BBF",
"\u0B9E\u0BC0","\u0B9E\u0BC1","\u0B9E\u0BC2","\u0B9E\u0BC6","\u0B9E\u0BC7","\u0B9E\u0BC8","\u0B9E\u0BCA","\u0B9E\u0BCB",
"\u0B9E\u0BCC","\u0B9F","\u0B9F\u0BBE","\u0B9F\u0BBF","\u0B9F\u0BC0","\u0B9F\u0BC1","\u0B9F\u0BC2","\u0B9F\u0BC6","\u0B9F\u0BC7",
"\u0B9F\u0BC8","\u0B9F\u0BCA","\u0B9F\u0BCB","\u0B9F\u0BCC","\u0BA3","\u0BA3\u0BBE","\u0BA3\u0BBF","\u0BA3\u0BC0","\u0BA3\u0BC1",
"\u0BA3\u0BC2","\u0BA3\u0BC6","\u0BA3\u0BC7","\u0BA3\u0BC8","\u0BA3\u0BCA","\u0BA3\u0BCB","\u0BA3\u0BCC","\u0BA4","\u0BA4\u0BBE",
"\u0BA4\u0BBF","\u0BA4\u0BC0","\u0BA4\u0BC1","\u0BA4\u0BC2","\u0BA4\u0BC6","\u0BA4\u0BC7","\u0BA4\u0BC8","\u0BA4\u0BCA","\u0BA4\u0BCB",
"\u0BA4\u0BCC","\u0BA8","\u0BA8\u0BBE","\u0BA8\u0BBF","\u0BA8\u0BC0","\u0BA8\u0BC1","\u0BA8\u0BC2","\u0BA8\u0BC6","\u0BA8\u0BC7",
"\u0BA8\u0BC8","\u0BA8\u0BCA","\u0BA8\u0BCB","\u0BA8\u0BCC","\u0BAA","\u0BAA\u0BBE","\u0BAA\u0BBF","\u0BAA\u0BC0","\u0BAA\u0BC1",
"\u0BAA\u0BC2","\u0BAA\u0BC6","\u0BAA\u0BC7","\u0BAA\u0BC8","\u0BAA\u0BCA","\u0BAA\u0BCB","\u0BAA\u0BCC","\u0BAE","\u0BAE\u0BBE",
"\u0BAE\u0BBF","\u0BAE\u0BC0","\u0BAE\u0BC1","\u0BAE\u0BC2","\u0BAE\u0BC6","\u0BAE\u0BC7","\u0BAE\u0BC8","\u0BAE\u0BCA","\u0BAE\u0BCB",
"\u0BAE\u0BCC","\u0BAF","\u0BAF\u0BBE","\u0BAF\u0BBF","\u0BAF\u0BC0","\u0BAF\u0BC1","\u0BAF\u0BC2","\u0BAF\u0BC6","\u0BAF\u0BC7",
"\u0BAF\u0BC8","\u0BAF\u0BCA","\u0BAF\u0BCB","\u0BAF\u0BCC","\u0BB0","\u0BB0\u0BBE","\u0BB0\u0BBF","\u0BB0\u0BC0","\u0BB0\u0BC1",
"\u0BB0\u0BC2","\u0BB0\u0BC6","\u0BB0\u0BC7","\u0BB0\u0BC8","\u0BB0\u0BCA","\u0BB0\u0BCB","\u0BB0\u0BCC","\u0BB2","\u0BB2\u0BBE",
"\u0BB2\u0BBF","\u0BB2\u0BC0","\u0BB2\u0BC1","\u0BB2\u0BC2","\u0BB2\u0BC6","\u0BB2\u0BC7","\u0BB2\u0BC8","\u0BB2\u0BCA","\u0BB2\u0BCB",
"\u0BB2\u0BCC","\u0BB5","\u0BB5\u0BBE","\u0BB5\u0BBF","\u0BB5\u0BC0","\u0BB5\u0BC1","\u0BB5\u0BC2","\u0BB5\u0BC6","\u0BB5\u0BC7","\u0BB5\u0BC8",
"\u0BB5\u0BCA","\u0BB5\u0BCB","\u0BB5\u0BCC","\u0BB4","\u0BB4\u0BBE","\u0BB4\u0BBF","\u0BB4\u0BC0","\u0BB4\u0BC1","\u0BB4\u0BC2","\u0BB4\u0BC6",
"\u0BB4\u0BC7","\u0BB4\u0BC8","\u0BB4\u0BCA","\u0BB4\u0BCB","\u0BB4\u0BCC","\u0BB3","\u0BB3\u0BBE","\u0BB3\u0BBF","\u0BB3\u0BC0","\u0BB3\u0BC1",
"\u0BB3\u0BC2","\u0BB3\u0BC6","\u0BB3\u0BC7","\u0BB3\u0BC8","\u0BB3\u0BCA","\u0BB3\u0BCB","\u0BB3\u0BCC","\u0BB1","\u0BB1\u0BBE","\u0BB1\u0BBF",
"\u0BB1\u0BC0","\u0BB1\u0BC1","\u0BB1\u0BC2","\u0BB1\u0BC6","\u0BB1\u0BC7","\u0BB1\u0BC8","\u0BB1\u0BCA","\u0BB1\u0BCB","\u0BB1\u0BCC","\u0BA9",
"\u0BA9\u0BBE","\u0BA9\u0BBF","\u0BA9\u0BC0","\u0BA9\u0BC1","\u0BA9\u0BC2","\u0BA9\u0BC6","\u0BA9\u0BC7","\u0BA9\u0BC8","\u0BA9\u0BCA",
"\u0BA9\u0BCB","\u0BA9\u0BCC","\u0B9C","\u0B9C\u0BBE","\u0B9C\u0BBF","\u0B9C\u0BC0","\u0B9C\u0BC1","\u0B9C\u0BC2","\u0B9C\u0BC6","\u0B9C\u0BC7",
"\u0B9C\u0BC8","\u0B9C\u0BCA","\u0B9C\u0BCB","\u0B9C\u0BCC","\u0BB8","\u0BB8\u0BBE","\u0BB8\u0BBF","\u0BB8\u0BC0","\u0BB8\u0BC1","\u0BB8\u0BC2",
"\u0BB8\u0BC6","\u0BB8\u0BC7","\u0BB8\u0BC8","\u0BB8\u0BCA","\u0BB8\u0BCB","\u0BB8\u0BCC","\u0BB7","\u0BB7\u0BBE","\u0BB7\u0BBF","\u0BB7\u0BC0",
"\u0BB7\u0BC1","\u0BB7\u0BC2","\u0BB7\u0BC6","\u0BB7\u0BC7","\u0BB7\u0BC8","\u0BB7\u0BCA","\u0BB7\u0BCB","\u0BB7\u0BCC","\u0BB9","\u0BB9\u0BBE",
"\u0BB9\u0BBF","\u0BB9\u0BC0","\u0BB9\u0BC1","\u0BB9\u0BC2","\u0BB9\u0BC6","\u0BB9\u0BC7","\u0BB9\u0BC8","\u0BB9\u0BCA","\u0BB9\u0BCB",
"\u0BB9\u0BCC","\u0BB8\u0BCD\u0BB0\u0BC0"," ",".",",","\'","\"","?","~","`","!","@","#","$","%","^","&","*","(",")","-","+","=","[","]","{","}","|","\\",":",";","/","1","2","3","4","5","6","7","8","9","0"};

JTextField text1;
JTextField text2;
JButton b1,b2,b3,b4;
JLabel label1,label2,label3;
JScrollPane scroll1,scroll3;
JSplitPane split;
ImageIcon image;
JPanel panel;
JTextArea area;
Font f;
JFrame frame;
TTE()
{
frame=new JFrame("English to Tamil Transliteration...");
f=new Font("Latha",Font.PLAIN,13);
image=new ImageIcon("images/unicode.gif");
label1=new JLabel("Type in English..");
label1.setBounds(2,10,180,20);
label2=new JLabel();
label2.setFont(f);
label2.setText("\u0BA4\u0BAE\u0BBF\u0BB4\u0BCD...");
label2.setBounds(310,10,200,20);
label3=new JLabel(image);
scroll3=new JScrollPane(label3);
text1=new JTextField(150);
text1.setToolTipText("Enter the text in english\n as per the Tamil language (refer the key table)");
text1.setBounds(2,30,290,30);
area=new JTextArea(100,100);
area.setLineWrap(true);
area.setFont(f);
scroll1=new JScrollPane(area);
scroll1.setBounds(1,89,580,475);
panel=new JPanel();
panel.setBackground(Color.green);
text2=new JTextField(150);
text2.setFont(f);
text2.setToolTipText("Tamil equvalant...");
text2.setBounds(310,30,270,30);

b1=new JButton("append");

b1.setMnemonic('a');

b1.setToolTipText("Press \"Alt+a\" for append text to TextArea");

b1.setBounds(2,62,145,25);

b2=new JButton("open");

b2.setToolTipText("Press \"Alt+o\" to open a file");

b2.setMnemonic('o');

b2.setBounds(149,62,145,25);

b3=new JButton("save");

b3.setToolTipText("Press \"Alt+s\" to save as file");

b3.setMnemonic('s');

b3.setBounds(296,62,145,25);

b4=new JButton("clear");

b4.setToolTipText("Press \"Alt+c\" to clear the TextArea");

b4.setMnemonic('c');

b4.setBounds(443,62,136,25);

 

panel.setLayout(null);
panel.add(label1);
panel.add(label2);
panel.add(text1);
panel.add(text2);
panel.add(b1);
panel.add(b2);
panel.add(b3);
panel.add(b4);
panel.add(scroll1);
split=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,scroll3,panel);
split.setOneTouchExpandable(true);
split.setDividerLocation(300);
split.setPreferredSize(new Dimension(400, 200));
frame.getContentPane().add(split);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
frame.setSize(900,600);
frame.setVisible(true);
text1.getDocument().addDocumentListener(new MyDocumentListener());

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
}

public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
area.append(text2.getText()+" ");
b1.setFocusable(false);
b2.setFocusable(false);
b3.setFocusable(false);
b4.setFocusable(false);
text2.setText("");
text1.setText("");
}

if(e.getSource()==b2)
{
JFileChooser dlg=new JFileChooser();
int a = dlg.showOpenDialog(frame);
if (a == JFileChooser.APPROVE_OPTION)
{
File file = dlg.getSelectedFile();
try
{

FileInputStream fis=new FileInputStream(file.getPath());

Reader reader = new InputStreamReader(fis, "UTF-8");

char[] x=new char[1024];

StringBuilder data = new StringBuilder();

while(true)

{

int size=reader.read(x); if(size<0)

break;

data.append(x,0,size);

} area.setText(""); area.append(""+data);

 

 

} catch(Exception ex) { }

}

}

if(e.getSource()==b3)

{

JFileChooser dlg=new JFileChooser();

int a = dlg.showSaveDialog(frame);

File file = dlg.getSelectedFile();

try

{

String x=""; x=area.getText();

Writer w = new OutputStreamWriter(new FileOutputStream(file.getPath()),"UTF-8");

w.append(x);

w.close();

} catch(Exception ex) { }

}

if(e.getSource()==b4)

area.setText("");

}

class MyDocumentListener implements DocumentListener
{
public void insertUpdate(DocumentEvent e)
{
textlistener();
}
public void removeUpdate(DocumentEvent e)
{
textlistener();
if((text1.getText()).isEmpty())
text2.setText("");
}

public void changedUpdate(DocumentEvent e)
{
}
}

void textlistener()
{
int c,cc,c1=0,c2=0,c3=0,c4=0;
String r="";
String s="";
String s1="";
String s2="";
String s3="";
String s4="";
String s5="";
String s6="";
String t="";

s=text1.getText();
int l=s.length();

try
{
for(int i=0;i<l;i++)
{
c=0;
cc=0;

r=Character.toString(s.charAt(i));
for(int m=0;m<338;m++)
{
if(r.equals(enk[m]))
{
s1=t;
t=t+tak[m];
s2=t;
text2.setText(t);
c2=1;
c3=1;
c4=1;
}
}

r=Character.toString(s.charAt(i))+Character.toString(s.charAt(i+1));
for(int k=0;k<338;k++)
{
if(r.equals(enk[k]))
{
t=s1+tak[k];
s3=t;
text2.setText(t);
i=i+1;
c=1;
c1=1;
c3=2;
c4=2;

}

}

if(c==0)

{

if((i+1)==(l-1))

continue ;

}

if(c==1)

r=Character.toString(s.charAt(i-1))+Character.toString(s.charAt(i))+Character.toString(s.charAt(i+1));
else r=Character.toString(s.charAt(i))+Character.toString(s.charAt(i+1))+Character.toString(s.charAt(i+2));
for(int j=11;j<338;j++)
{
if(r.equals(enk[j]))
{
c3=3;
t=s1+tak[j];
s4=t;
text2.setText(t);
if(c==1)
i=i+1;
else
i=i+2;
c1=1;
c2=1;
cc=1;
c4=3;
}
}

if(cc==0&&c==1)
{
if((i+1)==(l-1))
continue ;
}
else if(cc==0&&c==0)
{
if((i+2)==(l-1))
continue ;
}

if(cc==1)

r=Character.toString(s.charAt(i-2))+Character.toString(s.charAt(i-1))+Character.toString(s.charAt(i))
+Character.toString(s.charAt(i+1));

else if(c==1&&cc==0)
r=Character.toString(s.charAt(i-1))+Character.toString(s.charAt(i))+Character.toString(s.charAt(i+1))
+Character.toString(s.charAt(i+2));

else

r=Character.toString(s.charAt(i))+Character.toString(s.charAt(i+1))+Character.toString(s.charAt(i+2))+
Character.toString(s.charAt(i+3));

for(int n=47;n<338;n++)
{
if(r.equals(enk[n]))
{
c4=4;
t=s1+tak[n];
s5=t;
text2.setText(t);
if(cc==1)
i=i+1;

else if((i+2)==(l-1))
i=i+2;
else
i=i+3;
}
}

if(c1==0)
s1=s2;
if(c2==0)
s1=s3;
if(c3==0||c3==3)
s1=s4;
if(c3==2)
s1=s3;

if(c4==4||c4==0)
s1=s5; if(c4==3)
s1=s4;
if(c4==2)
s1=s3;
if(c4==1)
s1=s2;
}

}catch(Exception ex) { }

}

public static void main(String args[])
{
new TTE();
}
}