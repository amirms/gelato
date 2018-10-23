package org.servicifi.gelato.language.cobol.preprocess.resource.subprocessor.util;

public class CobolPreprocessorUtil {
	public final static char CHAR_ASTERISK = '*';

	public final static char CHAR_D = 'D';

	public final static char CHAR_D_ = 'd';

	public final static char CHAR_MINUS = '-';

	public final static char CHAR_SHARP = '#';

	public final static char CHAR_SLASH = '/';

	public final static String COMMENT_ENTRY_TAG = ">*CE";

	public final static String COMMENT_TAG = ">*";

	public final static String EXEC_CICS_TAG = ">*EXECCICS";

	public final static String EXEC_SQL_TAG = ">*EXECSQL";

	public final static String EXEC_SQLIMS_TAG = ">*EXECSQLIMS";

	public final static String INDICATOR_FIELD = "([ABCdD\\t\\-/*# ])";

	public final static char NEW_LINE = '\n';

	public final static char WS = ' ';
	
	public static final int INDICATOR_AREA = 6;
	public static final char COMMENT_SIGN1 = '*';
	public static final char COMMENT_SIGN2 = '/';
	public static final char CONTINUATION_SIGN = '-';
	public static final char DEBUGGING_SIGN = 'D';
	public static final char LITERAL_QUOTE_OPEN = '\'';
	public static final char LITERAL_DBL_QUOTE_OPEN = '"';
	
	public static final char DISAMBIGUATED_COMMENT_SIGN = '#';
	
	public static final int RECORD_LENGTH = 72;
}