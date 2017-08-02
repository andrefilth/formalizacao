/**
 * 
 */
package br.com.santander.front.previdencia.formalizacao.utils;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Classe de manipulação de datas.
 * 
 * @author André Franco
 * 
 *
 */
public class DatasUtil {

	private static final String YYYY_MM_DD = "yyyy-MM-dd";

	/**
	 * Converte uma String para um objeto Date. Caso a String seja vazia ou
	 * nula, retorna null - para facilitar em casos onde formulários podem ter
	 * campos de datas vazios.
	 * 
	 * @param data
	 *            String no formato yyyy-MM-dd a ser formatada
	 * @return Date Objeto Date ou null caso receba uma String vazia ou nula
	 * @throws Exception
	 *             Caso a String esteja no formato errado
	 */
	public static Date converterStringDate(String data) throws Exception {
		if (data == null || data.equals(""))
			return null;
		Date date = null;
		try {
			DateFormat formatter = new SimpleDateFormat(YYYY_MM_DD);
			date = formatter.parse(data);
		} catch (ParseException e) {
			throw e;
		}
		return date;
	}

	/**
	 * Método que recebe um tipo java.util.Date
	 * 
	 * @return java.sql.Date
	 * @throws ParseException
	 */
	public static Timestamp converterDataSql(Date date) {
		DateFormat fmt = new SimpleDateFormat(YYYY_MM_DD);
		Timestamp dataParser = null;
		try {
			String format = fmt.format(date);
			dataParser = new java.sql.Timestamp(fmt.parse(format).getTime());
			return dataParser;
		} catch (ParseException e) {
			throw new RuntimeException("Falha ao converter a data: " + date + " causa:  " + e);
		}
	}

	/**
	 * Método que recebe uma data do tipo String e converte para tipo
	 * java.sql.Date
	 * 
	 * @return java.sql.Date
	 * @throws ParseException
	 */
	public static java.sql.Date converterDataDeStringParaSql(String date) throws ParseException {
		java.sql.Date data = null;
		if (!eDataValida(date)) {
			DateFormat fmt = new SimpleDateFormat(YYYY_MM_DD);
			data = new java.sql.Date(fmt.parse(date).getTime());
		}
		return data;
	}

	private static boolean eDataValida(String date) {
		return date == null || date == "";
	}


	public static String getDataAtual() {
		Locale locale = new Locale("pt","BR");
		GregorianCalendar calendar = new GregorianCalendar(); 
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss",locale);
		return formatador.format(calendar.getTime());
	}

	public static XMLGregorianCalendar converteXMLGregorianCalendar(String date) throws Exception {
		XMLGregorianCalendar xmlCalender = null;
		if (!eDataValida(date)) {

			GregorianCalendar calender = new GregorianCalendar();
			calender.setTime(converterStringDate(date));
			try {
				xmlCalender = DatatypeFactory.newInstance().newXMLGregorianCalendar(calender);
			} catch (DatatypeConfigurationException e) {

			}
		}
		return xmlCalender;

	}

}