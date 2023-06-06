package com.teoria.restaurante;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.teoria.restaurante.model.Menu;

/**
 * Servlet implementation class Consultar
 */
@WebServlet("/Consultar")
public class Consultar extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Consultar() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String dia=request.getParameter("dia");
		/*if(dia.equalsIgnoreCase("lunes")) {
			response.getWriter().append("hoy es lunes");
		}
		else {
			response.getWriter().append("hoy NO es lunes");
		}*/
		HashMap<String, Menu>hm=new HashMap<>();
		hm.put("lunes", new Menu("arroz","agua","manzana", 19.95f));
		hm.put("martes", new Menu("tortilla","aquarius","platano", 19.95f));
		hm.put("miércoles", new Menu("albondigas","fanta","tarta", 19.95f));
		hm.put("jueves", new Menu("paella","sin bebida","tarta de queso", 19.95f));
		hm.put("viernes", new Menu("pizza","cocacola","lima", 19.95f));
		
		
		hm.keySet().stream().filter(k->k.equalsIgnoreCase(dia)).findFirst().ifPresent(k->{
			try {
				response.getWriter().append(hm.get(k).getComida()+"-");
				response.getWriter().append(hm.get(k).getComida()+"-");
				response.getWriter().append(hm.get(k).getComida()+"-");
				response.getWriter().append(hm.get(k).getComida()+"-");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
