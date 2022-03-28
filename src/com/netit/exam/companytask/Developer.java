// © 2022 Anna Vasileva. All rights reserved.

package com.netit.exam.companytask;

import java.util.List;

public class Developer extends Employee {
	private List<KnowledgeEnum> knowledge;

	public Developer(String name, int experience, int salary, List<KnowledgeEnum> knowledge) {
		super(name, experience, salary, Position.DEVELOPER);
		this.knowledge = knowledge;
	}

	public List<KnowledgeEnum> getKnowledge() {
		return knowledge;
	}

	public void setKnowledge(List<KnowledgeEnum> knowledge) {
		this.knowledge = knowledge;
	}

}
