/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.hadoop.hbase.regionserver;

import java.nio.ByteBuffer;

import org.apache.hadoop.hbase.NoTagsByteBufferKeyValue;
import org.apache.yetus.audience.InterfaceAudience;
import org.apache.hadoop.hbase.util.ByteBufferUtils;


/**
 * ByteBuffer based cell which has the chunkid at the 0th offset and with no tags
 * @see MemStoreLAB
 */
@InterfaceAudience.Private
public class NoTagByteBufferChunkCell extends NoTagsByteBufferKeyValue {

  public NoTagByteBufferChunkCell(ByteBuffer buf, int offset, int length) {
    super(buf, offset, length);
  }

  public NoTagByteBufferChunkCell(ByteBuffer buf, int offset, int length, long seqId) {
    super(buf, offset, length, seqId);
  }

  @Override
  public int getChunkId() {
    // The chunkId is embedded at the 0th offset of the bytebuffer
    return ByteBufferUtils.toInt(buf, 0);
  }

}
