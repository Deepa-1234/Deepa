package com.crm.comcast.GenericUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnlizerImplementation implements IRetryAnalyzer {
	int count=0;
	int retryLimit=1;
	public boolean retry(ITestResult result) {
		
		if(count < retryLimit){
			count++;
			return true;
		}
		return false;
	}

}
