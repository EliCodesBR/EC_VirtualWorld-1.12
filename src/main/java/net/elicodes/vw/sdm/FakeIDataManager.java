package net.elicodes.vw.sdm;

import net.minecraft.server.v1_12_R1.*;

import javax.annotation.Nullable;
import java.io.File;
import java.util.UUID;

public class FakeIDataManager implements IDataManager {

    private UUID uuid = UUID.randomUUID();
    private WorldData worldData;

    public void setWorldData(WorldData worldData) {
        this.worldData = worldData;
    }

    @Nullable
    @Override
    public WorldData getWorldData() {
        return worldData;
    }

    @Override
    public void checkSession() throws ExceptionWorldConflict {

    }

    @Override
    public IChunkLoader createChunkLoader(WorldProvider worldProvider) {
        return new FakeIChunkLoader();
    }

    @Override
    public void saveWorldData(WorldData worldData, NBTTagCompound nbtTagCompound) {

    }

    @Override
    public void saveWorldData(WorldData worldData) {

    }

    @Override
    public IPlayerFileData getPlayerFileData() {
        return new IPlayerFileData() {
            @Override
            public void save(EntityHuman entityHuman) {

            }

            @Override
            public NBTTagCompound load(EntityHuman entityHuman) {
                return null;
            }

            @Override
            public String[] getSeenPlayers() {
                return new String[0];
            }
        };
    }

    @Override
    public void a() {

    }

    @Override
    public File getDirectory() {
        return null;
    }

    @Override
    public File getDataFile(String s) {
        return null;
    }

    @Override
    public DefinedStructureManager h() {
        return null;
    }

    @Override
    public UUID getUUID() {
        return uuid;
    }
}