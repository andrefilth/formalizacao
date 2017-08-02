
package br.com.santander.front.previdencia.formalizacao.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuestionAnswer", propOrder = {
    "questionaryId",
    "questionId",
    "answerId",
    "answerDescription"
})
public class QuestionAnswer {

    protected Integer questionaryId;
    protected Integer questionId;
    protected Integer answerId;
    protected String answerDescription;

    
    /**
	 * 
	 */
	public QuestionAnswer() {
	}

	/**
	 * @param questionaryId
	 * @param questionId
	 * @param answerId
	 * @param answerDescription
	 */
	public QuestionAnswer(Integer questionaryId, Integer questionId, Integer answerId, String answerDescription) {
		this.questionaryId = questionaryId;
		this.questionId = questionId;
		this.answerId = answerId;
		this.answerDescription = answerDescription;
	}

	/**
     * Obt�m o valor da propriedade questionaryId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuestionaryId() {
        return questionaryId;
    }

    /**
     * Define o valor da propriedade questionaryId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuestionaryId(Integer value) {
        this.questionaryId = value;
    }

    /**
     * Obt�m o valor da propriedade questionId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuestionId() {
        return questionId;
    }

    /**
     * Define o valor da propriedade questionId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuestionId(Integer value) {
        this.questionId = value;
    }

    /**
     * Obt�m o valor da propriedade answerId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAnswerId() {
        return answerId;
    }

    /**
     * Define o valor da propriedade answerId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAnswerId(Integer value) {
        this.answerId = value;
    }

    /**
     * Obt�m o valor da propriedade answerDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnswerDescription() {
        return answerDescription;
    }

    /**
     * Define o valor da propriedade answerDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnswerDescription(String value) {
        this.answerDescription = value;
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("QuestionAnswer [");
		if (questionaryId != null) {
			builder.append("questionaryId=");
			builder.append(questionaryId);
			builder.append(", ");
		}
		if (questionId != null) {
			builder.append("questionId=");
			builder.append(questionId);
			builder.append(", ");
		}
		if (answerId != null) {
			builder.append("answerId=");
			builder.append(answerId);
			builder.append(", ");
		}
		if (answerDescription != null) {
			builder.append("answerDescription=");
			builder.append(answerDescription);
		}
		builder.append("]");
		return builder.toString();
	}

    
}
