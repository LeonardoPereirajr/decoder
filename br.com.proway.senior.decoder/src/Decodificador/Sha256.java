package Decodificador;

import java.security.MessageDigest;
import java.math.BigInteger;

public class Sha256 {

	public static String getSHA256(String valor) {
		String valorCodificado = null;
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			digest.reset();
			digest.update(valor.getBytes("utf8"));
			valorCodificado = String.format("%064x", new BigInteger(1, digest.digest()));
		} catch (Exception e) {
			e.printStackTrace();
		}

		return valorCodificado;
	}

	public static void main(String[] argv) {

		String valor = "a";
		String sha256 = Sha256.getSHA256(valor);
		System.out.println("O SHA-256 de \"" + valor + "\" é = " + sha256);
	}

}