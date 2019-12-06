package com.project.StringAccumulate;

import org.apache.commons.lang3.StringUtils;

public class StringAccumulate 
{
	
	public int add(String numbers) throws Exception {
		
		int totalCount = 0;
		String[] strArray = null;
		String[] numbersArray = null;
		if(StringUtils.isEmpty(numbers))
			return totalCount;
		
		if(numbers.startsWith("//")) {

			 strArray  =  StringUtils.substringAfter(numbers, "//").split("\n");
			 numbersArray =StringUtils.split(strArray[1], strArray[0]);
			 totalCount = getTotal(numbersArray);
			 return totalCount;
		}
		  
		numbersArray = StringUtils.split(numbers);
		for(String firstDelim : numbersArray)
		{
			String[] secondDelim =StringUtils.split(firstDelim,",");
			
			totalCount+= getTotal(secondDelim);
		}
			
		System.out.println(totalCount);
		return totalCount;
	}
	
	public int getTotal(String[] numbersArray) throws Exception {
		int count = 0;
		for(String str : numbersArray) {
			if(Integer.parseInt(str) < 0) {
				throw new Exception("negatives not allowed");
			}
			if(Integer.parseInt(str)<=1000) {
				count = count + Integer.parseInt(str);
			}
		}	
		
		return count;
	}
    public static void main( String[] args ) throws Exception
    {
        StringAccumulate sa = new StringAccumulate();
        //sa.add("//*|$\n1*2$3");
        //sa.add("//;\n1;2");
        sa.add("1\n2,3");
    }
}                      
