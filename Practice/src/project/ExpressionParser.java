package project;

public class ExpressionParser {
  public ExpressionParser(String expr) {
	  this.expr = expr.toLowerCase();
  }
	
  public String getNextToken() {
	  token = "";
	  tokenType = TokenType.UNKNOWN;
	  if (index >= expr.length()) {
		  tokenType = TokenType.EOF;
		  return token;
	  }
	  for (char c = expr.charAt(index); index < expr.length() && c == ' '; index++) {
		  continue;
	  }
	  if (index >= expr.length()) {
		  tokenType = TokenType.EOF;
		  return token;
	  }
	  for (char c = expr.charAt(index); c >= 'a' && c <= 'z' && index < expr.length(); index++) {
		  token += c;
	  }
	  if (!token.isEmpty()) {
		  tokenType = TokenType.INDENTIFIER;
		  return token;
	  }
	  for (char c = expr.charAt(index); (c >= '0' && c <= '9' || c == '.') && index < expr.length(); index++) {
		  token += c;
	  }
	  if (!token.isEmpty()) {
		  tokenType = TokenType.NUMBER;
		  return token;
	  }
	  if (index < expr.length()) {
		  char c = expr.charAt(index);
		  switch (c) {
		    case '(':
		    	tokenType = TokenType.LPAREN;
		    	token += c;
		    	index++;
		    	break;
		    case ')':
		    	tokenType = TokenType.RPAREN;
		    	token += c;
		    	index++;
		    	break;
		    case '+':
		    case '-':
		    case '*':
		    case '/':
		    	tokenType = TokenType.OPERATOR;
		    	token += c;
		    	index++;
		    	break;
		    default:
		    	throw new IllegalArgumentException("Invalid character c detected at index " + index);
		  }
	  }
	  return token;
  }
  
  public String getToken() { return token; }
  public TokenType getTokenType() { return tokenType; }
  
  private String expr;
  private int index = 0;
  private String token;
  private TokenType tokenType;
  public enum TokenType {
	  UNKNOWN,
	  OPERATOR,
	  INDENTIFIER,
	  NUMBER,
	  LPAREN,
	  RPAREN,
	  EOF,
	  
  }
}
