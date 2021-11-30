package mrthomas20121.bio_metals.items;

import com.google.common.collect.ImmutableList;
import mrthomas20121.bio_metals.init.BioRegistry;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;

public class NetheriteSteelArmor extends BIOArmor {

    public NetheriteSteelArmor(IArmorMaterial armorMaterial, EquipmentSlotType slot) {
        super(armorMaterial, slot, new Item.Properties().tab(BioRegistry.tab).fireResistant());
    }

    @Override
    public boolean canApplyAtEnchantingTable(ItemStack stack, Enchantment enchantment) {
        return super.canApplyAtEnchantingTable(stack, enchantment) && !enchantment.equals(Enchantments.FIRE_PROTECTION);
    }

    @Override
    public void onArmorTick(ItemStack stack, World world, PlayerEntity player) {
        ImmutableList<ItemStack> armors = ImmutableList.copyOf(player.getArmorSlots());
        ResourceLocation tag = new ResourceLocation("bio_metals:resistance/fire");
        boolean result = false;

        if(armors.size() == 4) {
            for(ItemStack s: armors) {
                result = s.getItem().getTags().contains(tag);
            }
            if(!player.hasEffect(Effects.FIRE_RESISTANCE) && result) {
                player.addEffect(new EffectInstance(Effects.FIRE_RESISTANCE, 10, 0, false, false));
            }
        }
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(@Nonnull ItemStack stack, @Nullable World world, @Nonnull List<ITextComponent> texts, @Nonnull ITooltipFlag flag) {
        TextComponent netherite_steel = new TranslationTextComponent("bio_metals.netherite_steel");
        texts.add(netherite_steel.withStyle(netherite_steel.getStyle().withColor(TextFormatting.DARK_RED).withBold(true)));
        super.appendHoverText(stack, world, texts, flag);
    }
}
