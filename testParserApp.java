//javac -cp .:antlr-4.9.2-complete.jar *.java
//java -cp .:antlr-4.9.2-complete.jar testParserApp

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class testParserApp {
    static String source="";
    public static void main(String[] args) {
         try {
            source="";
            File myObj = new File("my.lang");
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


           String input = source;
            
            

            try {
                // Cria um CharStream a partir da entrada do usuário
                CharStream charStream = CharStreams.fromString(input);

                // Inicializa o lexer e o parser com o CharStream
                testLexer lexer = new testLexer(charStream);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                testParser parser = new testParser(tokens);

                // Inicia o parser a partir da regra de entrada do arquivo testParser
                ParseTree tree = parser.program();  // Altere "program" para a regra de entrada correta

                // Exibe a árvore sintática
                System.out.println("Árvore Sintática: " + tree.toStringTree(parser));

                // Exibe os tokens da linha de entrada
                System.out.println("Tokens:");
                tokens.fill();
                for (Token token : tokens.getTokens()) {
                    System.out.printf("Tipo: %s, Valor: %s%n", testLexer.VOCABULARY.getSymbolicName(token.getType()), token.getText());
                }

            } catch (Exception e) {
                System.out.println("Erro ao analisar a linha: " + e.getMessage());
            }
        }
        
 }

