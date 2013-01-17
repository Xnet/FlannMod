// Coded by Flann

package flann;

import java.io.File;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@NetworkMod(clientSideRequired=true,serverSideRequired=false)
@Mod(modid="Flann",name="Flann Mods",version="1.0")
public class FlannModsCore {
	
	public static int BlockID = 800;
	public static int ItemID = 13744;
	
	public static int PaxelID = ItemID+3;
	public static int SPaxelID = PaxelID+8;
	public static int NethID = SPaxelID+7;
	public static int RedID = NethID+5;
	public static int ObsidID = RedID+5;
	public static int SteelID = ObsidID+5;
	public static int BattleaxeID = SteelID+5;
	public static int SBattleaxeID = BattleaxeID+5;
	public static int ArmorNethID = SBattleaxeID+4;
	public static int ArmorRedID = ArmorNethID+4;
	public static int ArmorObsidID = ArmorRedID+4;
	public static int ArmorSteelID = ArmorObsidID+4;
	
	public static int bSteelID,concreteID,aConcreteID,steelBarsID,dSteelBarsID,barbedwireID;
	public static int frmID,wirecutterID,stickCrafterID;
	
	public static int stickID,headID,bodyID,pWoodID,pStoneID,pIronID,pDiamondID,pGoldID;
	public static int sstickID,sheadID,sbodyID,pNethID,pRedID,pObsidID,pSteelID;
	
	public static int swNethID,spNethID,piNethID,axNethID,hoNethID;
	public static int swRedID,spRedID,piRedID,axRedID,hoRedID;
	public static int swObsidID,spObsidID,piObsidID,axObsidID,hoObsidID;
	public static int swSteelID,spSteelID,piSteelID,axSteelID,hoSteelID;
	
	public static int baWoodID,baStoneID,baIronID,baDiamondID,baGoldID;
	public static int baNethID,baRedID,baObsidID,baSteelID;
	
	public static int heNethID,plNethID,leNethID,boNethID;
	public static int heRedID,plRedID,leRedID,boRedID;
	public static int heObsidID,plObsidID,leObsidID,boObsidID;
	public static int heSteelID,plSteelID,leSteelID,boSteelID;
	
	public static boolean vanPaxel,vanBattleaxe;
	public static boolean exPaxel,exBattleaxe;
	public static boolean armNeth,armRed,armObsid,armSteel;
	public static boolean toolNeth,toolRed,toolObsid,toolSteel;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();
		
		bSteelID = config.get("blocks", "blockSteel", BlockID+0).getInt();
		concreteID = config.get("blocks", "blockConcrete", BlockID+1).getInt();
		aConcreteID = config.get("blocks", "blockConcreteArmed", BlockID+2).getInt();
		steelBarsID = config.get("blocks", "blockSteelBars", BlockID+3).getInt();
		dSteelBarsID = config.get("blocks", "blockSteelBarsDirty", BlockID+4).getInt();
		barbedwireID = config.get("blocks", "blockBarbedwire", BlockID+5).getInt();
		
		frmID = config.get("items", "Misc.Items", ItemID+0).getInt();
		wirecutterID = config.get("items", "wirecutter", ItemID+1).getInt();
		stickCrafterID = config.get("items", "stickCrafter", ItemID+2).getInt();
		
		stickID = config.get("items", "paxelNormSticks", PaxelID+0).getInt();
		headID = config.get("items", "paxelNormHeads", PaxelID+1).getInt();
		bodyID = config.get("items", "paxelNormBodies", PaxelID+2).getInt();
		
		pWoodID = config.get("items", "paxelWood", PaxelID+3).getInt();
		pStoneID = config.get("items", "paxelStone", PaxelID+4).getInt();
		pIronID = config.get("items", "paxelIron", PaxelID+5).getInt();
		pDiamondID = config.get("items", "paxelDiamond", PaxelID+6).getInt();
		pGoldID = config.get("items", "paxelGold", PaxelID+7).getInt();
		
		sstickID = config.get("items", "paxelSpecSticks", SPaxelID+0).getInt();
		sheadID = config.get("items", "paxelSpecHeads", SPaxelID+1).getInt();
		sbodyID = config.get("items", "paxelSpecBodies", SPaxelID+2).getInt();
		
		pNethID = config.get("items", "paxelNetherrack", SPaxelID+3).getInt();
		pRedID = config.get("items", "paxelRedstone", SPaxelID+4).getInt();
		pObsidID = config.get("items", "paxelObsidian", SPaxelID+5).getInt();
		pSteelID = config.get("items", "paxelSteel", SPaxelID+6).getInt();
		
		swNethID = config.get("items", "netherrackSword", NethID+0).getInt();
		spNethID = config.get("items", "netherrackShovel", NethID+1).getInt();
		piNethID = config.get("items", "netherrackPickaxe", NethID+2).getInt();
		axNethID = config.get("items", "netherrackAxe", NethID+3).getInt();
		hoNethID = config.get("items", "netherrackHoe", NethID+4).getInt();
		
		swRedID = config.get("items", "redstoneSword", RedID+0).getInt();
		spRedID = config.get("items", "redstoneShovel", RedID+1).getInt();
		piRedID = config.get("items", "redstonePickaxe", RedID+2).getInt();
		axRedID = config.get("items", "redstoneAxe", RedID+3).getInt();
		hoRedID = config.get("items", "redstoneHoe", RedID+4).getInt();
		
		swObsidID = config.get("items", "obsidianSword", ObsidID+0).getInt();
		spObsidID = config.get("items", "obsidianShovel", ObsidID+1).getInt();
		piObsidID = config.get("items", "obsidianPickaxe", ObsidID+2).getInt();
		axObsidID = config.get("items", "obsidianAxe", ObsidID+3).getInt();
		hoObsidID = config.get("items", "obsidianHoe", ObsidID+4).getInt();
		
		swSteelID = config.get("items", "steelSword", SteelID+0).getInt();
		spSteelID = config.get("items", "steelShovel", SteelID+1).getInt();
		piSteelID = config.get("items", "steelPickaxe", SteelID+2).getInt();
		axSteelID = config.get("items", "steelAxe", SteelID+3).getInt();
		hoSteelID = config.get("items", "steelHoe", SteelID+4).getInt();
		
		baWoodID = config.get("items", "battleaxeWood", BattleaxeID+0).getInt();
		baStoneID = config.get("items", "battleaxeStone", BattleaxeID+1).getInt();
		baIronID = config.get("items", "battleaxeIron", BattleaxeID+2).getInt();
		baDiamondID = config.get("items", "battleaxeDiamond", BattleaxeID+3).getInt();
		baGoldID = config.get("items", "battleaxeGold", BattleaxeID+4).getInt();
		
		baNethID = config.get("items", "battleaxeNetherrack", SBattleaxeID+0).getInt();
		baRedID = config.get("items", "battleaxeRedstone", SBattleaxeID+1).getInt();
		baObsidID = config.get("items", "battleaxeObsidian", SBattleaxeID+2).getInt();
		baSteelID = config.get("items", "battleaxeSteel", SBattleaxeID+3).getInt();
		
		heNethID = config.get("items", "netherrackHelmet", ArmorNethID+0).getInt();
		plNethID = config.get("items", "netherrackChestplate", ArmorNethID+1).getInt();
		leNethID = config.get("items", "netherrackLeggings", ArmorNethID+2).getInt();
		boNethID = config.get("items", "netherrackBoots", ArmorNethID+3).getInt();
		
		heRedID = config.get("items", "redstoneHelmet", ArmorRedID+0).getInt();
		plRedID = config.get("items", "redstoneChestplate", ArmorRedID+1).getInt();
		leRedID = config.get("items", "redstoneLeggings", ArmorRedID+2).getInt();
		boRedID = config.get("items", "redstoneBoots", ArmorRedID+3).getInt();
		
		heObsidID = config.get("items", "obsidianHelmet", ArmorObsidID+0).getInt();
		plObsidID = config.get("items", "obsidianChestplate", ArmorObsidID+1).getInt();
		leObsidID = config.get("items", "obsidianLeggings", ArmorObsidID+2).getInt();
		boObsidID = config.get("items", "obsidianBoots", ArmorObsidID+3).getInt();
		
		heSteelID = config.get("items", "steelHelmet", ArmorSteelID+0).getInt();
		plSteelID = config.get("items", "steelChestplate", ArmorSteelID+1).getInt();
		leSteelID = config.get("items", "steelLeggings", ArmorSteelID+2).getInt();
		boSteelID = config.get("items", "steelBoots", ArmorSteelID+3).getInt();
		
		vanPaxel = config.get("general", "Vanilla Paxels Enabled", true).getBoolean(true);
		vanBattleaxe = config.get("general", "Vanilla Battleaxes Enabled", true).getBoolean(true);
		
		exPaxel = config.get("general", "Extra Paxels Enabled", true).getBoolean(true);
		exBattleaxe = config.get("general", "Extra Battleaxes Enabled", true).getBoolean(true);
		
		armNeth = config.get("general", "Netherrack Armor Enabled", true).getBoolean(true);
		armRed = config.get("general", "Redstone Armor Enabled", true).getBoolean(true);
		armObsid = config.get("general", "Obsidian Armor Enabled", true).getBoolean(true);
		armSteel = config.get("general", "Steel Armor Enabled", true).getBoolean(true);
		
		toolNeth = config.get("general", "Netherrack Tools Enabled", true).getBoolean(true);
		toolRed = config.get("general", "Redstone Tools Enabled", true).getBoolean(true);
		toolObsid = config.get("general", "Obsidian Tools Enabled", true).getBoolean(true);
		toolSteel = config.get("general", "Steel Tools Enabled", true).getBoolean(true);
		
		//boolean someConfigFlag = config.get(Configuration.CATEGORY_GENERAL, "SomeConfigFlag", false).getBoolean(false);
		
		config.save();
	}
	
	public static CreativeTabs flanntab = new Flann_CreativeTab("flanntab");
	
	public static Block blockSteel,concrete,armedConcrete,steelBars,steelBarsDirty,barbedWire;
	public static Item FRM,wirecutter,stickCrafter;
	
	public static Item stickIngot,headIngot,bodyIngot;
	public static Item paxelWood,paxelStone,paxelIron,paxelDiamond,paxelGold;
	public static Item sstickIngot, sheadIngot, sbodyIngot;
	public static Item spaxelNeth, spaxelRed, spaxelObsid, spaxelSteel;
	
	public static Item battleaxeWood,battleaxeStone,battleaxeIron,battleaxeDiamond,battleaxeGold;
	public static Item battleaxeNeth,battleaxeRed,battleaxeObsid,battleaxeSteel;
	
	public static Item nethSword,nethSpade,nethPick,nethAxe,nethHoe;
	public static Item redSword,redSpade,redPick,redAxe,redHoe;
	public static Item obsidSword,obsidSpade,obsidPick,obsidAxe,obsidHoe;
	public static Item steelSword,steelSpade,steelPick,steelAxe,steelHoe;
	
	public static Item nethHelmet,nethPlate,nethLegs,nethBoots;
	public static Item redHelmet,redPlate,redLegs,redBoots;
	public static Item obsidHelmet,obsidPlate,obsidLegs,obsidBoots;
	public static Item steelHelmet,steelPlate,steelLegs,steelBoots;
	
	@Init
	public void load(FMLInitializationEvent event){
		
		LanguageRegistry.instance().addStringLocalization("itemGroup.flanntab", "en_US", "Flann Mods");
		GameRegistry.registerFuelHandler(new Flann_FuelHandler());
		
		blockSteel = new Flann_BlockSteel(bSteelID,0).setHardness(5F).setResistance(10F).setStepSound(Block.soundMetalFootstep).setBlockName("blockSteel");
		concrete = new Flann_BlockConcrete (concreteID, 1).setHardness(6F).setResistance(20F).setStepSound(Block.soundStoneFootstep).setBlockName("concrete");
		armedConcrete = new Flann_BlockArmedConcrete (aConcreteID,1,2).setHardness(20F).setResistance(30F).setStepSound(Block.soundStoneFootstep).setBlockName("armedConcrete");
		steelBars = new Flann_BlockPaneSteelBars(steelBarsID, 3).setHardness(5F).setResistance(10F).setStepSound(Block.soundMetalFootstep).setBlockName("steelBars");
		steelBarsDirty = new Flann_BlockPaneSteelBarsDirty(dSteelBarsID, 4).setHardness(5F).setResistance(10F).setStepSound(Block.soundMetalFootstep).setBlockName("steelBarsDirty");
		barbedWire = new Flann_BlockBarbedWire (barbedwireID, 5).setHardness(1F).setResistance(5F).setBlockName("barbedWire");
		
		FRM = new Flann_ItemMaterials(frmID).setItemName("FRM");
		wirecutter = new Flann_ItemWireCutter (wirecutterID, 16, Flann_EnumToolMaterial.WIRECUTTER).setItemName("wirecutter");
		stickCrafter = new Flann_ItemStickCrafter(stickCrafterID,17).setItemName("stickCrafter");
		
		if(vanPaxel == true){
			vanillaPaxels();
		}
		if(exPaxel==true){
			extraPaxels();
		}
		if(vanBattleaxe=true){
			vanillaBattleaxes();
		}
		if(exBattleaxe==true){
			extraBattleaxes();
		}
		if(armNeth==true){
			armorNeth();
		}
		if(armRed==true){
			armorRed();
		}
		if(armObsid==true){
			armorObsid();
		}
		if(armSteel==true){
			armorSteel();
		}
		if(toolNeth==true){
			toolsNeth();
		}
		if(toolRed==true){
			toolsRed();
		}
		if(toolObsid==true){
			toolsObsid();
		}
		if(toolSteel==true){
			toolsSteel();
		}
		
		GameRegistry.registerBlock(blockSteel);
		GameRegistry.registerBlock(concrete);
		GameRegistry.registerBlock(armedConcrete);
		GameRegistry.registerBlock(steelBars);
		GameRegistry.registerBlock(steelBarsDirty);
		GameRegistry.registerBlock(barbedWire);
		
		MinecraftForge.setBlockHarvestLevel(blockSteel, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(concrete, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(armedConcrete, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(steelBars, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(steelBarsDirty, "pickaxe", 1);
		
		LanguageRegistry.addName(blockSteel, "Steel Block");
		LanguageRegistry.addName(concrete, "Concrete");
		LanguageRegistry.addName(armedConcrete, "Armed Concrete");
		LanguageRegistry.addName(steelBars, "Steel Bars");
		LanguageRegistry.addName(steelBarsDirty, "Dirty Steel Bars");
		LanguageRegistry.addName(barbedWire, "Barbed Wire");
		
		LanguageRegistry.addName(new ItemStack(FRM,1,0), "Smelted Iron");
		LanguageRegistry.addName(new ItemStack(FRM,1,1), "Steel Ingot");
		LanguageRegistry.addName(new ItemStack(FRM,1,2), "Steel Sticks");
		LanguageRegistry.addName(new ItemStack(FRM,1,3), "Redstone Ingot");
		LanguageRegistry.addName(wirecutter, "Wire Cutter");
		LanguageRegistry.addName(stickCrafter, "Stick Crafter");
		
// Smelting
	// Block of Iron -> Smelted Iron
		GameRegistry.addSmelting(Block.blockSteel.blockID, new ItemStack(FRM,1,0), 5);
		
// Blocks
	// Smelted Iron -> Steel Block
		GameRegistry.addRecipe(new ItemStack(blockSteel,4), "SCS", "CSC", "SCS", Character.valueOf('C'), Item.coal, Character.valueOf('S'), new ItemStack(FRM,1,0));
		GameRegistry.addRecipe(new ItemStack(blockSteel,4), "SCS", "CSC", "SCS", Character.valueOf('C'), new ItemStack(Item.coal, 1, 1), Character.valueOf('S'), new ItemStack(FRM,1,0));
		
	// Concrete
		GameRegistry.addShapelessRecipe(new ItemStack(concrete, 2), Block.gravel, Item.clay, Item.bucketWater);
		GameRegistry.addShapelessRecipe(new ItemStack(concrete, 4), Block.gravel, Item.clay, Item.bucketWater, Block.gravel, Item.clay, Item.bucketWater);
		GameRegistry.addShapelessRecipe(new ItemStack(concrete, 6), Block.gravel, Item.clay, Item.bucketWater, Block.gravel, Item.clay, Item.bucketWater, Block.gravel, Item.clay, Item.bucketWater);
		
	// Armed concrete
		GameRegistry.addRecipe(new ItemStack(armedConcrete, 1), " C ", "CSC", " C ", Character.valueOf('C'), concrete, Character.valueOf('S'), steelBars);
		
	// Steel Bars
		GameRegistry.addRecipe(new ItemStack(steelBars, 16), "SSS", "SSS", Character.valueOf('S'), new ItemStack(FRM,1,1));
		
	// Barbed Wire
		GameRegistry.addRecipe(new ItemStack(barbedWire, 2), "SSS", "S S", "SSS", Character.valueOf('S'), new ItemStack(FRM,1,2));
		
// Items
	// Steel Block -> Steel Ingot
		GameRegistry.addRecipe(new ItemStack(FRM,9,1), "S", Character.valueOf('S'), blockSteel);
		
	// Steel Ingot -> Steel Block
		GameRegistry.addRecipe(new ItemStack(blockSteel,1), "SSS", "SSS", "SSS", Character.valueOf('S'), new ItemStack(FRM,1,1));
		
	// Steel Sticks
		GameRegistry.addRecipe(new ItemStack(FRM,4,2), "S", "S", Character.valueOf('S'), new ItemStack(FRM,1,1));
		
	// Redstone Ingot
		GameRegistry.addRecipe(new ItemStack(FRM,4,3), "RRR", "RIR", "RRR", Character.valueOf('R'), Item.redstone, Character.valueOf('I'), Item.ingotIron);
		
	// Wire Cutter
		GameRegistry.addRecipe(new ItemStack(wirecutter), "I I", " I ", "S S", Character.valueOf('I'), new ItemStack(FRM,1,1), Character.valueOf('S'), Item.stick);
		
	// Stick Crafter
		GameRegistry.addShapelessRecipe(new ItemStack(stickCrafter),Block.cobblestone,Item.flint);
		
	}
	
	public static void vanillaPaxels(){
		stickIngot = new Flann_ItemStick(stickID).setItemName("stickIngot");
		headIngot = new Flann_ItemHead(headID).setItemName("headIngot");
		bodyIngot = new Flann_ItemBody(bodyID).setItemName("bodyIngot");
		
		int paxelRow = 0;
		paxelWood = new Flann_ItemPaxel(pWoodID, paxelRow+0, Flann_EnumToolMaterial.WOODP).setItemName("paxelWood");
		paxelStone = new Flann_ItemPaxel(pStoneID, paxelRow+1, Flann_EnumToolMaterial.STONEP).setItemName("paxelStone");
		paxelIron = new Flann_ItemPaxel(pIronID, paxelRow+2, Flann_EnumToolMaterial.IRONP).setItemName("paxelIron");
		paxelDiamond = new Flann_ItemPaxel(pDiamondID, paxelRow+3, Flann_EnumToolMaterial.DIAMONDP).setItemName("paxelDiamond");
		paxelGold = new Flann_ItemPaxel(pGoldID, paxelRow+4, Flann_EnumToolMaterial.GOLDP).setItemName("paxelGold");
		
		MinecraftForge.setToolClass(paxelWood, "pickaxe", 0);
		MinecraftForge.setToolClass(paxelStone, "pickaxe", 1);
		MinecraftForge.setToolClass(paxelIron, "pickaxe", 2);
		MinecraftForge.setToolClass(paxelDiamond, "pickaxe", 3);
		MinecraftForge.setToolClass(paxelGold, "pickaxe", 0);
		
		LanguageRegistry.addName(new ItemStack(stickIngot,1,0), "Wooden Paxelsticks");
		LanguageRegistry.addName(new ItemStack(stickIngot,1,1), "Stone Paxelsticks");
		LanguageRegistry.addName(new ItemStack(stickIngot,1,2), "Iron Paxelsticks");
		LanguageRegistry.addName(new ItemStack(stickIngot,1,3), "Diamond Paxelsticks");
		LanguageRegistry.addName(new ItemStack(stickIngot,1,4), "Golden Paxelsticks");
		LanguageRegistry.addName(new ItemStack(headIngot,1,0), "Wooden Paxelhead");
		LanguageRegistry.addName(new ItemStack(headIngot,1,1), "Stone Paxelhead");
		LanguageRegistry.addName(new ItemStack(headIngot,1,2), "Iron Paxelhead");
		LanguageRegistry.addName(new ItemStack(headIngot,1,3), "Diamond Paxelhead");
		LanguageRegistry.addName(new ItemStack(headIngot,1,4), "Golden Paxelhead");
		LanguageRegistry.addName(new ItemStack(bodyIngot,1,0), "Wooden Paxelbody");
		LanguageRegistry.addName(new ItemStack(bodyIngot,1,1), "Stone Paxelbody");
		LanguageRegistry.addName(new ItemStack(bodyIngot,1,2), "Iron Paxelbody");
		LanguageRegistry.addName(new ItemStack(bodyIngot,1,3), "Diamond Paxelbody");
		LanguageRegistry.addName(new ItemStack(bodyIngot,1,4), "Golden Paxelbody");
		LanguageRegistry.addName(paxelWood, "Wooden Paxel");
		LanguageRegistry.addName(paxelStone, "Stone Paxel");
		LanguageRegistry.addName(paxelIron, "Iron Paxel");
		LanguageRegistry.addName(paxelDiamond, "Diamond Paxel");
		LanguageRegistry.addName(paxelGold, "Golden Paxel");
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(stickIngot,1,0),stickCrafter,"plankWood","plankWood"));
		GameRegistry.addShapelessRecipe(new ItemStack(stickIngot,1,1),stickCrafter,Block.cobblestone,Block.cobblestone);
		GameRegistry.addShapelessRecipe(new ItemStack(stickIngot,1,2),stickCrafter,Item.ingotIron,Item.ingotIron);
		GameRegistry.addShapelessRecipe(new ItemStack(stickIngot,1,3),stickCrafter,Item.diamond,Item.diamond);
		GameRegistry.addShapelessRecipe(new ItemStack(stickIngot,1,4),stickCrafter,Item.ingotGold,Item.ingotGold);
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(headIngot,1,0)," I","S ",Character.valueOf('S'),new ItemStack(stickIngot,1,0),Character.valueOf('I'),"plankWood"));
		GameRegistry.addRecipe(new ItemStack(headIngot,1,1)," I","S ",Character.valueOf('S'),new ItemStack(stickIngot,1,1),Character.valueOf('I'),Block.cobblestone);
		GameRegistry.addRecipe(new ItemStack(headIngot,1,2)," I","S ",Character.valueOf('S'),new ItemStack(stickIngot,1,2),Character.valueOf('I'),Item.ingotIron);
		GameRegistry.addRecipe(new ItemStack(headIngot,1,3)," I","S ",Character.valueOf('S'),new ItemStack(stickIngot,1,3),Character.valueOf('I'),Item.diamond);
		GameRegistry.addRecipe(new ItemStack(headIngot,1,4)," I","S ",Character.valueOf('S'),new ItemStack(stickIngot,1,4),Character.valueOf('I'),Item.ingotGold);
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(bodyIngot,1,0),"I  "," S ","  I",Character.valueOf('S'),new ItemStack(stickIngot,1,0),Character.valueOf('I'),"plankWood"));
		GameRegistry.addRecipe(new ItemStack(bodyIngot,1,1),"I  "," S ","  I",Character.valueOf('S'),new ItemStack(stickIngot,1,1),Character.valueOf('I'),Block.cobblestone);
		GameRegistry.addRecipe(new ItemStack(bodyIngot,1,2),"I  "," S ","  I",Character.valueOf('S'),new ItemStack(stickIngot,1,2),Character.valueOf('I'),Item.ingotIron);
		GameRegistry.addRecipe(new ItemStack(bodyIngot,1,3),"I  "," S ","  I",Character.valueOf('S'),new ItemStack(stickIngot,1,3),Character.valueOf('I'),Item.diamond);
		GameRegistry.addRecipe(new ItemStack(bodyIngot,1,4),"I  "," S ","  I",Character.valueOf('S'),new ItemStack(stickIngot,1,4),Character.valueOf('I'),Item.ingotGold);
		
		GameRegistry.addRecipe(new ItemStack(paxelWood,1),"  h"," b ","s  ",Character.valueOf('h'),new ItemStack(headIngot,1,0),Character.valueOf('b'),new ItemStack(bodyIngot,1,0),Character.valueOf('s'),new ItemStack(stickIngot,1,0));
		GameRegistry.addRecipe(new ItemStack(paxelStone,1),"  h"," b ","s  ",Character.valueOf('h'),new ItemStack(headIngot,1,1),Character.valueOf('b'),new ItemStack(bodyIngot,1,1),Character.valueOf('s'),new ItemStack(stickIngot,1,1));
		GameRegistry.addRecipe(new ItemStack(paxelIron,1),"  h"," b ","s  ",Character.valueOf('h'),new ItemStack(headIngot,1,2),Character.valueOf('b'),new ItemStack(bodyIngot,1,2),Character.valueOf('s'),new ItemStack(stickIngot,1,2));
		GameRegistry.addRecipe(new ItemStack(paxelDiamond,1),"  h"," b ","s  ",Character.valueOf('h'),new ItemStack(headIngot,1,3),Character.valueOf('b'),new ItemStack(bodyIngot,1,3),Character.valueOf('s'),new ItemStack(stickIngot,1,3));
		GameRegistry.addRecipe(new ItemStack(paxelGold,1),"  h"," b ","s  ",Character.valueOf('h'),new ItemStack(headIngot,1,4),Character.valueOf('b'),new ItemStack(bodyIngot,1,4),Character.valueOf('s'),new ItemStack(stickIngot,1,4));
	}
	
	public static void extraPaxels(){
		sstickIngot = new Flann_ItemSStick(sstickID).setItemName("sstickIngot");
		sheadIngot = new Flann_ItemSHead(sheadID).setItemName("sheadIngot");
		sbodyIngot = new Flann_ItemSBody(sbodyID).setItemName("sbodyIngot");
		
		int spaxelRow = 16;
		if(toolNeth==true){
			spaxelNeth = new Flann_ItemPaxel(pNethID, spaxelRow+0, Flann_EnumToolMaterial.toolNETHP).setItemName("spaxelNeth");
			MinecraftForge.setToolClass(spaxelNeth, "pickaxe", 1);
			LanguageRegistry.addName(new ItemStack(sstickIngot,1,0), "Netherrack Paxelsticks");
			LanguageRegistry.addName(new ItemStack(sheadIngot,1,0), "Netherrack Paxelhead");
			LanguageRegistry.addName(new ItemStack(sbodyIngot,1,0), "Netherrack Paxelbody");
			LanguageRegistry.addName(spaxelNeth, "Netherrack Paxel");
			GameRegistry.addShapelessRecipe(new ItemStack(sstickIngot,1,0),stickCrafter,Block.netherrack,Block.netherrack);
			GameRegistry.addRecipe(new ItemStack(sheadIngot,1,0)," I","S ",Character.valueOf('S'),new ItemStack(sstickIngot,1,0),Character.valueOf('I'),Block.netherrack);
			GameRegistry.addRecipe(new ItemStack(sbodyIngot,1,0),"I  "," S ","  I",Character.valueOf('S'),new ItemStack(sstickIngot,1,0),Character.valueOf('I'),Block.netherrack);
			GameRegistry.addRecipe(new ItemStack(spaxelNeth,1),"  h"," b ","s  ",Character.valueOf('h'),new ItemStack(sheadIngot,1,0),Character.valueOf('b'),new ItemStack(sbodyIngot,1,0),Character.valueOf('s'),new ItemStack(sstickIngot,1,0));
		}
		if(toolRed==true){
			spaxelRed = new Flann_ItemPaxel(pRedID, spaxelRow+1, Flann_EnumToolMaterial.toolREDP).setItemName("spaxelRed");
			MinecraftForge.setToolClass(spaxelRed, "pickaxe", 2);
			LanguageRegistry.addName(new ItemStack(sstickIngot,1,1), "Redstone Paxelsticks");
			LanguageRegistry.addName(new ItemStack(sheadIngot,1,1), "Redstone Paxelhead");
			LanguageRegistry.addName(new ItemStack(sbodyIngot,1,1), "Redstone Paxelbody");
			LanguageRegistry.addName(spaxelRed, "Redstone Paxel");
			GameRegistry.addShapelessRecipe(new ItemStack(sstickIngot,1,1),stickCrafter,new ItemStack(FRM,1,3),new ItemStack(FRM,1,3));
			GameRegistry.addRecipe(new ItemStack(sheadIngot,1,1)," I","S ",Character.valueOf('S'),new ItemStack(sstickIngot,1,1),Character.valueOf('I'),new ItemStack(FRM,1,3));
			GameRegistry.addRecipe(new ItemStack(sbodyIngot,1,1),"I  "," S ","  I",Character.valueOf('S'),new ItemStack(sstickIngot,1,1),Character.valueOf('I'),new ItemStack(FRM,1,3));
			GameRegistry.addRecipe(new ItemStack(spaxelRed,1),"  h"," b ","s  ",Character.valueOf('h'),new ItemStack(sheadIngot,1,1),Character.valueOf('b'),new ItemStack(sbodyIngot,1,1),Character.valueOf('s'),new ItemStack(sstickIngot,1,1));
		}
		if(toolObsid==true){
			spaxelObsid = new Flann_ItemPaxel(pObsidID, spaxelRow+2, Flann_EnumToolMaterial.toolOBSIDP).setItemName("spaxelObsid");
			MinecraftForge.setToolClass(spaxelObsid, "pickaxe", 3);
			LanguageRegistry.addName(new ItemStack(sstickIngot,1,2), "Obsidian Paxelsticks");
			LanguageRegistry.addName(new ItemStack(sheadIngot,1,2), "Obsidian Paxelhead");
			LanguageRegistry.addName(new ItemStack(sbodyIngot,1,2), "Obsidian Paxelbody");
			LanguageRegistry.addName(spaxelObsid, "Obsidian Paxel");
			GameRegistry.addShapelessRecipe(new ItemStack(sstickIngot,1,2),stickCrafter,Block.obsidian,Block.obsidian);
			GameRegistry.addRecipe(new ItemStack(sheadIngot,1,2)," I","S ",Character.valueOf('S'),new ItemStack(sstickIngot,1,2),Character.valueOf('I'),Block.obsidian);
			GameRegistry.addRecipe(new ItemStack(sbodyIngot,1,2),"I  "," S ","  I",Character.valueOf('S'),new ItemStack(sstickIngot,1,2),Character.valueOf('I'),Block.obsidian);
			GameRegistry.addRecipe(new ItemStack(spaxelObsid,1),"  h"," b ","s  ",Character.valueOf('h'),new ItemStack(sheadIngot,1,2),Character.valueOf('b'),new ItemStack(sbodyIngot,1,2),Character.valueOf('s'),new ItemStack(sstickIngot,1,2));
		}
		if(toolSteel==true){
			spaxelSteel = new Flann_ItemPaxel(pSteelID, spaxelRow+3, Flann_EnumToolMaterial.toolSTEELP).setItemName("spaxelSteel");
			MinecraftForge.setToolClass(spaxelSteel, "pickaxe", 2);
			LanguageRegistry.addName(new ItemStack(sstickIngot,1,3), "Steel Paxelsticks");
			LanguageRegistry.addName(new ItemStack(sheadIngot,1,3), "Steel Paxelhead");
			LanguageRegistry.addName(new ItemStack(sbodyIngot,1,3), "Steel Paxelbody");
			LanguageRegistry.addName(spaxelSteel, "Steel Paxel");
			GameRegistry.addShapelessRecipe(new ItemStack(sstickIngot,1,3),stickCrafter,new ItemStack(FRM,1,1),new ItemStack(FRM,1,1));
			GameRegistry.addRecipe(new ItemStack(sheadIngot,1,3)," I","S ",Character.valueOf('S'),new ItemStack(sstickIngot,1,3),Character.valueOf('I'),new ItemStack(FRM,1,1));
			GameRegistry.addRecipe(new ItemStack(sbodyIngot,1,3),"I  "," S ","  I",Character.valueOf('S'),new ItemStack(sstickIngot,1,3),Character.valueOf('I'),new ItemStack(FRM,1,1));
			GameRegistry.addRecipe(new ItemStack(spaxelSteel,1),"  h"," b ","s  ",Character.valueOf('h'),new ItemStack(sheadIngot,1,3),Character.valueOf('b'),new ItemStack(sbodyIngot,1,3),Character.valueOf('s'),new ItemStack(sstickIngot,1,3));
		}
	}
	
	public static void vanillaBattleaxes(){
		int battleaxeRow = 0;
		battleaxeWood = new Flann_ItemBattleaxe(baWoodID, battleaxeRow+0, Flann_EnumToolMaterial.WOODBA).setItemName("battleaxeWood");
		battleaxeStone = new Flann_ItemBattleaxe(baStoneID, battleaxeRow+1, Flann_EnumToolMaterial.STONEBA).setItemName("battleaxeStone");
		battleaxeIron = new Flann_ItemBattleaxe(baIronID, battleaxeRow+2, Flann_EnumToolMaterial.IRONBA).setItemName("battleaxeIron");
		battleaxeDiamond = new Flann_ItemBattleaxe(baDiamondID, battleaxeRow+3, Flann_EnumToolMaterial.DIAMONDBA).setItemName("battleaxeDiamond");
		battleaxeGold = new Flann_ItemBattleaxe(baGoldID, battleaxeRow+4, Flann_EnumToolMaterial.GOLDBA).setItemName("battleaxeGold");
		MinecraftForge.setToolClass(battleaxeWood, "axe", 0);
		MinecraftForge.setToolClass(battleaxeStone, "axe", 1);
		MinecraftForge.setToolClass(battleaxeIron, "axe", 2);
		MinecraftForge.setToolClass(battleaxeDiamond, "axe", 3);
		MinecraftForge.setToolClass(battleaxeGold, "axe", 0);
		LanguageRegistry.addName(battleaxeWood, "Wooden Battleaxe");
		LanguageRegistry.addName(battleaxeStone, "Stone Battleaxe");
		LanguageRegistry.addName(battleaxeIron, "Iron Battleaxe");
		LanguageRegistry.addName(battleaxeDiamond, "Diamond Battleaxe");
		LanguageRegistry.addName(battleaxeGold, "Gold Battleaxe");
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(battleaxeWood,1),"BBB","BIB"," I ",'B',"plankWood",'I',Item.stick));
		GameRegistry.addRecipe(new ItemStack(battleaxeStone,1),"BBB","BIB"," I ",'B',Block.cobblestone,'I',Item.stick);
		GameRegistry.addRecipe(new ItemStack(battleaxeIron,1),"BBB","BIB"," I ",'B',Item.ingotIron,'I',Item.stick);
		GameRegistry.addRecipe(new ItemStack(battleaxeDiamond,1),"BBB","BIB"," I ",'B',Item.diamond,'I',Item.stick);
		GameRegistry.addRecipe(new ItemStack(battleaxeGold,1),"BBB","BIB"," I ",'B',Item.ingotGold,'I',Item.stick);
	}
	
	public static void extraBattleaxes(){
		int battleaxeRow2 = 16;
		if(toolNeth==true){
			battleaxeNeth = new Flann_ItemBattleaxe(baNethID, battleaxeRow2+0, Flann_EnumToolMaterial.toolNETHBA).setItemName("nethBattle");
			MinecraftForge.setToolClass(battleaxeNeth, "axe", 1);
			LanguageRegistry.addName(battleaxeNeth, "Netherrack Battleaxe");
			GameRegistry.addRecipe(new ItemStack(battleaxeNeth,1),"BBB","BIB"," B ",'B',Block.netherrack,'I',Item.stick);
		}
		if(toolRed==true){
			battleaxeRed = new Flann_ItemBattleaxe(baRedID, battleaxeRow2+1, Flann_EnumToolMaterial.toolREDBA).setItemName("redBattle");
			MinecraftForge.setToolClass(battleaxeRed, "axe", 2);
			LanguageRegistry.addName(battleaxeRed, "Redstone Battleaxe");
			GameRegistry.addRecipe(new ItemStack(battleaxeRed,1),"BBB","BIB"," B ",'B',new ItemStack(FRM,1,3),'I',Item.stick);
		}
		if(toolObsid==true){
			battleaxeObsid = new Flann_ItemBattleaxe(baObsidID, battleaxeRow2+2, Flann_EnumToolMaterial.toolOBSIDBA).setItemName("obsidBattle");
			MinecraftForge.setToolClass(battleaxeObsid, "axe", 3);
			LanguageRegistry.addName(battleaxeObsid, "Obsidian Battleaxe");
			GameRegistry.addRecipe(new ItemStack(battleaxeObsid,1),"BBB","BIB"," B ",'B',Block.obsidian,'I',Item.stick);
		}
		if(toolSteel==true){
			battleaxeSteel = new Flann_ItemBattleaxe(baSteelID, battleaxeRow2+3, Flann_EnumToolMaterial.toolSTEELBA).setItemName("steelBattle");
			MinecraftForge.setToolClass(battleaxeSteel, "axe", 2);
			LanguageRegistry.addName(battleaxeSteel, "Steel Battleaxe");
			GameRegistry.addRecipe(new ItemStack(battleaxeSteel,1),"BBB","BIB"," B ",'B',new ItemStack(FRM,1,1),'I',Item.stick);
		}
	}
	
	public static void armorNeth(){
		int nethRow = 0;
		nethHelmet = new Flann_ItemArmor(heNethID, nethRow+0, Flann_EnumToolMaterial.armorNETH, 1, 0).setItemName("nethHelmet");
		nethPlate = new Flann_ItemArmor(plNethID, nethRow+1, Flann_EnumToolMaterial.armorNETH, 1, 1).setItemName("nethPlate");
		nethLegs = new Flann_ItemArmor(leNethID, nethRow+2, Flann_EnumToolMaterial.armorNETH, 1, 2).setItemName("nethLegs");
		nethBoots = new Flann_ItemArmor(boNethID, nethRow+3, Flann_EnumToolMaterial.armorNETH, 1, 3).setItemName("nethBoots");
		LanguageRegistry.addName(nethHelmet, "Netherrack Helmet");
		LanguageRegistry.addName(nethPlate, "Netherrack Chestplate");
		LanguageRegistry.addName(nethLegs, "Netherrack Leggings");
		LanguageRegistry.addName(nethBoots, "Netherrack Boots");
		GameRegistry.addRecipe(new ItemStack(nethHelmet,1),"BBB","B B",'B',Block.netherrack);
		GameRegistry.addRecipe(new ItemStack(nethPlate,1),"B B","BBB","BBB",'B',Block.netherrack);
		GameRegistry.addRecipe(new ItemStack(nethLegs,1),"BBB","B B","B B",'B',Block.netherrack);
		GameRegistry.addRecipe(new ItemStack(nethBoots,1),"B B","B B",'B',Block.netherrack);
	}
	
	public static void armorRed(){
		int redRow = 16;
		redHelmet = new Flann_ItemArmor(heRedID, redRow+0, Flann_EnumToolMaterial.armorRED, 1, 0).setItemName("redHelmet");
		redPlate = new Flann_ItemArmor(plRedID, redRow+1, Flann_EnumToolMaterial.armorRED, 1, 1).setItemName("redPlate");
		redLegs = new Flann_ItemArmor(leRedID, redRow+2, Flann_EnumToolMaterial.armorRED, 1, 2).setItemName("redLegs");
		redBoots = new Flann_ItemArmor(boRedID, redRow+3, Flann_EnumToolMaterial.armorRED, 1, 3).setItemName("redBoots");
		LanguageRegistry.addName(redHelmet, "Redstone Helmet");
		LanguageRegistry.addName(redPlate, "Redstone Chestplate");
		LanguageRegistry.addName(redLegs, "Redstone Leggings");
		LanguageRegistry.addName(redBoots, "Redstone Boots");
		GameRegistry.addRecipe(new ItemStack(redHelmet,1),"BBB","B B",'B',new ItemStack(FRM,1,3));
		GameRegistry.addRecipe(new ItemStack(redPlate,1),"B B","BBB","BBB",'B',new ItemStack(FRM,1,3));
		GameRegistry.addRecipe(new ItemStack(redLegs,1),"BBB","B B","B B",'B',new ItemStack(FRM,1,3));
		GameRegistry.addRecipe(new ItemStack(redBoots,1),"B B","B B",'B',new ItemStack(FRM,1,3));
	}
	
	public static void armorObsid(){
		int obsidRow = 32;
		obsidHelmet = new Flann_ItemArmor(heObsidID, obsidRow+0, Flann_EnumToolMaterial.armorOBSID, 1, 0).setItemName("obsidHelmet");
		obsidPlate = new Flann_ItemArmor(plObsidID, obsidRow+1, Flann_EnumToolMaterial.armorOBSID, 1, 1).setItemName("obsidPlate");
		obsidLegs = new Flann_ItemArmor(leObsidID, obsidRow+2, Flann_EnumToolMaterial.armorOBSID, 1, 2).setItemName("obsidLegs");
		obsidBoots = new Flann_ItemArmor(boObsidID, obsidRow+3, Flann_EnumToolMaterial.armorOBSID, 1, 3).setItemName("obsidBoots");
		LanguageRegistry.addName(obsidHelmet, "Obsidian Helmet");
		LanguageRegistry.addName(obsidPlate, "Obsidian Chestplate");
		LanguageRegistry.addName(obsidLegs, "Obsidian Leggings");
		LanguageRegistry.addName(obsidBoots, "Obsidian Boots");
		GameRegistry.addRecipe(new ItemStack(obsidHelmet,1),"BBB","B B",'B',Block.obsidian);
		GameRegistry.addRecipe(new ItemStack(obsidPlate,1),"B B","BBB","BBB",'B',Block.obsidian);
		GameRegistry.addRecipe(new ItemStack(obsidLegs,1),"BBB","B B","B B",'B',Block.obsidian);
		GameRegistry.addRecipe(new ItemStack(obsidBoots,1),"B B","B B",'B',Block.obsidian);
	}
	
	public static void armorSteel(){
		int steelRow = 48;
		steelHelmet = new Flann_ItemArmor(heSteelID, steelRow+0, Flann_EnumToolMaterial.armorSTEEL, 1, 0).setItemName("steelHelmet");
		steelPlate = new Flann_ItemArmor(plSteelID, steelRow+1, Flann_EnumToolMaterial.armorSTEEL, 1, 1).setItemName("steelPlate");
		steelLegs = new Flann_ItemArmor(leSteelID, steelRow+2, Flann_EnumToolMaterial.armorSTEEL, 1, 2).setItemName("steelLegs");
		steelBoots = new Flann_ItemArmor(boSteelID, steelRow+3, Flann_EnumToolMaterial.armorSTEEL, 1, 3).setItemName("steelBoots");
		LanguageRegistry.addName(steelHelmet, "Steel Helmet");
		LanguageRegistry.addName(steelPlate, "Steel Chestplate");
		LanguageRegistry.addName(steelLegs, "Steel Leggings");
		LanguageRegistry.addName(steelBoots, "Steel Boots");
		GameRegistry.addRecipe(new ItemStack(steelHelmet,1),"BBB","B B",'B',new ItemStack(FRM,1,1));
		GameRegistry.addRecipe(new ItemStack(steelPlate,1),"B B","BBB","BBB",'B',new ItemStack(FRM,1,1));
		GameRegistry.addRecipe(new ItemStack(steelLegs,1),"BBB","B B","B B",'B',new ItemStack(FRM,1,1));
		GameRegistry.addRecipe(new ItemStack(steelBoots,1),"B B","B B",'B',new ItemStack(FRM,1,1));
	}
	
	public static void toolsNeth(){
		int nethRow = 0;
		nethSword = new Flann_ItemSword(swNethID, nethRow+0, Flann_EnumToolMaterial.toolNETH).setItemName("nethSword");
		nethSpade = new Flann_ItemSpade(spNethID, nethRow+1, Flann_EnumToolMaterial.toolNETH).setItemName("nethSpade");
		nethPick = new Flann_ItemPickaxe(piNethID, nethRow+2, Flann_EnumToolMaterial.toolNETH).setItemName("nethPick");
		nethAxe = new Flann_ItemAxe(axNethID, nethRow+3, Flann_EnumToolMaterial.toolNETH).setItemName("nethAxe");
		nethHoe = new Flann_ItemHoe(hoNethID, nethRow+4, Flann_EnumToolMaterial.toolNETH).setItemName("nethHoe");
		MinecraftForge.setToolClass(nethSpade, "shovel", 1);
		MinecraftForge.setToolClass(nethPick, "pickaxe", 1);
		MinecraftForge.setToolClass(nethAxe, "axe", 1);
		LanguageRegistry.addName(nethSword, "Netherrack Sword");
		LanguageRegistry.addName(nethSpade, "Netherrack Shovel");
		LanguageRegistry.addName(nethPick, "Netherrack Pickaxe");
		LanguageRegistry.addName(nethAxe, "Netherrack Axe");
		LanguageRegistry.addName(nethHoe, "Netherrack Hoe");
		GameRegistry.addRecipe(new ItemStack(nethSword,1)," B "," B "," I ",'B',Block.netherrack,'I',Item.stick);
		GameRegistry.addRecipe(new ItemStack(nethSpade,1)," B "," I "," I ",'B',Block.netherrack,'I',Item.stick);
		GameRegistry.addRecipe(new ItemStack(nethPick,1),"BBB"," I "," I ",'B',Block.netherrack,'I',Item.stick);
		GameRegistry.addRecipe(new ItemStack(nethAxe,1),"BB ","BI "," I ",'B',Block.netherrack,'I',Item.stick);
		GameRegistry.addRecipe(new ItemStack(nethHoe,1),"BB "," I "," I ",'B',Block.netherrack,'I',Item.stick);
	}
	
	public static void toolsRed(){
		int redRow = 16;
		redSword = new Flann_ItemSword(swRedID, redRow+0, Flann_EnumToolMaterial.toolRED).setItemName("redSword");
		redSpade = new Flann_ItemSpade(spRedID, redRow+1, Flann_EnumToolMaterial.toolRED).setItemName("redSpade");
		redPick = new Flann_ItemPickaxe(piRedID, redRow+2, Flann_EnumToolMaterial.toolRED).setItemName("redPick");
		redAxe = new Flann_ItemAxe(axRedID, redRow+3, Flann_EnumToolMaterial.toolRED).setItemName("redAxe");
		redHoe = new Flann_ItemHoe(hoRedID, redRow+4, Flann_EnumToolMaterial.toolRED).setItemName("redHoe");
		MinecraftForge.setToolClass(redSpade, "shovel", 2);
		MinecraftForge.setToolClass(redPick, "pickaxe", 2);
		MinecraftForge.setToolClass(redAxe, "axe", 2);
		LanguageRegistry.addName(redSword, "Redstone Sword");
		LanguageRegistry.addName(redSpade, "Redstone Shovel");
		LanguageRegistry.addName(redPick, "Redstone Pickaxe");
		LanguageRegistry.addName(redAxe, "Redstone Axe");
		LanguageRegistry.addName(redHoe, "Redstone Hoe");
		GameRegistry.addRecipe(new ItemStack(redSword,1)," B "," B "," I ",'B',new ItemStack(FRM,1,3),'I',Item.stick);
		GameRegistry.addRecipe(new ItemStack(redSpade,1)," B "," I "," I ",'B',new ItemStack(FRM,1,3),'I',Item.stick);
		GameRegistry.addRecipe(new ItemStack(redPick,1),"BBB"," I "," I ",'B',new ItemStack(FRM,1,3),'I',Item.stick);
		GameRegistry.addRecipe(new ItemStack(redAxe,1),"BB ","BI "," I ",'B',new ItemStack(FRM,1,3),'I',Item.stick);
		GameRegistry.addRecipe(new ItemStack(redHoe,1),"BB "," I "," I ",'B',new ItemStack(FRM,1,3),'I',Item.stick);
	}
	
	public static void toolsObsid(){
		int obsidRow = 32;
		obsidSword = new Flann_ItemSword(swObsidID, obsidRow+0, Flann_EnumToolMaterial.toolOBSID).setItemName("obsidSword");
		obsidSpade = new Flann_ItemSpade(spObsidID, obsidRow+1, Flann_EnumToolMaterial.toolOBSID).setItemName("obsidSpade");
		obsidPick = new Flann_ItemPickaxe(piObsidID, obsidRow+2, Flann_EnumToolMaterial.toolOBSID).setItemName("obsidPick");
		obsidAxe = new Flann_ItemAxe(axObsidID, obsidRow+3, Flann_EnumToolMaterial.toolOBSID).setItemName("obsidAxe");
		obsidHoe = new Flann_ItemHoe(hoObsidID, obsidRow+4, Flann_EnumToolMaterial.toolOBSID).setItemName("obsidHoe");
		MinecraftForge.setToolClass(obsidSpade, "shovel", 3);
		MinecraftForge.setToolClass(obsidPick, "pickaxe", 3);
		MinecraftForge.setToolClass(obsidAxe, "axe", 3);
		LanguageRegistry.addName(obsidSword, "Obsidian Sword");
		LanguageRegistry.addName(obsidSpade, "Obsidian Shovel");
		LanguageRegistry.addName(obsidPick, "Obsidian Pickaxe");
		LanguageRegistry.addName(obsidAxe, "Obsidian Axe");
		LanguageRegistry.addName(obsidHoe, "Obsidian Hoe");
		GameRegistry.addRecipe(new ItemStack(obsidSword,1)," B "," B "," I ",'B',Block.obsidian,'I',Item.stick);
		GameRegistry.addRecipe(new ItemStack(obsidSpade,1)," B "," I "," I ",'B',Block.obsidian,'I',Item.stick);
		GameRegistry.addRecipe(new ItemStack(obsidPick,1),"BBB"," I "," I ",'B',Block.obsidian,'I',Item.stick);
		GameRegistry.addRecipe(new ItemStack(obsidAxe,1),"BB ","BI "," I ",'B',Block.obsidian,'I',Item.stick);
		GameRegistry.addRecipe(new ItemStack(obsidHoe,1),"BB "," I "," I ",'B',Block.obsidian,'I',Item.stick);
	}
	
	public static void toolsSteel(){
		int steelRow = 48;
		steelSword = new Flann_ItemSword(swSteelID, steelRow+0, Flann_EnumToolMaterial.toolSTEEL).setItemName("steelSword");
		steelSpade = new Flann_ItemSpade(spSteelID, steelRow+1, Flann_EnumToolMaterial.toolSTEEL).setItemName("steelSpade");
		steelPick = new Flann_ItemPickaxe(piSteelID, steelRow+2, Flann_EnumToolMaterial.toolSTEEL).setItemName("steelPick");
		steelAxe = new Flann_ItemAxe(axSteelID, steelRow+3, Flann_EnumToolMaterial.toolSTEEL).setItemName("steelAxe");
		steelHoe = new Flann_ItemHoe(hoSteelID, steelRow+4, Flann_EnumToolMaterial.toolSTEEL).setItemName("steelHoe");
		MinecraftForge.setToolClass(steelSpade, "shovel", 2);
		MinecraftForge.setToolClass(steelPick, "pickaxe", 2);
		MinecraftForge.setToolClass(steelAxe, "axe", 2);
		LanguageRegistry.addName(steelSword, "Steel Sword");
		LanguageRegistry.addName(steelSpade, "Steel Shovel");
		LanguageRegistry.addName(steelPick, "Steel Pickaxe");
		LanguageRegistry.addName(steelAxe, "Steel Axe");
		LanguageRegistry.addName(steelHoe, "Steel Hoe");
		GameRegistry.addRecipe(new ItemStack(steelSword,1)," B "," B "," I ",'B',new ItemStack(FRM,1,1),'I',Item.stick);
		GameRegistry.addRecipe(new ItemStack(steelSpade,1)," B "," I "," I ",'B',new ItemStack(FRM,1,1),'I',Item.stick);
		GameRegistry.addRecipe(new ItemStack(steelPick,1),"BBB"," I "," I ",'B',new ItemStack(FRM,1,1),'I',Item.stick);
		GameRegistry.addRecipe(new ItemStack(steelAxe,1),"BB ","BI "," I ",'B',new ItemStack(FRM,1,1),'I',Item.stick);
		GameRegistry.addRecipe(new ItemStack(steelHoe,1),"BB "," I "," I ",'B',new ItemStack(FRM,1,1),'I',Item.stick);
	}
	
}