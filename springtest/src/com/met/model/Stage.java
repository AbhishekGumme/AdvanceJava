package com.met.model;

public class Stage {

	private static int count;
	private static Stage stage=null;
	private int stageId;
	
	private Stage()
	{
		stageId=++count;
		System.out.println("private cunst called"+stageId);
	}
	
	public static Stage getStage()
	{
		if(stage==null)
		{
			stage=new Stage();
		}
		return stage;
	}
}
