import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException{

        String file = "Downloads";
        String nomeArquivo = "padrao_tiss_componente_organizacional_201902.pdf";
        URL url = new URL("https://www.gov.br/ans/pt-br/assuntos/prestadores/padrao-para-troca-de-informacao-de-saude-suplementar-2013-tiss");
        //Cria streams de leitura e faz a conexão
        InputStream is = url.openStream();
        // leitura
        FileOutputStream fos = new FileOutputStream(file + "/" + nomeArquivo);
        //Lê e grava byte a byte
        int contByte = 0;
        byte buffer[] = new byte[8192];
        long tempo = System.currentTimeMillis();
        while((contByte = is.read()) >= 0 ){
            fos.write(buffer, 0, contByte);
        }
        System.out.println("Download finalizado em " + tempo + " ms");
        //Encerra
        is.close();
        fos.close();

    }
}
