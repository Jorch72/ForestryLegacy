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
package forestry.cultivation.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Slot;
import forestry.core.gui.ContainerForestry;
import forestry.core.gui.SlotClosed;
import forestry.cultivation.gadgets.TilePlanter;

public class ContainerPlanterSoilWaste extends ContainerForestry {

	private TilePlanter planter;

	public ContainerPlanterSoilWaste(InventoryPlayer player, TilePlanter planter) {
		super(planter);

		this.planter = planter;
		this.addSlot(new Slot(planter, 0, 34, 35));
		this.addSlot(new Slot(planter, 1, 34, 53));
		this.addSlot(new Slot(planter, 2, 52, 35));
		this.addSlot(new Slot(planter, 3, 52, 53));

		this.addSlot(new SlotClosed(planter, 8, 107, 35));
		this.addSlot(new SlotClosed(planter, 9, 107, 53));
		this.addSlot(new SlotClosed(planter, 10, 125, 35));
		this.addSlot(new SlotClosed(planter, 11, 125, 53));

		int var3;
		for (var3 = 0; var3 < 3; ++var3) {
			for (int var4 = 0; var4 < 9; ++var4) {
				this.addSlot(new Slot(player, var4 + var3 * 9 + 9, 8 + var4 * 18, 84 + var3 * 18));
			}
		}

		for (var3 = 0; var3 < 9; ++var3) {
			this.addSlot(new Slot(player, var3, 8 + var3 * 18, 142));
		}

	}

	@Override
	public boolean canInteractWith(EntityPlayer player) {
		return this.planter.isUseableByPlayer(player);
	}

}
