package zswi.objects.dav.collections;

import java.math.BigInteger;
import java.util.ArrayList;

import org.apache.http.impl.client.DefaultHttpClient;

public class CalendarCollection extends AbstractNotPrincipalCollection implements ICalDavSupported {

  java.net.URI addMember;
  java.net.URI resourceId;
  net.fortuna.ical4j.model.Calendar calendarTimezone;
  java.util.Date minDateTime;
  java.util.Date maxDateTime;
  String scheduleCalendarTransp;
  String calendarColor;
  BigInteger calendarOrder;
  ArrayList<String> supportedCalendarComponentSet;
  //{caldav}supported-collation-set
  DefaultHttpClient httpClient;
  String calendarDescription;

  public CalendarCollection(String uri) {
    setUri(uri);
  }
  
  public CalendarCollection(DefaultHttpClient _httpClient) {
    httpClient = _httpClient;
  }

  public java.net.URI getAddMember() {
    return addMember;
  }

  protected void setAddMember(java.net.URI addMember) {
    this.addMember = addMember;
  }

  public java.net.URI getResourceId() {
    return resourceId;
  }

  protected void setResourceId(java.net.URI resourceId) {
    this.resourceId = resourceId;
  }

  public net.fortuna.ical4j.model.Calendar getCalendarTimezone() {
    return calendarTimezone;
  }

  public void setCalendarTimezone(net.fortuna.ical4j.model.Calendar calendarTimezone) {
    this.calendarTimezone = calendarTimezone;
  }

  public java.util.Date getMinDateTime() {
    return minDateTime;
  }

  protected void setMinDateTime(java.util.Date minDateTime) {
    this.minDateTime = minDateTime;
  }

  public java.util.Date getMaxDateTime() {
    return maxDateTime;
  }

  protected void setMaxDateTime(java.util.Date maxDateTime) {
    this.maxDateTime = maxDateTime;
  }

  public String getScheduleCalendarTransp() {
    return scheduleCalendarTransp;
  }

  public void setScheduleCalendarTransp(String scheduleCalendarTransp) {
    this.scheduleCalendarTransp = scheduleCalendarTransp;
  }

  public String getCalendarColor() {
    return calendarColor;
  }

  public void setCalendarColor(String calendarColor) {
    this.calendarColor = calendarColor;
  }

  public BigInteger getCalendarOrder() {
    return calendarOrder;
  }

  public void setCalendarOrder(BigInteger calendarOrder) {
    this.calendarOrder = calendarOrder;
  }

  public String getCalendarDescription() {
    return calendarDescription;
  }

  public void setCalendarDescription(String calendarDescription) {
    this.calendarDescription = calendarDescription;
  }

  @Override
  public ArrayList<String> getSupportedCalendarComponentSet() {
    if (supportedCalendarComponentSet == null) {
      supportedCalendarComponentSet = new ArrayList<String>();
    }
    return supportedCalendarComponentSet;
  }

  @Override
  public void setSupportedCalendarComponentSet(ArrayList<String> supportedCalendarComponentSet) {
    this.supportedCalendarComponentSet = supportedCalendarComponentSet;
  }
 
}
