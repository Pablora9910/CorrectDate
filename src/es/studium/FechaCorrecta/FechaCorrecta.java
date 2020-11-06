package es.studium.FechaCorrecta;

import java.util.Scanner;

//import java.util.Calendar;
//import java.util.GregorianCalendar;

public class FechaCorrecta
{

	public static void main(String[] args)
	{
		/*Calendar fecha = new GregorianCalendar();
		int año = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);*/
		Scanner teclado = new Scanner(System.in);
		int dia,mes,año ;
		System.out.println( "Introduce un Día " );
		dia=teclado.nextInt();
		System.out.println( "Introduce un Mes " );
		mes=teclado.nextInt();
		System.out.println( "introduce un Año" );
		año=teclado.nextInt();
		teclado.close();
        switch(mes) 
        {
        	case 1:
        	case 3:
        	case 5:
        	case 7:
        	case 8:
        	case 10:
        	case 12:
        		if (dia<1 || dia>31)
        		{
        			System.out.println("Día invalido para e mes metido");
        		}
        		else
        		{
        			System.out.println("Día valido para e mes metido");
        		}
        		break;
        	case 4:
        	case 6:
        	case 9:
        	case 11:
        		if (dia<1 || dia>30)
        		{
        			System.out.println("Día invalido para e mes metido");
        		}
        		else
        		{
        			System.out.println("Día valido para e mes metido");
        		}
        		break;
        	case 2:
        		if( año%4==0 && año%100!=0 || año%400==0)
        		{
        			if(dia<1 || dia<28)
        			{
        				System.out.println("Fecha Incorrecta ");
        			}
        			else
        			{
        				System.out.println("FECHA ES CORRECTA");
        			}
        		}
        		else
        		{
        			if(dia < 1 && dia<29)
        			{
        				System.out.println("Fecha Incorrecta");
        			}
        			else
        			{
        				System.out.println("FECHA ES CORRECTA ");
        			}
        		}
        		break;
        	default:
        		System.out.println("La fecha es incorrecta mes invalido");
        		break;
        		
        		
        }
	}
}



/*
Programa ejercicio27

VARIABLES
   ENTERO agno, mes, dia
INICIO
	ESCRIBE "Introduce el dia de hoy"
	LEER dia
	ESCRIBE "Introduce el mes actual (como número)"
	LEER mes
	ESCRIBE "Introduce el año actual"
	LEER agno
	SEGUN mes HACER
		CASO 1:
		CASO 3:
		CASO 5:
		CASO 7:
		CASO 8:
		CASO 10:
		CASO 12:
			SI dia<1 O dia>31 ENTONCEA
				ESCRIBIR "Dia inavalido para el més que has metido "
			SINO
				ESCRIBIR "La fecha es correcta"
			FIN
		CASO 4:
		CASO 6:
		CASO 9:
		CASO 11:
			SI dia<1 O dia>30 ENTONCEA
				ESCRIBIR "Dia inavalido para el més que has metido "
			SINO
				ESCRIBIR "La fecha es correcta"
			FIN
		CASO 2:
			SI (agno%4 = 0 Y agno%100<>0) O (agno%400 = 0)
				SI dia < 1 0 dia<28 ENTONCES 
					ESCRIBIR  "Fecha Incorrecta"
				SINO
					ESCRIBIR "FECHA ES CORRECTA"
				FINSI
			SINO
				SI dia < 1 0 dia<29 ENTONCES 
				ESCRIBIR  "Fecha Incorrecta"
				SINO
					ESCRIBIR "FECHA ES CORRECTA"
				FINSI
			FINSI
		DEFECTO:
			ESCRIBIR "La fecha es incorrecta mes invalido"
	FINSEGUN
FIN

*/