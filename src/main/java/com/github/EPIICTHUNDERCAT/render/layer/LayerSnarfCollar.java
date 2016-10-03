package com.github.EPIICTHUNDERCAT.render.layer;

import com.github.EPIICTHUNDERCAT.entity.mobs.EntitySnarf;
import com.github.EPIICTHUNDERCAT.render.RenderEntitySnarf;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
@SideOnly(Side.CLIENT)
public class LayerSnarfCollar implements LayerRenderer<EntitySnarf>{

	private static final ResourceLocation SNARF_COLLAR = new ResourceLocation(
			"thundercats:textures/entity/Snarf/snarf_collar.png");
    private RenderEntitySnarf snarfRenderer;

    public LayerSnarfCollar(final RenderEntitySnarf snarfRendererIn)
    {
        this.snarfRenderer = snarfRendererIn;
    }

    public void doRenderLayer(EntitySnarf entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
    {
        if (entitylivingbaseIn.isTamed() && !entitylivingbaseIn.isInvisible())
        {
            this.snarfRenderer.bindTexture(SNARF_COLLAR);
            EnumDyeColor enumdyecolor = EnumDyeColor.byMetadata(entitylivingbaseIn.getCollarColor().getMetadata());
            float[] afloat = EntitySheep.getDyeRgb(enumdyecolor);
            GlStateManager.color(afloat[0], afloat[1], afloat[2]);
            this.snarfRenderer.getMainModel().render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
        }
    }

    public boolean shouldCombineTextures()
    {
        return true;
    }

	

}
