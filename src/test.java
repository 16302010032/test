import java.io.File;
import java.io.IOException;

public class test {
    public static void main(String[] args) throws IOException{
        File x=new File("C:\\Users\\wqruan\\Desktop\\Project 1");
        File y=new File("C:\\Users\\wqruan\\Music");
        File[] m=x.listFiles();
            long a=System.nanoTime();
            CompressDestribute f=new CompressDestribute(x.getAbsolutePath(),y.getAbsolutePath());
            File[] l=y.listFiles();
            System.out.println((1)+":"+x.getName()+"  大小:"+x.length()/1024+"KB  压缩后大小："+l[0].length()/1024+"KB  压缩率："+(((float)(l[0].length())/(float)(x.length())))*100+"%  压缩时间:"+(System.nanoTime()-a)/1000000+"ms");

    }
}
