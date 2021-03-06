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
package forestry.food.gui;

import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.IInventory;
import forestry.api.food.BeverageManager;
import forestry.core.config.Defaults;
import forestry.core.gui.GuiForestry;
import forestry.food.items.ItemInfuser.InfuserInventory;

public class GuiInfuser extends GuiForestry {

	private IInventory inventory;

	private int startX;
	private int startY;

	public GuiInfuser(InventoryPlayer inventoryplayer, InfuserInventory inventory) {
		super(Defaults.TEXTURE_PATH_GUI + "/infuser.png", new ContainerInfuser(inventoryplayer, inventory), inventory, 1, inventory.getSizeInventory());

		this.inventory = inventory;

		xSize = 176;
		ySize = 185;
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int i, int j) {

		drawBackground();

		for (int l = 2; l < inventory.getSizeInventory(); l++) {
			String description = BeverageManager.ingredientManager.getDescription(inventory.getStackInSlot(l));
			if (description == null) {
				description = "(No effect)";
			}

			int row = (l - 2) * 20;
			fontRenderer.drawString(description, startX + 32, startY + 16 + row, fontColor.get("gui.screen"));
		}
	}

	@Override
	public void initGui() {
		super.initGui();

		startX = (this.width - this.xSize) / 2;
		startY = (this.height - this.ySize) / 2;
	}

}
