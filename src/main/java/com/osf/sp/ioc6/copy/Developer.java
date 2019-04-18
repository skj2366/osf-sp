package com.osf.sp.ioc6.copy;

import org.springframework.stereotype.Component;

@Component
public class Developer extends Worker {

	public Developer() {
		super("개발자" , "it팀");
	}
	@Override
	public void doWork() {
		System.out.println("개발팀 반장이 일을합니다.");
	}

	@Override
	public void goToOffice() {
		System.out.println("개발팀 반장이 출근합니다.");
	}

}
