package fr.unilim.iut.spaceinvaders;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;
import org.junit.Before;


import fr.unilim.iut.spaceinvaders.utils.HorsEspaceJeuException;

public class SpaceInvadersTest {
	
    private SpaceInvaders spaceinvaders;

    @Before
    public void initialisation() {
	    spaceinvaders = new SpaceInvaders(15, 10);
    }
    
	 @Test
	   public void test_AuDebut_JeuSpaceInvaderEstVide() {
		    assertEquals("" + 
		    "...............\n" + 
		    "...............\n" +
		    "...............\n" + 
		    "...............\n" + 
		    "...............\n" + 
		    "...............\n" + 
		    "...............\n" + 
		    "...............\n" + 
		    "...............\n" + 
		    "...............\n" , spaceinvaders.recupererEspaceJeuDansChaineASCII());
	        }
	 
		@Test
		public void test_unNouveauVaisseauEstCorrectementPositionneDansEspaceJeu() {
			spaceinvaders.positionnerUnNouveauVaisseau(1,1,7,9);
			assertEquals("" + 
			"...............\n" + 
			"...............\n" +
			"...............\n" + 
			"...............\n" + 
			"...............\n" + 
			"...............\n" + 
			"...............\n" + 
			"...............\n" + 
			"...............\n" + 
			".......V.......\n" , spaceinvaders.recupererEspaceJeuDansChaineASCII());
		}

		
	    @Test
		public void test_unNouveauVaisseauAvecDimensionEstCorrectementPositionneDansEspaceJeu() {
			spaceinvaders.positionnerUnNouveauVaisseau(3,2,7,9);
			assertEquals("" + 
			"...............\n" + 
			"...............\n" +
			"...............\n" + 
			"...............\n" + 
			"...............\n" + 
			"...............\n" + 
			"...............\n" + 
			"...............\n" + 
			".......VVV.....\n" + 
			".......VVV.....\n" , spaceinvaders.recupererEspaceJeuDansChaineASCII());
		}
	    
		@Test
		public void test_UnNouveauVaisseauPositionneDansEspaceJeuMaisAvecDimensionTropGrande_DoitLeverUneExceptionDeDebordement() {
			
			try {
				spaceinvaders.positionnerUnNouveauVaisseau(9,2,7,9);
				fail("Dépassement du vaisseau à droite en raison de sa longueur trop importante : devrait déclencher une exception DebordementEspaceJeuException");
			} catch (final DebordementEspaceJeuException e) {
			}
			
			
			try {
				spaceinvaders.positionnerUnNouveauVaisseau(3,4,7,1);
				fail("Dépassement du vaisseau vers le haut en raison de sa hauteur trop importante : devrait déclencher une exception DebordementEspaceJeuException");
			} catch (final DebordementEspaceJeuException e) {
			}
				
		}

	    @Test
	    public void test_VaisseauAvance_DeplacerVaisseauVersLaDroite() {
			
			spaceinvaders.positionnerUnNouveauVaisseau(3,2,7,9);
			spaceinvaders.deplacerVaisseauVersLaDroite();
			assertEquals("" + 
			"...............\n" + 
			"...............\n" +
			"...............\n" + 
			"...............\n" + 
			"...............\n" + 
			"...............\n" + 
			"...............\n" + 
			"...............\n" + 
			"........VVV....\n" + 
			"........VVV....\n" , spaceinvaders.recupererEspaceJeuDansChaineASCII());
		}
	    
	    @Test
		public void test_VaisseauImmobile_DeplacerVaisseauVersLaDroite() {
			
			spaceinvaders.positionnerUnNouveauVaisseau(3,2,12,9);
			spaceinvaders.deplacerVaisseauVersLaDroite();
			assertEquals("" + 
			"...............\n" + 
			"...............\n" +
			"...............\n" + 
			"...............\n" + 
			"...............\n" + 
			"...............\n" + 
			"...............\n" + 
			"...............\n" + 
			"............VVV\n" + 
			"............VVV\n" , spaceinvaders.recupererEspaceJeuDansChaineASCII());
		}
		
	    @Test
		public void test_VaisseauAvecDimensionAvance_DeplacerVaisseauVersLaGauche() {
			
			spaceinvaders.positionnerUnNouveauVaisseau(3,2,7,9);
			spaceinvaders.deplacerVaisseauVersLaGauche();
		
			assertEquals("" + 
			"...............\n" + 
			"...............\n" +
			"...............\n" + 
			"...............\n" + 
			"...............\n" + 
			"...............\n" + 
			"...............\n" + 
			"...............\n" + 
			"......VVV......\n" + 
			"......VVV......\n" , spaceinvaders.recupererEspaceJeuDansChaineASCII());
	    }
	    
		@Test
		public void test_VaisseauAvecDimensionImmobile_DeplacerVaisseauVersLaGauche() {
			
			spaceinvaders.positionnerUnNouveauVaisseau(3,2,0,9);
			spaceinvaders.deplacerVaisseauVersLaGauche();
			
			assertEquals("" + 
			"...............\n" + 
			"...............\n" +
			"...............\n" + 
			"...............\n" + 
			"...............\n" + 
			"...............\n" + 
			"...............\n" + 
			"...............\n" + 
			"VVV............\n" + 
			"VVV............\n" , spaceinvaders.recupererEspaceJeuDansChaineASCII());
		}
		
	    @Test(expected = HorsEspaceJeuException.class)
		public void test_unNouveauVaisseauEstPositionneHorsEspaceJeuTropEnBas_UneExceptionEstLevee() throws Exception {
			spaceinvaders.positionnerUnNouveauVaisseau(1,1,14,10);
		}

	    @Test
		public void test_UnNouveauVaisseauPositionneHorsEspaceJeu_DoitLeverUneException() {
			SpaceInvaders spaceinvaders = new SpaceInvaders(15, 10);
			
			try {
				spaceinvaders.positionnerUnNouveauVaisseau(1,1,15,9);
				fail("Position trop à droite : devrait déclencher une exception HorsEspaceJeuException");
			} catch (final HorsEspaceJeuException e) {
			}
			
			
			try {
				spaceinvaders.positionnerUnNouveauVaisseau(1,1,-1,9);
				fail("Position trop à gauche : devrait déclencher une exception HorsEspaceJeuException");
			} catch (final HorsEspaceJeuException e) {
			}
			
			
			try {
				spaceinvaders.positionnerUnNouveauVaisseau(1,1,14,10);
				fail("Position trop en bas : devrait déclencher une exception HorsEspaceJeuException");
			} catch (final HorsEspaceJeuException e) {
			}
			
			
			try {
				spaceinvaders.positionnerUnNouveauVaisseau(1,1,14,-1);
				fail("Position trop à haut : devrait déclencher une exception HorsEspaceJeuException");
			} catch (final HorsEspaceJeuException e) {
			}
				
		}
}
