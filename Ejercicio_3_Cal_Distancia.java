import java.util.Scanner;
public class Ejercicio_3_Cal_Distancia
{
    public static void main(String[] args)
        {
        double K = 6371.07;
        double latitud1,longitud1,latitud2,longitud2;
        
        Scanner Tecl = new Scanner(System.in);
        System.out.print("latitud en grados decimales ciudad 1 = ");
        latitud1 = Tecl.nextDouble();
        System.out.print("longitud en grados decimales ciudad 1 = ");
        longitud1= Tecl.nextDouble();
        System.out.print("latitud en grados decimales ciudad 2 = ");
        latitud2 = Tecl.nextDouble();
        System.out.print("longitud en grados decimales ciudad 1 = ");
        longitud2= Tecl.nextDouble();
            
        double long1,lat1,long2,lat2;
        lat1 = Math.toRadians(latitud1);
        long1 = Math.toRadians(longitud1);
        lat2 = Math.toRadians(latitud2);
        long2 = Math.toRadians(longitud2);

        double dlon = (long2-long1);
        double dlat = (lat2-lat1);

        double sinlat = Math.sin(dlat / 2);
        double sinlon = Math.sin(dlon / 2);

        double a = (sinlat * sinlat) + Math.cos(lat1)*Math.cos(lat2)*(sinlon*sinlon);
        double c = 2 * Math.asin (Math.min(1.0, Math.sqrt(a)));

        double distanceInMeters = K * c;

        
      
        System.out.println("La ditancia es = "+distanceInMeters);
        

}

}
