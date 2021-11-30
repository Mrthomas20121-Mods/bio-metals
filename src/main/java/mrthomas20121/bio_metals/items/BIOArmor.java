package mrthomas20121.bio_metals.items;

import mrthomas20121.bio_metals.init.BioRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import javax.annotation.Nullable;

public class BIOArmor extends ArmorItem {

    private String armorTexture;

    public BIOArmor(IArmorMaterial material, EquipmentSlotType slot) {
        super(material, slot, new Item.Properties().tab(BioRegistry.tab));
    }

    public BIOArmor(IArmorMaterial material, EquipmentSlotType slot, Item.Properties properties) {
        super(material, slot, properties);
    }

    public Item setArmorTexture(String armorTexture) {
        this.armorTexture = armorTexture;
        return this;
    }

    @Nullable
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
        return "bio_metals:textures/models/armor/"+this.armorTexture+".png";
    }
}
