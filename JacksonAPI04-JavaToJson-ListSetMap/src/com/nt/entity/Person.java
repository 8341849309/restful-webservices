package com.nt.entity;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.Data;

@Data
public class Person {
	private int pid;
	private List<String> nickNames;
	private Set<Long> phones;
	private Map<String, LocalDate> impDates;
}
