package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ServiceImpl {
	
	public double method(IntegerDTO dto)
	{
		double pro = 1.0;
		int i = 0;
		double a[] = dto.getA();
		while(i < a.length)
		{
			pro *= a[i];
			i++;
		}
//		List<Double> list = dto.getList();
//		i = 0;
//		while(i<list.size())
//		{
//			pro *= list.get(i);
//			i++;
//		}
		return pro;
	}

}
