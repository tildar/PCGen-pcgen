/*
 * RaceToken.java
 * Copyright 2006 (C) Aaron Divinsky <boomer70@yahoo.com>
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 *
 * Created on March 3, 2006
 *
 * Current Ver: $Revision$
 * Last Editor: $Author$
 * Last Edited: $Date$
 */

package plugin.lsttokens.kit;

import java.util.StringTokenizer;

import pcgen.core.Kit;
import pcgen.core.kit.KitRace;
import pcgen.persistence.PersistenceLayerException;
import pcgen.persistence.SystemLoader;
import pcgen.persistence.lst.BaseKitLoader;
import pcgen.persistence.lst.KitLstToken;
import pcgen.util.Logging;

/**
 * Handles the RACE tag as well as Common tags on the RACE line.
 */
public class RaceToken extends KitLstToken
{
	/**
	 * Gets the name of the tag this class will parse.
	 * 
	 * @return Name of the tag this class handles
	 */
	public String getTokenName()
	{
		return "RACE";
	}

	/**
	 * Handles parsing the RACE tag and any Common tags on the line.
	 * 
	 * @param aKit
	 *            the Kit object to add this information to
	 * @param value
	 *            the token string
	 * @return true if parse OK
	 * @throws PersistenceLayerException
	 */
	public boolean parse(Kit aKit, String value)
		throws PersistenceLayerException
	{
		final StringTokenizer colToken =
				new StringTokenizer(value, SystemLoader.TAB_DELIM);
		KitRace kRace = new KitRace(colToken.nextToken());

		while (colToken.hasMoreTokens())
		{
			final String colString = colToken.nextToken();
			if (colString.startsWith("RACE:"))
			{
				Logging.errorPrint("Ignoring second RACE tag \"" + colString
					+ "\" in RaceToken.parse");
			}
			else
			{
				if (BaseKitLoader.parseCommonTags(kRace, colString) == false)
				{
					throw new PersistenceLayerException("Unknown KitRace info "
						+ " \"" + colString + "\"");
				}
			}
		}
		aKit.addObject(kRace);
		return true;
	}
}
