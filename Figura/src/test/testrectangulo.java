package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Modelo.Rectangulo;

class testrectangulo {
static Rectangulo r1;
static Rectangulo r2;
@BeforeAll
static void setup() {
	r1= new Rectangulo();
	r2= new Rectangulo(3,2);
	
}


@Test
void areR1() {
	double areaEsperada=1;
	double areaObtenida= r1.area();
	assertEquals(areaEsperada,areaObtenida);
}

@Test
void areR2() {
	double areaEsperada=6;
	double areaObtenida= r2.area();
	assertEquals(areaEsperada,areaObtenida);
}

@Test
void perimetroR1() {
	double perimetroesperado=4;
	double perometroobtenido= r1.perimetro();
	assertEquals(perimetroesperado,perometroobtenido);
}
@Test
void perimetroR2() {
	double perimetroesperado=10;
	double perometroobtenido= r2.perimetro();
	assertEquals(perimetroesperado,perometroobtenido);
}
}
