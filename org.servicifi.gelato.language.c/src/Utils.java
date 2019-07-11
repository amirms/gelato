import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.TerminalNode;

public class Utils {
//	public static String getFullText(ParserRuleContext context) {
//		if (context.start == null || context.stop == null || context.start.getStartIndex() < 0
//				|| context.stop.getStopIndex() < 0)
//			return context.getText(); // Fallback
//
//		return context.start.getInputStream()
//				.getText(Interval.of(context.start.getStartIndex(), context.stop.getStopIndex()));
//	}
//	
	
	public static String getFullText(ParserRuleContext context) {
		  Token startToken = context.start;
		  if (context.start instanceof TerminalNode) 
			  startToken = ((TerminalNode)(context.start)).getSymbol();
		  else if (context.start instanceof ParserRuleContext) 
			  startToken = ((ParserRuleContext)(context.start)).start;
		  
		  Token stopToken = context.stop;
		  if (context.stop instanceof TerminalNode) 
			  stopToken = ((TerminalNode)(context.stop)).getSymbol();
		  else if (context.stop instanceof ParserRuleContext) 
			  stopToken = ((ParserRuleContext)(context.stop)).stop;
		  
		  return startToken.getInputStream().getText(new Interval(startToken.getStartIndex(), stopToken.getStopIndex()));
		}
}
