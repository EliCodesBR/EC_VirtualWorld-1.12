package net.elicodes.vw.sdm;

import net.minecraft.server.v1_12_R1.Chunk;
import net.minecraft.server.v1_12_R1.ExceptionWorldConflict;
import net.minecraft.server.v1_12_R1.IChunkLoader;
import net.minecraft.server.v1_12_R1.World;

import javax.annotation.Nullable;
import java.io.IOException;

public class FakeIChunkLoader implements IChunkLoader {

    @Nullable
    @Override
    public Chunk a(World world, int i, int i1) throws IOException {
        return null;
    }

    @Override
    public void saveChunk(World world, Chunk chunk, boolean b) throws IOException, ExceptionWorldConflict {

    }

    @Override
    public void b() {

    }

    @Override
    public void c() {

    }

    @Override
    public boolean chunkExists(int i, int i1) {
        return false;
    }
}
