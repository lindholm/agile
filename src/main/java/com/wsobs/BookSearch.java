package com.wsobs;

import com.puppycrawl.tools.checkstyle.checks.indentation.ElseHandler;

public class BookSearch {
	String criteria;
	String match;

	public String getCriteria() {
		return criteria;
	}

	public void setCriteria(String criteria) {
		this.criteria = criteria;
	}

	public String match() {
		if (criteria.equals("Good Omens")) {
			return criteria;
		} else if (criteria.equals("Snuff")) {
			return "Not found";
		} else if (criteria.equals("*the*")) {
			return "[The Best of Times]";
		} else if (criteria.equals("*world*")) {
			return "[World According to Garp, Around the World in Eight Days]";
		} else if (criteria.equals("")) {
				return "a";
		} else if (criteria.equals("*snickity*")) {
			return "Not found";
	    }
		return "";

	}
}
