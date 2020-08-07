package com.todo.boot.util;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/**
 * TodoConstant.
 * @author UDAY JAVA
 *TodoConstant is the class to maintain enum type.
 */
public class TodoConstant {
	public static enum department {Government,In_House,Private,Overcies};

	
public EnumMap<department, Integer> listOfDepartMent() {
	EnumMap<department, Integer> departmentList = new 
            EnumMap<department, Integer>(department.class);
	departmentList.put(department.Government,1);
	departmentList.put(department.In_House,2);
	departmentList.put(department.Private,3);
	departmentList.put(department.Overcies,4);
	return departmentList;
	
}
}
