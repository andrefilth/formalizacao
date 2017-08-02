package br.com.santander.front.previdencia.formalizacao.builder;

import br.com.santander.front.previdencia.formalizacao.entity.QuestionAnswer;

public class QuestionAnswerBuilder {
	
	 private Integer questionaryId;
	    private Integer questionId;
	    private Integer answerId;
	    private String answerDescription;
	    
	    

	/**
		 * @param questionaryId the questionaryId to with
	 * @return 
		 */
		public QuestionAnswerBuilder withQuestionaryId(Integer questionaryId) {
			this.questionaryId = questionaryId;
			return this;}



		/**
		 * @param questionId the questionId to with
		 * @return 
		 */
		public QuestionAnswerBuilder withQuestionId(Integer questionId) {
			this.questionId = questionId;
			return this;}



		/**
		 * @param answerId the answerId to with
		 * @return 
		 */
		public QuestionAnswerBuilder withAnswerId(Integer answerId) {
			this.answerId = answerId;
			return this;}



		/**
		 * @param answerDescription the answerDescription to with
		 * @return 
		 */
		public QuestionAnswerBuilder withAnswerDescription(String answerDescription) {
			this.answerDescription = answerDescription;
	return this;	}



	public QuestionAnswer createQuestionAnswer() {
		return new QuestionAnswer(questionaryId, questionId, answerId, answerDescription);
	}

}
