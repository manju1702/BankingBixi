package com.bixi.GenericUtilitls;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.annotations.IConfigurationAnnotation;
import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;

public class IAnnoTrans implements IAnnotationTransformer
{

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod,
			Class<?> occurringClazz)
	{
annotation.setRetryAnalyzer(com.bixi.GenericUtilitls.RetryImpClass.class);
	}




}
