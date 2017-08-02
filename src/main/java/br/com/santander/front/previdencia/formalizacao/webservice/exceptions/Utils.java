package br.com.santander.front.previdencia.formalizacao.webservice.exceptions;

/**
 * Classes utilit�rias  
 * 
 * @author tereza.Oliveira
 * 
 */
public class Utils {
      
    private static final String BOOLEAN_FALSE_STR = "N";
    private static final String BOOLEAN_TRUE_STR = "S";


    /*
     * Classe para remo��o de acento
     * 
     */
	  
	//public static String removeAcentoNormalize(String str) {   
	//    CharSequence cs = new StringBuilder(str == null ? "" : str);   
	//    return Normalizer.normalize(cs, Normalizer.Form.NFKD).replaceAll("\\p{InCombiningDiacriticalMarks}+", "");   
	//}  
	
	public static String removeAcento (String str){ 
		  if(str!= null){	
		      str = str.replaceAll("[�����]","A");   
		      str = str.replaceAll("[�����]","a");   
		      str = str.replaceAll("[����]","E");   
		      str = str.replaceAll("[����]","e");   
		      str = str.replaceAll("[����]","I");   
		      str = str.replaceAll("[����]","i");   
		      str = str.replaceAll("[�����]","O");   
		      str = str.replaceAll("[�����]","o");   
		      str = str.replaceAll("[����]","U");   
		      str = str.replaceAll("[����]","u");   
		      str = str.replaceAll("�","C");   
		      str = str.replaceAll("�","c");    
		  }
	      return str;   
	   }   
    /*
     * Classe para remo��o de ponto e espa�o
     * 
     */
	  
	public static String removePonto (String str){ 
		  if(str!= null){	
		      str = str.replaceAll("[.]","");   
		      str = str.replaceAll("[ ]","");   
		  }
		  return str;   
	}
	
	
	public static String boolToStr(Boolean bool) {
	    if(null == bool) return null;
	    return bool ? BOOLEAN_TRUE_STR : BOOLEAN_FALSE_STR;
	}
	public static Boolean strToBool(String str){
	    if(null == str) return null;
	    return BOOLEAN_TRUE_STR.equals(str) ? Boolean.TRUE : Boolean.FALSE;
	}
	
	
	
	public static String lpad(String text, char fill, int length) {
		return pad(text, fill, length, true);
	}
	
	public static String rpad(String text, char fill, int length) {
		return pad(text, fill, length, false);
	}

	public static String pad(String text, char fill, int length, boolean left) {
		if (text.length() >= length)
			return text;	

		String complete = "";
		for (int i = 0; i < length - text.length(); ++i)
			complete = complete + fill;

		if (left)
			return complete + text;

		return text + complete;
	}
	
}
