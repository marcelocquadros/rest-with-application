package br.com.marcelo;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

// It's good practice to include a version number in the path so you can have
// multiple versions deployed at once. That way consumers don't need to upgrade
// right away if things are working for them.
// use the url to access http://localhost:7001/RestExample/rest/calc/1.0/addTwoNumbers;firstNumber=2;secondNumber=3
@Path("calc/1.0")
public class CalculatorV1_0 {
  @GET
  @Consumes("text/plain")
  @Produces("text/plain")
  @Path("addTwoNumbers")
  public String add(@MatrixParam("firstNumber") int n1, @MatrixParam("secondNumber") int n2) {
    return "The result is "+ String.valueOf(n1 + n2);
  }
}