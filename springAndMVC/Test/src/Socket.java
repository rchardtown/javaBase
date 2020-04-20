import java.io.DataOutputStream;
import java.net.ServerSocket;
public class Socket {
public static void main(String[] args) {
	
	ServerSocket serverScoket =null;
	try {
		serverScoket =	new ServerSocket(8888);
		//服务端接收客户端请求后创建于客户端对话的额socket
		java.net.Socket socket= serverScoket.accept();
		//向开户端发送数据输出流
		DataOutputStream dataOutputStream=new DataOutputStream(socket.getOutputStream())
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	
}
}
