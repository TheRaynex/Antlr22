import compiler.CalcBaseListener;
import compiler.CalcParser;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class MyCalcListener extends CalcBaseListener {
    Map<CalcParser.MulExprContext, Integer> symbolTable = new HashMap<CalcParser.MulExprContext, Integer>();

    @Override
    public void exitMulExpr(CalcParser.MulExprContext ctx) {
        int result = 1;
        // get list of number
        List<TerminalNode> numberList = ctx.NUMBER();
        ListIterator<TerminalNode> numberListIterator = numberList.listIterator();
        // //for each number
        while (numberListIterator.hasNext()) {
            // multiply result by number
            TerminalNode number = numberListIterator.next();
            result *= Integer.parseInt(number.getText());
        }
        symbolTable.put(ctx, result);
    }

    @Override
    public  void exitSumExpr(CalcParser.SumExprContext ctx) {
        int result = 0;
        // get list of number
        List<CalcParser.MulExprContext> mulExprContextList = ctx.mulExpr();
        ListIterator<CalcParser.MulExprContext> mulExprContextListIterator = mulExprContextList.listIterator();
        // //for each number
        while (mulExprContextListIterator.hasNext()) {
            // add result by number
            CalcParser.MulExprContext mulExpr = mulExprContextListIterator.next();
            int value = symbolTable.get(mulExpr);
            result += value;
        }
        System.out.println(result);
    }
}
