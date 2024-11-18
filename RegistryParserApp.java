//javac -cp .:antlr-4.9.2-complete.jar *.java
//java -cp .:antlr-4.9.2-complete.jar RegistryParserApp
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RegistryParserApp {
    static String source="";
    public static void main(String[] args) {
        try {
            source="";
            File myObj = new File("registry.reg");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                source=source+data+"\n";
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

       // Scanner scanner = new Scanner(System.in);
       

        
            
            String input = source;

            if (input.trim().isEmpty()) {
                System.out.println("Encerrando o programa.");
                
            }

            try {
                // Cria um CharStream a partir da entrada do usuário
                CharStream charStream = CharStreams.fromString(input);

                // Inicializa o lexer e o parser com o CharStream
                RegistryLexer lexer = new RegistryLexer(charStream);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                RegistryParser parser = new RegistryParser(tokens);

                // Inicia o parser a partir da regra de entrada
                ParseTree tree = parser.registryFile();

                // Exibe a árvore sintática
                System.out.println("Árvore Sintática: " + tree.toStringTree(parser));

            } catch (Exception e) {
                System.out.println("Erro ao analisar o arquivo de registro: " + e.getMessage());
            }
        }
        
            
}

