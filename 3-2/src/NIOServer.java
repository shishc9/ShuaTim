import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.locks.Condition;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/10, 9:22
 * @Auther:ShiShc
 */

public class NIOServer {
    public static void main(String[] args) throws IOException {
        Selector selector = Selector.open();

        ServerSocketChannel ssChannel = ServerSocketChannel.open();
        ssChannel.configureBlocking(false);
        ssChannel.register(selector, SelectionKey.OP_ACCEPT);

        ServerSocket serverSocket = ssChannel.socket();
        InetSocketAddress address = new InetSocketAddress("127.0.0.1", 8888);
        serverSocket.bind(address);

        String str = "abc";
        str.intern();

        while(true) {
            selector.select();
            Set<SelectionKey> keys = selector.selectedKeys();
            Iterator<SelectionKey> iterable = keys.iterator();

            while(iterable.hasNext()) {
                SelectionKey key = iterable.next();

                if(key.isAcceptable()) {
                    ServerSocketChannel serverSocketChannel = (ServerSocketChannel)key.channel();
                    SocketChannel socketChannel1 = serverSocketChannel.accept();
                    socketChannel1.configureBlocking(false);
                    socketChannel1.register(selector, SelectionKey.OP_READ);
                } else if(key.isReadable()) {
                    SocketChannel socketChannel = (SocketChannel)key.channel();
                }
            }
        }



    }
}
