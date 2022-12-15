package study.web;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

  private final int PORT = 8080;

  public void run() {
    try (ServerSocket serverSocket = new ServerSocket(PORT)) {
      Socket connection;
      while ((connection = serverSocket.accept())!=null) {
        System.out.println("connected");

      }
    } catch (IOException e) {
      e.printStackTrace();
      throw new RuntimeException(e);
    }
  }
}
