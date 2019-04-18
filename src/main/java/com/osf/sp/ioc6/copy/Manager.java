package com.osf.sp.ioc6.copy;

import org.springframework.stereotype.Component;

@Component
public class Manager extends Worker {

	public Manager() {
		super("매니저","it팀");
	}

	@Override
	public void doWork() {

		System.out.println("매니저가 일을 한다");
	}

	@Override
	public void goToOffice() {

		System.out.println("매니저는 늦게 출근해도 되지");
		
	}
}
