package net.nicky.monstersandmen.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.nicky.monstersandmen.MonstersAndMen;
import net.nicky.monstersandmen.entity.custom.ChimeraEntity;

public class ChimeraRenderer extends MobRenderer<ChimeraEntity, ChimeraModel<ChimeraEntity>> {


    public ChimeraRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new ChimeraModel<>(pContext.bakeLayer(ModModelLayers.CHIMERA_LAYER)), 2f);
    }

    @Override
    public ResourceLocation getTextureLocation(ChimeraEntity pEntity) {
        return new ResourceLocation(MonstersAndMen.MOD_ID, "textures/entity/chimera.png");
    }

    @Override
    public void render(ChimeraEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack,
                       MultiBufferSource pBuffer, int pPackedLight) {
        if(pEntity.isBaby()){
            pPoseStack.scale(.5f,.5f,.5f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);
    }
}
