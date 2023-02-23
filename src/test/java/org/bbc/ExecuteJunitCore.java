package org.bbc;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class ExecuteJunitCore {
	public static void main(String[] args) {
		Result r = JUnitCore.runClasses(JUnit.class,JUnit1.class);
		System.out.println("Failure Count"+ r.getFailureCount());
		System.out.println("Ignore Count"+ r.getIgnoreCount());
		System.out.println("Run Count"+ r.getRunCount());
		int passCount =r.getRunCount()-r.getFailureCount();
		System.out.println("Pass Count"+passCount);
		List<Failure> failures = r.getFailures();
		for (Failure failure : failures) {
			System.out.println(failure);
		}
		
	}

}
