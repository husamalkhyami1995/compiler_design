package Java.AST.RuleJavaStmt.declareVarNotAssignmen;

import Java.AST.Visitor.ASTVisitor;
import Java.AST.RuleJavaStmt.JavaBody;

import java.util.ArrayList;

public class DeclareJavaVarNotAssignment extends JavaBody {
    private ArrayList<String> namesVar = new ArrayList<>();

    public ArrayList<String> getNamesVar() {
        return namesVar;
    }

    public void setNamesVar(ArrayList<String> namesVar) {
        this.namesVar = namesVar;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }
}
