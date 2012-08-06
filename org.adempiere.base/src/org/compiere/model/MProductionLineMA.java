package org.compiere.model;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.Properties;

import org.compiere.model.X_M_ProductionLineMA;

public class MProductionLineMA extends X_M_ProductionLineMA {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MProductionLineMA(Properties ctx, int M_ProductionLineMA_ID,
			String trxName) {
		super(ctx, M_ProductionLineMA_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public MProductionLineMA(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Parent constructor
	 * @param parent
	 * @param asi
	 * @param qty
	 * @param ctx
	 * @param trxName
	 */
	public MProductionLineMA( MProductionLine parent, int asi, BigDecimal qty)	{
		
		super(parent.getCtx(),0,parent.get_TrxName());
		setM_AttributeSetInstance_ID(asi);
		setM_ProductionLine_ID(parent.get_ID());
		setMovementQty(qty);
		
	}

}
