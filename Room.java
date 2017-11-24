public class Room {
private int rnum;
private String gname;
private char rstat;
public Room(){
rnum=0;
gname="";
rstat='A';}
public String toString(){
return "Room number:"+rnum+" "+"Guest name:"+gname+" "+"Room status:"+rstat;}
public void setRnum(int num){
rnum=num;}
public void setGname(String name){
gname=name;
rstat='N';
}
public void setRstat(char status){
rstat=status;}
public int getRnum(){
return rnum;}
public String getGname(){
return gname;}
public char getRstat(){
return rstat;}
}