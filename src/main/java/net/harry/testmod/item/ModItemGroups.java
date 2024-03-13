package net.harry.testmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.harry.testmod.TestMod;
import net.harry.testmod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(TestMod.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                    .icon(()->new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
        entries.add(ModItems.RUBY);
        entries.add(ModItems.RAW_RUBY);
        entries.add(ModItems.JEW_HUNTER);

        entries.add(ModBlocks.RUBY_BLOCK);

                    }).build());

    public static void registerItemGroups()
    {
        TestMod.LOGGER.info("Registering Item Groups for" + TestMod.MOD_ID);
    }
}
