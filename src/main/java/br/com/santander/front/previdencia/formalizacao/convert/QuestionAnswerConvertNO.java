///**
// * 
// */
//package br.com.santander.front.previdencia.formalizacao.convert;
//
//import org.apache.log4j.Logger;
//import org.springframework.stereotype.Component;
//import org.w3c.dom.Element;
//import org.w3c.dom.Node;
//import org.w3c.dom.NodeList;
//
//
///**
// * @author x195291
// *
// */
//@Component
//public class QuestionAnswerConvertNO {
//
//	private static final String DESCRIPTION = "description";
//	private static final String ANSWER_ID = "answerId";
//	private static final String QUESTION_ID = "questionId";
//	private static final String QUESTIONARY_ID = "questionaryId";
//	private static Logger logger = Logger.getLogger(PhoneConvertNO.class);
//
//	public QuestionAnswer findNoQuestionAnswer(org.w3c.dom.Document documentoXml, String questionaryAnswers) {
//		QuestionAnswer answer = null;
//		final NodeList answerNode = documentoXml.getElementsByTagName(questionaryAnswers);
//		for (int i = 0; i < answerNode.getLength(); i++) {
//			Node nNode = answerNode.item(i);
//			logger.info("Elemento: " + nNode.getNodeName());
//			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
//				Element element = (Element) nNode;
//				String questionaryId = element.getElementsByTagName(QUESTIONARY_ID).item(0).getTextContent();
//				String questionId = element.getElementsByTagName(QUESTION_ID).item(0).getTextContent();
//				String answerId = element.getElementsByTagName(ANSWER_ID).item(0).getTextContent();
//				String description = element.getElementsByTagName(DESCRIPTION).item(0).getTextContent();
//
//				answer = new QuestionAnswerBuilder().withQuestionaryId(Integer.parseInt(questionaryId))
//						.withQuestionId(Integer.parseInt(questionId)).withAnswerId(Integer.parseInt(answerId))
//						.withAnswerDescription(description).createQuestionAnswer();
//				logger.info("Elementos de QuestionAnswer:  " + answer);
//			}
//		}
//		return answer;
//	}
//}
