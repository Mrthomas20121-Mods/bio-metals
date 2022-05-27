package mrthomas20121.bio_metals.items;

import com.google.common.collect.ImmutableList;
import mrthomas20121.bio_metals.init.BioMetalsItems;
import mrthomas20121.biolib.item.armor.BioArmorItem;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nonnull;
import java.util.List;

public class NetheriteSteelArmor extends BioArmorItem {

    public NetheriteSteelArmor(ArmorMaterial armorMaterial, EquipmentSlot slot, Item.Properties properties) {
        super(armorMaterial, slot, properties.fireResistant());
    }

    @Override
    public boolean canApplyAtEnchantingTable(ItemStack stack, Enchantment enchantment) {
        return super.canApplyAtEnchantingTable(stack, enchantment) && !enchantment.equals(Enchantments.FIRE_PROTECTION);
    }

    @Override
    public void onArmorTick(ItemStack stack, Level world, Player player) {
        ImmutableList<ItemStack> armors = ImmutableList.copyOf(player.getArmorSlots());
        ResourceLocation tag = new ResourceLocation("bio_metals:resistance/fire");
        boolean result = false;

        if(armors.size() == 4) {
            for(ItemStack s: armors) {
                result = s.getTags().map(TagKey::location).toList().contains(tag);
            }
            if(!player.hasEffect(MobEffects.FIRE_RESISTANCE) && result) {
                player.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 10, 0, false, false));
            }
        }
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public void appendHoverText(@Nonnull ItemStack stack, @org.jetbrains.annotations.Nullable Level level, List<Component> list, @Nonnull TooltipFlag flags) {
        TranslatableComponent netherite_steel = new TranslatableComponent("bio_metals.netherite_steel");
        list.add(netherite_steel.withStyle(ChatFormatting.DARK_RED).withStyle(ChatFormatting.BOLD));
        super.appendHoverText(stack, level, list, flags);
    }
}
