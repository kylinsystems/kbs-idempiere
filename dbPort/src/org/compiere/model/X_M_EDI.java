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
/** Generated Model for M_EDI
 *  @author Jorg Janke (generated) 
 *  @version Release 2.6.0a - $Id$ */
public class X_M_EDI extends PO
{
/** Standard Constructor
@param ctx context
@param M_EDI_ID id
@param trxName transaction
*/
public X_M_EDI (Properties ctx, int M_EDI_ID, String trxName)
{
super (ctx, M_EDI_ID, trxName);
/** if (M_EDI_ID == 0)
{
setC_BP_EDI_ID (0);
setDocumentNo (null);
setEDIStatus (null);
setLine (0);
setM_EDI_ID (0);
setM_Product_ID (0);
setM_Warehouse_ID (0);
setProcessed (false);
setRequest_Qty (Env.ZERO);
setRequest_Shipdate (new Timestamp(System.currentTimeMillis()));
setTrxSent (new Timestamp(System.currentTimeMillis()));
setTrxType (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_EDI (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=367 */
public static final int Table_ID=367;

/** TableName=M_EDI */
public static final String Table_Name="M_EDI";

protected static KeyNamePair Model = new KeyNamePair(367,"M_EDI");

protected BigDecimal accessLevel = new BigDecimal(3);
/** AccessLevel
@return 3 - Client - Org 
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
StringBuffer sb = new StringBuffer ("X_M_EDI[").append(get_ID()).append("]");
return sb.toString();
}
/** Set EDI Definition.
@param C_BP_EDI_ID Electronic Data Interchange */
public void setC_BP_EDI_ID (int C_BP_EDI_ID)
{
if (C_BP_EDI_ID < 1) throw new IllegalArgumentException ("C_BP_EDI_ID is mandatory.");
set_Value ("C_BP_EDI_ID", new Integer(C_BP_EDI_ID));
}
/** Get EDI Definition.
@return Electronic Data Interchange */
public int getC_BP_EDI_ID() 
{
Integer ii = (Integer)get_Value("C_BP_EDI_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Set Document No.
@param DocumentNo Document sequence number of the document */
public void setDocumentNo (String DocumentNo)
{
if (DocumentNo == null) throw new IllegalArgumentException ("DocumentNo is mandatory.");
if (DocumentNo.length() > 30)
{
log.warning("Length > 30 - truncated");
DocumentNo = DocumentNo.substring(0,29);
}
set_Value ("DocumentNo", DocumentNo);
}
/** Get Document No.
@return Document sequence number of the document */
public String getDocumentNo() 
{
return (String)get_Value("DocumentNo");
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getDocumentNo());
}

/** EDIStatus AD_Reference_ID=202 */
public static final int EDISTATUS_AD_Reference_ID=202;
/** Acknowledged = A */
public static final String EDISTATUS_Acknowledged = "A";
/** Answered (complete) = C */
public static final String EDISTATUS_AnsweredComplete = "C";
/** Draft = D */
public static final String EDISTATUS_Draft = "D";
/** Sent = S */
public static final String EDISTATUS_Sent = "S";
/** Set EDI Status.
@param EDIStatus EDI Status */
public void setEDIStatus (String EDIStatus)
{
if (EDIStatus == null) throw new IllegalArgumentException ("EDIStatus is mandatory");
if (EDIStatus.equals("A") || EDIStatus.equals("C") || EDIStatus.equals("D") || EDIStatus.equals("S"));
 else throw new IllegalArgumentException ("EDIStatus Invalid value - " + EDIStatus + " - Reference_ID=202 - A - C - D - S");
if (EDIStatus.length() > 1)
{
log.warning("Length > 1 - truncated");
EDIStatus = EDIStatus.substring(0,0);
}
set_ValueNoCheck ("EDIStatus", EDIStatus);
}
/** Get EDI Status.
@return EDI Status */
public String getEDIStatus() 
{
return (String)get_Value("EDIStatus");
}
/** Set Line No.
@param Line Unique line for this document */
public void setLine (int Line)
{
set_Value ("Line", new Integer(Line));
}
/** Get Line No.
@return Unique line for this document */
public int getLine() 
{
Integer ii = (Integer)get_Value("Line");
if (ii == null) return 0;
return ii.intValue();
}
/** Set EDI Transaction.
@param M_EDI_ID EDI Transaction */
public void setM_EDI_ID (int M_EDI_ID)
{
if (M_EDI_ID < 1) throw new IllegalArgumentException ("M_EDI_ID is mandatory.");
set_ValueNoCheck ("M_EDI_ID", new Integer(M_EDI_ID));
}
/** Get EDI Transaction.
@return EDI Transaction */
public int getM_EDI_ID() 
{
Integer ii = (Integer)get_Value("M_EDI_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Set Product.
@param M_Product_ID Product, Service, Item */
public void setM_Product_ID (int M_Product_ID)
{
if (M_Product_ID < 1) throw new IllegalArgumentException ("M_Product_ID is mandatory.");
set_Value ("M_Product_ID", new Integer(M_Product_ID));
}
/** Get Product.
@return Product, Service, Item */
public int getM_Product_ID() 
{
Integer ii = (Integer)get_Value("M_Product_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Set Warehouse.
@param M_Warehouse_ID Storage Warehouse and Service Point */
public void setM_Warehouse_ID (int M_Warehouse_ID)
{
if (M_Warehouse_ID < 1) throw new IllegalArgumentException ("M_Warehouse_ID is mandatory.");
set_Value ("M_Warehouse_ID", new Integer(M_Warehouse_ID));
}
/** Get Warehouse.
@return Storage Warehouse and Service Point */
public int getM_Warehouse_ID() 
{
Integer ii = (Integer)get_Value("M_Warehouse_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Set Processed.
@param Processed The document has been processed */
public void setProcessed (boolean Processed)
{
set_Value ("Processed", new Boolean(Processed));
}
/** Get Processed.
@return The document has been processed */
public boolean isProcessed() 
{
Object oo = get_Value("Processed");
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}
/** Set Reply Price.
@param Reply_Price Confirmed Price from EDI Partner */
public void setReply_Price (BigDecimal Reply_Price)
{
set_Value ("Reply_Price", Reply_Price);
}
/** Get Reply Price.
@return Confirmed Price from EDI Partner */
public BigDecimal getReply_Price() 
{
BigDecimal bd = (BigDecimal)get_Value("Reply_Price");
if (bd == null) return Env.ZERO;
return bd;
}
/** Set Reply Qty Available.
@param Reply_QtyAvailable Reply Qty Available */
public void setReply_QtyAvailable (BigDecimal Reply_QtyAvailable)
{
set_Value ("Reply_QtyAvailable", Reply_QtyAvailable);
}
/** Get Reply Qty Available.
@return Reply Qty Available */
public BigDecimal getReply_QtyAvailable() 
{
BigDecimal bd = (BigDecimal)get_Value("Reply_QtyAvailable");
if (bd == null) return Env.ZERO;
return bd;
}
/** Set Reply Qty Confirmed.
@param Reply_QtyConfirmed Reply Qty Confirmed */
public void setReply_QtyConfirmed (BigDecimal Reply_QtyConfirmed)
{
set_Value ("Reply_QtyConfirmed", Reply_QtyConfirmed);
}
/** Get Reply Qty Confirmed.
@return Reply Qty Confirmed */
public BigDecimal getReply_QtyConfirmed() 
{
BigDecimal bd = (BigDecimal)get_Value("Reply_QtyConfirmed");
if (bd == null) return Env.ZERO;
return bd;
}
/** Set Reply Received.
@param Reply_Received Reply Received */
public void setReply_Received (Timestamp Reply_Received)
{
set_Value ("Reply_Received", Reply_Received);
}
/** Get Reply Received.
@return Reply Received */
public Timestamp getReply_Received() 
{
return (Timestamp)get_Value("Reply_Received");
}
/** Set Reply Remarks.
@param Reply_Remarks Reply Remarks */
public void setReply_Remarks (String Reply_Remarks)
{
if (Reply_Remarks != null && Reply_Remarks.length() > 2000)
{
log.warning("Length > 2000 - truncated");
Reply_Remarks = Reply_Remarks.substring(0,1999);
}
set_Value ("Reply_Remarks", Reply_Remarks);
}
/** Get Reply Remarks.
@return Reply Remarks */
public String getReply_Remarks() 
{
return (String)get_Value("Reply_Remarks");
}
/** Set Reply Ship date.
@param Reply_ShipDate Reply Ship date */
public void setReply_ShipDate (Timestamp Reply_ShipDate)
{
set_Value ("Reply_ShipDate", Reply_ShipDate);
}
/** Get Reply Ship date.
@return Reply Ship date */
public Timestamp getReply_ShipDate() 
{
return (Timestamp)get_Value("Reply_ShipDate");
}
/** Set Request Price.
@param Request_Price Request Price */
public void setRequest_Price (BigDecimal Request_Price)
{
set_Value ("Request_Price", Request_Price);
}
/** Get Request Price.
@return Request Price */
public BigDecimal getRequest_Price() 
{
BigDecimal bd = (BigDecimal)get_Value("Request_Price");
if (bd == null) return Env.ZERO;
return bd;
}
/** Set Request Qty.
@param Request_Qty Request Qty */
public void setRequest_Qty (BigDecimal Request_Qty)
{
if (Request_Qty == null) throw new IllegalArgumentException ("Request_Qty is mandatory.");
set_Value ("Request_Qty", Request_Qty);
}
/** Get Request Qty.
@return Request Qty */
public BigDecimal getRequest_Qty() 
{
BigDecimal bd = (BigDecimal)get_Value("Request_Qty");
if (bd == null) return Env.ZERO;
return bd;
}
/** Set Request Ship date.
@param Request_Shipdate Request Ship date */
public void setRequest_Shipdate (Timestamp Request_Shipdate)
{
if (Request_Shipdate == null) throw new IllegalArgumentException ("Request_Shipdate is mandatory.");
set_Value ("Request_Shipdate", Request_Shipdate);
}
/** Get Request Ship date.
@return Request Ship date */
public Timestamp getRequest_Shipdate() 
{
return (Timestamp)get_Value("Request_Shipdate");
}
/** Set Transaction received.
@param TrxReceived Transaction received */
public void setTrxReceived (Timestamp TrxReceived)
{
set_Value ("TrxReceived", TrxReceived);
}
/** Get Transaction received.
@return Transaction received */
public Timestamp getTrxReceived() 
{
return (Timestamp)get_Value("TrxReceived");
}
/** Set Transaction sent.
@param TrxSent Transaction sent */
public void setTrxSent (Timestamp TrxSent)
{
if (TrxSent == null) throw new IllegalArgumentException ("TrxSent is mandatory.");
set_Value ("TrxSent", TrxSent);
}
/** Get Transaction sent.
@return Transaction sent */
public Timestamp getTrxSent() 
{
return (Timestamp)get_Value("TrxSent");
}

/** TrxType AD_Reference_ID=203 */
public static final int TRXTYPE_AD_Reference_ID=203;
/** Inquiry = I */
public static final String TRXTYPE_Inquiry = "I";
/** Purchase Order = O */
public static final String TRXTYPE_PurchaseOrder = "O";
/** Set Transaction Type.
@param TrxType Type of credit card transaction */
public void setTrxType (String TrxType)
{
if (TrxType == null) throw new IllegalArgumentException ("TrxType is mandatory");
if (TrxType.equals("I") || TrxType.equals("O"));
 else throw new IllegalArgumentException ("TrxType Invalid value - " + TrxType + " - Reference_ID=203 - I - O");
if (TrxType.length() > 1)
{
log.warning("Length > 1 - truncated");
TrxType = TrxType.substring(0,0);
}
set_ValueNoCheck ("TrxType", TrxType);
}
/** Get Transaction Type.
@return Type of credit card transaction */
public String getTrxType() 
{
return (String)get_Value("TrxType");
}
}
