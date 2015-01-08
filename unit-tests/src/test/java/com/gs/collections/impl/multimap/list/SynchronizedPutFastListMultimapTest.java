/*
 * Copyright 2015 Goldman Sachs.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.gs.collections.impl.multimap.list;

import com.gs.collections.api.tuple.Pair;
import com.gs.collections.impl.list.mutable.FastList;

/**
 * Test of {@link SynchronizedPutFastListMultimap}.
 */
public class SynchronizedPutFastListMultimapTest extends AbstractMutableListMultimapTestCase
{
    @Override
    public <K, V> SynchronizedPutFastListMultimap<K, V> newMultimap()
    {
        return SynchronizedPutFastListMultimap.newMultimap();
    }

    @Override
    public <K, V> SynchronizedPutFastListMultimap<K, V> newMultimapWithKeyValue(K key, V value)
    {
        SynchronizedPutFastListMultimap<K, V> mutableMultimap = this.newMultimap();
        mutableMultimap.put(key, value);
        return mutableMultimap;
    }

    @Override
    public <K, V> SynchronizedPutFastListMultimap<K, V> newMultimapWithKeysValues(K key1, V value1, K key2, V value2)
    {
        SynchronizedPutFastListMultimap<K, V> mutableMultimap = this.newMultimap();
        mutableMultimap.put(key1, value1);
        mutableMultimap.put(key2, value2);
        return mutableMultimap;
    }

    @Override
    public <K, V> SynchronizedPutFastListMultimap<K, V> newMultimapWithKeysValues(
            K key1, V value1,
            K key2, V value2,
            K key3, V value3)
    {
        SynchronizedPutFastListMultimap<K, V> mutableMultimap = this.newMultimap();
        mutableMultimap.put(key1, value1);
        mutableMultimap.put(key2, value2);
        mutableMultimap.put(key3, value3);
        return mutableMultimap;
    }

    @Override
    public <K, V> SynchronizedPutFastListMultimap<K, V> newMultimapWithKeysValues(
            K key1, V value1,
            K key2, V value2,
            K key3, V value3,
            K key4, V value4)
    {
        SynchronizedPutFastListMultimap<K, V> mutableMultimap = this.newMultimap();
        mutableMultimap.put(key1, value1);
        mutableMultimap.put(key2, value2);
        mutableMultimap.put(key3, value3);
        mutableMultimap.put(key4, value4);
        return mutableMultimap;
    }

    @SafeVarargs
    @Override
    public final <K, V> SynchronizedPutFastListMultimap<K, V> newMultimap(Pair<K, V>... pairs)
    {
        return SynchronizedPutFastListMultimap.newMultimap(pairs);
    }

    @Override
    public <K, V> SynchronizedPutFastListMultimap<K, V> newMultimapFromPairs(Iterable<Pair<K, V>> inputIterable)
    {
        return SynchronizedPutFastListMultimap.newMultimap(inputIterable);
    }

    @SafeVarargs
    @Override
    protected final <V> FastList<V> createCollection(V... args)
    {
        return FastList.newListWith(args);
    }
}
