/***********************************************************************
 * This file is part of iDempiere ERP Open Source                      *
 * http://www.idempiere.org                                            *
 *                                                                     *
 * Copyright (C) Contributors                                          *
 *                                                                     *
 * This program is free software; you can redistribute it and/or       *
 * modify it under the terms of the GNU General Public License         *
 * as published by the Free Software Foundation; either version 2      *
 * of the License, or (at your option) any later version.              *
 *                                                                     *
 * This program is distributed in the hope that it will be useful,     *
 * but WITHOUT ANY WARRANTY; without even the implied warranty of      *
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the        *
 * GNU General Public License for more details.                        *
 *                                                                     *
 * You should have received a copy of the GNU General Public License   *
 * along with this program; if not, write to the Free Software         *
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,          *
 * MA 02110-1301, USA.                                                 *
 *                                                                     *
 * Contributors:                                                       *
 * - carlos															   *
 * - deepak                         								   *
 **********************************************************************/
package org.adempiere.report.jasper;

import java.util.List;

import org.compiere.model.PrintInfo;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperPrint;

/**
 * 
 * @author carlos
 *
 */
public interface JRViewerProviderList {

	/**
	 * 
	 * @param jasperPrintList
	 * @param title
	 * @param printInfo
	 * @throws JRException
	 */
	public void openViewer(List<JasperPrint> jasperPrintList, String title, PrintInfo printInfo) throws JRException;

	public default void openViewer(List<JasperPrint> jasperPrintList, String title) throws JRException {
		openViewer(jasperPrintList, title, null);
	}

}
