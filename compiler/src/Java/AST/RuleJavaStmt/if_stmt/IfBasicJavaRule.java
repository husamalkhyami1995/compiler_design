package Java.AST.RuleJavaStmt.if_stmt;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;
import Java.AST.RuleJavaStmt.BodyBracketsJava;
import Java.AST.RuleJavaStmt.ConditionJava;

public class IfBasicJavaRule extends Node{
    private ConditionJava conditionJava;
    private BodyBracketsJava bodyBracketsJava;

    public ConditionJava getConditionJava() {
        return conditionJava;
    }

    public void setConditionJava(ConditionJava conditionJava) {
        this.conditionJava = conditionJava;
    }

    public BodyBracketsJava getBodyBracketsJava() {
        return bodyBracketsJava;
    }

    public void setBodyBracketsJava(BodyBracketsJava bodyBracketsJava) {
        this.bodyBracketsJava = bodyBracketsJava;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        conditionJava.accept(astVisitor);
        bodyBracketsJava.accept(astVisitor);
    }

}
