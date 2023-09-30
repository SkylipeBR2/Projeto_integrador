import java.net.URL;
import javax.swing.*;
import javax.sound.sampled.*;
import java.io.*;
import java.util.Scanner;

public class TESTE {

    public static void main(String[] args) throws Exception {

        // Carrega o arquivo de áudio (não funciona com .mp3, só .wav)
        String resource = "audioTeste.WAV";
        InputStream input = TESTE.class.getResourceAsStream(resource);
        Clip oClip = AudioSystem.getClip();
        AudioInputStream audioInput = AudioSystem.getAudioInputStream(input);
        oClip.open(audioInput);

        oClip.loop(Clip.LOOP_CONTINUOUSLY); // Toca uma vez
        //clip.loop(Clip.LOOP_CONTINUOUSLY); // Toca continuamente (para o caso de músicas)

        // Para a execução (senão o programa termina antes de você ouvir o som)
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                System.out.println("Em uma pequena vila perdida no meio da floresta, viviam dois irmãos. Eles eram inseparáveis. Sempre caçando aventuras por onde iam. O irmão mais velho, *irmão*, adorava procurar tesouros escondidos e misteriosos, já o irmão mais novo, *personagem* gostava de entender a natureza das coisas, como elas funcionam a partir de certos experimentos");
                Scanner input = new Scanner(System.in);
                int fim = input.nextInt();
            }
        });
    }
}