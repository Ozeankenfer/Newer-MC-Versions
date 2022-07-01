
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.newermcversions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.newermcversions.block.MudBlock;
import net.mcreator.newermcversions.NewerMcVersionsMod;

public class NewerMcVersionsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, NewerMcVersionsMod.MODID);
	public static final RegistryObject<Block> MUD = REGISTRY.register("mud", () -> new MudBlock());
}
