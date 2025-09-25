/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tareahashmap;
import java.util.HashMap;

public class TareaHashMap {
    public static void main(String[] args) {
        HashMap<String, Object> informacionPersonal = new HashMap<>();
        informacionPersonal.put("nombre", "Pablo");
        informacionPersonal.put("edad", "33");
        informacionPersonal.put("ciudad", "Loja");
        
        System.out.println("Ciudad actual: " + informacionPersonal.get("Ciudad"));
        informacionPersonal.put("ciudad", "Cuenca"); 
        informacionPersonal.put("profesion", "Ingeniero en Geologia y Minas");
        
         if (!informacionPersonal.containsKey("telefono")) {
            informacionPersonal.putIfAbsent("telefono", "0912345678");
        }
         
         informacionPersonal.remove("edad");
         
         System.out.println("\nContenido final del HashMap:");
        for (String clave : informacionPersonal.keySet()) {
            System.out.println(clave + " : " + informacionPersonal.get(clave));
        }
    }
}
