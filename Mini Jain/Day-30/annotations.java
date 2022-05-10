<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:context="http://www.springframework.org/schema/context"
    xsi:schemaLocation="http://www.springframework.org/schema/beans
        http://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context
        http://www.springframework.org/schema/context/spring-context.xsd">
        
          <context:annotation-config />

	<bean id="america" class="com.world.autowire.America">
		<property name="noOfCountries" value="35" />
	</bean>
	
	<bean id="asia" class="com.world.autowire.Asia">
		<property name="noOfCountries" value="48" />
	</bean>
        
        <bean id="europe" class="com.world.autowire.Europe">
		<property name="noOfCountries" value="44" />
	</bean>
	
	<bean id="world" class="com.world.autowire.World" autowire="byType"/>
	
 </beans>       