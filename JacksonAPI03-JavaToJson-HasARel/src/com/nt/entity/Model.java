package com.nt.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Model {
	private int modelId;
	private String modelCode;
	private double modelCost;
	private Margin margin;
}
