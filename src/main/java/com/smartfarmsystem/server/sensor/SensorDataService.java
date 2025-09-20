package com.smartfarmsystem.server.sensor;

import org.springframework.stereotype.Service;

@Service
public class SensorDataService {

	private final SensorDataRepository sensorDataRepository;

	public SensorDataService(SensorDataRepository sensorDataRepository) {
		this.sensorDataRepository = sensorDataRepository;
	}

	public void saveData(SensorData sensorData) {
		sensorDataRepository.save(sensorData);
		System.out.println("데이터 저장 완료 : " + sensorData.toString());
	}

}
