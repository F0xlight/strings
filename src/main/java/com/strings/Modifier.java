package com.strings;

import java.awt.image.BufferedImage;

public class Modifier {

    private static int averageIntARGB(int a, int b) {

        // récupère chaque canal et fait une moyenne avec les carrés
        int nA = (int) Math.sqrt((Math.pow((double)((a >> 24) & 0xFF), 2)+Math.pow((double)((b >> 24) & 0xFF), 2))/2);
        int nR = (int) Math.sqrt((Math.pow((double)((a >> 16) & 0xFF), 2)+Math.pow((double)((b >> 16) & 0xFF), 2))/2);
        int nG = (int) Math.sqrt((Math.pow((double)((a >> 8) & 0xFF), 2)+Math.pow((double)((b >> 8) & 0xFF), 2))/2);
        int nB = (int) Math.sqrt((Math.pow((double)(a & 0xFF), 2)+Math.pow((double)(b & 0xFF), 2))/2);

        // recombine les canaux en un int
        return (nA << 24) | (nR << 16) | (nG << 8) | nB ;
    }
    
    public static BufferedImage applyFunction(BufferedImage source, int width, int height) {
        BufferedImage frame = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        
        // la transfo est un sinus pour l'instant
        for(int x = 0; x < width; x++) {
            for(int y = 0; y < height; y++) {
                int ny = y + (int) (Math.sin((double) x /10)*5) ;
                if(ny >= 0 && ny < height) {
                    frame.setRGB(x, ny, source.getRGB(x, y));
                }
            }
        }

        return frame;
    }
}
