package com.employee.QuestionWithAnswers;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Answers {
	List<String> AnswersList;
	Set<String>  AnswersSet;
	Map<Integer,String>  AnswersMap;
	
	public List<String> getAnswersList() {
		System.out.print("List of Answers: ");
		return AnswersList;
	}
	public void setAnswersList(List<String> answersList) {
		AnswersList = answersList;
	}
	
	public Set<String> getAnswersSet() {
		System.out.print("Answers In Set: ");
		return AnswersSet;
	}
	public void setAnswersSet(Set<String> answersSet) {
		AnswersSet = answersSet;
	}
	
	public Map<Integer, String> getAnswersMap() {
		System.out.print("Answers In Mapping :");
		return AnswersMap;
	}
	public void setAnswersMap(Map<Integer, String> answersMap) {
		AnswersMap = answersMap;
	}	

}
