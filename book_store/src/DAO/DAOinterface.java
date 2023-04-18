/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author ASUS
 */

import java.util.ArrayList;

public interface DAOinterface<T> {
	public int insert(T t);

	public void update(T t);

	public int delete(T t);

	public int delete_all();

	public ArrayList<T> selecAll();

	public T selectById(int t);

	public ArrayList<T> select_all_ById(int t);

	public ArrayList<T> selecByCondition(String condition);

}
