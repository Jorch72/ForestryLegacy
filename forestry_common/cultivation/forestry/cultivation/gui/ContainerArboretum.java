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

public class ContainerArboretum extends ContainerForestry {

	private TilePlanter arboretum;

	public ContainerArboretum(InventoryPlayer player, TilePlanter arboretum) {
		super(arboretum);

		this.arboretum = arboretum;
		this.addSlot(new Slot(arboretum, 0, 19, 35));
		this.addSlot(new Slot(arboretum, 1, 19, 53));
		this.addSlot(new Slot(arboretum, 2, 37, 35));
		this.addSlot(new Slot(arboretum, 3, 37, 53));

		this.addSlot(new Slot(arboretum, 4, 71, 35));
		this.addSlot(new Slot(arboretum, 5, 71, 53));
		this.addSlot(new Slot(arboretum, 6, 89, 35));
		this.addSlot(new Slot(arboretum, 7, 89, 53));

		this.addSlot(new SlotClosed(arboretum, 8, 123, 35));
		this.addSlot(new SlotClosed(arboretum, 9, 123, 53));
		this.addSlot(new SlotClosed(arboretum, 10, 141, 35));
		this.addSlot(new SlotClosed(arboretum, 11, 141, 53));

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
	public void detectAndSendChanges() {
		super.detectAndSendChanges();

	}

	@Override
	public boolean canInteractWith(EntityPlayer player) {
		return this.arboretum.isUseableByPlayer(player);
	}

}
