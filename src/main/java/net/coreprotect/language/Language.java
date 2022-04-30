package net.coreprotect.language;

import java.util.concurrent.ConcurrentHashMap;

public class Language {

    private static ConcurrentHashMap<Phrase, String> phrases = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<Phrase, String> userPhrases = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<Phrase, String> translatedPhrases = new ConcurrentHashMap<>();

    protected static String getPhrase(Phrase phrase) {
        return phrases.get(phrase);
    }

    protected static String getUserPhrase(Phrase phrase) {
        return userPhrases.get(phrase);
    }

    protected static String getTranslatedPhrase(Phrase phrase) {
        return translatedPhrases.get(phrase);
    }

    protected static void setUserPhrase(Phrase phrase, String value) {
        userPhrases.put(phrase, value);
    }

    protected static void setTranslatedPhrase(Phrase phrase, String value) {
        translatedPhrases.put(phrase, value);
    }

    public static void loadPhrases() {
        phrases.put(Phrase.ACTION_NOT_SUPPORTED, "That action is not supported by the command");
        phrases.put(Phrase.AMOUNT_BLOCK, "{0} {block|blocks}");
        phrases.put(Phrase.AMOUNT_CHUNK, "{0} {chunk|chunks}");
        phrases.put(Phrase.AMOUNT_ENTITY, "{0} {entity|entities}");
        phrases.put(Phrase.AMOUNT_ITEM, "{0} {item|items}");
        phrases.put(Phrase.API_TEST, "API test successful");
        phrases.put(Phrase.CACHE_ERROR, "WARNING: Error while validating {0} cache");
        phrases.put(Phrase.CACHE_RELOAD, "Forcing reload of {mapping|world} caches from database");
        phrases.put(Phrase.CHECK_CONFIG, "Please check config.yml");
        phrases.put(Phrase.COMMAND_CONSOLE, "Please run the command from the console");
        phrases.put(Phrase.COMMAND_NOT_FOUND, "Command \"{0}\" not found");
        phrases.put(Phrase.COMMAND_THROTTLED, "Please wait a moment and try again");
        phrases.put(Phrase.CONSUMER_ERROR, "Consumer queue processing already {paused|resumed}");
        phrases.put(Phrase.CONSUMER_TOGGLED, "Consumer queue processing has been {paused|resumed}");
        phrases.put(Phrase.CONTAINER_HEADER, "容器記錄");
        phrases.put(Phrase.DATABASE_BUSY, "資料庫忙碌中 請稍後再試");
        phrases.put(Phrase.DATABASE_INDEX_ERROR, "Unable to validate database indexes");
        phrases.put(Phrase.DATABASE_LOCKED_1, "Database locked. Waiting up to 15 seconds..");
        phrases.put(Phrase.DATABASE_LOCKED_2, "Database is already in use. Please try again");
        phrases.put(Phrase.DATABASE_LOCKED_3, "To disable database locking, set \"database-lock: false\"");
        phrases.put(Phrase.DATABASE_LOCKED_4, "Disabling database locking can result in data corruption");
        phrases.put(Phrase.DATABASE_UNREACHABLE, "Database is unreachable. Discarding data and shutting down");
        phrases.put(Phrase.DEVELOPMENT_BRANCH, "Development branch detected, skipping patch scripts");
        phrases.put(Phrase.DIRT_BLOCK, "Placed a dirt block under you");
        phrases.put(Phrase.DISABLE_SUCCESS, "Success! Disabled {0}");
        phrases.put(Phrase.ENABLE_FAILED, "{0} was unable to start");
        phrases.put(Phrase.ENABLE_SUCCESS, "{0} has been successfully enabled!");
        phrases.put(Phrase.ENJOY_COREPROTECT, "Enjoy {0}? Join our Discord!");
        phrases.put(Phrase.FINISHING_CONVERSION, "Finishing up data conversion. Please wait..");
        phrases.put(Phrase.FINISHING_LOGGING, "Finishing up data logging. Please wait..");
        phrases.put(Phrase.FIRST_VERSION, "Initial DB: {0}");
        phrases.put(Phrase.GLOBAL_LOOKUP, "Don't specify a radius to do a global lookup");
        phrases.put(Phrase.GLOBAL_ROLLBACK, "Use \"{0}\" to do a global {rollback|restore}");
        phrases.put(Phrase.HELP_ACTION_1, "Restrict the lookup to a certain action");
        phrases.put(Phrase.HELP_ACTION_2, "Examples: [a:block], [a:+block], [a:-block] [a:click], [a:container], [a:inventory], [a:item], [a:kill], [a:chat], [a:command], [a:sign], [a:session], [a:username]");
        phrases.put(Phrase.HELP_COMMAND, "Display more info for that command");
        phrases.put(Phrase.HELP_EXCLUDE_1, "Exclude blocks/users");
        phrases.put(Phrase.HELP_EXCLUDE_2, "Examples: [e:stone], [e:Notch], [e:stone,Notch]");
        phrases.put(Phrase.HELP_HEADER, "{0} Help");
        phrases.put(Phrase.HELP_INCLUDE_1, "Include specific blocks/entities");
        phrases.put(Phrase.HELP_INCLUDE_2, "Examples: [i:stone], [i:zombie], [i:stone,wood,bedrock]");
        phrases.put(Phrase.HELP_INSPECT_1, "With the inspector enabled, you can do the following:");
        phrases.put(Phrase.HELP_INSPECT_2, "Left-click a block to see who placed that block");
        phrases.put(Phrase.HELP_INSPECT_3, "Right-click a block to see what adjacent block was broken");
        phrases.put(Phrase.HELP_INSPECT_4, "Place a block to see what block was broken at that location");
        phrases.put(Phrase.HELP_INSPECT_5, "Place a block in liquid (etc) to see who placed it");
        phrases.put(Phrase.HELP_INSPECT_6, "Right-click on a door, chest, etc, to see who last used it");
        phrases.put(Phrase.HELP_INSPECT_7, "Tip: You can use just \"/co i\" for quicker access");
        phrases.put(Phrase.HELP_INSPECT_COMMAND, "Turns the block inspector on or off");
        phrases.put(Phrase.HELP_LIST, "Displays a list of all commands");
        phrases.put(Phrase.HELP_LOOKUP_1, "Command shortcut");
        phrases.put(Phrase.HELP_LOOKUP_2, "Use after inspecting a block to view logs");
        phrases.put(Phrase.HELP_LOOKUP_COMMAND, "Advanced block data lookup");
        phrases.put(Phrase.HELP_NO_INFO, "Information for command \"{0}\" not found");
        phrases.put(Phrase.HELP_PARAMETER, "Please see \"{0}\" for detailed parameter info");
        phrases.put(Phrase.HELP_PARAMS_1, "Perform the {lookup|rollback|restore}");
        phrases.put(Phrase.HELP_PARAMS_2, "Specify the user(s) to {lookup|rollback|restore}");
        phrases.put(Phrase.HELP_PARAMS_3, "Specify the amount of time to {lookup|rollback|restore}");
        phrases.put(Phrase.HELP_PARAMS_4, "Specify a radius area to limit the {lookup|rollback|restore} to");
        phrases.put(Phrase.HELP_PARAMS_5, "Restrict the {lookup|rollback|restore} to a certain action");
        phrases.put(Phrase.HELP_PARAMS_6, "Include specific blocks/entities in the {lookup|rollback|restore}");
        phrases.put(Phrase.HELP_PARAMS_7, "Exclude blocks/users from the {lookup|rollback|restore}");
        phrases.put(Phrase.HELP_PURGE_1, "Delete data older than specified time");
        phrases.put(Phrase.HELP_PURGE_2, "For example, \"{0}\" will delete all data older than one month, and only keep the last 30 days of data");
        phrases.put(Phrase.HELP_PURGE_COMMAND, "Delete old block data");
        phrases.put(Phrase.HELP_RADIUS_1, "Specify a radius area");
        phrases.put(Phrase.HELP_RADIUS_2, "Examples: [r:10] (Only make changes within 10 blocks of you)");
        phrases.put(Phrase.HELP_RELOAD_COMMAND, "Reloads the configuration file");
        phrases.put(Phrase.HELP_RESTORE_COMMAND, "Restore block data");
        phrases.put(Phrase.HELP_ROLLBACK_COMMAND, "Rollback block data");
        phrases.put(Phrase.HELP_STATUS, "View the plugin status and version information");
        phrases.put(Phrase.HELP_STATUS_COMMAND, "Displays the plugin status");
        phrases.put(Phrase.HELP_TELEPORT, "Teleport to a location");
        phrases.put(Phrase.HELP_TIME_1, "Specify the amount of time to lookup");
        phrases.put(Phrase.HELP_TIME_2, "Examples: [t:2w,5d,7h,2m,10s], [t:5d2h], [t:2.50h]");
        phrases.put(Phrase.HELP_USER_1, "Specify the user(s) to lookup");
        phrases.put(Phrase.HELP_USER_2, "Examples: [u:Notch], [u:Notch,#enderman]");
        phrases.put(Phrase.INCOMPATIBLE_ACTION, "\"{0}\" can't be used with that action");
        phrases.put(Phrase.INSPECTOR_ERROR, "記錄查詢模式已{啟用|關閉}");
        phrases.put(Phrase.INSPECTOR_TOGGLED, "{進入記錄查詢模式 點擊方塊可查詢記錄 再輸入一次 /co i 可退出|離開記錄查詢模式}");
        phrases.put(Phrase.INTEGRATION_ERROR, "Unable to {initialize|disable} {0} logging");
        phrases.put(Phrase.INTEGRATION_SUCCESS, "{0} logging successfully {initialized|disabled}");
        phrases.put(Phrase.INTEGRATION_VERSION, "Invalid {0} version found");
        phrases.put(Phrase.INTERACTIONS_HEADER, "玩家互動記錄");
        phrases.put(Phrase.INVALID_ACTION, "That is not a valid action");
        phrases.put(Phrase.INVALID_BRANCH_1, "Invalid plugin version (branch has not been set)");
        phrases.put(Phrase.INVALID_BRANCH_2, "To continue, set project branch to \"development\"");
        phrases.put(Phrase.INVALID_BRANCH_3, "Running development code may result in data corruption");
        phrases.put(Phrase.INVALID_CONTAINER, "Please inspect a valid container first");
        phrases.put(Phrase.INVALID_DONATION_KEY, "Invalid donation key");
        phrases.put(Phrase.INVALID_INCLUDE, "\"{0}\" is an invalid block/entity name");
        phrases.put(Phrase.INVALID_INCLUDE_COMBO, "That is an invalid block/entity combination");
        phrases.put(Phrase.INVALID_RADIUS, "Please enter a valid radius");
        phrases.put(Phrase.INVALID_SELECTION, "{0} selection not found");
        phrases.put(Phrase.INVALID_USERNAME, "\"{0}\" is an invalid username");
        phrases.put(Phrase.INVALID_WORLD, "Please specify a valid world");
        phrases.put(Phrase.LATEST_VERSION, "Latest Version: {0}");
        phrases.put(Phrase.LINK_DISCORD, "Discord: {0}");
        phrases.put(Phrase.LINK_DOWNLOAD, "Download: {0}");
        phrases.put(Phrase.LINK_PATREON, "Patreon: {0}");
        phrases.put(Phrase.LINK_WIKI_BLOCK, "Block Names: {0}");
        phrases.put(Phrase.LINK_WIKI_ENTITY, "Entity Names: {0}");
        phrases.put(Phrase.LOGGING_ITEMS, "{0} items left to log. Please wait..");
        phrases.put(Phrase.LOGGING_TIME_LIMIT, "Logging time limit reached. Discarding data and shutting down");
        phrases.put(Phrase.LOOKUP_BLOCK, "{0} {放置了|破壞了} {1}");
        phrases.put(Phrase.LOOKUP_CONTAINER, "{0} {放入了|拿出了} {1} {2}");
        phrases.put(Phrase.LOOKUP_HEADER, "{0} 檢索結果");
        phrases.put(Phrase.LOOKUP_INTERACTION, "{0} {點擊了|殺死了} {1}");
        phrases.put(Phrase.LOOKUP_ITEM, "{0} {撿起了|丟棄了} {1} {2}");
        phrases.put(Phrase.LOOKUP_LOGIN, "{0} logged {in|out}");
        phrases.put(Phrase.LOOKUP_PAGE, "第 {0} 頁 可使用 /co l <頁數> 來切換頁數");
        phrases.put(Phrase.LOOKUP_PROJECTILE, "{0} {丟|射} {1} {2}");
        phrases.put(Phrase.LOOKUP_ROWS_FOUND, "找到 {0} {行|行}");
        phrases.put(Phrase.LOOKUP_SEARCHING, "資料搜尋中 請稍後...");
        phrases.put(Phrase.LOOKUP_STORAGE, "{0} {放入了|拿出了} {1} {2}");
        phrases.put(Phrase.LOOKUP_TIME, "{0}前");
        phrases.put(Phrase.LOOKUP_USERNAME, "{0} logged in as {1}");
        phrases.put(Phrase.MAXIMUM_RADIUS, "The maximum {lookup|rollback|restore} radius is {0}");
        phrases.put(Phrase.MISSING_ACTION_USER, "To use that action, please specify a user");
        phrases.put(Phrase.MISSING_LOOKUP_TIME, "Please specify the amount of time to {lookup|rollback|restore}");
        phrases.put(Phrase.MISSING_LOOKUP_USER, "Please specify a user or {block|radius} to lookup");
        phrases.put(Phrase.MISSING_PARAMETERS, "Please use \"{0}\"");
        phrases.put(Phrase.MISSING_ROLLBACK_RADIUS, "You did not specify a {rollback|restore} radius");
        phrases.put(Phrase.MISSING_ROLLBACK_USER, "You did not specify a {rollback|restore} user");
        phrases.put(Phrase.MYSQL_UNAVAILABLE, "Unable to connect to MySQL server");
        phrases.put(Phrase.NO_DATA, "該處沒有找到資料 {0}");
        phrases.put(Phrase.NO_DATA_LOCATION, "此處沒有找到任何{資料|記錄|互動|訊息} ");
        phrases.put(Phrase.NO_PERMISSION, "你沒有權限");
        phrases.put(Phrase.NO_RESULTS, "未找到近期的記錄");
        phrases.put(Phrase.NO_RESULTS_PAGE, "此頁沒有找到{結果|資料}");
        phrases.put(Phrase.NO_ROLLBACK, "No {pending|previous} rollback/restore found");
        phrases.put(Phrase.PATCH_INTERRUPTED, "Upgrade interrupted. Will try again on restart");
        phrases.put(Phrase.PATCH_OUTDATED_1, "Unable to upgrade databases older than {0}");
        phrases.put(Phrase.PATCH_OUTDATED_2, "Please upgrade with a supported version of CoreProtect");
        phrases.put(Phrase.PATCH_PROCESSING, "資料處理中 請稍後");
        phrases.put(Phrase.PATCH_SKIP_UPDATE, "Skipping {table|index} {update|creation|removal} on {0}");
        phrases.put(Phrase.PATCH_STARTED, "Performing {0} upgrade. Please wait..");
        phrases.put(Phrase.PATCH_SUCCESS, "Successfully upgraded to {0}");
        phrases.put(Phrase.PATCH_UPGRADING, "資料庫升級中 請稍後");
        phrases.put(Phrase.PLEASE_SELECT, "請選擇: \"{0}\" 或 \"{1}\"");
        phrases.put(Phrase.PREVIEW_CANCELLED, "Preview cancelled");
        phrases.put(Phrase.PREVIEW_CANCELLING, "Cancelling preview..");
        phrases.put(Phrase.PREVIEW_IN_GAME, "You can only preview rollbacks in-game");
        phrases.put(Phrase.PREVIEW_TRANSACTION, "You can't preview {container|inventory} transactions");
        phrases.put(Phrase.PURGE_ABORTED, "Purge failed. Database may be corrupt");
        phrases.put(Phrase.PURGE_ERROR, "Unable to process {0} data!");
        phrases.put(Phrase.PURGE_FAILED, "Purge failed. Please try again later");
        phrases.put(Phrase.PURGE_IN_PROGRESS, "資料庫清理中 請稍後再試...");
        phrases.put(Phrase.PURGE_MINIMUM_TIME, "You can only purge data older than {0} {days|hours}");
        phrases.put(Phrase.PURGE_NOTICE_1, "Please note that this may take some time");
        phrases.put(Phrase.PURGE_NOTICE_2, "Do not restart your server until completed");
        phrases.put(Phrase.PURGE_OPTIMIZING, "Optimizing database. Please wait..");
        phrases.put(Phrase.PURGE_PROCESSING, "Processing {0} data..");
        phrases.put(Phrase.PURGE_REPAIRING, "Attempting to repair. This may take some time..");
        phrases.put(Phrase.PURGE_ROWS, "{0} {row|rows} of data deleted");
        phrases.put(Phrase.PURGE_STARTED, "Data purge started on \"{0}\"");
        phrases.put(Phrase.PURGE_SUCCESS, "Data purge successful");
        phrases.put(Phrase.RELOAD_STARTED, "Reloading configuration - please wait");
        phrases.put(Phrase.RELOAD_SUCCESS, "Configuration successfully reloaded");
        phrases.put(Phrase.ROLLBACK_ABORTED, "Rollback or restore aborted");
        phrases.put(Phrase.ROLLBACK_CHUNKS_FOUND, "Found {0} {chunk|chunks} to modify");
        phrases.put(Phrase.ROLLBACK_CHUNKS_MODIFIED, "Modified {0}/{1} {chunk|chunks}");
        phrases.put(Phrase.ROLLBACK_COMPLETED, "{Rollback|Restore|Preview} completed for \"{0}\"");
        phrases.put(Phrase.ROLLBACK_EXCLUDED_USERS, "Excluded {user|users}: \"{0}\"");
        phrases.put(Phrase.ROLLBACK_INCLUDE, "{Included|Excluded} {block|entity|target} {type|types}: \"{0}\"");
        phrases.put(Phrase.ROLLBACK_IN_PROGRESS, "A rollback/restore is already in progress");
        phrases.put(Phrase.ROLLBACK_LENGTH, "Time taken: {0} {second|seconds}");
        phrases.put(Phrase.ROLLBACK_MODIFIED, "{Modified|Modifying} {0}");
        phrases.put(Phrase.ROLLBACK_RADIUS, "Radius: {0} {block|blocks}");
        phrases.put(Phrase.ROLLBACK_SELECTION, "Radius set to \"{0}\"");
        phrases.put(Phrase.ROLLBACK_STARTED, "{Rollback|Restore|Preview} started on \"{0}\"");
        phrases.put(Phrase.ROLLBACK_TIME, "Time range: {0}");
        phrases.put(Phrase.ROLLBACK_WORLD_ACTION, "Restricted to {world|action} \"{0}\"");
        phrases.put(Phrase.SIGN_HEADER, "告示牌訊息");
        phrases.put(Phrase.STATUS_CONSUMER, "Consumer: {0} {item|items} in queue");
        phrases.put(Phrase.STATUS_DATABASE, "Database: Using {0}");
        phrases.put(Phrase.STATUS_INTEGRATION, "{0}: Integration {enabled|disabled}");
        phrases.put(Phrase.STATUS_LICENSE, "License: {0}");
        phrases.put(Phrase.STATUS_VERSION, "Version: {0}");
        phrases.put(Phrase.TELEPORTED, "Teleported to {0}");
        phrases.put(Phrase.TELEPORTED_SAFETY, "Teleported you to safety");
        phrases.put(Phrase.TELEPORT_PLAYERS, "Teleport command can only be used by players");
        phrases.put(Phrase.TIME_DAYS, "{0}{天|天}");
        phrases.put(Phrase.TIME_HOURS, "{0}{小時|小時}");
        phrases.put(Phrase.TIME_MINUTES, "{0}{分|分}");
        phrases.put(Phrase.TIME_SECONDS, "{0}{秒|秒}");
        phrases.put(Phrase.TIME_WEEKS, "{0}{週|週}");
        phrases.put(Phrase.UPDATE_ERROR, "An error occurred while checking for updates");
        phrases.put(Phrase.UPDATE_HEADER, "{0} Update");
        phrases.put(Phrase.UPDATE_NOTICE, "Notice: {0} is now available");
        phrases.put(Phrase.UPGRADE_IN_PROGRESS, "升級中 請稍後再試");
        phrases.put(Phrase.USER_NOT_FOUND, "未找到玩家 \"{0}\"");
        phrases.put(Phrase.USER_OFFLINE, "玩家 \"{0}\" 不在線上");
        phrases.put(Phrase.USING_MYSQL, "Using MySQL for data storage");
        phrases.put(Phrase.USING_SQLITE, "Using SQLite for data storage");
        phrases.put(Phrase.VALID_DONATION_KEY, "Valid donation key");
        phrases.put(Phrase.VERSION_NOTICE, "Version {0} is now available");
        phrases.put(Phrase.VERSION_REQUIRED, "{0} {1} or higher is required");
        phrases.put(Phrase.WORLD_NOT_FOUND, "未發現世界 \"{0}\"");

        userPhrases.putAll(phrases);
        translatedPhrases.putAll(phrases);
    }

}
