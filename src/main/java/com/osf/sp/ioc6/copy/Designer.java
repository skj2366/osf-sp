package com.osf.sp.ioc6.copy;

import org.springframework.stereotype.Component;

@Component
public class Designer extends Worker {

	public Designer() {
		super("디자이너" , "it팀");
	}
	@Override
	public void doWork() {
		System.out.println("디자이너 반장이 일을합니다.");
	}

	@Override
	public void goToOffice() {
		System.out.println("디자이너 반장이 출근합니다.");
	}

}
