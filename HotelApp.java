import java.util.*;
public class HotelApp {
static Scanner console=new Scanner(System.in);
private static Room[] rooms=new Room[5];
public static void main (String[] args){
char choice=' ';
for(int  s=0;s<rooms.length;s++){
rooms[s]=new Room();
rooms[s].setRnum(s+1);}
char ch='a';
do {

System.out.println("Enter the letter you want:");
System.out.println("V: To View All Rooms");
System.out.println("A: To Add guest to a room and print the room information");
System.out.println("D: To Delete guest with a room number entered by user");
System.out.println("X: Exit");
choice=console.next().charAt(0);
ch=Character.toUpperCase(choice);
switch (ch) {
case 'V':
for (int f=0;f<rooms.length;f++)
System.out.println(rooms[f]);
break;

case 'A':
{
int index=addGuest(rooms);
if (index!=-1){
System.out.println("Enter the Guest name:");
console.nextLine();
String name=console.nextLine();
rooms[index].setGname(name);
System.out.println(rooms[index]);}
else
System.out.println("Sorry, the Hotel is full");
break;}

case 'D':
{System.out.println("Enter the Room number: ");
int roomnum=console.nextInt();
deleteGuest(rooms,roomnum);
break;}

}
}while (ch!='X');

}
public static int addGuest(Room list[]){
for (int i=0;i<rooms.length;i++)
if (list[i].getRstat()=='A')
return i;
return -1;
 }


public static void deleteGuest(Room list[], int roomNum){
if (list[roomNum-1].getRstat()=='N'){
list[roomNum-1].setRstat('A');
list[roomNum-1].setGname("");}
else
System.out.println("The Room is already available");
}
}

