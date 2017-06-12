package com.xriva.burger;

public class DecodeOrder
{
	private static String[] TOPPINGS =
	{
			"Mayonnaise", "Ketchup", "Pickles", "Onions", "Tomatoes", "Lettuce",
			"Mustard", "Relish"
	};

	public static void main(String[] args)
	{
		for (int x = 0; x < 256; x++)
		{
			System.out.println(DecodeOrder.decoder(x));
		}
	}

	public DecodeOrder()
	{
	}

	public final static String decoder(int toppings)
	{
		String decodedOrder = "";

		if (toppings < 256)
		{
			for (int x = 0; x < 8; x++)
			{
				int addTopping = (toppings & (int) (Math.pow(2, x)));
				if (addTopping != 0)
					decodedOrder += TOPPINGS[x] + " ";

			}
		}

		if (toppings == 0)
			decodedOrder = "Plain";

		return decodedOrder.trim();
	}

}
