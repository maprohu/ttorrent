package com.turn.ttorrent.client.storage;

import com.turn.ttorrent.common.Torrent;

import java.io.IOException;
import java.util.List;

/**
 * Created by martonpapp on 05/05/16.
 */
public interface TorrentByteStorageProvider {

    TorrentByteStorage create(
            List<Torrent.TorrentFile> files,
            long size
    ) throws IOException;

}
