package com.github.alexthe666.alexsmobs.config;

import com.github.alexthe666.citadel.math.Tuple2f;
import com.google.common.collect.Lists;
import cpw.mods.modlauncher.LaunchPluginHandler;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.config.ModConfig;

import java.util.ArrayList;
import java.util.List;

public class CommonConfig {

    public final ForgeConfigSpec.DoubleValue lavaOpacity;
    public final ForgeConfigSpec.BooleanValue shadersCompat;
    public final ForgeConfigSpec.BooleanValue neutralBoneSerpents;
    public final ForgeConfigSpec.BooleanValue lavaBottleEnabled;
    public final ForgeConfigSpec.BooleanValue spidersAttackFlies;
    public final ForgeConfigSpec.BooleanValue wolvesAttackMoose;
    public final ForgeConfigSpec.BooleanValue polarBearsAttackSeals;
    public final ForgeConfigSpec.BooleanValue bananasDropFromLeaves;
    public final ForgeConfigSpec.IntValue bananaChance;
    public final ForgeConfigSpec.IntValue grizzlyBearSpawnWeight;
    public final ForgeConfigSpec.IntValue grizzlyBearSpawnRolls;
    public final ForgeConfigSpec.IntValue roadrunnerSpawnWeight;
    public final ForgeConfigSpec.IntValue roadrunnerSpawnRolls;
    public final ForgeConfigSpec.IntValue boneSerpentSpawnWeight;
    public final ForgeConfigSpec.IntValue boneSeprentSpawnRolls;
    public final ForgeConfigSpec.IntValue gazelleSpawnWeight;
    public final ForgeConfigSpec.IntValue gazelleSpawnRolls;
    public final ForgeConfigSpec.IntValue crocodileSpawnWeight;
    public final ForgeConfigSpec.IntValue crocSpawnRolls;
    public final ForgeConfigSpec.IntValue flySpawnWeight;
    public final ForgeConfigSpec.IntValue flySpawnRolls;
    public final ForgeConfigSpec.IntValue hummingbirdSpawnWeight;
    public final ForgeConfigSpec.IntValue hummingbirdSpawnRolls;
    public final ForgeConfigSpec.IntValue orcaSpawnWeight;
    public final ForgeConfigSpec.IntValue orcaSpawnRolls;
    public final ForgeConfigSpec.IntValue sunbirdSpawnWeight;
    public final ForgeConfigSpec.IntValue sunbirdSpawnRolls;
    public final ForgeConfigSpec.IntValue gorillaSpawnWeight;
    public final ForgeConfigSpec.IntValue gorillaSpawnRolls;
    public final ForgeConfigSpec.IntValue crimsonMosquitoSpawnWeight;
    public final ForgeConfigSpec.IntValue crimsonMosquitoSpawnRolls;
    public final ForgeConfigSpec.IntValue rattlesnakeSpawnWeight;
    public final ForgeConfigSpec.IntValue rattlesnakeSpawnRolls;
    public final ForgeConfigSpec.IntValue endergradeSpawnWeight;
    public final ForgeConfigSpec.IntValue endergradeSpawnRolls;
    public final ForgeConfigSpec.IntValue hammerheadSharkSpawnWeight;
    public final ForgeConfigSpec.IntValue hammerheadSharkSpawnRolls;
    public final ForgeConfigSpec.IntValue lobsterSpawnWeight;
    public final ForgeConfigSpec.IntValue lobsterSpawnRolls;
    public final ForgeConfigSpec.IntValue komodoDragonSpawnWeight;
    public final ForgeConfigSpec.IntValue komodoDragonSpawnRolls;
    public final ForgeConfigSpec.IntValue capuchinMonkeySpawnWeight;
    public final ForgeConfigSpec.IntValue capuchinMonkeySpawnRolls;
    public final ForgeConfigSpec.IntValue caveCentipedeSpawnWeight;
    public final ForgeConfigSpec.IntValue caveCentipedeSpawnRolls;
    public final ForgeConfigSpec.IntValue caveCentipedeSpawnHeight;
    public final ForgeConfigSpec.IntValue warpedToadSpawnWeight;
    public final ForgeConfigSpec.IntValue warpedToadSpawnRolls;
    public final ForgeConfigSpec.IntValue mooseSpawnWeight;
    public final ForgeConfigSpec.IntValue mooseSpawnRolls;
    public final ForgeConfigSpec.IntValue mimicubeSpawnWeight;
    public final ForgeConfigSpec.IntValue mimicubeSpawnRolls;
    public final ForgeConfigSpec.IntValue raccoonSpawnWeight;
    public final ForgeConfigSpec.IntValue raccoonSpawnRolls;
    public final ForgeConfigSpec.IntValue blobfishSpawnWeight;
    public final ForgeConfigSpec.IntValue blobfishSpawnRolls;
    public final ForgeConfigSpec.IntValue blobfishSpawnHeight;
    public final ForgeConfigSpec.IntValue sealSpawnWeight;
    public final ForgeConfigSpec.IntValue sealSpawnRolls;
    public final ForgeConfigSpec.IntValue cockroachSpawnWeight;
    public final ForgeConfigSpec.IntValue cockroachSpawnRolls;
    public final ForgeConfigSpec.IntValue shoebillSpawnWeight;
    public final ForgeConfigSpec.IntValue shoebillSpawnRolls;
    public final ForgeConfigSpec.IntValue elephantSpawnWeight;
    public final ForgeConfigSpec.IntValue elephantSpawnRolls;
    public final ForgeConfigSpec.IntValue soulVultureSpawnWeight;
    public final ForgeConfigSpec.IntValue soulVultureSpawnRolls;
    public final ForgeConfigSpec.IntValue snowLeopardSpawnWeight;
    public final ForgeConfigSpec.IntValue snowLeopardSpawnRolls;
    public final ForgeConfigSpec.IntValue spectreSpawnWeight;
    public final ForgeConfigSpec.IntValue spectreSpawnRolls;
    public final ForgeConfigSpec.IntValue crowSpawnWeight;
    public final ForgeConfigSpec.IntValue crowSpawnRolls;

    public final ForgeConfigSpec.BooleanValue giveBookOnStartup;
    public final ForgeConfigSpec.BooleanValue mimicubeSpawnInEndCity;
    public final ForgeConfigSpec.BooleanValue mimicreamRepair;
    public final ForgeConfigSpec.ConfigValue<List<? extends String>> mimicreamBlacklist;
    public final ForgeConfigSpec.BooleanValue raccoonStealFromChests;
    public final ForgeConfigSpec.BooleanValue fishOilMeme;
    public final ForgeConfigSpec.BooleanValue soulVultureSpawnOnFossil;
    public final ForgeConfigSpec.BooleanValue acaciaBlossomsDropFromLeaves;
    public final ForgeConfigSpec.BooleanValue wanderingTraderOffers;

    public CommonConfig(final ForgeConfigSpec.Builder builder) {
        builder.push("general");
        giveBookOnStartup = buildBoolean(builder, "giveBookOnStartup", "all", true, "Whether all players should get an Animal Dictionary when joining the world for the first time.");
        lavaOpacity = buildDouble(builder, "lavaVisionOpacity", "all", 0.65D, 0.01D, 1D, "Lava Opacity for the Lava Vision Potion.");
        shadersCompat = buildBoolean(builder, "shadersCompat", "all", false, "Whether to disable certain aspects of the Lava Vision Potion. Enable if issues with shaders persist.");
        bananasDropFromLeaves = buildBoolean(builder, "bananasDropFromLeaves", "all", true, "Whether bananas should drop from blocks tagged with #alexsmobs:drops_bananas");
        bananaChance = buildInt(builder, "bananaChance", "all", AMConfig.bananaChance, 0, Integer.MAX_VALUE, "1 out of this number chance for leaves to drop a banana when broken. Fortune is automatically factored in");
        spidersAttackFlies = buildBoolean(builder, "spidersAttackFlies", "all", true, "Whether spiders should target fly mobs.");
        wolvesAttackMoose = buildBoolean(builder, "wolvesAttackMoose", "all", true, "Whether wolves should target moose mobs.");
        polarBearsAttackSeals = buildBoolean(builder, "polarBearsAttackSeals", "all", true, "Whether polar bears should target seal mobs.");
        lavaBottleEnabled = buildBoolean(builder, "lavaBottleEnabled", "all", true, "Whether lava can be bottled with a right click of a glass bottle.");
        neutralBoneSerpents = buildBoolean(builder, "neutralBoneSerpents", "all", false, "Whether bone serpents are neutral or hostile.");
        caveCentipedeSpawnHeight = buildInt(builder, "caveCentipedeSpawnHeight", "all", AMConfig.caveCentipedeSpawnHeight, 0, 256, "Maximum world y-level that cave centipedes can spawn at");
        blobfishSpawnHeight = buildInt(builder, "blobfishSpawnHeight", "all", AMConfig.blobfishSpawnHeight, 0, 256, "Maximum world y-level that blobfish can spawn at");
        mimicubeSpawnInEndCity = buildBoolean(builder, "mimicubeSpawnInEndCity", "all", true, "Whether mimicubes spawns should be restricted solely to the end city structure or to whatever biome is specified in their respective biome config.");
        mimicreamRepair = buildBoolean(builder, "mimicreamRepair", "all", true, "Whether mimicream can be used to duplicate items.");
        mimicreamBlacklist = builder.comment("Blacklist for items that mimicream cannot make a copy of. Ex: \"minecraft:stone_sword\", \"alexsmobs:blood_sprayer\"").defineList("mimicreamBlacklist", Lists.newArrayList("alexsmobs:blood_sprayer"), o -> o instanceof String);
        raccoonStealFromChests = buildBoolean(builder, "raccoonStealFromChests", "all", true, "Whether wild raccoons steal food from chests.");
        fishOilMeme = buildBoolean(builder, "fishOilMeme", "all", true, "Whether fish oil gives players a special levitation effect.");
        soulVultureSpawnOnFossil = buildBoolean(builder, "soulVultureSpawnOnFossil", "all", true, "Whether soul vulture spawns should be restricted solely to the nether fossil structure or to whatever biome is specified in their respective biome config.");
        acaciaBlossomsDropFromLeaves = buildBoolean(builder, "acaciaBlossomsDropFromLeaves", "all", true, "Whether acacia blossoms should drop from blocks tagged with #alexsmobs:drops_acacia_blossoms");
        wanderingTraderOffers = buildBoolean(builder, "wanderingTraderOffers", "all", true, "Whether wandering traders offer items like acacia blossoms, mosquito larva, crocodile egg, etc.");
        builder.push("spawning");
        grizzlyBearSpawnWeight = buildInt(builder, "grizzlyBearSpawnWeight", "spawns", AMConfig.grizzlyBearSpawnWeight, 0, 1000, "Spawn Weight, added to a pool of other mobs for each biome. Higher number = higher chance of spawning. 0 = disable spawn");
        grizzlyBearSpawnRolls = buildInt(builder, "grizzlyBearSpawnRolls", "spawns", AMConfig.grizzlyBearSpawnRolls, 0, Integer.MAX_VALUE, "Random roll chance to enable mob spawning. Higher number = lower chance of spawning");
        roadrunnerSpawnWeight = buildInt(builder, "roadrunnerSpawnWeight", "spawns", AMConfig.roadrunnerSpawnWeight, 0, 1000, "Spawn Weight, added to a pool of other mobs for each biome. Higher number = higher chance of spawning. 0 = disable spawn");
        roadrunnerSpawnRolls = buildInt(builder, "roadrunnerSpawnRolls", "spawns", AMConfig.roadrunnerSpawnRolls, 0, Integer.MAX_VALUE, "Random roll chance to enable mob spawning. Higher number = lower chance of spawning");
        boneSerpentSpawnWeight = buildInt(builder, "boneSerpentSpawnWeight", "spawns", AMConfig.boneSerpentSpawnWeight, 0, 1000, "Spawn Weight, added to a pool of other mobs for each biome. Higher number = higher chance of spawning. 0 = disable spawn");
        boneSeprentSpawnRolls = buildInt(builder, "boneSeprentSpawnRolls", "spawns", AMConfig.boneSeprentSpawnRolls, 0, Integer.MAX_VALUE, "Random roll chance to enable mob spawning. Higher number = lower chance of spawning");
        gazelleSpawnWeight = buildInt(builder, "gazelleSpawnWeight", "spawns", AMConfig.gazelleSpawnWeight, 0, 1000, "Spawn Weight, added to a pool of other mobs for each biome. Higher number = higher chance of spawning. 0 = disable spawn");
        gazelleSpawnRolls = buildInt(builder, "gazelleSpawnRolls", "spawns", AMConfig.gazelleSpawnRolls, 0, Integer.MAX_VALUE, "Random roll chance to enable mob spawning. Higher number = lower chance of spawning");
        crocodileSpawnWeight = buildInt(builder, "crocodileSpawnWeight", "spawns", AMConfig.crocodileSpawnWeight, 0, 1000, "Spawn Weight, added to a pool of other mobs for each biome. Higher number = higher chance of spawning. 0 = disable spawn");
        crocSpawnRolls = buildInt(builder, "crocSpawnRolls", "spawns", AMConfig.crocSpawnRolls, 0, Integer.MAX_VALUE, "Random roll chance to enable mob spawning. Higher number = lower chance of spawning");
        flySpawnWeight = buildInt(builder, "flySpawnWeight", "spawns", AMConfig.flySpawnWeight, 0, 1000, "Spawn Weight, added to a pool of other mobs for each biome. Higher number = higher chance of spawning. 0 = disable spawn");
        flySpawnRolls = buildInt(builder, "flySpawnRolls", "spawns", AMConfig.flySpawnRolls, 0, Integer.MAX_VALUE, "Random roll chance to enable mob spawning. Higher number = lower chance of spawning");
        hummingbirdSpawnWeight = buildInt(builder, "hummingbirdSpawnWeight", "spawns", AMConfig.hummingbirdSpawnWeight, 0, 1000, "Spawn Weight, added to a pool of other mobs for each biome. Higher number = higher chance of spawning. 0 = disable spawn");
        hummingbirdSpawnRolls = buildInt(builder, "hummingbirdSpawnRolls", "spawns", AMConfig.flySpawnRolls, 0, Integer.MAX_VALUE, "Random roll chance to enable mob spawning. Higher number = lower chance of spawning");
        orcaSpawnWeight = buildInt(builder, "orcaSpawnWeight", "spawns", AMConfig.orcaSpawnWeight, 0, 1000, "Spawn Weight, added to a pool of other mobs for each biome. Higher number = higher chance of spawning. 0 = disable spawn");
        orcaSpawnRolls = buildInt(builder, "orcaSpawnRolls", "spawns", AMConfig.orcaSpawnRolls, 0, Integer.MAX_VALUE, "Random roll chance to enable mob spawning. Higher number = lower chance of spawning");
        sunbirdSpawnWeight = buildInt(builder, "sunbirdSpawnWeight", "spawns", AMConfig.sunbirdSpawnWeight, 0, 1000, "Spawn Weight, added to a pool of other mobs for each biome. Higher number = higher chance of spawning. 0 = disable spawn");
        sunbirdSpawnRolls= buildInt(builder, "sunbirdSpawnRolls", "spawns", AMConfig.sunbirdSpawnRolls, 0, Integer.MAX_VALUE, "Random roll chance to enable mob spawning. Higher number = lower chance of spawning");
        gorillaSpawnWeight = buildInt(builder, "gorillaSpawnWeight", "spawns", AMConfig.gorillaSpawnWeight, 0, 1000, "Spawn Weight, added to a pool of other mobs for each biome. Higher number = higher chance of spawning. 0 = disable spawn");
        gorillaSpawnRolls= buildInt(builder, "gorillaSpawnRolls", "spawns", AMConfig.gorillaSpawnRolls, 0, Integer.MAX_VALUE, "Random roll chance to enable mob spawning. Higher number = lower chance of spawning");
        crimsonMosquitoSpawnWeight = buildInt(builder, "crimsonMosquitoSpawnWeight", "spawns", AMConfig.crimsonMosquitoSpawnWeight, 0, 1000, "Spawn Weight, added to a pool of other mobs for each biome. Higher number = higher chance of spawning. 0 = disable spawn");
        crimsonMosquitoSpawnRolls = buildInt(builder, "crimsonMosquitoSpawnRolls", "spawns", AMConfig.crimsonMosquitoSpawnRolls, 0, Integer.MAX_VALUE, "Random roll chance to enable mob spawning. Higher number = lower chance of spawning");
        rattlesnakeSpawnWeight = buildInt(builder, "rattlesnakeSpawnWeight", "spawns", AMConfig.rattlesnakeSpawnWeight, 0, 1000, "Spawn Weight, added to a pool of other mobs for each biome. Higher number = higher chance of spawning. 0 = disable spawn");
        rattlesnakeSpawnRolls = buildInt(builder, "rattlesnakeSpawnRolls", "spawns", AMConfig.rattlesnakeSpawnRolls, 0, Integer.MAX_VALUE, "Random roll chance to enable mob spawning. Higher number = lower chance of spawning");
        endergradeSpawnWeight = buildInt(builder, "endergradeSpawnWeight", "spawns", AMConfig.endergradeSpawnWeight, 0, 1000, "Spawn Weight, added to a pool of other mobs for each biome. Higher number = higher chance of spawning. 0 = disable spawn");
        endergradeSpawnRolls = buildInt(builder, "endergradeSpawnRolls", "spawns", AMConfig.endergradeSpawnRolls, 0, Integer.MAX_VALUE, "Random roll chance to enable mob spawning. Higher number = lower chance of spawning");
        hammerheadSharkSpawnWeight = buildInt(builder, "hammerheadSharkSpawnWeight", "spawns", AMConfig.hammerheadSharkSpawnWeight, 0, 1000, "Spawn Weight, added to a pool of other mobs for each biome. Higher number = higher chance of spawning. 0 = disable spawn");
        hammerheadSharkSpawnRolls = buildInt(builder, "hammerheadSharkSpawnRolls", "spawns", AMConfig.hammerheadSharkSpawnRolls, 0, Integer.MAX_VALUE, "Random roll chance to enable mob spawning. Higher number = lower chance of spawning");
        lobsterSpawnWeight = buildInt(builder, "lobsterSpawnWeight", "spawns", AMConfig.lobsterSpawnWeight, 0, 1000, "Spawn Weight, added to a pool of other mobs for each biome. Higher number = higher chance of spawning. 0 = disable spawn");
        lobsterSpawnRolls = buildInt(builder, "lobsterSpawnRolls", "spawns", AMConfig.lobsterSpawnRolls, 0, Integer.MAX_VALUE, "Random roll chance to enable mob spawning. Higher number = lower chance of spawning");
        komodoDragonSpawnWeight = buildInt(builder, "komodoDragonSpawnWeight", "spawns", AMConfig.komodoDragonSpawnWeight, 0, 1000, "Spawn Weight, added to a pool of other mobs for each biome. Higher number = higher chance of spawning. 0 = disable spawn");
        komodoDragonSpawnRolls = buildInt(builder, "komodoDragonSpawnRolls", "spawns", AMConfig.komodoDragonSpawnRolls, 0, Integer.MAX_VALUE, "Random roll chance to enable mob spawning. Higher number = lower chance of spawning");
        capuchinMonkeySpawnWeight = buildInt(builder, "capuchinMonkeySpawnWeight", "spawns", AMConfig.capuchinMonkeySpawnWeight, 0, 1000, "Spawn Weight, added to a pool of other mobs for each biome. Higher number = higher chance of spawning. 0 = disable spawn");
        capuchinMonkeySpawnRolls = buildInt(builder, "capuchinMonkeySpawnRolls", "spawns", AMConfig.capuchinMonkeySpawnRolls, 0, Integer.MAX_VALUE, "Random roll chance to enable mob spawning. Higher number = lower chance of spawning");
        caveCentipedeSpawnWeight = buildInt(builder, "caveCentipedeSpawnWeight", "spawns", AMConfig.caveCentipedeSpawnWeight, 0, 1000, "Spawn Weight, added to a pool of other mobs for each biome. Higher number = higher chance of spawning. 0 = disable spawn");
        caveCentipedeSpawnRolls = buildInt(builder, "caveCentipedeSpawnRolls", "spawns", AMConfig.caveCentipedeSpawnRolls, 0, Integer.MAX_VALUE, "Random roll chance to enable mob spawning. Higher number = lower chance of spawning");
        warpedToadSpawnWeight = buildInt(builder, "warpedToadSpawnWeight", "spawns", AMConfig.warpedToadSpawnWeight, 0, 1000, "Spawn Weight, added to a pool of other mobs for each biome. Higher number = higher chance of spawning. 0 = disable spawn");
        warpedToadSpawnRolls = buildInt(builder, "warpedToadSpawnRolls", "spawns", AMConfig.warpedToadSpawnRolls, 0, Integer.MAX_VALUE, "Random roll chance to enable mob spawning. Higher number = lower chance of spawning");
        mooseSpawnWeight = buildInt(builder, "mooseSpawnWeight", "spawns", AMConfig.mooseSpawnWeight, 0, 1000, "Spawn Weight, added to a pool of other mobs for each biome. Higher number = higher chance of spawning. 0 = disable spawn");
        mooseSpawnRolls = buildInt(builder, "mooseSpawnRolls", "spawns", AMConfig.mooseSpawnRolls, 0, Integer.MAX_VALUE, "Random roll chance to enable mob spawning. Higher number = lower chance of spawning");
        mimicubeSpawnWeight = buildInt(builder, "mimicubeSpawnWeight", "spawns", AMConfig.mimicubeSpawnWeight, 0, 1000, "Spawn Weight, added to a pool of other mobs for each biome. Higher number = higher chance of spawning. 0 = disable spawn");
        mimicubeSpawnRolls = buildInt(builder, "mimicubeSpawnRolls", "spawns", AMConfig.mimicubeSpawnRolls, 0, Integer.MAX_VALUE, "Random roll chance to enable mob spawning. Higher number = lower chance of spawning");
        raccoonSpawnWeight = buildInt(builder, "raccoonSpawnWeight", "spawns", AMConfig.raccoonSpawnWeight, 0, 1000, "Spawn Weight, added to a pool of other mobs for each biome. Higher number = higher chance of spawning. 0 = disable spawn");
        raccoonSpawnRolls = buildInt(builder, "raccoonSpawnRolls", "spawns", AMConfig.raccoonSpawnRolls, 0, Integer.MAX_VALUE, "Random roll chance to enable mob spawning. Higher number = lower chance of spawning");
        blobfishSpawnWeight = buildInt(builder, "blobfishSpawnWeight", "spawns", AMConfig.blobfishSpawnWeight, 0, 1000, "Spawn Weight, added to a pool of other mobs for each biome. Higher number = higher chance of spawning. 0 = disable spawn");
        blobfishSpawnRolls = buildInt(builder, "blobfishSpawnRolls", "spawns", AMConfig.blobfishSpawnRolls, 0, Integer.MAX_VALUE, "Random roll chance to enable mob spawning. Higher number = lower chance of spawning");
        sealSpawnWeight = buildInt(builder, "sealSpawnWeight", "spawns", AMConfig.sealSpawnWeight, 0, 1000, "Spawn Weight, added to a pool of other mobs for each biome. Higher number = higher chance of spawning. 0 = disable spawn");
        sealSpawnRolls = buildInt(builder, "sealSpawnRolls", "spawns", AMConfig.sealSpawnRolls, 0, Integer.MAX_VALUE, "Random roll chance to enable mob spawning. Higher number = lower chance of spawning");
        cockroachSpawnWeight = buildInt(builder, "cockroachSpawnWeight", "spawns", AMConfig.cockroachSpawnWeight, 0, 1000, "Spawn Weight, added to a pool of other mobs for each biome. Higher number = higher chance of spawning. 0 = disable spawn");
        cockroachSpawnRolls = buildInt(builder, "cockroachSpawnRolls", "spawns", AMConfig.cockroachSpawnRolls, 0, Integer.MAX_VALUE, "Random roll chance to enable mob spawning. Higher number = lower chance of spawning");
        shoebillSpawnWeight = buildInt(builder, "shoebillSpawnWeight", "spawns", AMConfig.shoebillSpawnWeight, 0, 1000, "Spawn Weight, added to a pool of other mobs for each biome. Higher number = higher chance of spawning. 0 = disable spawn");
        shoebillSpawnRolls = buildInt(builder, "shoebillSpawnRolls", "spawns", AMConfig.shoebillSpawnRolls, 0, Integer.MAX_VALUE, "Random roll chance to enable mob spawning. Higher number = lower chance of spawning");
        elephantSpawnWeight = buildInt(builder, "elephantSpawnWeight", "spawns", AMConfig.elephantSpawnWeight, 0, 1000, "Spawn Weight, added to a pool of other mobs for each biome. Higher number = higher chance of spawning. 0 = disable spawn");
        elephantSpawnRolls = buildInt(builder, "elephantSpawnRolls", "spawns", AMConfig.elephantSpawnRolls, 0, Integer.MAX_VALUE, "Random roll chance to enable mob spawning. Higher number = lower chance of spawning");
        soulVultureSpawnWeight = buildInt(builder, "soulVultureSpawnWeight", "spawns", AMConfig.soulVultureSpawnWeight, 0, 1000, "Spawn Weight, added to a pool of other mobs for each biome. Higher number = higher chance of spawning. 0 = disable spawn");
        soulVultureSpawnRolls = buildInt(builder, "soulVultureSpawnRolls", "spawns", AMConfig.soulVultureSpawnRolls, 0, Integer.MAX_VALUE, "Random roll chance to enable mob spawning. Higher number = lower chance of spawning");
        snowLeopardSpawnWeight = buildInt(builder, "snowLeopardSpawnWeight", "spawns", AMConfig.snowLeopardSpawnWeight, 0, 1000, "Spawn Weight, added to a pool of other mobs for each biome. Higher number = higher chance of spawning. 0 = disable spawn");
        snowLeopardSpawnRolls = buildInt(builder, "snowLeopardSpawnRolls", "spawns", AMConfig.snowLeopardSpawnRolls, 0, Integer.MAX_VALUE, "Random roll chance to enable mob spawning. Higher number = lower chance of spawning");
        spectreSpawnWeight = buildInt(builder, "spectreSpawnWeight", "spawns", AMConfig.spectreSpawnWeight, 0, 1000, "Spawn Weight, added to a pool of other mobs for each biome. Higher number = higher chance of spawning. 0 = disable spawn");
        spectreSpawnRolls = buildInt(builder, "spectreSpawnRolls", "spawns", AMConfig.spectreSpawnRolls, 0, Integer.MAX_VALUE, "Random roll chance to enable mob spawning. Higher number = lower chance of spawning");
        crowSpawnWeight = buildInt(builder, "crowSpawnWeight", "spawns", AMConfig.crowSpawnWeight, 0, 1000, "Spawn Weight, added to a pool of other mobs for each biome. Higher number = higher chance of spawning. 0 = disable spawn");
        crowSpawnRolls = buildInt(builder, "crowSpawnRolls", "spawns", AMConfig.crowSpawnRolls, 0, Integer.MAX_VALUE, "Random roll chance to enable mob spawning. Higher number = lower chance of spawning");
    }

    private static ForgeConfigSpec.BooleanValue buildBoolean(ForgeConfigSpec.Builder builder, String name, String catagory, boolean defaultValue, String comment){
        return builder.comment(comment).translation(name).define(name, defaultValue);
    }

    private static ForgeConfigSpec.IntValue buildInt(ForgeConfigSpec.Builder builder, String name, String catagory, int defaultValue, int min, int max, String comment){
        return builder.comment(comment).translation(name).defineInRange(name, defaultValue, min, max);
    }

    private static ForgeConfigSpec.DoubleValue buildDouble(ForgeConfigSpec.Builder builder, String name, String catagory, double defaultValue, double min, double max, String comment){
        return builder.comment(comment).translation(name).defineInRange(name, defaultValue, min, max);
    }
}
