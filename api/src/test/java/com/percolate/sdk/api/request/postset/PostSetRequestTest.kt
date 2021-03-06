package com.percolate.sdk.api.request.postset

import com.percolate.sdk.api.BaseApiTest
import com.percolate.sdk.dto.PostSetData
import org.junit.Assert
import org.junit.Test

class PostSetRequestTest : BaseApiTest() {

    @Test
    fun testGet() {
        val postSet = percolateApi
                .postSet()
                .get(PostSetParams())
                .execute()
                .body();

        Assert.assertNotNull(postSet)
        Assert.assertNotNull(postSet.postSetData)
        Assert.assertEquals(1, postSet.postSetData.size.toLong())
    }

    @Test
    fun testCreate() {
        val postSetData = percolateApi
                .postSet()
                .create(PostSetData())
                .execute()
                .body();

        Assert.assertNotNull(postSetData)
        Assert.assertNotNull(postSetData.id)
    }

    @Test
    fun testUpdate() {
        val postSetData = percolateApi
                .postSet()
                .update(PostSetData().apply { id = 123L })
                .execute()
                .body();

        Assert.assertNotNull(postSetData)
        Assert.assertNotNull(postSetData.id)
    }
}
