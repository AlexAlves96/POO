/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/alex.json")
public class SeuServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("application/json");
        
        PrintWriter out = response.getWriter();
        out.print("{\"RA\":\"1290482112025\", \"nome\":\"Alex Alves\", \"disciplinas\":[\"Gestão de Projetos\","
                + "\"Estágio Supervisionado em Análise e Desenvolvimento de Sistemas\",\"Ética e Responsabilidade Profissional\","
                + "\"Inteligência Artificial (Escolha 3)\",\"Programação Orientada a Objetos\","
                + "\"Tópicos Especiais em Informática (Escolha 2)\",\"Inglês VI\",\"Programação Linear e Aplicações\",\"Linguagem de Programação IV\"}");
        out.flush();
    }

}
