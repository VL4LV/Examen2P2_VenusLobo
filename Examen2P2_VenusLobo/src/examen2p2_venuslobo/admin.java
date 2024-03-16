/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_venuslobo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class admin {

    private ArrayList<vehiculo> ap = new ArrayList();
    private File archivo = null;

    public admin() {
    }

    public ArrayList<vehiculo> getAp() {
        return ap;
    }

    public void setAp(ArrayList<vehiculo> ap) {
        this.ap = ap;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

//    public void cargarArchi() throws IOException {
//        BufferedReader b = new BufferedReader(new FileReader(archivo.getName()));
//        String s;
//        while ((s = b.readLine()) != null) {
//            String[] tokens = s.split(",");
//            ap.add(new vehiculo(Integer.parseInt(tokens[0]), 
//                    tokens[1], 
//                    tokens[2], 
//                    Double.parseDouble(tokens[3]),
//                    Integer.parseInt(tokens[4]),
//                    Integer.parseInt(tokens[5])));
//        }
//    }
    public void escribirArchi() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);

            for (vehiculo p : ap) {
                bw.write(p.getCodigo()+ ",");
                bw.write(p.getMarca()+ ",");
                bw.write(p.getModelo()+ ",");
                bw.write(p.getPrecio()+ ",");
                bw.write(p.getCodigo()+ ",");
                bw.write(p.getFechaCreacion()+ "\n");
            }
            bw.flush();
        } catch (Exception e) {
        }
        bw.close();
        fw.close();
    }

}
