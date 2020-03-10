package Servidor;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.channels.ReadableByteChannel;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server {

    static String ack = "'ACK' Comunicação sucedida!";
    static boolean continuar = true;
    static int votosCandidatoA = 0;
    static int votosCandidatoB = 0;
    static String registro="0";
    static int voto;

    public static void main(String[] args) {

        Thread tempoVotacao = new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(35000);
                    continuar = false;
                    System.exit(0);

                } catch (InterruptedException ex) {
                }
            }
        };

        try {
            while (continuar) {

                ServerSocket server = new ServerSocket(3322);
                System.out.println("Servidor iniciado na porta 3322");
                new Thread(tempoVotacao).start();

                Socket cliente = server.accept();
                System.out.println("Cliente conectado do IP " + cliente.getInetAddress().getHostAddress());

                ObjectOutputStream output = new ObjectOutputStream(cliente.getOutputStream());
                ObjectInputStream input = new ObjectInputStream(cliente.getInputStream());

                String msg = input.readUTF();
                System.out.println("Mensagem recebida: " + msg);
                
                if (msg.equals("AYA")) {
                    output.writeUTF("IAA");
                    output.flush();
                } else 
                
                registro = msg;
                voto = registro.charAt(0);
                if (voto == 49) {
                    votosCandidatoA = votosCandidatoA + 1;
                } else if (voto == 50) {
                    votosCandidatoB = votosCandidatoB + 1;
                }

                if (votosCandidatoA > votosCandidatoB) {
                    output.writeUTF("Candidato A esta vencendo o candidato B por: " + votosCandidatoA + " a " + votosCandidatoB);
                    output.flush();

                } else if (votosCandidatoA < votosCandidatoB) {
                    output.writeUTF("Candidato B está vencendo o candidato A por: " + votosCandidatoB + " a " + votosCandidatoA);
                    output.flush();

                }

                output.writeUTF("'REP'O servidor registrou o seu voto com sucesso!");
                output.flush();
                output.writeUTF(ack);
                output.flush();
                System.out.println(input.readUTF());

                input.close();
                output.close();
                server.close();
            }

        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
