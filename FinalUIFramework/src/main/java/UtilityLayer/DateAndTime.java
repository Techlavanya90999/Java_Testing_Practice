package UtilityLayer;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAndTime {
public static String getYear()
{
	return new SimpleDateFormat ("YYYY").format(new Date());
}
public static String getMonthYear()
{
	return new SimpleDateFormat ("MMYYYY").format(new Date());
}
public static String getDateMonthYear()
{
	return new SimpleDateFormat ("DDMMYYYY").format(new Date());
}
public static String getDateTimeYear()
{
	return new SimpleDateFormat ("DDMMYYYYHHmmss").format(new Date());
}
}
