package Java;

import Java.AST.Function.FunctionDeclaration;
import Java.AST.Parse;
import Java.AST.QueryStmt.SelectStmt.SelectCore;
import Java.AST.Visitor.BaseASTVisitor;
import Java.Base.BaseVisitor;
import Java.SymbolTable.Type;
import generated.SQLLexer;
import generated.SQLParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import Java.SymbolTable.SymbolTable;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static SymbolTable symbolTable = new SymbolTable();
    public static  Type rightType = new Type();
    public static SelectCore selectCore= new SelectCore();
    public static FunctionDeclaration functionDeclaration = new FunctionDeclaration();
    public static void main(String[] args) {
        try {
            String source = "samples//samples.txt";
            CharStream cs = fromFileName(source);
            SQLLexer lexer = new SQLLexer(cs);
            CommonTokenStream token  = new CommonTokenStream(lexer);
            SQLParser parser = new SQLParser(token);
            ParseTree tree = parser.parse();

            Parse p = (Parse) new BaseVisitor().visit(tree);

            p.accept(new BaseASTVisitor());

            System.out.println(p.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
