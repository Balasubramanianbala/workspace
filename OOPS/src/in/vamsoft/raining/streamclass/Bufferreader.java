package in.vamsoft.raining.streamclass;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Bufferreader {
  
  public static void main(String[] args)throws Exception {
    
    
      RandomAccessFile afile=new RandomAccessFile("/home/vamsoft/actor.txt","rw");
      FileChannel inChannel=afile.getChannel();
      ByteBuffer buf=ByteBuffer.allocate(10);
      int bytesread=inChannel.read(buf);
      while(bytesread!=1) {
        
      
      buf.flip();
      while(buf.hasRemaining()) {
        System.out.println((char) buf.get());
      }
      buf.clear();
      bytesread=inChannel.read(buf);
      }
      afile.close();
  }

}
