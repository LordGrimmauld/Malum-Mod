package com.kittykitcatcat.malum.integration.jei.blockTransmutation;

import com.kittykitcatcat.malum.MalumMod;
import com.kittykitcatcat.malum.init.ModBlocks;
import com.kittykitcatcat.malum.init.ModItems;
import com.kittykitcatcat.malum.recipes.BlockTransmutationRecipe;
import com.kittykitcatcat.malum.recipes.SpiritFurnaceRecipe;
import com.mojang.blaze3d.platform.GlStateManager;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.block.FurnaceBlock;
import net.minecraft.client.gui.recipebook.FurnaceRecipeGui;
import net.minecraft.client.resources.I18n;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.FurnaceTileEntity;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nonnull;

public class SpiritFurnaceRecipeCategory implements IRecipeCategory<SpiritFurnaceRecipe>
{
    public static final ResourceLocation UID = new ResourceLocation(MalumMod.MODID, "spirit_furnace");
    private final IDrawable background;
    private final String localizedName;
    private final IDrawable overlay;
    private final IDrawable icon;

    public SpiritFurnaceRecipeCategory(IGuiHelper guiHelper)
    {
        background = guiHelper.createBlankDrawable(110, 48);
        localizedName = I18n.format("malum.jei.spirit_furnace");
        overlay = guiHelper.createDrawable(new ResourceLocation(MalumMod.MODID, "textures/gui/spirit_furnace_overlay.png"),
            0, 0, 101, 49);
        icon = guiHelper.createDrawableIngredient(new ItemStack(ModItems.spirit_furnace));
    }

    @Override
    public void draw(SpiritFurnaceRecipe recipe, double mouseX, double mouseY)
    {
        GlStateManager.enableAlphaTest();
        GlStateManager.enableBlend();
        overlay.draw(0, 0);
        GlStateManager.disableBlend();
        GlStateManager.disableAlphaTest();
    }

    @Nonnull
    @Override
    public ResourceLocation getUid()
    {
        return UID;
    }

    @Nonnull
    @Override
    public Class<? extends SpiritFurnaceRecipe> getRecipeClass()
    {
        return SpiritFurnaceRecipe.class;
    }

    @Nonnull
    @Override
    public String getTitle()
    {
        return localizedName;
    }

    @Nonnull
    @Override
    public IDrawable getBackground()
    {
        return background;
    }

    @Nonnull
    @Override
    public IDrawable getIcon()
    {
        return icon;
    }

    @Override
    public void setIngredients(SpiritFurnaceRecipe spiritFurnaceRecipe, IIngredients iIngredients)
    {
        iIngredients.setInput(VanillaTypes.ITEM, new ItemStack(spiritFurnaceRecipe.getInputItem()));
        iIngredients.setOutput(VanillaTypes.ITEM, new ItemStack(spiritFurnaceRecipe.getOutputItem()));
    }

    @Override
    public void setRecipe(IRecipeLayout iRecipeLayout, SpiritFurnaceRecipe spiritFurnaceRecipe, IIngredients iIngredients)
    {
        iRecipeLayout.getItemStacks().init(0, true, 3, 5);
        iRecipeLayout.getItemStacks().set(0, new ItemStack(spiritFurnaceRecipe.getInputItem()));
        iRecipeLayout.getItemStacks().init(1, true, 40, 5);
        iRecipeLayout.getItemStacks().set(1, new ItemStack(ModItems.spirit_furnace));
        iRecipeLayout.getItemStacks().init(2, true, 82, 5);
        iRecipeLayout.getItemStacks().set(2, new ItemStack(spiritFurnaceRecipe.getOutputItem()));
        iRecipeLayout.getItemStacks().init(3, true, 82, 28);
        iRecipeLayout.getItemStacks().set(3, new ItemStack(spiritFurnaceRecipe.getSideItem()));
    }
}