package com.cybage.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybage.model.Product;
import com.cybage.service.IProductService;
import com.cybage.service.ProductServiceImpl;

/**
 * Servlet implementation class WelcomeAdmin
 */
@WebServlet("/WelcomeAdmin")
public class WelcomeAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WelcomeAdmin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IProductService productService = new ProductServiceImpl();
		List<Product> productList= productService.getAllProducts();
		request.setAttribute("productList", productList);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("WelcomeAdmin.jsp");
		requestDispatcher.forward(request, response);
	}

}
