package net.ukaye.skulkequipment.items;


import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.ukaye.skulkequipment.SkulkEquipment;

public class ModItems {

    public static final Item REINFORCED_CROSSBOW = registerItem("reinforced_crossbow", new ReinforcedCrossbow(new FabricItemSettings().maxCount(1).group(ItemGroup.COMBAT).maxDamage(965)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(SkulkEquipment.MOD_ID, name), item);
    }

    public static void registerModItems() {
        SkulkEquipment.LOGGER.info("Registering items for SkulkEquipment");
    }
}


