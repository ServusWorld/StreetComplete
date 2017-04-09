package de.westnordost.streetcomplete;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ApplicationConstants
{
	public final static String
		NAME = "StreetComplete",
		VERSION = "0.7",
		USER_AGENT = NAME + " " + VERSION,
		QUESTTYPE_TAG_KEY = NAME + ":quest_type";

	// date of birth of StreetComplete ;-) (first Google Play version)
	public final static Date DATE_OF_BIRTH = new GregorianCalendar(2017,Calendar.FEBRUARY,20).getTime();

	public final static double
		MAX_DOWNLOADABLE_AREA_IN_SQKM = 50,
		MIN_DOWNLOADABLE_AREA_IN_SQKM = 4;

	public final static double MIN_DOWNLOADABLE_RADIUS_IN_METERS = 1000;

	public final static int QUEST_TILE_ZOOM = 14;
}
