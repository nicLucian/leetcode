package problem146;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class TestLruCache {
    @Test
    public void testLruCache() {
        LRUCache lruCache = new LRUCache(2);
        LRUCache cache = new LRUCache( 2 /* 缓存容量 */ );

        cache.put(1, 1);
        cache.put(2, 2);
        assertThat(cache.get(1), equalTo(1));       // 返回  1
        cache.put(3, 3);    // 该操作会使得关键字 2 作废
        assertThat(cache.get(2), equalTo(-1));       // 返回 -1 (未找到)
        cache.put(4, 4);    // 该操作会使得关键字 1 作废
        assertThat(cache.get(1), equalTo(-1));       // 返回 -1 (未找到)
        assertThat(cache.get(3), equalTo(3));       // 返回  3
        assertThat(cache.get(4), equalTo(4));       // 返回  4

    }

    @Test
    public void testLruCache1() {
        LRUCache lruCache = new LRUCache(2);
        LRUCache cache = new LRUCache( 2 /* 缓存容量 */ );

        cache.put(2, 1);
        cache.put(1, 2);
        cache.put(2, 3);
        cache.put(4, 1);
        assertThat(cache.get(1), equalTo(-1));       // 返回  1
        assertThat(cache.get(2), equalTo(3));       // 返回 -1 (未找到)

    }
}
