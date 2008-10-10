/**
 * pcgen.core.term.EvaluatorFactoryEQVar.java
 * Copyright 2008 Andrew Wilson
 * <nuance@users.sourceforge.net>.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; if not, write to the Free Software Foundation, Inc.,
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 *
 * Created 03 Oct 2008
 *
 * Current Ver: $Revision:$
 * Last Editor: $Author:$
 * Last Edited: $Date:$
 */

package pcgen.core.term;

/**
 * <code>EvaluatorFactoryEQVar</code> 
 *
 * This individual enumerations in this class are each responsible for making
 * and returning an object that implements the TermEvaluator interface.  Each
 * enumeration has a regular expression that matches one of the "hardcoded"
 * internal variables that every piece of equipment has a value for.  They also
 * have an array of string keys that enumerate every string that the regular
 * expression can match (this is not as bad as it sounds since each can only
 * match at most eight strings).  The array of string is used to populate a
 * Map<String, Enum>
 */

public enum TermEvaluatorBuilderEQVar implements TermEvaluatorBuilder
{
	COMPLETE_EQ_BASECOST
		("BASECOST",
		 new String[] { "BASECOST" },
	 	 true ) { 

		public TermEvaluator getTermEvaluator(
				final String expressionString,
				final String src,
				final String matchedSection) {

			return new EQBaseCostTermEvaluator(expressionString);
		}
	},

	COMPLETE_EQ_CRITMULT
		("CRITMULT",
		 new String[] { "CRITMULT" },
	 	 true ) { 

		public TermEvaluator getTermEvaluator(
				final String expressionString,
				final String src,
				final String matchedSection) {

			return new EQCritMultTermEvaluator(expressionString);
		}
	},

	COMPLETE_EQ_DMGDICE
		("DMGDICE",
		 new String[] { "DMGDICE" }, 
		 true ) { 

		public TermEvaluator getTermEvaluator(
				final String expressionString,
				final String src,
				final String matchedSection) {

			return new EQACCheckTermEvaluator(expressionString);
		}
	},

	COMPLETE_EQ_DMGDIE
		("DMGDIE",
		 new String[] { "DMGDIE" }, 
		 true ) { 

		public TermEvaluator getTermEvaluator(
				final String expressionString,
				final String src,
				final String matchedSection) {

			return new EQDamageDieTermEvaluator(expressionString);
		}
	},
	COMPLETE_EQ_EQACCHECK
		("EQACCHECK",
		 new String[] { "EQACCHECK" },
	 	 true ) { 

		public TermEvaluator getTermEvaluator(
				final String expressionString,
				final String src,
				final String matchedSection) {

			return new EQACCheckTermEvaluator(expressionString);
		}
	},

	COMPLETE_EQ_EQHANDS
		("EQHANDS",
		 new String[] { "EQHANDS" },
	 	 true ) { 

		public TermEvaluator getTermEvaluator(
				final String expressionString,
				final String src,
				final String matchedSection) {

			return new EQHandsTermEvaluator(expressionString);
		}
	},

	COMPLETE_EQ_EQSPELLFAIL
		("EQSPELLFAIL",
		 new String[] { "EQSPELLFAIL" },
	 	 true ) { 

		public TermEvaluator getTermEvaluator(
				final String expressionString,
				final String src,
				final String matchedSection) {

			return new EQSpellFailureTermEvaluator(expressionString);
		}
	},
	
	COMPLETE_EQ_EQUIP_SIZE_INT
		("EQUIP\\.SIZE(?:\\.INT)?",
		 new String[] { "EQUIP.SIZE.INT", "EQUIP.SIZE" },
		 true ) { 

		public TermEvaluator getTermEvaluator(
				final String expressionString,
				final String src,
				final String matchedSection) {

			if (matchedSection.length() == 14)
			{
				return new EQSizeTermEvaluator(expressionString);
			}
			else
			{
				return new EQEquipSizeTermEvaluator(expressionString);				
			}
		}
	},

	COMPLETE_EQ_RANGE
		("RANGE",
		 new String[] { "RANGE" },
	 	 true ) { 

		public TermEvaluator getTermEvaluator(
				final String expressionString,
				final String src,
				final String matchedSection) {

			return new EQRangeTermEvaluator(expressionString);
		}
	},

	COMPLETE_EQ_REACHMULT
		("(?:RACEREACH|REACHMULT|REACH)",
		 new String[] { "RACEREACH" ,"REACHMULT", "REACH" },
	 	 true ) { 

		public TermEvaluator getTermEvaluator(
				final String expressionString,
				final String src,
				final String matchedSection) {

			if ("RACEREACH".equals(expressionString))
			{
				return new EQRaceReachTermEvaluator(expressionString, src);				
			}
			else if ("REACHMULT".equals(expressionString))
			{
				return new EQReachMultTermEvaluator(expressionString);
			}
			else if ("REACH".equals(expressionString))
			{
				return new EQReachTermEvaluator(expressionString);
			}
			return null;
		}
	},

	COMPLETE_EQ_SIZE
		("SIZE",
		 new String[] { "SIZE" },
	 	 true ) { 

		public TermEvaluator getTermEvaluator(
				final String expressionString,
				final String src,
				final String matchedSection) {

			return new EQSizeTermEvaluator(expressionString);
		}
	},

	COMPLETE_EQ_WT
		("WT",
		 new String[] { "WT" },
	 	 true ) { 

		public TermEvaluator getTermEvaluator(
				final String expressionString,
				final String src,
				final String matchedSection) {

			return new EQWeightTermEvaluator(expressionString);
		}
	};

	private String   termConstructorPattern;
	private String[] termConstructorKeys;
	private boolean  patternMatchesEntireTerm;

	TermEvaluatorBuilderEQVar(
			String pattern,
			String[] keys,
			boolean matchEntireTerm)
	{
		termConstructorPattern   = pattern;
		termConstructorKeys      = keys;
		patternMatchesEntireTerm = matchEntireTerm;
	}

	public String getTermConstructorPattern()
	{
		return termConstructorPattern;
	}

	public String[] getTermConstructorKeys()
	{
		return termConstructorKeys;
	}

	public boolean isEntireTerm()
	{
		return patternMatchesEntireTerm;
	}
}

