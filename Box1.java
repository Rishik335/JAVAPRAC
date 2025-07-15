class Box1
{
int width, height, depth;
void volume() {
System.out.println("no inputs");
}
void Findvolume(int width,int height,int depth){
this.width=width;
this.depth=height;
this.height=depth;
int vol=width*height*depth;
System.out.println("This the volume of the box: " +vol);
} 
public static void main(String args[]){
Box1 bo=new Box1();
bo.volume();
bo.Findvolume(2,8,7);
}
}
