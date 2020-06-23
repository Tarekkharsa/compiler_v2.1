///*-
// * #%L
// * JSQLParser library
// * %%
// * Copyright (C) 2004 - 2019 JSQLParser
// * %%
// * Dual licensed under GNU LGPL 2.1 or Apache License 2.0
// * #L%
// */
//package Java.AST.QueryStmt;
//
//import Java.AST.Node;
//import Java.AST.Visitor.ASTVisitor;
//
//import java.util.List;
//
//public class Join extends Statement {
//
//    private boolean outer = false;
//    private boolean left = false;
//    private boolean inner = false;
//    private String joinOperator;
//    private FromItem rightItem =new FromItem();
//    private FromItem leftItem =new FromItem();
//    JoinConstraint joinConstraint =new JoinConstraint();
//
//    public boolean isOuter() {
//        return outer;
//    }
//
//    public void setOuter(boolean outer) {
//        this.outer = outer;
//    }
//
//    public boolean isLeft() {
//        return left;
//    }
//
//    public FromItem getLeftItem() {
//        return leftItem;
//    }
//
//    public void setLeftItem(FromItem leftItem) {
//        this.leftItem = leftItem;
//    }
//
//    public void setLeft(boolean left) {
//        this.left = left;
//    }
//
//    public boolean isInner() {
//        return inner;
//    }
//
//    public void setInner(boolean inner) {
//        this.inner = inner;
//    }
//
//    public String getJoinOperator() {
//        return joinOperator;
//    }
//
//    public void setJoinOperator(String joinOperator) {
//        this.joinOperator = joinOperator;
//    }
//
//    public FromItem getRightItem() {
//        return rightItem;
//    }
//
//    public void setRightItem(FromItem rightItem) {
//        this.rightItem = rightItem;
//    }
//
//    public JoinConstraint getJoinConstraint() {
//        return joinConstraint;
//    }
//
//    public void setJoinConstraint(JoinConstraint joinConstraint) {
//        this.joinConstraint = joinConstraint;
//    }
////    private Expression onExpression;
//
//
//
//    @Override
//    public void accept(ASTVisitor astVisitor){
//        astVisitor.visit(this);
//    }
//}
