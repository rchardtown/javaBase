import java.io.DataOutputStream;
import java.net.ServerSocket;
public class Socket {
public static void main(String[] args) {
	
	ServerSocket serverScoket =null;
	try {
		serverScoket =	new ServerSocket(8888);
		//����˽��տͻ�������󴴽��ڿͻ��˶Ի��Ķ�socket
		java.net.Socket socket= serverScoket.accept();
		//�򿪻��˷������������
		DataOutputStream dataOutputStream=new DataOutputStream(socket.getOutputStream())
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	
}
}
