/*******************************************************************************
 * Copyright (c) 2011-2014 SirSengir.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v3
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl-3.0.txt
 * 
 * Various Contributors including, but not limited to:
 * SirSengir (original work), CovertJaguar, Player, Binnie, MysteriousAges
 ******************************************************************************/
package forestry.cultivation.harvesters;

import net.minecraft.tileentity.TileEntity;
import forestry.api.cultivation.CropProviders;
import forestry.core.gadgets.Machine;
import forestry.core.gadgets.MachineFactory;
import forestry.core.gadgets.TileMachine;

public class HarvesterSapling extends Harvester {

	public static class Factory extends MachineFactory {
		@Override
		public Machine createMachine(TileEntity tile) {
			return new HarvesterSapling((TileMachine) tile);
		}
	}

	public HarvesterSapling(TileMachine tile) {
		super(tile, CropProviders.arborealCrops);
	}

	@Override
	public String getName() {
		return "Logger";
	}
}
