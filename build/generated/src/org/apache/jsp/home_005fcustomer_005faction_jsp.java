package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import edu.pitt.store.Order;
import edu.pitt.store.Customer;
import java.util.Date;
import java.sql.ResultSet;
import edu.pitt.utilities.DbUtilities;
import edu.pitt.store.Product;
import java.util.ArrayList;
import edu.pitt.store.HomeCustomer;

public final class home_005fcustomer_005faction_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");

    if(session.getAttribute("homecustomer")==null){
        response.sendRedirect("login_home_customer.jsp");
    }
    

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Home Customer Operation Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap-theme.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body >\n");
      out.write("        <h1 align=\"center\">Welcome! For Home Customer:</h1>\n");
      out.write("        <h3 align=\"center\">Browse product</h3>\n");
      out.write("    <!---------------Browse Products by Category ---------------------->\n");
      out.write("        <div align=\"center\">\n");
      out.write("            <form method=\"get\" action=\"home_customer_action.jsp\" >\n");
      out.write("                <label>Category of Products: &nbsp;</label>\n");
      out.write("                <select name=\"category\" class=\"form-control\" >\n");
      out.write("                    \n");
      out.write("                    <option value=\"all\" selected=\"selected\">All</option>\n");
      out.write("                    <option value=\"Men's Clothing\">Men's Clothing</option>\n");
      out.write("                    <option value=\"Women's Clothing\">Women's Clothing</option>\n");
      out.write("                    <option value=\"kids Clothing\">Kids Clothing</option>\n");
      out.write("                    <option value=\"Handbags\">Handbags</option>\n");
      out.write("                    <option value=\"Shoes\">Shoes</option>\n");
      out.write("                </select><br><br>\n");
      out.write("                    <input type=\"submit\" value=\"Submit Query\" class=\"btn btn-default\"/>\n");
      out.write("            </form>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("        ");

            
            
            HomeCustomer homeCustomer = (HomeCustomer) session.getAttribute("homehustomer");
            if(request.getParameter("category")!=null){
                String category = request.getParameter("category");
                int customerID = Integer.parseInt(session.getAttribute("customerID").toString());
                System.out.println(customerID);
                Customer customer = new Customer(customerID);
                ArrayList<Product> productList = customer.customerFindProductByCategory(category);
                out.println("<table align='center' border='2' class='table table-hover'>");
                out.println("<tr>");
                out.println("<th> Product ID </th>");   
                out.println("<th> Product name </th>");
                out.println("<th> Category </th>");
                out.println("<th> Inventory </th>");
                out.println("<th> Price </th>");
                out.println("</tr>");

                for(Product product: productList){
                    out.println("<tr>");
                    out.println("<td> "+product.getProductID()+" </td>");
                    out.println("<td> "+product.getName()+" </td>");
                    out.println("<td> "+product.getCategory()+" </td>");
                    out.println("<td> "+product.getInventory()+" </td>");
                    out.println("<td> "+product.getPrice()+" </td>");
                    out.println("</tr>");
                }

                out.println("</table>");


            }
            
        
      out.write("\n");
      out.write("        <br><br>\n");
      out.write("    <!---------------Browse Products by Product Name ---------------------->    \n");
      out.write("        <h3 align=\"center\">Search Product</h3>\n");
      out.write("        <div align=\"center\">\n");
      out.write("            <form method=\"get\" action=\"home_customer_action.jsp\">\n");
      out.write("                <label>Product name: &nbsp;\n");
      out.write("                    <input type=\"text\" name=\"productName\" placeholder=\"Product Name\" class=\"form-control\" size=\"100\" required/>（vague search）</label><br><br>\n");
      out.write("            <input type=\"submit\" value=\"Submit Query\" class=\"btn btn-default\"/>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("        ");

            homeCustomer = (HomeCustomer) session.getAttribute("homecustomer");
            if(request.getParameter("productName")!=null){
                String name = request.getParameter("productName");
                ArrayList<Product> productList = homeCustomer.findProductByName(name);
                out.println("<table align='center' border='2'  class='table table-hover'>");
                out.println("<tr>");
                out.println("<th>Product ID</th>");   
                out.println("<th>Product name</th>");
                out.println("<th>Category</th>");
                out.println("<th>Inventory</th>");
                out.println("<th>Price</th>");
                out.println("</tr>");
                
                for(Product product: productList){
                    out.println("<tr>");
                    out.println("<td>"+product.getProductID()+"</td>");
                    out.println("<td>"+product.getName()+"</td>");
                    out.println("<td>"+product.getCategory()+"</td>");
                    out.println("<td>"+product.getInventory()+"</td>");
                    out.println("<td>"+product.getPrice()+"</td>");
                    out.println("</tr>");
                }
                
                out.println("</table>");
                
            }
            
        
      out.write("\n");
      out.write("        <br><br>\n");
      out.write("        \n");
      out.write("    <!---------------Browse Products by Product ID ---------------------->    \n");
      out.write("        <h3 align=\"center\">Search Product</h3>\n");
      out.write("        <div align=\"center\">\n");
      out.write("            <form method=\"get\" action=\"home_customer_action.jsp\">\n");
      out.write("                <label>Product ID: &nbsp;\n");
      out.write("                    <input type=\"number\" name=\"productIID\" placeholder=\"Product ID\" size=\"120\" class=\"form-control\" required/>（precise search） </label><br><br>\n");
      out.write("                <input type=\"submit\" value=\"Submit Query\"  class=\"btn btn-default\"/>\n");
      out.write("            </form>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("        ");

            if(request.getParameter("productIID")!=null){
                int productID = Integer.parseInt(request.getParameter("productIID"));
                Product product = new Product(productID);
                
                out.println("<table align='center' border='2' class='table table-hover'>");
                out.println("<tr>");
                out.println("<th>Product ID</th>");   
                out.println("<th>Product name</th>");
                out.println("<th>Category</th>");
                out.println("<th>Inventory</th>");
                out.println("<th>Price</th>");
                out.println("</tr>");
                
                
                if(product.getProductID()!=0){
                    out.println("<tr>");
                    out.println("<td>"+product.getProductID()+"</td>");
                    out.println("<td>"+product.getName()+"</td>");
                    out.println("<td>"+product.getCategory()+"</td>");
                    out.println("<td>"+product.getInventory()+"</td>");
                    out.println("<td>"+product.getPrice()+"</td>");
                    out.println("</tr>");
                }
                
                
            
            out.println("</table>");
            
            }
            
        
      out.write("\n");
      out.write("        \n");
      out.write("        <br><br>\n");
      out.write("    <!---------------Search Orders by Time Period, Product ID, or Order ID ---------------------->\n");
      out.write("        <h3 align=\"center\">Search for Orders</h3>\n");
      out.write("        <div align=\"center\">\n");
      out.write("            <form method=\"get\" action=\"home_customer_action.jsp\" >\n");
      out.write("                <label>Time period: \n");
      out.write("                <select name=\"timePeriod\" class=\"form-control\">\n");
      out.write("                    <option value=\"1000\" selected=\"selected\"> All Orders</option>\n");
      out.write("                    <option value=\"30\">Last 30 Days</option>\n");
      out.write("                    <option value=\"60\">Last 60 Days</option>\n");
      out.write("                    <option value=\"90\">Last 90 Days</option>\n");
      out.write("                </select></label><br><br>\n");
      out.write("                <label>Product ID: \n");
      out.write("                    <input name=\"productID\" type=\"number\" placeholder=\"Product ID\" value=\"0\" required/></label><br><br>\n");
      out.write("                <label>Order ID: \n");
      out.write("                    <input type=\"text\" name=\"orderID\" placeholder=\"Order ID\" value=\"0\" required/></label><br><br>\n");
      out.write("                <input type=\"submit\" value=\"Submit Query\" class=\"btn btn-default\" />\n");
      out.write("                \n");
      out.write("            </form>\n");
      out.write("        </div><br>\n");
      out.write("        ");

           if(session.getAttribute("customerID")!=null){
                int period = 0;
                int productID = 0;
                int orderID = 0;
                int customerID = Integer.parseInt(session.getAttribute("customerID").toString());
                Customer customer = new Customer(customerID);
                ArrayList<Order> orderList = new ArrayList<Order>();
                if(request.getParameter("orderID")!=null){
                        orderID = Integer.parseInt(request.getParameter("orderID"));
                        period=1000;
                        productID = 0;
                }else{
                    if(request.getParameter("timePeriod")!=null){
                        period = Integer.parseInt(request.getParameter("timePeriod"));
                        if(request.getParameter("productID")!=null){
                            productID = Integer.parseInt(request.getParameter("productID"));
                        }
                    }
                }
                if(customer.customerFindOrder(customerID, period, productID, orderID)!=null){
                    orderList = customer.customerFindOrder(customerID, period, productID, orderID);
                    
                    out.println("<table align='center' border='2'  class='table table-hover'>");
                    out.println("<tr>");
                    out.println("<th>Product ID</th>");   
                    out.println("<th>Product name</th>");
                    out.println("<th>Category</th>");
                    out.println("<th>Inventory</th>");
                    out.println("<th>Price</th>");
                    out.println("</tr>");
                
                for(Order order: orderList){
                    out.println("<tr>");
                    out.println("<td>"+order.getOrderID()+"</td>");
                    out.println("<td>"+order.getCustomerID()+"</td>");
                    out.println("<td>"+order.getSalesID()+"</td>");
                    out.println("<td>"+order.getDate()+"</td>");
                    out.println("<td>"+order.getProductID()+"</td>");
                    out.println("<td>"+order.getPrice()+"</td>");
                    out.println("<td>"+order.getQuantity()+"</td>");
                    out.println("</tr>");
                }
                out.println("</table>");
                }
                
                
                
           }
            
        
      out.write("\n");
      out.write("        <br><br><br><br><br><br>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}