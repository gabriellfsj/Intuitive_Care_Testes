import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Main{

    public static void main(String[] args) throws IOException {

        URL url = new URL("https://www.gov.br/ans/pt-br/arquivos/assuntos/prestadores/padrao-para-troca-de-informacao-de-saude-suplementar-tiss/padrao-tiss/padrao-tiss_componente-organizacional_202111.pdf");
        File file = new File("C:\\Users\\DELL\\Downloads\\arquivo-baixado.pdf");

        InputStream is = url.openStream();
        FileOutputStream fos = new FileOutputStream(file);

        int bytes = 0;

        while ((bytes = is.read()) != -1) {
            fos.write(bytes);
        }

        is.close();

        fos.close();
    }


}
