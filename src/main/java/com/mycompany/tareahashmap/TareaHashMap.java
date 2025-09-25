/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tareahashmap;
import java.util.HashMap;

public class TareaHashMap {
    public static void main(String[] args) {
        HashMap<String, Object> informacionPersonal = new HashMap<>();
        informacionPersonal.put("Nombre", "Pablo");
        informacionPersonal.put("Edad", "33");
        informacionPersonal.put("Ciudad", "Loja");
        
        System.out.println("Ciudad actual: " + informacionPersonal.get("Ciudad"));
        informacionPersonal.put("Ciudad", "Cuenca"); 
        informacionPersonal.put("Profesion", "Ingeniero en Geologia y Minas");
    }
}
