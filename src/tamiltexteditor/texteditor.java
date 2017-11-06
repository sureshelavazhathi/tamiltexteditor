/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tamiltexteditor;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.scene.text.Font.font;
import javax.swing.JFileChooser;
import javax.swing.text.BadLocationException;

/**
 *
 * @author THIYAGU N
 */
public class texteditor extends javax.swing.JFrame {

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
    JFileChooser fc=new JFileChooser();
        Font font=new Font("Latha",Font.PLAIN,13);    
	     boolean flag;
	     File f;
	     FileWriter fw;
    
    public texteditor() {
        
       initComponents();
       initComponent();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
     // <editor-fold defaultstate="collapsed" desc="Generated Code">
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(jEditorPane1);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("jLabel1");

        jMenu1.setText("File");

        jMenuItem1.setText("jMenuItem1");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("jMenuItem2");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("jMenuItem3");
        jMenu1.add(jMenuItem3);

        jMenuItem7.setText("jMenuItem7");
        jMenu1.add(jMenuItem7);

        jMenuItem9.setText("jMenuItem9");
        jMenu1.add(jMenuItem9);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem4.setText("jMenuItem4");
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("jMenuItem5");
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("jMenuItem6");
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(5, 5, 5)))
                .addGap(61, 61, 61))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        transulator();
    }//GEN-LAST:event_jButton1ActionPerformed
     
    private void transulator()
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

s=jEditorPane1.getText();
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
jLabel1.setFont(font);
jLabel1.setText(t);
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

jLabel1.setText(t);
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
jLabel1.setFont(font);
jLabel1.setText(t);
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
jLabel1.setFont(font);
jLabel1.setText(t);
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

    
    
    private void initComponent() { 
            /*jScrollPane1 = new javax.swing.JScrollPane();
            jEditorPane1 = new javax.swing.JEditorPane();
            jMenuBar1 = new javax.swing.JMenuBar();
            jMenu1 = new javax.swing.JMenu();
            jMenuItem1 = new javax.swing.JMenuItem();
            jMenuItem2 = new javax.swing.JMenuItem();
            jMenuItem3 = new javax.swing.JMenuItem();
            jMenuItem7 = new javax.swing.JMenuItem();
            jMenuItem9 = new javax.swing.JMenuItem();
            jMenu2 = new javax.swing.JMenu();
            jMenuItem4 = new javax.swing.JMenuItem();
            jMenuItem5 = new javax.swing.JMenuItem();
            jMenuItem6 = new javax.swing.JMenuItem();*/
                   Font font=new Font("Latha",Font.PLAIN,13);

                 setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
             jScrollPane1.setViewportView(jEditorPane1);
             jButton1.setText("Convert");
             jMenu1.setText("File");
             jMenuItem1.setText("New");
             jLabel1.setText("The Text Convertion shown here");
             
             
             jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt); }
                 private void jMenuItem1ActionPerformed(ActionEvent evt) {
                                                          
                        // TODO add your handling code here:
                        jEditorPane1.setText(null);
                        flag=false;
      }    
                    
     });
             
      jMenu1.add(jMenuItem1);
      jMenuItem2.setText("Open");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
              private void jMenuItem2ActionPerformed(ActionEvent evt) {
                        if(JFileChooser.APPROVE_OPTION==fc.showOpenDialog(texteditor.this))
	      {
	           try {
	                f=fc.getSelectedFile();
	                jEditorPane1.setPage("file://"+f.getAbsolutePath());
	                flag=true;
	            } catch (IOException ex) {
	                Logger.getLogger(texteditor.class.getName()).log(Level.SEVERE, null, ex);
                    }
	      }
            }
	        });
        jMenu1.add(jMenuItem2);
         jMenuItem3.setText("Save");
            jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jMenuItem3ActionPerformed(evt);
	            }

                    private void jMenuItem3ActionPerformed(ActionEvent evt) {
                        // TODO add your handling code here:
	      int choice=0;
	      if(flag==false && (choice=JFileChooser.APPROVE_OPTION)==fc.showSaveDialog(texteditor.this))
	      {
	            try {
	                f=fc.getSelectedFile();
	                fw = new FileWriter(f.getAbsolutePath());
	                jEditorPane1.getEditorKit().write(fw, jEditorPane1.getDocument(), 0, jLabel1.getText().length());
	                fw.close();
	            } catch (BadLocationException ex) {
	                Logger.getLogger(texteditor.class.getName()).log(Level.SEVERE, null, ex);
	            } catch (IOException ex) {
                        Logger.getLogger(texteditor.class.getName()).log(Level.SEVERE, null, ex);
	            }
	      }
	      else
	      {
            if(choice==JFileChooser.CANCEL_OPTION)
            {
	            try {
	                fw = new FileWriter(f.getAbsolutePath(),true);
	                jEditorPane1.getEditorKit().write(fw, jEditorPane1.getDocument(), 0, jLabel1.getText().length());
	                fw.close();
	            } catch (BadLocationException ex) {
	                Logger.getLogger(texteditor.class.getName()).log(Level.SEVERE, null, ex);
	            } catch (IOException ex) {
	                Logger.getLogger(texteditor.class.getName()).log(Level.SEVERE, null, ex);
	            }

	            }

	      }}

	        });
             jMenu1.add(jMenuItem3);
             jMenuItem7.setText("Save As");
	        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jMenuItem7ActionPerformed(evt);
	            }

                    private void jMenuItem7ActionPerformed(ActionEvent evt) {
                      // TODO add your handling code here:
	         FileWriter fw;
	      if(JFileChooser.APPROVE_OPTION==fc.showSaveDialog(texteditor.this))
	      {
	            try {
	                fw = new FileWriter(fc.getSelectedFile().getAbsolutePath());

	                jEditorPane1.getEditorKit().write(fw, jEditorPane1.getDocument(), 0, jLabel1.getText().length());

	                flag=true;
	                fw.close();
	            } catch (BadLocationException ex) {
	                Logger.getLogger(texteditor.class.getName()).log(Level.SEVERE, null, ex);
	            } catch (IOException ex) {
	                Logger.getLogger(texteditor.class.getName()).log(Level.SEVERE, null, ex);
	            }
	      }  
                    }
	        });
                
                 jMenu1.add(jMenuItem7);
                    jMenuItem9.setText("Exit");
                    jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
                         public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jMenuItem9ActionPerformed(evt);
	            }

                    private void jMenuItem9ActionPerformed(ActionEvent evt) {
                         System.exit(0);
                    }
	        });
                    jMenu1.add(jMenuItem9);
	        jMenuBar1.add(jMenu1);
	        jMenu2.setText("Edit");
	        jMenuItem4.setText("Cut");
	        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	               jMenuItem4ActionPerformed(evt);

	            }

                    private void jMenuItem4ActionPerformed(ActionEvent evt) {
                        jEditorPane1.cut();
                    }
	        });
                jMenu2.add(jMenuItem4);
	        jMenuItem5.setText("Copy");

	        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jMenuItem5ActionPerformed(evt);
	            }

                    private void jMenuItem5ActionPerformed(ActionEvent evt) {
                        jEditorPane1.copy();}
	        });
                  
	        jMenu2.add(jMenuItem5);
	        jMenuItem6.setText("Paste");
	        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jMenuItem6ActionPerformed(evt);
	            }

                    private void jMenuItem6ActionPerformed(ActionEvent evt) {
                        jEditorPane1.paste();
                    }
	        });
	        jMenu2.add(jMenuItem6);
	        jMenuBar1.add(jMenu2);
	        setJMenuBar(jMenuBar1);
                
                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addContainerGap(20, Short.MAX_VALUE))
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
	                .addContainerGap())
	        );
                pack();
	    // </editor-fold>
         
            
     }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(texteditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(texteditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(texteditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(texteditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
         
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new texteditor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

   
}
