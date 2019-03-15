import java.io.*;
class dum1
{
public void finale()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String box[][]=new String[11][11];
String b[][]=new String[11][11];
int x=0,y=0,a=0,p=0,f=0,i=0,q=0,r=0,s=0;
String sym="",sy="";
for(x=0;x<11;x++)
{
for(y=0;y<11;y++)
{
if(y==3)
{
box[x][y]="|";
}
else if(y==7)
{
box[x][y]="|";
}
else if(x==3)
{
box[x][y]="*";
}
else if(x==7)
{
box[x][y]="*";
}
else
{
box[x][y]=" ";
}
}
}
for(x=0;x<11;x++)
{
for(y=0;y<11;y++)
{
b[x][y]=box[x][y];
}
}
for(x=0;x<11;x++)
{
System.out.print("\t\t\t\t");
for(y=0;y<11;y++)
{
System.out.print(b[x][y]);
}
System.out.println();
}
System.out.println("DO U WANT TO PLAY THE TIC-TAC-TOE");
System.out.println("PRESS 1 FOR YES AND 0 FOR NO");
a=Integer.parseInt(br.readLine());
while(a==1)
{
System.out.println("WHICH SYMBOL WOULD YOU LIKE TO USE (0 OR X)");
sym=br.readLine();
if(sym.equalsIgnoreCase("X"))
{
sy="0";
}
else
{
sy="X";
}
fo(box);
for(x=0;x<11;x++)
{
for(y=0;y<11;y++)
{
box[x][y]=b[x][y];
}
}
f=0;
p=0;
q=0;
r=0;
s=0;
while(f<9)
{
System.out.println("PRESS THE GIVEN NO.TO FILL TO REQUIRED POSITION");
i=Integer.parseInt(br.readLine());
f++;

if(f%2!=0)
{
switch(i)
{
case 1:
if(box[1][1]==" ")
{
box[1][1]=sym;
for(x=0;x<11;x++)
{
System.out.print("\t\t\t\t");
for(y=0;y<11;y++)
{
System.out.print(box[x][y]);
}
System.out.println();
}
}
else
{
f--;
System.out.println("THIS PLACE IS ALREDY FILLED,PLS TRY ANOTHER PLACE");
}
break;
case 2:
if(box[1][5]==" ")
{
box[1][5]=sym;
for(x=0;x<11;x++)
{
System.out.print("\t\t\t\t");
for(y=0;y<11;y++)
{
System.out.print(box[x][y]);
}
System.out.println();
}
}
else
{
f--;
System.out.println("THIS PLACE IS ALREDY FILLED,PLS TRY ANOTHER PLACE");
}
break;
case 3:
if(box[1][9]==" ")
{
box[1][9]=sym;
for(x=0;x<11;x++)
{
System.out.print("\t\t\t\t");
for(y=0;y<11;y++)
{
System.out.print(box[x][y]);
}
System.out.println();
}
}
else
{
f--;
System.out.println("THIS PLACE IS ALREDY FILLED,PLS TRY ANOTHER PLACE");
}
break;
case 4:
if(box[5][1]==" ")
{
box[5][1]=sym;
for(x=0;x<11;x++)
{
System.out.print("\t\t\t\t");
for(y=0;y<11;y++)
{
System.out.print(box[x][y]);
}
System.out.println();
}
}
else
{
f--;
System.out.println("THIS PLACE IS ALREDY FILLED,PLS TRY ANOTHER PLACE");
}
break;
case 5:
if(box[5][5]==" ")
{
box[5][5]=sym;
for(x=0;x<11;x++)
{
System.out.print("\t\t\t\t");
for(y=0;y<11;y++)
{
System.out.print(box[x][y]);
}
System.out.println();
}
}
else
{
f--;
System.out.println("THIS PLACE IS ALREDY FILLED,PLS TRY ANOTHER PLACE");
}
break;
case 6:
if(box[5][9]==" ")
{
box[5][9]=sym;
for(x=0;x<11;x++)
{
System.out.print("\t\t\t\t");
for(y=0;y<11;y++)
{
System.out.print(box[x][y]);
}
System.out.println();
}
}
else
{
f--;
System.out.println("THIS PLACE IS ALREDY FILLED,PLS TRY ANOTHER PLACE");
}
break;
case 7:
if(box[9][1]==" ")
{
box[9][1]=sym;
for(x=0;x<11;x++)
{
System.out.print("\t\t\t\t");
for(y=0;y<11;y++)
{
System.out.print(box[x][y]);
}
System.out.println();
}
}
else
{
f--;
System.out.println("THIS PLACE IS ALREDY FILLED,PLS TRY ANOTHER PLACE");
}
break;
case 8:
if(box[9][5]==" ")
{
box[9][5]=sym;
for(x=0;x<11;x++)
{
System.out.print("\t\t\t\t");
for(y=0;y<11;y++)
{
System.out.print(box[x][y]);
}
System.out.println();
}
}
else
{
f--;
System.out.println("THIS PLACE IS ALREDY FILLED,PLS TRY ANOTHER PLACE");
}
break;
case 9:
if(box[9][9]==" ")
{
box[9][9]=sym;
for(x=0;x<11;x++)
{
System.out.print("\t\t\t\t");
for(y=0;y<11;y++)
{
System.out.print(box[x][y]);
}
System.out.println();
}
}
else
{
f--;
System.out.println("THIS PLACE IS ALREDY FILLED,PLS TRY ANOTHER PLACE");
}
break;
default:
System.out.println("WRONG CHOICE");
}
}
else
{
switch(i)
{
case 1:
if(box[1][1]==" ")
{
box[1][1]=sy;
for(x=0;x<11;x++)
{
System.out.print("\t\t\t\t");
for(y=0;y<11;y++)
{
System.out.print(box[x][y]);
}
System.out.println();
}
}
else
{
f--;
System.out.println("THIS PLACE IS ALREDY FILLED,PLS TRY ANOTHER PLACE");
}
break;
case 2:
if(box[1][5]==" ")
{
box[1][5]=sy;
for(x=0;x<11;x++)
{
System.out.print("\t\t\t\t");
for(y=0;y<11;y++)
{
System.out.print(box[x][y]);
}
System.out.println();
}
}
else
{
f--;
System.out.println("THIS PLACE IS ALREDY FILLED,PLS TRY ANOTHER PLACE");
}
break;
case 3:
if(box[1][9]==" ")
{
box[1][9]=sy;
for(x=0;x<11;x++)
{
System.out.print("\t\t\t\t");
for(y=0;y<11;y++)
{
System.out.print(box[x][y]);
}
System.out.println();
}
}
else
{
f--;
System.out.println("THIS PLACE IS ALREDY FILLED,PLS TRY ANOTHER PLACE");
}
break;
case 4:
if(box[5][1]==" ")
{
box[5][1]=sy;
for(x=0;x<11;x++)
{
System.out.print("\t\t\t\t");
for(y=0;y<11;y++)
{
System.out.print(box[x][y]);
}
System.out.println();
}
}
else
{
f--;
System.out.println("THIS PLACE IS ALREDY FILLED,PLS TRY ANOTHER PLACE");
}
break;
case 5:
if(box[5][5]==" ")
{
box[5][5]=sy;
for(x=0;x<11;x++)
{
System.out.print("\t\t\t\t");
for(y=0;y<11;y++)
{
System.out.print(box[x][y]);
}
System.out.println();
}
}
else
{
f--;
System.out.println("THIS PLACE IS ALREDY FILLED,PLS TRY ANOTHER PLACE");
}
break;
case 6:
if(box[5][9]==" ")
{
box[5][9]=sy;
for(x=0;x<11;x++)
{
System.out.print("\t\t\t\t");
for(y=0;y<11;y++)
{
System.out.print(box[x][y]);
}
System.out.println();
}
}
else
{
f--;
System.out.println("THIS PLACE IS ALREDY FILLED,PLS TRY ANOTHER PLACE");
}
break;
case 7:
if(box[9][1]==" ")
{
box[9][1]=sy;
for(x=0;x<11;x++)
{
System.out.print("\t\t\t\t");
for(y=0;y<11;y++)
{
System.out.print(box[x][y]);
}
System.out.println();
}
}
else
{
f--;
System.out.println("THIS PLACE IS ALREDY FILLED,PLS TRY ANOTHER PLACE");
}
break;
case 8:
if(box[9][5]==" ")
{
box[9][5]=sy;
for(x=0;x<11;x++)
{
System.out.print("\t\t\t\t");
for(y=0;y<11;y++)
{
System.out.print(box[x][y]);
}
System.out.println();
}
}
else
{
f--;
System.out.println("THIS PLACE IS ALREDY FILLED,PLS TRY ANOTHER PLACE");
}
break;
case 9:
if(box[9][9]==" ")
{
box[9][9]=sy;
for(x=0;x<11;x++)
{
System.out.print("\t\t\t\t");
for(y=0;y<11;y++)
{
System.out.print(box[x][y]);
}
System.out.println();
}
}
else
{
f--;
System.out.println("THIS PLACE IS ALREDY FILLED,PLS TRY ANOTHER PLACE");
}
break;
default:
System.out.println("WRONG CHOICE");
}
}

p=row(box,sym);
q=col(box,sym);
r=ld(box,sym);
s=rd(box,sym);
if(p==1||q==1||r==1||s==1)
{
System.out.println("PLAYER 1 WON");
break;
}
if(p==2||q==2||r==2||s==2)
{
System.out.println("PLAYER 2 WON");
break;
}
}
if(p==0&&q==0&&r==0&&s==0)
{
System.out.println("NO ONE WON");
}
System.out.println("WANNA PLAY AGAIN ?");
System.out.println("PRESS 1 FOR YES AND 0 FOR NO");
a=Integer.parseInt(br.readLine());
}
System.out.println((char)1+" "+(char)2+" THANX FOR PLAYING "+(char)1+" "+(char)2+"\nBYE-BYE");
}









public void fo(String bo[][])
{
int f=1,x=0,y=0;
String k="";
for(x=1;x<11;x+=4)
{
for(y=1;y<11;y+=4)
{
k=Integer.toString(f);
bo[x][y]=k;
f++;
}
}
for(x=0;x<11;x++)
{
System.out.print("\t\t\t\t");
for(y=0;y<11;y++)
{
System.out.print(bo[x][y]);
}
System.out.println();
}
}

public int row(String bo[][],String c)
{ 
int x=1,y=1,f=0;
if(bo[x][y]!=" ")
{
if(bo[x][y]==bo[x][y+4]&&bo[x][y]==bo[x][y+8])
{
if(bo[x][y].equalsIgnoreCase(c))
{
f=1;
}
else
{
f=2;
}
}
}
x=5;
y=1;
if(bo[x][y]!=" ")
{
if(bo[x][y]==bo[x][y+4]&&bo[x][y]==bo[x][y+8])
{
if(bo[x][y].equalsIgnoreCase(c))
{
f=1;
}
else
{
f=2;
}
}
}
x=9;
y=1;
if(bo[x][y]!=" ")
{
if(bo[x][y]==bo[x][y+4]&&bo[x][y]==bo[x][y+8])
{
if(bo[x][y].equalsIgnoreCase(c))
{
f=1;
}
else
{
f=2;
}
}
}
return f;

}






public int col(String b[][],String c1)
{
int f=0;
int x=0,y=0;
x=1;
y=1;
if(b[x][y]!=" ")
{
if(b[x][y]==b[x+4][y]&&b[x][y]==b[x+8][y])
{
if(b[x][y].equalsIgnoreCase(c1))
{
f=1;
}
else
{
f=2;
}
}
}
x=1;
y=5;
if(b[x][y]!=" ")
{
if(b[x][y]==b[x+4][y]&&b[x][y]==b[x+8][y])
{
if(b[x][y].equalsIgnoreCase(c1))
{
f=1;
}
else
{
f=2;
}
}
}
x=1;
y=9;
if(b[x][y]!=" ")
{
if(b[x][y]==b[x+4][y]&&b[x][y]==b[x+8][y])
{
if(b[x][y].equalsIgnoreCase(c1))
{
f=1;
}
else
{
f=2;
}
}
}
return f;
}




public int ld(String bo[][],String c)
{
int f=0;
int x=1,y=1;
if(bo[x][y]!=" ")
{
if(bo[x][y]==bo[x+4][y+4]&&bo[x][y]==bo[x+8][y+8])
{
if(bo[x][y].equalsIgnoreCase(c))
{
f=1;
}
else
{
f=2;
}
}
}
return f;
}



public int rd(String b[][],String c1)
{
int x=1,y=9;
int f=0;
if(b[x][y]!=" ")
{
if(b[x][y]==b[x+4][y-4]&&b[x][y]==b[x+8][y-8])
{
if(b[x][y].equalsIgnoreCase(c1))
{
f=1;
}
else
{
f=2;
}
}
}
return f;
}






public static void main (String ml[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
dum1 ob=new dum1();
int a=0;
char c=' ';String ch="y";
c=(char)1;
while(ch.equalsIgnoreCase("Y"))
{
ch="";
System.out.println("\t\t"+c+"  "+c+"  "+c+"  "+c+"  "+c+"  "+c+"  "+c+"  "+c+"  "+c+"  "+c+"  "+c+"  "+c+"  "+c+"  "+c+"  "+c+"  "+c+"  "+c+"  "+c+"\n\n");
System.out.println("\t\t"+c+"      WELCOME TO THE TIC-TAC-TOE GAME             "+c+"\n\n");
System.out.println("\t\t"+c+"      PRESS 1 TO PLAY THE GAME                    "+c+"\n\n");
System.out.println("\t\t"+c+"      PRESS 2 FOR INFO                            "+c+"\n\n");
System.out.println("\t\t"+c+"      PRESS 3 CHECK THE CONCEPTS USED             "+c+"\n\n"); 
System.out.println("\t\t"+c+"  "+c+"  "+c+"  "+c+"  "+c+"  "+c+"  "+c+"  "+c+"  "+c+"  "+c+"  "+c+"  "+c+"  "+c+"  "+c+"  "+c+"  "+c+"  "+c+"  "+c+"\n\n");
a=Integer.parseInt(br.readLine());
if(a==1)
{
ob.finale();
}
if(a==2)
{
System.out.println("THIS is a typical game which is usually played between two players .\n\nThey have  to choose a symbol among '0' or 'X'.\n\nThen they have to fill them alternately in such a way that tends to make a row  or column or any diagonal of same type i.e. of all 0s or all Xs without any     repetition of the position. \n\nThe player who fulfills this condition first is declared winner of the game.");
System.out.println("\n\n\nWANNA GO BACK TO MENU ???\nPRESS Y FOR YES AND N FOR NO");
ch=br.readLine();
}
if(a==3)
{
System.out.println("In the coding of this programs ,the following concepts are used :-\n\n1.  Functions\n\n2.  Selection making statements -\n  i) if statement\n  ii) if else statement\n  iii) switch statement\n\n3.  Looping statements -\n i) for loop\n ii) while loop\n\n4.  2-D Array");
System.out.println("\n\n\n\nWANNA GO BACK TO MENU ???\nPRESS Y FOR YES AND N FOR NO");
ch=br.readLine();
}
}
}
}




