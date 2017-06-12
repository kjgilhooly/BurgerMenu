package com.xriva.burger;

import java.io.BufferedWriter;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BurgerToppings
 */
@WebServlet("/BurgerToppings")
public class BurgerToppingsServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BurgerToppingsServlet()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		String order = request.getParameter("Toppings");
		int codedOrder = Integer.parseInt(order);
		order = DecodeOrder.decoder(codedOrder);
		BufferedWriter out = new BufferedWriter(response.getWriter());
		out.write("<html>");
		out.write("<head>");
		out.write("<title>Burger Order Decoder</title>");
		out.write("</head>");
		out.write("<body>");
		out.write("<h1>#" + order + "</h1>");
		out.write("<h2>" + order + "</h2>");
		out.write("</body>");
		out.write("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		doGet(request, response);
	}

}
