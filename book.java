import java.util.Scanner;
class book{
String author;
String name;
int price;
int num_pages;
book(String name1,String author1,int price1,int pages){
name=name1;
author=author1;
price=price1;
num_pages=pages;
}
book(){
}
void setdetails(){
Scanner sc=new Scanner(System.in);
System.out.print("enter name of book: ");
name=sc.nextLine();
System.out.print("enter author's name: ");
author=sc.nextLine();
System.out.print("enter price of book: ");
price=sc.nextInt();
System.out.print("enter num of pages: ");
num_pages=sc.nextInt();
System.out.println("DETAILS SET SUCCESSFULLY :)");
}
void getdetails(){
System.out.println("NAME: "+name);
System.out.println("AUTHOR: "+author);
System.out.println("PRICE: "+price);
System.out.println("NUM_PAGES: "+num_pages);
}
public String toString(){
return("NAME: "+name+" AUTHOR: "+author+" PRICE: "+price+"
NUM_PAGES: "+num_pages);
}
}
class exp3{
public static void main(String args[]){
int n;
System.out.println("enter the number of books: ");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
book b1[]= new book[n];
for(int j=0;j<n;j++){
System.out.println("ENTER DETAILS");
System.out.println("1:set using constructor\n2:set using method");
int ch=sc.nextInt();
if(ch==2){
b1[j]=new book();
b1[j].setdetails();
}
else{
b1[j]=new book("TINKLE","ANONYMOUS",20,100);
}
}
for(int j=0;j<n;j++){
System.out.println("\nPRINTING BOOK DETAILS");
System.out.println("1:display using method\n2:display using toString");
int ch=sc.nextInt();
if(ch==1){
b1[j].getdetails();
System.out.println();
}
else{
String details=b1[j].toString();
System.out.println(details);
}
}
}
}
