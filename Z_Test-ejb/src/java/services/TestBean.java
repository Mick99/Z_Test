/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import interfaces.*;
import javax.ejb.Local;

/**
 *
 * @author Mick_02
 */
@Stateless
@LocalBean
//@Local(LocalService1.class)
@Local(LocalService2.class)

/* Zwei Lokale interfaces sind nicht möglich */

public class TestBean {

	public String meth01() {
		return "meth01";
	}
	public String local1() {
		return "local1";
	}
	public String local2() {
		return "local2";
	}
}
