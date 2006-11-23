/******************************************************************************
 * Product: Compiere ERP & CRM Smart Business Solution                        *
 * Copyright (C) 1999-2006 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software;
 you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY;
 without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program;
 if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
package org.compiere.model;

/** Generated Model - DO NOT CHANGE */
import java.util.*;
import java.sql.*;
import java.math.*;
import org.compiere.util.*;
/** Generated Model for AD_WorkflowProcessor
 *  @author Jorg Janke (generated) 
 *  @version Release 2.6.0a - $Id$ */
public class X_AD_WorkflowProcessor extends PO
{
/** Standard Constructor
@param ctx context
@param AD_WorkflowProcessor_ID id
@param trxName transaction
*/
public X_AD_WorkflowProcessor (Properties ctx, int AD_WorkflowProcessor_ID, String trxName)
{
super (ctx, AD_WorkflowProcessor_ID, trxName);
/** if (AD_WorkflowProcessor_ID == 0)
{
setAD_WorkflowProcessor_ID (0);
setFrequency (0);
setFrequencyType (null);
setKeepLogDays (0);	// 7
setName (null);
setSupervisor_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_WorkflowProcessor (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=697 */
public static final int Table_ID=697;

/** TableName=AD_WorkflowProcessor */
public static final String Table_Name="AD_WorkflowProcessor";

protected static KeyNamePair Model = new KeyNamePair(697,"AD_WorkflowProcessor");

protected BigDecimal accessLevel = new BigDecimal(4);
/** AccessLevel
@return 4 - System 
*/
protected int get_AccessLevel()
{
return accessLevel.intValue();
}
/** Load Meta Data
@param ctx context
@return PO Info
*/
protected POInfo initPO (Properties ctx)
{
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_WorkflowProcessor[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Workflow Processor.
@param AD_WorkflowProcessor_ID Workflow Processor Server */
public void setAD_WorkflowProcessor_ID (int AD_WorkflowProcessor_ID)
{
if (AD_WorkflowProcessor_ID < 1) throw new IllegalArgumentException ("AD_WorkflowProcessor_ID is mandatory.");
set_ValueNoCheck ("AD_WorkflowProcessor_ID", new Integer(AD_WorkflowProcessor_ID));
}
/** Get Workflow Processor.
@return Workflow Processor Server */
public int getAD_WorkflowProcessor_ID() 
{
Integer ii = (Integer)get_Value("AD_WorkflowProcessor_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Set Alert over Priority.
@param AlertOverPriority Send alert email when over priority */
public void setAlertOverPriority (int AlertOverPriority)
{
set_Value ("AlertOverPriority", new Integer(AlertOverPriority));
}
/** Get Alert over Priority.
@return Send alert email when over priority */
public int getAlertOverPriority() 
{
Integer ii = (Integer)get_Value("AlertOverPriority");
if (ii == null) return 0;
return ii.intValue();
}
/** Set Date last run.
@param DateLastRun Date the process was last run. */
public void setDateLastRun (Timestamp DateLastRun)
{
set_Value ("DateLastRun", DateLastRun);
}
/** Get Date last run.
@return Date the process was last run. */
public Timestamp getDateLastRun() 
{
return (Timestamp)get_Value("DateLastRun");
}
/** Set Date next run.
@param DateNextRun Date the process will run next */
public void setDateNextRun (Timestamp DateNextRun)
{
set_Value ("DateNextRun", DateNextRun);
}
/** Get Date next run.
@return Date the process will run next */
public Timestamp getDateNextRun() 
{
return (Timestamp)get_Value("DateNextRun");
}
/** Set Description.
@param Description Optional short description of the record */
public void setDescription (String Description)
{
if (Description != null && Description.length() > 255)
{
log.warning("Length > 255 - truncated");
Description = Description.substring(0,254);
}
set_Value ("Description", Description);
}
/** Get Description.
@return Optional short description of the record */
public String getDescription() 
{
return (String)get_Value("Description");
}
/** Set Frequency.
@param Frequency Frequency of events */
public void setFrequency (int Frequency)
{
set_Value ("Frequency", new Integer(Frequency));
}
/** Get Frequency.
@return Frequency of events */
public int getFrequency() 
{
Integer ii = (Integer)get_Value("Frequency");
if (ii == null) return 0;
return ii.intValue();
}

/** FrequencyType AD_Reference_ID=221 */
public static final int FREQUENCYTYPE_AD_Reference_ID=221;
/** Day = D */
public static final String FREQUENCYTYPE_Day = "D";
/** Hour = H */
public static final String FREQUENCYTYPE_Hour = "H";
/** Minute = M */
public static final String FREQUENCYTYPE_Minute = "M";
/** Set Frequency Type.
@param FrequencyType Frequency of event */
public void setFrequencyType (String FrequencyType)
{
if (FrequencyType == null) throw new IllegalArgumentException ("FrequencyType is mandatory");
if (FrequencyType.equals("D") || FrequencyType.equals("H") || FrequencyType.equals("M"));
 else throw new IllegalArgumentException ("FrequencyType Invalid value - " + FrequencyType + " - Reference_ID=221 - D - H - M");
if (FrequencyType.length() > 1)
{
log.warning("Length > 1 - truncated");
FrequencyType = FrequencyType.substring(0,0);
}
set_Value ("FrequencyType", FrequencyType);
}
/** Get Frequency Type.
@return Frequency of event */
public String getFrequencyType() 
{
return (String)get_Value("FrequencyType");
}
/** Set Inactivity Alert Days.
@param InactivityAlertDays Send Alert when there is no activity after days (0= no alert) */
public void setInactivityAlertDays (int InactivityAlertDays)
{
set_Value ("InactivityAlertDays", new Integer(InactivityAlertDays));
}
/** Get Inactivity Alert Days.
@return Send Alert when there is no activity after days (0= no alert) */
public int getInactivityAlertDays() 
{
Integer ii = (Integer)get_Value("InactivityAlertDays");
if (ii == null) return 0;
return ii.intValue();
}
/** Set Days to keep Log.
@param KeepLogDays Number of days to keep the log entries */
public void setKeepLogDays (int KeepLogDays)
{
set_Value ("KeepLogDays", new Integer(KeepLogDays));
}
/** Get Days to keep Log.
@return Number of days to keep the log entries */
public int getKeepLogDays() 
{
Integer ii = (Integer)get_Value("KeepLogDays");
if (ii == null) return 0;
return ii.intValue();
}
/** Set Name.
@param Name Alphanumeric identifier of the entity */
public void setName (String Name)
{
if (Name == null) throw new IllegalArgumentException ("Name is mandatory.");
if (Name.length() > 60)
{
log.warning("Length > 60 - truncated");
Name = Name.substring(0,59);
}
set_Value ("Name", Name);
}
/** Get Name.
@return Alphanumeric identifier of the entity */
public String getName() 
{
return (String)get_Value("Name");
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getName());
}
/** Set Process Now.
@param Processing Process Now */
public void setProcessing (boolean Processing)
{
set_Value ("Processing", new Boolean(Processing));
}
/** Get Process Now.
@return Process Now */
public boolean isProcessing() 
{
Object oo = get_Value("Processing");
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}
/** Set Reminder Days.
@param RemindDays Days between sending Reminder Emails for a due or inactive Document */
public void setRemindDays (int RemindDays)
{
set_Value ("RemindDays", new Integer(RemindDays));
}
/** Get Reminder Days.
@return Days between sending Reminder Emails for a due or inactive Document */
public int getRemindDays() 
{
Integer ii = (Integer)get_Value("RemindDays");
if (ii == null) return 0;
return ii.intValue();
}

/** Supervisor_ID AD_Reference_ID=316 */
public static final int SUPERVISOR_ID_AD_Reference_ID=316;
/** Set Supervisor.
@param Supervisor_ID Supervisor for this user/organization - used for escalation and approval */
public void setSupervisor_ID (int Supervisor_ID)
{
if (Supervisor_ID < 1) throw new IllegalArgumentException ("Supervisor_ID is mandatory.");
set_Value ("Supervisor_ID", new Integer(Supervisor_ID));
}
/** Get Supervisor.
@return Supervisor for this user/organization - used for escalation and approval */
public int getSupervisor_ID() 
{
Integer ii = (Integer)get_Value("Supervisor_ID");
if (ii == null) return 0;
return ii.intValue();
}
}
