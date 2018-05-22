package com.databaseservice.serviceinterface;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import java.sql.SQLException;

public interface I_Hibernate {

	Object execute(Session session) throws HibernateException, SQLException;

}
