package com.andrei1058.bedwars.language;

import com.andrei1058.bedwars.Main;
import com.andrei1058.bedwars.configuration.ConfigPath;
import org.bukkit.configuration.file.YamlConfiguration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static com.andrei1058.bedwars.Main.mainCmd;
import static com.andrei1058.bedwars.language.Language.addCategoryMessages;
import static com.andrei1058.bedwars.language.Language.addContentMessages;

public class English {

    public English(Language lbj, YamlConfiguration yml) {
        yml.addDefault(Messages.PREFIX, "");
        yml.options().copyDefaults(true);
        yml.addDefault("name", "English");

        yml.addDefault(Messages.COMMAND_MAIN, Arrays.asList("", "&2▪ &7/" + mainCmd + " stats", "&2▪ &7/" + mainCmd + " join &o<arena/group>", "&2▪ &7/" + mainCmd + " leave", "&2▪ &7/" + mainCmd + " lang", "&2▪ &7/" + mainCmd + " gui", "&2▪ &7/" + mainCmd + " start &3(vip)"));
        yml.addDefault(Messages.COMMAND_LANG_LIST_HEADER, "{prefix} &2Available languages:");
        yml.addDefault(Messages.COMMAND_LANG_LIST_FORMAT, "&a▪  &7{iso} - &f{name}");
        yml.addDefault(Messages.COMMAND_LANG_USAGE, "{prefix}&7Usage: /lang &f&o<iso>");
        yml.addDefault(Messages.COMMAND_LANG_SELECTED_NOT_EXIST, "{prefix}&cThis language doesn't exist!");
        yml.addDefault(Messages.COMMAND_LANG_SELECTED_SUCCESSFULLY, "{prefix}&aLanguage changed!");
        yml.addDefault(Messages.COMMAND_LANG_USAGE_DENIED, "{prefix}&cYou can't change the language during the game.");
        yml.addDefault(Messages.COMMAND_JOIN_USAGE, "§a▪ §7Usage: /" + mainCmd + " join §o<arena/group>");
        yml.addDefault(Messages.COMMAND_JOIN_GROUP_OR_ARENA_NOT_FOUND, "{prefix}&cThere isn't any arena or arena group called: {name}");
        yml.addDefault(Messages.COMMAND_JOIN_DENIED_IS_FULL, "{prefix}&cThis arena is full!\n&aPlease consider donating for more features. &7&o(click)");
        yml.addDefault(Messages.COMMAND_JOIN_NO_EMPTY_FOUND, "{prefix}&cThere isn't any arena available right now ;(");
        yml.addDefault(Messages.COMMAND_JOIN_DENIED_IS_FULL_OF_VIPS, "{prefix}&cWe apologise but this arena is full.\n&cWe know you're a donor but actually this arena is full of staff or/and donors.");
        yml.addDefault(Messages.COMMAND_JOIN_DENIED_PARTY_TOO_BIG, "{prefix}&cYour party is too big for joining this arena as a team :(");
        yml.addDefault(Messages.COMMAND_JOIN_DENIED_NOT_PARTY_LEADER, "{prefix}&cOnly the leader can choose the arena.");
        yml.addDefault(Messages.COMMAND_JOIN_PLAYER_JOIN_MSG, "{prefix}&7{player} &ehas joined (&b{on}&e/&b{max}&e)!");
        yml.addDefault(Messages.COMMAND_JOIN_SPECTATOR_MSG, "{prefix}§6You are now spectating §9{arena}§6.\n{prefix}§eYou can leave the arena at any time doing §c/leave§e.");
        yml.addDefault(Messages.COMMAND_JOIN_SPECTATOR_DENIED_MSG, "&cSpectators are not allowed in this arena!");
        yml.addDefault(Messages.REJOIN_NO_ARENA, "{prefix}&cThere is no arena to rejoin!");
        yml.addDefault(Messages.REJOIN_DENIED, "{prefix}&cYou can't rejoin the arena anymore. Game ended or bed destroyed.");
        yml.addDefault(Messages.REJOIN_ALLOWED, "{prefix}&eJoining arena &a{arena}&e!");
        yml.addDefault(Messages.COMMAND_REJOIN_PLAYER_RECONNECTED, "{prefix}&7{player} &ehas reconnected!");
        yml.addDefault(Messages.COMMAND_LEAVE_DENIED_NOT_IN_ARENA, "{prefix}&cYou're not in arena!");
        yml.addDefault(Messages.COMMAND_LEAVE_MSG, "{prefix}&7{player} &ehas quit!");
        yml.addDefault(Messages.COMMAND_NOT_ALLOWED_IN_GAME, "{prefix}&cYou can't do this during the game.");
        yml.addDefault(Messages.COMMAND_NOT_FOUND_OR_INSUFF_PERMS, "{prefix}&cCommand not found or you don't have permission!");
        yml.addDefault(Messages.COMMAND_PARTY_HELP, Arrays.asList("&6▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬",
                "&aParty Commands:", "&e/party help &7- &bPrints this help message", "&e/party invite <player> &7- &bInvites the player to your party",
                "&e/party leave &7- &bLeaves the current party",
                "&e/party remove <player> &7- &bRemove the player from the party",
                "&e/party accept <player> &7- &bAccept a party invite", "&e/party disband &7- &bDisbands the party"));
        yml.addDefault(Messages.COMMAND_PARTY_INVITE_USAGE, "{prefix}&eUsage: &7/party invite <player>");
        yml.addDefault(Messages.COMMAND_PARTY_INVITE_DENIED_PLAYER_OFFLINE, "{prefix}&7{player} &eis not online!");
        yml.addDefault(Messages.COMMAND_PARTY_INVITE_SENT, "{prefix}&eInvite sent to &7{player}&6.");
        yml.addDefault(Messages.COMMAND_PARTY_INVITE_SENT_TARGET_RECEIVE_MSG, "{prefix}&b{player} &ehas invited you to a party! &o&7(Click to accept)");
        yml.addDefault(Messages.COMMAND_PARTY_INVITE_DENIED_CANNOT_INVITE_YOURSELF, "{prefix}&cYou cannot invite yourself!");
        yml.addDefault(Messages.COMMAND_PARTY_INVITE_DENIED_PLAYER_OFFLINE, "{prefix}&7{player} &eis offline!");
        yml.addDefault(Messages.COMMAND_PARTY_ACCEPT_DENIED_NO_INVITE, "{prefix}&cThere's no party requests to accept");
        yml.addDefault(Messages.COMMAND_PARTY_ACCEPT_DENIED_ALREADY_IN_PARTY, "{prefix}&eYou're already in a party!");
        yml.addDefault(Messages.COMMAND_PARTY_INSUFFICIENT_PERMISSIONS, "{prefix}&cOnly the party owner can do this!");
        yml.addDefault(Messages.COMMAND_PARTY_ACCEPT_USAGE, "{prefix}&eUsage: &7/party accept <player>");
        yml.addDefault(Messages.COMMAND_PARTY_ACCEPT_SUCCESS, "{prefix}&7{player} &ehas joined the party!");
        yml.addDefault(Messages.COMMAND_PARTY_GENERAL_DENIED_NOT_IN_PARTY, "{prefix}&cYou're not in a party!");
        yml.addDefault(Messages.COMMAND_PARTY_LEAVE_DENIED_IS_OWNER_NEEDS_DISBAND, "{prefix}&cYou can't leave your own party!\n&eTry using: &b/party disband");
        yml.addDefault(Messages.COMMAND_PARTY_LEAVE_SUCCESS, "{prefix}&7{player} &ehas leaved the party!");
        yml.addDefault(Messages.COMMAND_PARTY_DISBAND_SUCCESS, "{prefix}&eParty disbanded!");
        yml.addDefault(Messages.COMMAND_PARTY_REMOVE_USAGE, "{prefix}&7Usage: &e/party remove <player>");
        yml.addDefault(Messages.COMMAND_PARTY_REMOVE_SUCCESS, "{prefix}&7{player} &ewas removed from the party,");
        yml.addDefault(Messages.COMMAND_PARTY_REMOVE_DENIED_TARGET_NOT_PARTY_MEMBER, "{prefix}&7{player} &eis not in your party!");
        yml.addDefault(Messages.COMMAND_FORCESTART_NOT_IN_GAME, "§c▪ §7You're not playing!");
        yml.addDefault(Messages.COMMAND_FORCESTART_SUCCESS, "§c▪ §7Countdown shortened!");
        yml.addDefault(Messages.COMMAND_FORCESTART_NO_PERM, "{prefix}&7You can't forcestart the arena.\n§7Please consider donating for VIP features.");
        yml.addDefault(Messages.COMMAND_COOLDOWN, "&cYou can't do that yet! Wait {seconds} more seconds!");
        yml.addDefault(Messages.ARENA_JOIN_VIP_KICK, "{prefix}&cSorry, but you were kicked out because a donor joined the arena.\n&aPlease consider donating for more features. &7&o(click)");
        yml.addDefault(Messages.ARENA_START_COUNTDOWN_STOPPED_INSUFF_PLAYERS, "{prefix}§cThere aren't enough players! Countdown stopped!");
        yml.addDefault(Messages.ARENA_RESTART_PLAYER_KICK, "{prefix}&eThe arena you were in is restarting.");
        yml.addDefault(Messages.ARENA_STATUS_PLAYING_NAME, "&cPlaying");
        yml.addDefault(Messages.ARENA_STATUS_RESTARTING_NAME, "&4Restarting");
        yml.addDefault(Messages.ARENA_STATUS_WAITING_NAME, "&2Waiting §c{full}");
        yml.addDefault(Messages.ARENA_STATUS_STARTING_NAME, "&6Starting §c{full}");
        yml.addDefault(Messages.ARENA_GUI_INV_NAME, "&8Click to join");
        yml.addDefault(Messages.ARENA_GUI_ARENA_CONTENT_NAME, "&a&l{name}");
        yml.addDefault(Messages.ARENA_GUI_ARENA_CONTENT_LORE, Arrays.asList("", "&7Status: {status}", "&7Players: &f{on}&7/&f{max}", "&7Type: &a{group}", "", "&aLeft-Click to join.", "&eRight-Click to spectate."));
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN, "{prefix}&eThe game starts in &6{time} &eseconds!");
        yml.addDefault(Messages.ARENA_STATUS_START_PLAYER_TITLE, "&aGO");
        yml.addDefault(Messages.ARENA_STATUS_START_PLAYER_TUTORIAL, Arrays.asList("&a▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬",
                "&f                                   &lBedWars", "",
                "&e&l    Protect your bed and destroy the enemy beds.",
                "&e&l      Upgrade yourself and your team by collecting",
                "&e&l   Iron, Gold, Emerald, and Diamond from generators",
                "&e&l             to access powerful upgrades.", "",
                "&a▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬"));
        yml.addDefault(Messages.ARENA_JOIN_DENIED_SELECTOR, "{prefix}&cSorry but you can't join this arena at this moment. Use Right-Click to spectate!");
        yml.addDefault(Messages.ARENA_SPECTATE_DENIED_SELECTOR, "{prefix}&cSorry but you can't spectate this arena at this moment. Use Left-Click to join!");
        yml.addDefault(Messages.ARENA_SPECTATOR_TELEPORTER_GUI_NAME, "&8Teleporter");
        yml.addDefault(Messages.ARENA_SPECTATOR_TELEPORTER_GUI_HEAD_NAME, "{prefix}{player}");
        yml.addDefault(Messages.ARENA_SPECTATOR_TELEPORTER_GUI_HEAD_LORE, Arrays.asList("&7Health: &f{health}%", "&7Food: &f{food}", "", "&7Left-click to spectate"));
        yml.addDefault(Messages.ARENA_SPECTATOR_LEAVE_ITEM_NAME, "&c&lReturn to lobby");
        yml.addDefault(Messages.ARENA_SPECTATOR_LEAVE_ITEM_LORE, Collections.singletonList("&7Right-click to leave to the lobby!"));
        yml.addDefault(Messages.ARENA_SPECTATOR_FIRST_PERSON_ENTER_TITLE, "&aSpectating &7{player}");
        yml.addDefault(Messages.ARENA_SPECTATOR_FIRST_PERSON_ENTER_SUBTITLE, "&cSNEAK to exit");
        yml.addDefault(Messages.ARENA_SPECTATOR_FIRST_PERSON_LEAVE_TITLE, "&eExiting Spectator mode");
        yml.addDefault(Messages.ARENA_SPECTATOR_FIRST_PERSON_LEAVE_SUBTITLE, "");
        yml.addDefault(Messages.ARENA_LEAVE_PARTY_DISBANDED, "{prefix}§cThe party owner has left and the party was disbanded!");
        yml.addDefault(Messages.GENERATOR_HOLOGRAM_TIER, "&eTier &c{tier}");
        yml.addDefault(Messages.GENERATOR_HOLOGRAM_TYPE_DIAMOND, "&b&lDiamond");
        yml.addDefault(Messages.GENERATOR_HOLOGRAM_TYPE_EMERALD, "&a&lEmerald");
        yml.addDefault(Messages.GENERATOR_HOLOGRAM_TIMER, "&eSpawns in &c{seconds} &eseconds");
        yml.addDefault(Messages.GENERATOR_UPGRADE_CHAT_ANNOUNCEMENT, "{prefix}{generatorType} Generators &ehave been upgraded to Tier &c{tier}");
        yml.addDefault(Messages.FORMATTING_CHAT_LOBBY, "{vPrefix}&7{player}{vSuffix}: {message}");
        yml.addDefault(Messages.FORMATTING_CHAT_WAITING, "{vPrefix}&7{player}{vSuffix}: {message}");
        yml.addDefault(Messages.FORMATTING_CHAT_SHOUT, "{vPrefix}&6[SHOUT] {team} &7{player}&f{vSuffix}: {message}");
        yml.addDefault(Messages.FORMATTING_CHAT_TEAM, "{vPrefix}&f{level}{team}&7 {player}{vSuffix} {message}");
        yml.addDefault(Messages.FORMATTING_CHAT_SPECTATOR, "{vPrefix}&7[SPECTATOR] {player}{vSuffix}: {message}");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_DATE, "dd/MM/yy");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_TEAM_ELIMINATED, "&c&l✘");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_BED_DESTROYED, "&a{remainingPlayers}");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_TEAM_ALIVE, "&a&l✓");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_NEXEVENT_TIMER, "mm:ss");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_YOUR_TEAM, "&7 (You)");
        yml.addDefault(Messages.FORMATTING_ACTION_BAR_TRACKING, "&fTracking: {team} &f- Distance: {distance}m");
        yml.addDefault(Messages.FORMATTING_TEAM_WINNER_FORMAT, "      {TeamColor}{TeamName} &7- {members}");
        yml.addDefault(Messages.FORMATTING_SOLO_WINNER_FORMAT, "                 {TeamColor}{TeamName} &7- {members}");
        yml.addDefault(Messages.FORMATTING_GENERATOR_TIER1, "I");
        yml.addDefault(Messages.FORMATTING_GENERATOR_TIER2, "II");
        yml.addDefault(Messages.FORMATTING_GENERATOR_TIER3, "III");
        yml.addDefault(Messages.FORMATTING_DESPAWNABLE_UTILITY_NPC_HEALTH, "▮ ");
        yml.addDefault(Messages.FORMATTING_STATS_DATE_FORMAT, "yyyy/MM/dd HH:mm");
        yml.addDefault(Messages.FORMAT_PAPI_PLAYER_TEAM_TEAM, "{TeamColor}[{TeamName}]");
        yml.addDefault(Messages.FORMAT_PAPI_PLAYER_TEAM_SHOUT, "&6[SHOUT]");
        yml.addDefault(Messages.FORMAT_PAPI_PLAYER_TEAM_SPECTATOR, "&7[SPECTATOR]");
        yml.addDefault(Messages.MEANING_FULL, "Full");
        yml.addDefault(Messages.MEANING_SHOUT, "shout");
        yml.addDefault(Messages.MEANING_NOBODY, "Nobody");
        yml.addDefault(Messages.MEANING_NEVER, "Never");
        yml.addDefault(Messages.MEANING_IRON_SINGULAR, "Iron");
        yml.addDefault(Messages.MEANING_IRON_PLURAL, "Iron");
        yml.addDefault(Messages.MEANING_GOLD_SINGULAR, "Gold");
        yml.addDefault(Messages.MEANING_GOLD_PLURAL, "Gold");
        yml.addDefault(Messages.MEANING_EMERALD_SINGULAR, "Emerald");
        yml.addDefault(Messages.MEANING_EMERALD_PLURAL, "Emeralds");
        yml.addDefault(Messages.MEANING_DIAMOND_SINGULAR, "Diamond");
        yml.addDefault(Messages.MEANING_DIAMOND_PLURAL, "Diamonds");
        yml.addDefault(Messages.MEANING_VAULT_SINGULAR, "$");
        yml.addDefault(Messages.MEANING_VAULT_PLURAL, "$");
        yml.addDefault(Messages.INTERACT_CANNOT_PLACE_BLOCK, "{prefix}&cYou can't place blocks here!");
        yml.addDefault(Messages.INTERACT_CANNOT_BREAK_BLOCK, "{prefix}&cYou can only break blocks placed by a player!");
        yml.addDefault(Messages.INTERACT_CANNOT_BREAK_OWN_BED, "&cYou can't destroy your own bed!");
        yml.addDefault(Messages.INTERACT_BED_DESTROY_CHAT_ANNOUNCEMENT, "\n&f&lBED DESTRUCTION > {TeamColor}{TeamName} Bed &7was deep fried by {PlayerColor}{PlayerName}&7!\n");
        yml.addDefault(Messages.INTERACT_BED_DESTROY_TITLE_ANNOUNCEMENT, "&cBED DESTROYED!");
        yml.addDefault(Messages.INTERACT_BED_DESTROY_SUBTITLE_ANNOUNCEMENT, "&fYou will no longer respawn!");
        yml.addDefault(Messages.INTERACT_BED_DESTROY_CHAT_ANNOUNCEMENT_TO_VICTIM, "&f&lBED DESTRUCTION > &7Your bed was iced by {PlayerColor}{PlayerName}&7!");
        yml.addDefault(Messages.INTERACT_CHEST_CANT_OPEN_TEAM_ELIMINATED, "&cYou can't open this chest because this team was eliminated!");
        yml.addDefault(Messages.PLAYER_DIE_VOID_FALL_REGULAR_KILL, "{PlayerColor}{PlayerName} &7fell into the void.");
        yml.addDefault(Messages.PLAYER_DIE_VOID_FALL_FINAL_KILL, "{PlayerColor}{PlayerName} &7fell into the void. &b&lFINAL KILL!");
        yml.addDefault(Messages.PLAYER_DIE_KNOCKED_IN_VOID_REGULAR_KILL, "{PlayerColor}{PlayerName} &7was knocked into the void by {KillerColor}{KillerName}&7.");
        yml.addDefault(Messages.PLAYER_DIE_KNOCKED_IN_VOID_FINAL_KILL, "{PlayerColor}{PlayerName} &7was knocked into the void by {KillerColor}{KillerName}&7. &b&lFINAL KILL!");
        yml.addDefault(Messages.PLAYER_DIE_EXPLOSION_WITH_SOURCE_REGULAR_KILL, "{PlayerColor}{PlayerName} &7was hit off by a love bomb from {KillerColor}{KillerName}&7.");
        yml.addDefault(Messages.PLAYER_DIE_EXPLOSION_WITH_SOURCE_FINAL_KILL, "{PlayerColor}{PlayerName} &7was hit off by a love bomb from {KillerColor}{KillerName}&7. &b&lFINAL KILL!");
        yml.addDefault(Messages.PLAYER_DIE_EXPLOSION_WITHOUT_SOURCE_REGULAR, "{PlayerColor}{PlayerName} &7was hit off by a bomb.");
        yml.addDefault(Messages.PLAYER_DIE_EXPLOSION_WITHOUT_SOURCE_FINAL_KILL, "{PlayerColor}{PlayerName} &7was hit off by a bomb. &b&lFINAL KILL!");
        yml.addDefault(Messages.PLAYER_DIE_PVP_REGULAR_KILL, "{PlayerColor}{PlayerName} &7was killed by {KillerColor}{KillerName}&7.");
        yml.addDefault(Messages.PLAYER_DIE_PVP_FINAL_KILL, "{PlayerColor}{PlayerName} &7was killed by {KillerColor}{KillerName}&7. &b&lFINAL KILL!");
        yml.addDefault(Messages.PLAYER_DIE_UNKNOWN_REASON_REGULAR, "{PlayerColor}{PlayerName} &7died.");
        yml.addDefault(Messages.PLAYER_DIE_UNKNOWN_REASON_FINAL_KILL, "{PlayerColor}{PlayerName} &7died. &b&lFINAL KILL!");
        yml.addDefault(Messages.PLAYER_DIE_SHOOT_REGULAR, "{PlayerColor}{PlayerName} &7was shoot by {KillerColor}{KillerName}&7!");
        yml.addDefault(Messages.PLAYER_DIE_SHOOT_FINAL_KILL, "{PlayerColor}{PlayerName} &7was shoot by {KillerColor}{KillerName}&7! &b&lFINAL KILL!");
        yml.addDefault(Messages.PLAYER_DIE_DEBUG_REGULAR, "{PlayerColor}{PlayerName} &7was killed by {KillerColor}{KillerTeamName}'s &7BedBug!");
        yml.addDefault(Messages.PLAYER_DIE_DEBUG_FINAL_KILL, "{PlayerColor}{PlayerName} &7was killed by {KillerColor}{KillerTeamName}'s &7BedBug! &b&lFINAL KILL!");
        yml.addDefault(Messages.PLAYER_DIE_IRON_GOLEM_REGULAR, "{PlayerColor}{PlayerName} &7was killed by {KillerColor}{KillerTeamName}'s &7Iron Golem!");
        yml.addDefault(Messages.PLAYER_DIE_IRON_GOLEM_FINAL_KILL, "{PlayerColor}{PlayerName} &7was killed by {KillerColor}{KillerTeamName}'s &7Iron Golem! &b&lFINAL KILL!");
        yml.addDefault(Messages.PLAYER_DIE_REWARD_DIAMOND, "{prefix}&b+{amount} {meaning}");
        yml.addDefault(Messages.PLAYER_DIE_REWARD_EMERALD, "{prefix}&a+{amount} {meaning}");
        yml.addDefault(Messages.PLAYER_DIE_REWARD_IRON, "{prefix}&f+{amount} {meaning}");
        yml.addDefault(Messages.PLAYER_DIE_REWARD_GOLD, "{prefix}&6+{amount} {meaning}");
        yml.addDefault(Messages.PLAYER_DIE_RESPAWN_TITLE, "&cYOU DIED!");
        yml.addDefault(Messages.PLAYER_DIE_RESPAWN_SUBTITLE, "&eYou will respawn in &c{time} &eseconds!");
        yml.addDefault(Messages.PLAYER_DIE_RESPAWN_CHAT, "{prefix}&eYou will respawn in &c{time} &eseconds!");
        yml.addDefault(Messages.PLAYER_DIE_RESPAWNED_TITLE, "&aRESPAWNED!");
        yml.addDefault(Messages.PLAYER_DIE_ELIMINATED_CHAT, "{prefix}&cYou have been eliminated!");
        yml.addDefault(Messages.GAME_END_GAME_OVER_PLAYER_TITLE, "&c&lGAME OVER!");
        yml.addDefault(Messages.GAME_END_VICTORY_PLAYER_TITLE, "&6&lVICTORY!");
        yml.addDefault(Messages.GAME_END_TEAM_WON_CHAT, "{prefix}{TeamColor}{TeamName} &ahas won the game!");
        yml.addDefault(Messages.GAME_END_TOP_PLAYER_CHAT, Arrays.asList("&a▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬",
                "&f                                   &lBedWars", "", "{winnerFormat}", "", "",
                "&e                          &l1st Killer &7- {firstName} - {firstKills}",
                "&6                          &l2nd Killer &7- {secondName} - {secondKills}",
                "&c                          &l3rd Killer &7- {thirdName} - {thirdKills}", "",
                "&a▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬"));
        yml.addDefault(Messages.BED_HOLOGRAM_DEFEND, "&c&lDefend your bed!");
        yml.addDefault(Messages.BED_HOLOGRAM_DESTROYED, "&c&lYour bed was destroyed!");
        yml.addDefault(Messages.NPC_NAME_TEAM_UPGRADES, "&e&lTEAM,&E&LUPGRADES");
        yml.addDefault(Messages.NPC_NAME_SOLO_UPGRADES, "&e&lSOLO,&E&LUPGRADES");
        yml.addDefault(Messages.NPC_NAME_TEAM_SHOP, "&e&lITEM SHOP");
        yml.addDefault(Messages.NPC_NAME_SOLO_SHOP, "&e&lITEM SHOP");
        yml.addDefault(Messages.TEAM_ELIMINATED_CHAT, "\n&f&lTEAM ELIMINATED > {TeamColor}{TeamName} Team &chas been eliminated!\n");
        yml.addDefault(Messages.NEXT_EVENT_BEDS_DESTROY, "&cBeds Destruction");
        yml.addDefault(Messages.NEXT_EVENT_DIAMOND_UPGRADE_II, "&fDiamond II");
        yml.addDefault(Messages.NEXT_EVENT_DIAMOND_UPGRADE_III, "&fDiamond III");
        yml.addDefault(Messages.NEXT_EVENT_DRAGON_SPAWN, "&fSudden Death");
        yml.addDefault(Messages.NEXT_EVENT_EMERALD_UPGRADE_II, "&fEmerald II");
        yml.addDefault(Messages.NEXT_EVENT_EMERALD_UPGRADE_III, "&fEmerald III");
        yml.addDefault(Messages.NEXT_EVENT_GAME_END, "&4Game End");
        yml.addDefault(Messages.NEXT_EVENT_TITLE_ANNOUNCE_BEDS_DESTROYED, "&cBED DESTROYED!");
        yml.addDefault(Messages.NEXT_EVENT_SUBTITLE_ANNOUNCE_BEDS_DESTROYED, "&fAll beds have been destroyed!");
        yml.addDefault(Messages.NEXT_EVENT_CHAT_ANNOUNCE_BEDS_DESTROYED, "&c&lAll beds have been destroyed!");
        yml.addDefault(Messages.NEXT_EVENT_TITLE_ANNOUNCE_SUDDEN_DEATH, "&cSudden Death");
        yml.addDefault(Messages.NEXT_EVENT_SUBTITLE_ANNOUNCE_SUDDEN_DEATH, "");
        yml.addDefault(Messages.NEXT_EVENT_CHAT_ANNOUNCE_SUDDEN_DEATH, "&cSUDDEN DEATH: &6&b{TeamDragons} {TeamColor}{TeamName} Dragon!");
        yml.addDefault("xp-reward-per-minute", "{prefix}&6+{xp} BedWars Experience Received (Play Time).");

        /* Lobby Command Items */
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_NAME.replace("%path%", "stats"), "&eStats");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_LORE.replace("%path%", "stats"), Collections.singletonList("&fRight-click to see your stats!"));
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_NAME.replace("%path%", "arena-selector"), "&eArena Selector");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_LORE.replace("%path%", "arena-selector"), Collections.singletonList("&fRight-click to choose an arena!"));
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_NAME.replace("%path%", "leave"), "&eBack to Hub");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_LORE.replace("%path%", "leave"), Collections.singletonList("&fRight-click to leave BedWars!"));
        /* Pre Game Command Items */
        yml.addDefault(Messages.GENERAL_CONFIGURATION_WAITING_ITEMS_NAME.replace("%path%", "stats"), "&eStats");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_WAITING_ITEMS_LORE.replace("%path%", "stats"), Collections.singletonList("&fRight-click to see your stats!"));
        yml.addDefault(Messages.GENERAL_CONFIGURATION_WAITING_ITEMS_NAME.replace("%path%", "leave"), "&eBack to Lobby");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_WAITING_ITEMS_LORE.replace("%path%", "leave"), Collections.singletonList("&fRight-click to leave the arena!"));
        /* Spectator Command Items */
        yml.addDefault(Messages.GENERAL_CONFIGURATION_SPECTATOR_ITEMS_NAME.replace("%path%", "teleporter"), "&eTeleporter");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_SPECTATOR_ITEMS_NAME.replace("%path%", "leave"), "&eBack to Lobby");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_SPECTATOR_ITEMS_LORE.replace("%path%", "leave"), Collections.singletonList("&fRight-click to leave the arena!"));

        yml.addDefault(Messages.TRAP_ENEMY_BASE_ENTER_ACTION, "&cTRAP TRIGGERED!");
        yml.addDefault(Messages.TRAP_ENEMY_BASE_ENTER_CHAT, "{prefix}&cTRAP TRIGGERED!");
        yml.addDefault(Messages.TRAP_ENEMY_BASE_ENTER_SUBTITLE, "&fYour trap has been set off!");
        yml.addDefault(Messages.TRAP_ENEMY_BASE_ENTER_TITLE, "&cTRAP TRIGGERED!");

        /* save default items messages for stats gui */
        yml.addDefault(Messages.PLAYER_STATS_GUI_INV_NAME, "{player} Stats");
        lbj.addDefaultStatsMsg(yml, "wins", "&6Wins", "&f{wins}");
        lbj.addDefaultStatsMsg(yml, "losses", "&6Losses", "&f{losses}");
        lbj.addDefaultStatsMsg(yml, "kills", "&6Kills", "&f{kills}");
        lbj.addDefaultStatsMsg(yml, "deaths", "&6Deaths", "&f{deaths}");
        lbj.addDefaultStatsMsg(yml, "final-kills", "&6Final Kills", "&f{finalKills}");
        lbj.addDefaultStatsMsg(yml, "final-deaths", "&6Final Deaths", "&f{finalDeaths}");
        lbj.addDefaultStatsMsg(yml, "beds-destroyed", "&6Beds Destroyed", "&f{bedsDestroyed}");
        lbj.addDefaultStatsMsg(yml, "first-play", "&6First Play", "&f{firstPlay}");
        lbj.addDefaultStatsMsg(yml, "last-play", "&6Last Play", "&f{lastPlay}");
        lbj.addDefaultStatsMsg(yml, "games-played", "&6Games Played", "&f{gamesPlayed}");

        yml.addDefault(Messages.SCOREBOARD_DEFAULT_STARTING, Arrays.asList("&f&lBED WARS", "", "&fMap: &a{map}", "&fPlayer: &a{on}/{max}", "", "&fStarting in &a{time}s", "", "§fServer: &a{server}", "", "&e  {server_ip}"));
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_WAITING, Arrays.asList("&f&lBED WARS", "", "&fMap: &a{map}", "&fPlayer: &a{on}/{max}", "", "&fWaiting...", "", "§fServer: &a{server}", "", "&e  {server_ip}"));
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_PLAYING, Arrays.asList("&e&lBED WARS", "&7{date}", "", "&f{nextEvent}", "&a{time}", "", "{TeamRedColor}&lR&f {TeamRedName}&f: {TeamRedStatus}",
                "{TeamBlueColor}&lB&f {TeamBlueName}&f: {TeamBlueStatus}", "{TeamGreenColor}&lG&f {TeamGreenName}&f: {TeamGreenStatus}", "{TeamYellowColor}&lY &f{TeamYellowName}&f: {TeamYellowStatus}", "",
                "&fKills: &a{kills}", "&fFinal Kills: &a{finalKills}", "&fBeds Broken: &a{beds}", "", "&e{server_ip}"));
        yml.addDefault("scoreboard.Solo.playing", Arrays.asList("&e&lBED WARS", "&7{date}", "", "&f{nextEvent}", "&a{time}", "", "{TeamRedColor}&lR&f {TeamRedName}&f: {TeamRedStatus}",
                "{TeamBlueColor}&lB&f {TeamBlueName}&f: {TeamBlueStatus}", "{TeamGreenColor}&lG&f {TeamGreenName}&f: {TeamGreenStatus}", "{TeamYellowColor}&lY &f{TeamYellowName}&f: {TeamYellowStatus}",
                "{TeamAquaColor}&lA&f {TeamAquaName}&f: {TeamAquaStatus}", "{TeamWhiteColor}&lW&f {TeamWhiteName}&f: {TeamWhiteStatus}", "{TeamPinkColor}&lP&f {TeamPinkName}&f: {TeamPinkStatus}", "{TeamGrayColor}&lG&f {TeamGrayName}&f: {TeamGrayStatus}", "", "&ehttp://andrei1058.com"));
        yml.addDefault("scoreboard.Doubles.playing", Arrays.asList("&e&lBED WARS", "&7{date}", "", "&f{nextEvent}", "&a{time}", "", "{TeamRedColor}&lR&f {TeamRedName}&f: {TeamRedStatus}",
                "{TeamBlueColor}&lB&f {TeamBlueName}&f: {TeamBlueStatus}", "{TeamGreenColor}&lG&f {TeamGreenName}&f: {TeamGreenStatus}", "{TeamYellowColor}&lY &f{TeamYellowName}&f: {TeamYellowStatus}",
                "{TeamAquaColor}&lA&f {TeamAquaName}&f: {TeamAquaStatus}", "{TeamWhiteColor}&lW&f {TeamWhiteName}&f: {TeamWhiteStatus}", "{TeamPinkColor}&lP&f {TeamPinkName}&f: {TeamPinkStatus}", "{TeamGrayColor}&lG&f {TeamGrayName}&f: {TeamGrayStatus}", "", "&ehttp://andrei1058.com"));
        yml.addDefault(Messages.SCOREBOARD_LOBBY, Arrays.asList("&6&lBedWars", "&fYour Level: {level}", "", "&fProgress: &a{currentXp}&7/&b{requiredXp}", "{progress}", "", "&7{player}", "", "&fCoins: &a{money}"
                , "", "&fTotal Wins: &a{wins}", "&fTotal Kills: &a{kills}", "", "&e{server_ip}"));

        //
        yml.addDefault(Messages.SHOP_INDEX_NAME, "&8Quick Buy");
        yml.addDefault(Messages.SHOP_INSUFFICIENT_MONEY, "{prefix}&cYou don't have enough {currency}! Need {amount} more!");
        yml.addDefault(Messages.SHOP_NEW_PURCHASE, "{prefix}&aYou purchased &6{item}");
        yml.addDefault(Messages.SHOP_ALREADY_BOUGHT, "{prefix}&cYou've already bought that!");
        yml.addDefault(Messages.SHOP_UTILITY_NPC_SILVERFISH_NAME, "{TeamColor}&l{TeamName} &r{TeamColor}Silverfish");
        yml.addDefault(Messages.SHOP_UTILITY_NPC_IRON_GOLEM_NAME, "{TeamColor}{despawn}s &8[ {TeamColor}{health}&8]");
        yml.addDefault(Messages.SHOP_SEPARATOR_NAME, "&8⇧ Categories");
        yml.addDefault(Messages.SHOP_SEPARATOR_LORE, Collections.singletonList("&8⇩ Items"));
        yml.addDefault(Messages.SHOP_QUICK_BUY_NAME, "&bQuick Buy");
        yml.addDefault(Messages.SHOP_QUICK_BUY_LORE, new ArrayList<>());
        yml.addDefault(Messages.SHOP_QUICK_EMPTY_NAME, "&cEmpty slot!");
        yml.addDefault(Messages.SHOP_QUICK_EMPTY_LORE, Arrays.asList("&7This is a Quick Buy Slot!", "&bSneak Click &7any item in", "&7the shop to add it here."));
        yml.addDefault(Messages.SHOP_CAN_BUY_COLOR, "&a");
        yml.addDefault(Messages.SHOP_CANT_BUY_COLOR, "&c");
        yml.addDefault(Messages.SHOP_LORE_STATUS_CAN_BUY, "&eClick to purchase!");
        yml.addDefault(Messages.SHOP_LORE_STATUS_CANT_AFFORD, "&cYou don't have enough {currency}!");
        yml.addDefault(Messages.SHOP_LORE_STATUS_MAXED, "&aMAXED!");
        yml.addDefault(Messages.SHOP_LORE_QUICK_ADD, "&bSneak Click to add to Quick Buy");
        yml.addDefault(Messages.SHOP_LORE_QUICK_REMOVE, "&bSneak Click to remove from Quick Buy!");


        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "&8Blocks", "&aBlocks", Collections.singletonList("&eClick to view!"));

        addContentMessages(yml, "wool", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Wool", Arrays.asList("&7Cost: &f{cost} {currency}", "", "&7Great for bridging across", "&7islands. Turns into your team's",
                "&7color.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "clay", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Hardened Clay", Arrays.asList("&7Cost: {cost} {currency}", "", "&7Basic block to defend your bed.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "glass", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Blast-Proof Glass", Arrays.asList("&7Cost: {cost} {currency}", "", "&7Immune to explosions.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "stone", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}End Stone", Arrays.asList("&7Cost: {cost} {currency}", "", "&7Solid block to defend your bed.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "ladder", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Ladder", Arrays.asList("&7Cost: {cost} {currency}", "", "&7Useful to save cats stuck in", "&7trees.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "obsidian", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Obsidian", Arrays.asList("&7Cost: {cost} {currency}", "", "&7Extreme protection for your bed.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "wood", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Wood", Arrays.asList("&7Cost: {cost} {currency}", "", "&7Solid block to defend your bed", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_MELEE, "&8Melee", "&aMelee", Collections.singletonList("&eClick to view!"));

        addContentMessages(yml, "stone-sword", ConfigPath.SHOP_PATH_CATEGORY_MELEE, "{color}Stone Sword", Arrays.asList("&7Cost: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "iron-sword", ConfigPath.SHOP_PATH_CATEGORY_MELEE, "{color}Iron Sword", Arrays.asList("&7Cost: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "diamond-sword", ConfigPath.SHOP_PATH_CATEGORY_MELEE, "{color}Diamond Sword", Arrays.asList("&7Cost: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "stick", ConfigPath.SHOP_PATH_CATEGORY_MELEE, "{color}Stick (KnockBack I)", Arrays.asList("&7Cost: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_ARMOR, "&8Armor", "&aArmor", Collections.singletonList("&eClick to view!"));

        addContentMessages(yml, "chainmail", ConfigPath.SHOP_PATH_CATEGORY_ARMOR, "{color}Permanent Chainmail Armor", Arrays.asList("&7Cost: {cost} {currency}",
                "", "&7Chainmail leggings and boots", "&7which you will always spawn", "&7with.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "iron-armor", ConfigPath.SHOP_PATH_CATEGORY_ARMOR, "{color}Permanent Iron Armor", Arrays.asList("&7Cost: {cost} {currency}",
                "", "&7Iron leggings and boots which", "&7you will always spawn with.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "diamond-armor", ConfigPath.SHOP_PATH_CATEGORY_ARMOR, "{color}Permanent Diamond Armor", Arrays.asList("&7Cost: {cost} {currency}",
                "", "&7Diamond leggings and boots which", "&7you will always crush with.", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_TOOLS, "&8Tools", "&aTools", Collections.singletonList("&eClick to view!"));

        addContentMessages(yml, "shears", ConfigPath.SHOP_PATH_CATEGORY_TOOLS, "{color}Permanent Shears", Arrays.asList("&7Cost: {cost} {currency}",
                "", "&7Great to get rid of wool. You", "&7will always spawn with these shears.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "pickaxe", ConfigPath.SHOP_PATH_CATEGORY_TOOLS, "{color}Pickaxe {tier}", Arrays.asList("&7Cost: {cost} {currency}", "&7Tier: &e{tier}",
                "", "&7This is an upgradable item.", "&7It will lose 1 tier upon.", "&7death!", "", "&7You will permanently", "&7respawn with at least the", "&7lowest tier.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "axe", ConfigPath.SHOP_PATH_CATEGORY_TOOLS, "{color}Axe {tier}", Arrays.asList("&7Cost: {cost} {currency}", "&7Tier: &e{tier}",
                "", "&7This is an upgradable item.", "&7It will lose 1 tier upon.", "&7death!", "", "&7You will permanently", "&7respawn with at least the", "&7lowest tier.", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_RANGED, "&8Ranged", "&aRanged", Collections.singletonList("&eClick to view!"));

        addContentMessages(yml, "arrow", ConfigPath.SHOP_PATH_CATEGORY_RANGED, "{color}Arrow", Arrays.asList("&7Cost: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "bow1", ConfigPath.SHOP_PATH_CATEGORY_RANGED, "{color}Bow", Arrays.asList("&7Cost: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "bow2", ConfigPath.SHOP_PATH_CATEGORY_RANGED, "{color}Bow (Power I)", Arrays.asList("&7Cost: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "bow3", ConfigPath.SHOP_PATH_CATEGORY_RANGED, "{color}Bow (Power I, Punch I)", Arrays.asList("&7Cost: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_POTIONS, "&8Potions", "&aPotions", Collections.singletonList("&eClick to view!"));

        addContentMessages(yml, "speed-potion", ConfigPath.SHOP_PATH_CATEGORY_POTIONS, "{color}Speed II Potion (45 seconds)", Arrays.asList("&7Cost: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "jump-potion", ConfigPath.SHOP_PATH_CATEGORY_POTIONS, "{color}Jump V Potion (45 seconds)", Arrays.asList("&7Cost: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "invisibility", ConfigPath.SHOP_PATH_CATEGORY_POTIONS, "{color}Invisibility Potion (30 seconds)", Arrays.asList("&7Cost: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "&8Utility", "&aUtility", Collections.singletonList("&eClick to view!"));

        addContentMessages(yml, "golden-apple", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Golden Apple", Arrays.asList("&7Cost: {cost} {currency}", "", "&7Well-rounded healing.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "bedbug", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}BedBug", Arrays.asList("&7Cost: {cost} {currency}", "", "&7Spawns silverfish where the",
                "&7snowball lands to distract your", "&7enemies. Lasts 15 seconds.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "dream-defender", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Dream Defender", Arrays.asList("&7Cost: {cost} {currency}", "", "&7Iron Golem to help defend your",
                "&7base. Lasts 4 minutes.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "fireball", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Fireball", Arrays.asList("&7Cost: {cost} {currency}", "", "&7Right-click to launch! Great to",
                "&7knock back enemies walking on", "&7thin bridges", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "tnt", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}TNT", Arrays.asList("&7Cost: {cost} {currency}", "", "&7Instantly ignites, appropriate",
                "&7to explode things!", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "ender-pearl", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Ender Pearl", Arrays.asList("&7Cost: {cost} {currency}", "", "&7The quickest way to invade enemy",
                "&7bases.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "water-bucket", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Water Bucket", Arrays.asList("&7Cost: {cost} {currency}", "", "&7Great to slow down approaching",
                "&7enemies. Can also protect", "against TNT.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "bridge-egg", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Bridge Egg", Arrays.asList("&7Cost: {cost} {currency}", "", "&7This egg creates a bridge in its",
                "&7trial after being thrown.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "magic-milk", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Magic Milk", Arrays.asList("&7Cost: {cost} {currency}", "", "&7Avoid triggering traps for 60",
                "&7seconds after consuming.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "sponge", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Sponge", Arrays.asList("&7Cost: {cost} {currency}", "", "&7Great for soaking up water.",
                "", "{quick_buy}", "{buy_status}"));

        yml.addDefault(Messages.UPGRADES_LORE_REPLACEMENT_CLICK_TO_BUY, "&aClick to purchase!");
        yml.addDefault(Messages.UPGRADES_LORE_REPLACEMENT_INSUFFICIENT_MONEY, "&cYou don't have enough {currency}");
        yml.addDefault(Messages.UPGRADES_LORE_REPLACEMENT_LOCKED, "&cLOCKED");
        yml.addDefault(Messages.UPGRADES_LORE_REPLACEMENT_UNLOCKED, "&aUNLOCKED");
        yml.addDefault(Messages.UPGRADES_UPGRADE_BOUGHT_CHAT, "&a{player} purchased &6{upgradeName}");

        yml.addDefault("upgrades.Default.generators.tier1.name", "&eIron Forge");
        yml.addDefault("upgrades.Default.generators.tier1.lore", Arrays.asList("&7Increases the spawn rate of Iron", "&7and Gold by 50%..", "", "&7Cost:&b {cost} {currency}", "", "{loreFooter}"));
        yml.addDefault("upgrades.Default.generators.tier2.name", "&eGolden Forge");
        yml.addDefault("upgrades.Default.generators.tier2.lore", Arrays.asList("&7Increases the spawn rate of Iron", "&7and Gold by 100%..", "", "&7Cost:&b {cost} {currency}", "", "{loreFooter}"));
        yml.addDefault("upgrades.Default.generators.tier3.name", "&eEmerald Forge");
        yml.addDefault("upgrades.Default.generators.tier3.lore", Arrays.asList("&7Activates the Emerald spawner in", "&7your team's Forge.", "", "&7Cost:&b {cost} {currency}", "", "{loreFooter}"));
        yml.addDefault("upgrades.Default.maniacMiner.tier1.name", "&eManiac Miner");
        yml.addDefault("upgrades.Default.maniacMiner.tier1.lore", Arrays.asList("&7All players on your team", "&7permanently gain Haste I", "", "&7Cost:&b {cost} {currency}", "", "{loreFooter}"));
        yml.addDefault("upgrades.Default.sharpSword.tier1.name", "&eSharpened Swords");
        yml.addDefault("upgrades.Default.sharpSword.tier1.lore", Arrays.asList("&7Your team gets Sharpness I on", "&7all swords!", "", "&7Cost:&b {cost} {currency}", "", "{loreFooter}"));
        yml.addDefault("upgrades.Default.reinforced.tier1.name", "&eReinforced Armor");
        yml.addDefault("upgrades.Default.reinforced.tier1.lore", Arrays.asList("&7Your team gets Protection I on", "&7all armor pieces!", "", "&7Cost:&b {cost} {currency}", "", "{loreFooter}"));
        yml.addDefault("upgrades.Default.trap.tier1.name", "&eIt's a trap!");
        yml.addDefault("upgrades.Default.trap.tier1.lore", Arrays.asList("&7The nex enemy to enter your", "&7base will receive Blindness and", "&7Slowness!", "", "&7Cost:&b {cost} {currency}", "", "{loreFooter}"));
        yml.addDefault("upgrades.Default.miningFatigue.tier1.name", "&eMiner Fatigue Trap");
        yml.addDefault("upgrades.Default.miningFatigue.tier1.lore", Arrays.asList("&7The nex enemy to enter your", "&7base will receive Mining Fatigue", "&7for 10 seconds!", "", "&7Cost:&b {cost} {currency}", "", "{loreFooter}"));
        yml.addDefault("upgrades.Default.healPool.tier1.name", "&eHeal Pool");
        yml.addDefault("upgrades.Default.healPool.tier1.lore", Arrays.asList("&7Creates a Regeneration field", "&7around your base!", "", "&7Cost:&b {cost} {currency}", "", "{loreFooter}"));
    }
}
